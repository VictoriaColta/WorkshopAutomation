package elements;

import Utils.ElementHandler;
import org.openqa.selenium.By;

public class Elements {

    public static By elementsButton = By.xpath("//h5[text()='Elements']");
    public static By alertsFrameWindowsButton = By.xpath("//h5[text()='Alerts, Frame & Windows']");
    public static By webTablesButton = By.xpath("//li[@class='btn btn-light ']//span[contains(text(),'Web Tables')]");
    public static By widgetsButton = By.xpath("//h5[text()='Widgets']");
    public static By dynamicPropertiesButton = By.xpath("//li[@class='btn btn-light ']//span[contains(text(),'Dynamic Properties')]");


    public static void openElementsPage() {
        ElementHandler.clickElement(elementsButton);

    }

    public static void openWebTables() {
        ElementHandler.clickElement(webTablesButton);

    }

    public static void alertsFrameWindows() {
        ElementHandler.clickElement(alertsFrameWindowsButton);

    }

    public static void widgets() {
        ElementHandler.clickElement(widgetsButton);

    }

    public static void dynamicProperties() {
        ElementHandler.clickElement(dynamicPropertiesButton);

    }

}

