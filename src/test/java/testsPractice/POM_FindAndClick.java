package testsPractice;

import elements.FindAndClickElements;
import model.Application;
import org.testng.annotations.Test;

public class POM_FindAndClick {

    @Test
    public void testPOM() {
        Application.start();

//        Step 1: Click pe Add/Remove Elements de pe pagina principala
        FindAndClickElements.clickElementFromTextBox();

//        Step 2: Click pe butonul Add Element
        FindAndClickElements.clickAddElement();

//        add another element button
        FindAndClickElements.clickAddElement();

//      Step 3: Sa se verifice display la butonul Delete
        FindAndClickElements.deleteButtonIsDisplayed();

//        Step 4: Click pe button Delete
        FindAndClickElements.clickDeleteButton();

//        Step 4: Click pe button Delete
        FindAndClickElements.deleteButtonIsNotDisplayed();


        Application.close();

    }
}
