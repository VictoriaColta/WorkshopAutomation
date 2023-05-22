package model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static model.ApplicationDemoQa.driver;

public class HomePageDemoQa {
    public static By elements = By.xpath("//*[text()='Elements']");
    public static By forms = By.xpath("//*[text()='Forms']");
    public static By alertsFramesWindows = By.xpath("//*[text()='Alerts, Frame & Windows']");
    public static By widgets = By.xpath("//*[text()='Widgets']");
    public static By interactions=By.xpath("//*[text()='Interactions']");

    public static void clickTab(By locator) {

        WebElement element = driver().findElement(locator);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver();
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

}
