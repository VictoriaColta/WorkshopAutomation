package testsPractice;

import elements.FindAndClickElements;
import model.Application;
import org.testng.annotations.Test;

public class POM_FindAndClick {

    @Test
    public void testPOM() {
        Application.start();

        FindAndClickElements.clickElementFromTextBox();
        FindAndClickElements.clickAddElement();
//        add another element button
        FindAndClickElements.clickAddElement();
        FindAndClickElements.clickDeleteButton();

        Application.close();
    }
}
