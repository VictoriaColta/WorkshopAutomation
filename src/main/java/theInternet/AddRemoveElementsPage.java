package theInternet;

import Utils.GeneralMethods;
import org.openqa.selenium.By;

public class AddRemoveElementsPage {

    public static By addElementButton = By.xpath("//button[@onclick='addElement()']");
    public static By deleteElementButton = By.xpath("//button[@class='added-manually']");


    public static void addElement  (){
        GeneralMethods.clickElement(addElementButton);
        GeneralMethods.elementIsDisplayed(deleteElementButton);
    }

    public static void deleteElement (){
        GeneralMethods.clickElement(deleteElementButton);
    }

}
