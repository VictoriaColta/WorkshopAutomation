package theInternet;

import Utils.ElementHandler;
import org.openqa.selenium.By;

public class AddRemoveElementsPage {

    public static By addElementButton = By.xpath("//button[@onclick='addElement()']");
    public static By deleteElementButton = By.xpath("//button[@class='added-manually']");


    public static void addElement() {
        ElementHandler.clickElement(addElementButton);

    }

    public static void deleteElement() {
        ElementHandler.clickElement(deleteElementButton);
    }

    public static boolean isDeleteButtonVisible() {
        return ElementHandler.elementVisibilityValidation(deleteElementButton);
    }
}
