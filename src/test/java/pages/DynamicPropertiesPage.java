package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static model.ApplicationDemoQa.driver;

public class DynamicPropertiesPage {
    public static By dynamicProperties = By.xpath("//span[text()='Dynamic Properties']");
    public static By visibleAfterButton = By.id("visibleAfter");
    public static By colorChangeButton = By.xpath("//button[@class='mt-4 text-danger btn btn-primary']");

    public static void click(By locator) {
        WebElement element = driver().findElement(locator);
        element.click();
    }

    public static boolean isFiveSecondsButtonVisibleAfter(long value) {
        WebDriverWait wait = new WebDriverWait(driver(), Duration.ofSeconds(value));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(visibleAfterButton));
        } catch (TimeoutException exception) {
            return false;
        }
        return true;
    }

    public static boolean isColorChanged() {
        WebElement element = driver().findElement(colorChangeButton);
        return element.getAttribute("class").contains("text-danger");
    }
}