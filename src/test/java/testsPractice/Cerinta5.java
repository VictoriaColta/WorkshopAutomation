package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Cerinta4 {
    // test
    //cerinta_4
    //                Step 1: Click pe Elements de pe pagina principala
    //                Step 2: Click pe Upload and Download din lista
    //                Step 3: Sa se faca un upload cu un fisier de tip .zip

    private static By elementsMenu = By.xpath("//div[@class='card-body']//*[text()='Elements']");
    private static By uploadDownloadSection = By.xpath("//*[@id=\"item-7\"]/span[@class='text' and contains (text(), \"Upload and Download\")]");
    private static By chooseFileButton = By.xpath("//input[@id='uploadFile']");

 @Test
    public void testCerinta4(){

     Application.start();
     //                Step 1: Click pe Elements de pe pagina principala
     JavascriptExecutor js = (JavascriptExecutor) Application.driver();
     WebElement Element = Application.driver().findElement(elementsMenu);
     js.executeScript("arguments[0].scrollIntoView();", Element);
     Application.driver().findElement(elementsMenu).click();

    //                Step 2: Click pe Upload and Download din lista
     Application.driver().findElement(uploadDownloadSection).click();

     //                Step 3: Sa se faca un upload cu un fisier de tip .zip
     WebElement choosedFile = Application.driver().findElement(chooseFileButton);
     choosedFile.sendKeys("C:\\Users\\radu.giosanu\\OneDrive - Fortech srl\\Documents\\archive.zip");

     Application.close();
 }
}
