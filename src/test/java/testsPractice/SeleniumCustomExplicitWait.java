package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.desktop.AppForegroundListener;

public class SeleniumCustomExplicitWait {

    @Test
    public void customExplicitWait() {

        Application.start();
        // this checks if any div element is visible
        Assert.assertTrue(isElementVisible(By.xpath("//div")));

        // this checks if an element with id "randomId" is not visible (intentionally)
        Assert.assertFalse(isElementVisible(By.id("randomId")));
    }

    public boolean isElementVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Application.driver(), 5);
        try {
            wait.until((ExpectedCondition<Boolean>) driver -> {
                WebElement element = Application.driver().findElement(locator);
                if (element.isDisplayed()) {
                    return true;
                }
                return false;
            });
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }
}
