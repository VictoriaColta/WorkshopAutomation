package elements;
import Utils.GeneralMethods;
import org.openqa.selenium.By;

public class Elements {

    public static By elementsButton = By.xpath("//h5[text()='Elements']");
    public static By alertsFrameWindowsButton = By.xpath("//h5[text()='Alerts, Frame & Windows']");
    public static By webTablesButton = By.xpath("//li[@id='item-3']//span[contains(text(),'Web Tables')]");
    public static By widgetsButton = By.xpath("//h5[text()='Widgets']");



    public static void openElementsPage  () throws Exception {
        GeneralMethods.clickElement(elementsButton);

    }

    public static void openWebTables  (){
        GeneralMethods.clickElement(webTablesButton);

    }

    public static void alertsFrameWindows  (){
        GeneralMethods.clickElement(alertsFrameWindowsButton);

    }
    public static void widgets  (){
        GeneralMethods.clickElement(widgetsButton);

    }

}

