package testsPractice.Selenium;

import elements.FindAndClick;
import model.Application;
import org.testng.annotations.Test;

public class POM_FindAndClick {

    @Test
    public void testPOM() {
        Application.start();

//        Step 1: Click pe Add/Remove Elements de pe pagina principala
        FindAndClick.clickElementFromTextBox();

//        Step 2: Click pe butonul Add Element
        FindAndClick.clickAddElement();

//        add another element button
        FindAndClick.clickAddElement();

//      Step 3: Sa se verifice display la butonul Delete
        FindAndClick.deleteButtonIsDisplayed();

//        Step 4: Click pe button Delete
        FindAndClick.clickDeleteButton();

//        Step 4: Click pe button Delete
        FindAndClick.deleteButtonIsNotDisplayed();


        Application.close();

    }
}
