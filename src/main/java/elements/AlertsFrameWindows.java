package elements;

import Utils.GeneralMethods;
import org.openqa.selenium.By;

public class AlertsFrameWindows {

    public static By framesButton = By.xpath("//li[@id='item-2']//span[contains(text(),'Frames')]");
    public static By checkDesktopCheckBox = By.xpath(" //span[contains(text(),'Desktop')]");

    public static void frames  (){
        GeneralMethods.clickElement(framesButton);

    }

    static String desktopText = "This is a sample page";
}
