package theInternet;

import Utils.GeneralMethods;
import org.openqa.selenium.By;

public class Homepage {

    public static By addRemoveElementsButton = By.xpath("//a[@href='/add_remove_elements/']");

    public static void clickAddRemoveElements  (){
        GeneralMethods.clickElement(addRemoveElementsButton);

    }
}
