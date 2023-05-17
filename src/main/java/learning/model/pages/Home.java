package learning.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static learning.Application.driver;

public class Home {
    private static final By elements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private static final By alertsFrameWindows = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]");
    private static final By widgets = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");

    public static void clickElements(){
        WebDriverWait wait = new WebDriverWait(driver(), 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(elements));

        WebElement element = driver().findElement(elements);
        element.click();
    }
    public static void clickAlertsFrameWindows(){
        WebDriverWait wait = new WebDriverWait(driver(),3);
        wait.until(ExpectedConditions.presenceOfElementLocated(alertsFrameWindows));
        WebElement element = driver().findElement(alertsFrameWindows);
        element.click();
    }
    public static void clickWidgets(){
        WebDriverWait wait = new WebDriverWait(driver(), 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(widgets));
        WebElement element = driver().findElement(widgets);
        element.click();
    }
}
