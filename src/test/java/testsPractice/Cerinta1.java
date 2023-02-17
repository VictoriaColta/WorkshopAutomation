package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Cerinta1 {

//    cerinta_1:
//    Step 1: Click pe Add/Remove Elements de pe pagina principala
//    Step 2: Click pe butonul Add Element
//    Step 3: Sa se verifice display la butonul Delete
//    Step 4: Click pe button Delete
//    Step 5: Sa se verifice ca butonul Delete nu mai apare -> Foloseste assert
 @Test
    public void testCerinta1(){

     Application.start();

     WebElement addRemoveButton = Application.driver().findElement(By.xpath("//a[@href='/add_remove_elements/']"));
     addRemoveButton.click();

     WebElement addElementButton = Application.driver().findElement(By.xpath("//button[@onclick='addElement()']"));
     addElementButton.click();

     boolean deleteButton = Application.driver().findElement(By.xpath("//button[@class='added-manually']")).isDisplayed();
     System.out.println("Is Delete button displayed? " + deleteButton);

     WebElement sameDeleteButton = Application.driver().findElement(By.xpath("//button[@class='added-manually']"));
     sameDeleteButton.click();

  // To verify if the delete button is not displayed anymore, I adapted the solution found on this site : https://www.tutorialspoint.com/how-do-i-verify-that-an-element-does-not-exist-in-selenium-2

     List<WebElement> listDeleteButton = Application.driver().findElements(By.xpath("//button[@class='added-manually']"));

     Assert.assertEquals(listDeleteButton.size(), 0);
     System.out.println("Delete button is not present");

     Application.close();
 }
}
