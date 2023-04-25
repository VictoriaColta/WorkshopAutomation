package pages;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Homepage {

    private static By elementsMenu = By.xpath("//div[@class='card-body']//*[text()='Elements']");
    private static By alertsMenu = By.xpath("//div[@class='card-body']//*[text()='Alerts, Frame & Windows']");
    private static By widgetsMenu = By.xpath("//div[@class='card-body']//*[text()='Widgets']");


    public static void scrollUntilElementIsVisible () {
        JavascriptExecutor js = (JavascriptExecutor) Application.driver();
        WebElement Element = Application.driver().findElement(elementsMenu);
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }
    public static void clickElementsMenu () {
        Application.driver().findElement(elementsMenu).click();
    }
    public static void clickAlertsMenu () {Application.driver().findElement(alertsMenu).click();}
    public static void clickWidgetsMenu () {Application.driver().findElement(widgetsMenu).click();}


}
