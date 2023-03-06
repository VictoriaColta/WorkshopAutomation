package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
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

    //    Step 1: Click pe Add/Remove Elements de pe pagina principala
    WebElement btnAddElementPage = driver.findElement(By.xpath("//a[@href='/add_remove_elements/']"));
    btnAddElementPage.click();

    //    Step 2: Click pe butonul Add Element
    WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
    addElementButton.click();

    //  Step 3: Sa se verifice display la butonul Delete
    WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
    assertTrue(deleteButton.isDisplayed());

    //    Step 4: Click pe button Delete
    deleteButton.click();

    //  Step 5: Sa se verifice ca butonul Delete nu mai apare -> Foloseste assert
    boolean isDeleteButtonDisplayed = true;
    try{
        driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
    }catch (Exception e){
        isDeleteButtonDisplayed = false;
    }
    assertFalse(isDeleteButtonDisplayed);

    Application.close();
    }
}
