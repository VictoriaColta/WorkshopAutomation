package testsPractice;

import model.Application;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
    @BeforeMethod
    public void start(){
        Application.start();
    }
    @AfterMethod
    public void close(){
        Application.close();
    }
    @Test
    public void testCerinta1() {
        AddRemovePage.click(AddRemovePage.addRemoveSection);
        AddRemovePage.click(AddRemovePage.addElementButton);
        Assert.assertTrue(AddRemovePage.checkIfDeleteButtonIsDisplayed());
        AddRemovePage.click(AddRemovePage.deleteButton);
        Assert.assertFalse(AddRemovePage.checkIfDeleteButtonIsDisplayed());
    }
}
