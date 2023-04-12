package elements;

import Utils.GeneralMethods;
import org.openqa.selenium.By;

public class CheckBox {

    public static By CheckBoxButton = By.xpath("//li[@id='item-1']//span[contains(text(),'Check Box')]");
    public static By clickArrow = By.xpath("//button[@title='Toggle']");
    public static By checkDesktopCheckBox = By.xpath(" //span[contains(text(),'Desktop')]");
    
    

    public static void openCheckBox  (){
        GeneralMethods.clickElement(CheckBoxButton);

    }
    
    public static void openArrow  (){
        GeneralMethods.clickElement(clickArrow);

    }
    public static void checkDesktop  () {
        GeneralMethods.clickElement(checkDesktopCheckBox);

    }
    static String desktopText = "desktop notes commands";

    public static void displayMessage  () {
        System.out.println(desktopText);

    }
}
