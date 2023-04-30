package learning.practice;


import learning.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.Assert;



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
     WebDriver driver = Application.driver();
     driver.get("https://the-internet.herokuapp.com/");
     WebElement addRemoveButton = Application.driver().findElement(By.xpath("//a[@href='/add_remove_elements/']"));
     addRemoveButton.click();

     WebElement addElementButton = Application.driver().findElement(By.xpath("//button[@onclick='addElement()']"));
     addElementButton.click();

     WebElement deleteButton = Application.driver().findElement(By.xpath("//button[@onclick='deleteElement']"));
     boolean isDisplayed = deleteButton.isDisplayed();

     Assert.assertTrue(isDisplayed);
     deleteButton.click();

     isDisplayed = deleteButton.isDisplayed();
     Assert.assertFalse(isDisplayed);




     Application.close();
 }
}
