package testsPractice;

import model.Application;
import model.ApplicationHerokuapp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Cerinta2 {
    // test
    //cerinta_2:
    //Step 1: Click pe Elements de pe pagina principala
    //Step 2: Click pe Check Box din lista
    //Step 3: Expand Home prin click pe sageata
    //Step 4: Click pe checkbox-ul aferent "Desktop"
    //Step 5: Sa se salveze textul generat de checkbox-ul selectat intr-o variabila, apoi afisata in consola

    private static By elementsMenu = By.xpath("//div[@class='card-body']//*[text()='Elements']");
    private static By checkBox = By.xpath("//*[@id=\"item-1\"]/span[@class='text' and contains (text(), \"Check Box\")]");
    private static By arrowHome = By.xpath("//button[@title='Toggle']");
    private static By checkboxDesktop = By.xpath("//label[@for=\"tree-node-desktop\"]");
    private static By result = By.id("result");
 @Test
    public void testCerinta1(){

     Application.start();

    //Step 1: Click pe Elements de pe pagina principala
     JavascriptExecutor js = (JavascriptExecutor) Application.driver();
     WebElement Element = Application.driver().findElement(elementsMenu);
     js.executeScript("arguments[0].scrollIntoView();", Element);
     Application.driver().findElement(elementsMenu).click();

     //  Step 2: Click pe Check Box din lista
     Application.driver().findElement(checkBox).click();


    //Step 3: Expand Home prin click pe sageata
     Application.driver().findElement(arrowHome).click();


     //Step 4: Click pe checkbox-ul aferent "Desktop"
     Application.driver().findElement(checkboxDesktop).click();

     //Step 5: Sa se salveze textul generat de checkbox-ul selectat intr-o variabila, apoi afisata in consola
     Application.driver().findElement(result).getText();
     System.out.println("The text is:   " + result);

     //ApplicationHerokuapp.close();
     ApplicationHerokuapp.close();
 }
}
