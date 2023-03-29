package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class Cerinta4 {
    /*
                cerinta_4
                Step 1: Click pe Elements de pe pagina principala
                Step 2: Click pe Upload and Download din lista
                Step 3: Sa se faca un upload cu un fisier de tip .zip
     */
    @Test
    public void testCerinta4() {
        Application.start();
        WebDriver driver = Application.driver();
        driver.get("https://demoqa.com/");

        //Step 1: Click pe Elements de pe pagina principala
        WebElement btnElements = driver.findElement(By.xpath("//*[@class=\"card mt-4 top-card\"][1]"));
        btnElements.click();

        //Step 2: Click pe Upload and Download din lista
        WebElement btnUploadAndDownload = driver.findElement(By.xpath("//*[@id=\"item-7\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnUploadAndDownload);
        btnUploadAndDownload.click();

        //Step 3: Sa se faca un upload cu un fisier de tip .zip
        WebElement uploadElement = driver.findElement(By.id("uploadFile"));
        File file = new File("Files/Hidden Occult Secrets.zip");
        uploadElement.sendKeys(file.getAbsolutePath());

        //Verify upload was successful
        WebElement uploadTextElement = driver.findElement(By.id("uploadedFilePath"));
        String uploadText = uploadTextElement.getText();

        Assert.assertEquals(uploadText, "C:\\fakepath\\Hidden Occult Secrets.zip");

        Application.close();
    }
}
