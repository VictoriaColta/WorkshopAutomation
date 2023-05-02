package testsPractice;

import model.Application;
import org.testng.annotations.Test;
import pages.AddRemovePage;

public class Cerinta1 {
    AddRemovePage addRemoveElements = new AddRemovePage();

    //    cerinta_1:
//    Step 1: Click pe Add/Remove Elements de pe pagina principala
//    Step 2: Click pe butonul Add Element
//    Step 3: Sa se verifice display la butonul Delete
//    Step 4: Click pe button Delete
//    Step 5: Sa se verifice ca butonul Delete nu mai apare -> Foloseste assert
    @Test
    public void testCerinta1() {
        Application.start();
        AddRemovePage.clickAddRemove();
        AddRemovePage.clickAddElement();
        AddRemovePage.checkIfDeleteButtonIsDisplayed();
        AddRemovePage.clickDeleteButton();
        addRemoveElements.checkThatDeleteButtonIsNotDisplayed();
        Application.close();

    }
}
