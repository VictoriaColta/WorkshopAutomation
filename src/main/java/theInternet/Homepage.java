package theInternet;

import Utils.ElementHandler;
import org.openqa.selenium.By;

public class Homepage {

    public static By addRemoveElementsButton = By.xpath("//a[@href='/add_remove_elements/']");

    public static void AddRemoveElements() {
        ElementHandler.clickElement(addRemoveElementsButton);

    }
}
