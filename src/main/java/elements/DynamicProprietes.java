package elements;

import Utils.ElementHandler;
import org.openqa.selenium.By;

public class DynamicProprietes {

    public static By VisibleAfter5SecondsButton = By.xpath("//button[@id='visibleAfter']");
    public static By whiteButton = By.xpath("//button[@class='mt-4 btn btn-primary' and contains(text(),'Color Change')]");
    public static By redButton = By.xpath("//button[@class='mt-4 text-danger btn btn-primary' and contains(text(),'Color Change')]");

    public static boolean isButtonVisible() {
        return ElementHandler.elementVisibilityValidation(VisibleAfter5SecondsButton);
    }

    public static boolean isButtonWhite() {
        return ElementHandler.elementVisibilityValidation(whiteButton);
    }

    public static boolean isButtonRed() {
        return ElementHandler.elementVisibilityValidation(redButton);
    }
}