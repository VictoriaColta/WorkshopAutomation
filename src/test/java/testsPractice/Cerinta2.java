package testsPractice;

import model.Application;
import model.ApplicationHerokuapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static model.Application.driver;

public class Cerinta1 {
    // test
//    cerinta_1:
//    Step 1: Click pe Add/Remove Elements de pe pagina principala
//    Step 2: Click pe butonul Add Element
//    Step 3: Sa se verifice display la butonul Delete
//    Step 4: Click pe button Delete
//    Step 5: Sa se verifice ca butonul Delete nu mai apare -> Foloseste assert
 @Test
    public void testCerinta1(){

     ApplicationHerokuapp.start();
    WebDriver driver = ApplicationHerokuapp.driver();
    driver.get("https://the-internet.herokuapp.com/");

    WebElement addElementPage = driver.findElement(By.xpath("//a[@href=\"/add_remove_elements/\"]"));
//    Step 1: Click pe Add/Remove Elements de pe pagina principala
     addElementPage.click();
//    Step 2: Click pe butonul Add Element
     WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick=\"addElement()\"]"));
     addElementButton.click();
//    Step 3: Sa se verifice display la butonul Delete
     WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick=\"deleteElement()\"]"));
     Assert.assertTrue(deleteButton.isDisplayed());
//    Step 4: Click pe button Delete
     deleteButton.click();
//    Step 5: Sa se verifice ca butonul Delete nu mai apare -> Foloseste assert
     boolean isDeleteButtonPresent = true;
     try{
         driver.findElement(By.xpath("//button[@onclick=\"deleteElement()\"]"));
     }catch (Exception e){
         isDeleteButtonPresent = false;
     }
     Assert.assertFalse(isDeleteButtonPresent);

     //ApplicationHerokuapp.close();
     ApplicationHerokuapp.close();
 }
}
