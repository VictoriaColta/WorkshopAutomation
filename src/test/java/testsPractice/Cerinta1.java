package testsPractice;

import elements.Elements;
import model.Application;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Cerinta1 {

 @Test
    public void cerinta1(){
     //    Step 1: Click pe Add/Remove Elements de pe pagina principala
     Application.startApp();
     Elements.clickAddRemoveElements();

     //    Step 2: Click pe butonul Add Element
     Elements.clickAddElement();

     //    Step 3: Sa se verifice display la butonul Delete
     Elements.deleteButtonDisplayed();

     //    Step 4: Click pe button Delete
     Elements.clickDeleteButton();

     //    Step 5: Sa se verifice ca butonul Delete nu mai apare -> Foloseste assert
    Assert.assertFalse(Elements.isDeleteButtonVisible());

     // Step 6: Close browser
     Application.close();
 }
}
