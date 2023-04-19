package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    By btnElements = By.xpath("//h5[contains(text(), 'Elements')]");
    By btnForms = By.xpath("//h5[contains(text(), 'Forms')]");
    By btnAlertsFrameWindows = By.xpath("//h5[contains(text(), 'Alerts, Frame & Windows')]");
    By btnWidgets = By.xpath("//h5[contains(text(), 'Widgets')]");
    By btnInteractions = By.xpath("//h5[contains(text(), 'Interactions')]");
    By btnBookStoreApplication = By.xpath("//h5[contains(text(), 'Book Store Application')]");

    public void clickAlertsFrameWindows(){
        WebElement alertsFrameWindows = driver.findElement(btnAlertsFrameWindows);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alertsFrameWindows);
        alertsFrameWindows.click();
    }

    public void clickWidgets(){
        WebElement widgets = driver.findElement(btnWidgets);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", widgets);
        widgets.click();
    }

    public void clickElements(){
        WebElement elements = driver.findElement(btnElements);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elements);
        elements.click();
    }
}
