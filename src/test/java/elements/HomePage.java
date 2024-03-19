package elements;

import model.SecondApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static model.SecondApplication.driver;
public class HomePage {
    private static By elementsSectionElement = By.xpath("//h5[normalize-space()='Elements']");
    private static By formsSectionElement = By.xpath("//h5[normalize-space()='Forms']");
    private static By alertsFrameWindowsSectionElement = By.xpath("//h5[normalize-space()='Alerts, Frame & Windows']");
    private static By widgetsButtonElement = By.xpath("//h5[normalize-space()='Widgets']");
    private static By interactionsButtonElement = By.xpath("//h5[normalize-space()='Interactions']");
    private static By bookStoreApplicationButtonElement = By.xpath(" //h5[normalize-space()='Book Store Application']");
    private static final By allSectionElement = By.className("home-body");
    public static By alertsFramesWindows = By.xpath("//*[text()='Alerts, Frame & Windows']");


    public static void clickOnElementsSection() {

        WebElement elements = SecondApplication.driver().findElement(elementsSectionElement);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver();
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elements);
        elements.click();

    }

    public static void clickOnAlertsSection() {

        WebElement alertsFrameWindowsSection = driver().findElement(alertsFrameWindowsSectionElement);
        alertsFrameWindowsSection.click();

    }
    public static void validateHomePageDisplayed() {

        WebElement allSection = driver().findElement(allSectionElement);
        Assert.assertTrue(allSection.isDisplayed());

    }
    public static void clickWidgetsSection() {
        WebElement widgets = driver().findElement(widgetsButtonElement);
        widgets.click();
    }
    public static void clickFormsSection() {
        WebElement formsSection = driver().findElement(formsSectionElement);
        formsSection.click();
    }

    public static void clickInteractionsSection() {
        WebElement interactionsSection = driver().findElement(interactionsButtonElement);
        interactionsSection.click();
    }
    public static void clickBookStoreApplicationSection() {

        WebElement bookStoreApplicationSection = driver().findElement(bookStoreApplicationButtonElement);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver();
        //JavascriptExecutor clasa, jsExecutor e obiect al clasei
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", bookStoreApplicationSection);
        bookStoreApplicationSection.click();
    }
    public static void clickAlertsFrameWindows() {

        WebElement element = driver().findElement(alertsFramesWindows);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver();
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }
}
