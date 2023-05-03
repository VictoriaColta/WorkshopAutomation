package pages;

import model.Application;
import org.objectweb.asm.Handle;
import org.openqa.selenium.By;
import utils.Handler;

public class Homepage {

    private static By elementsMenu = By.xpath("//div[@class='card-body']//*[text()='Elements']");
    private static By alertsMenu = By.xpath("//div[@class='card-body']//*[text()='Alerts, Frame & Windows']");
    private static By widgetsMenu = By.xpath("//div[@class='card-body']//*[text()='Widgets']");


    public static void clickElementsMenu () {
        Handler.scrollUntilElementIsVisible(elementsMenu);
        Handler.clickElement(elementsMenu);}

    public static void clickAlertsMenu () {
        Handler.scrollUntilElementIsVisible(alertsMenu);
        Handler.clickElement(alertsMenu);}
    public static void clickWidgetsMenu () {
        Handler.scrollUntilElementIsVisible(widgetsMenu);
        Handler.clickElement(widgetsMenu);}


}
