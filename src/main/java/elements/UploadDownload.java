package elements;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.File;

public class UploadDownload {

    private static By uploadDownloadSection = By.xpath("//*[@id=\"item-7\"]/span[@class='text' and contains (text(), \"Upload and Download\")]");
    private static By chooseFileButton = By.xpath("//input[@id='uploadFile']");


    public static void clickUploadDownload () {
        Application.driver().findElement(uploadDownloadSection).click();
    }

 /*   public static void forcedClickElement(By webelement) {
        WebElement element = Application.driver().findElement(webelement);
        ((JavascriptExecutor) Application.driver()).executeScript("arguments[0].click();", element);
    }*/

    public static void uploadFile () {
        WebElement choosedFile = Application.driver().findElement(chooseFileButton);
        choosedFile.sendKeys("Documents/test_report.zip");
    }






}
