package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
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
    public void testCerinta1() {

        Application.start();
        WebDriver driver = Application.driver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement addElementPage = driver.findElement(By.xpath("//a[@href='/add_remove_elements/']"));


        //    Step 1: Click pe Add/Remove Elements de pe pagina principala
        addElementPage.click();

        //    Step 2: Click pe butonul Add Element
        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementButton.click();

//  Step 3: Sa se verifice display la butonul Delete
        WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        deleteButton.isDisplayed();

//    Step 4: Click pe button Delete
        deleteButton.click();

//  Step 5: Sa se verifice ca butonul Delete nu mai apare -> Foloseste assert

//        WebElement deleteIsNotDisplayed = driver.findElement(By.id("elements"));
//     boolean visible = Application.driver().findElement(By.xpath("//div[@id='elements']")).isDisplayed();
        boolean flag = true;

        try {
            deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
            flag = false;

        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(flag);

//     System.out.println("Delete button is not displayed");
//
//     Assert.assertTrue(visible);

        driver.close();
    }
}
