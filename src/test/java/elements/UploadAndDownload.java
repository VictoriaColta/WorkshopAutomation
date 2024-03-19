package elements;

import model.SecondApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static model.SecondApplication.driver;

public class UploadAndDownload {

    public static File fileLocation = new File ("C:\\Users\\andreea.gheban\\OneDrive - Fortech srl\\Desktop\\fisierZip.zip");
    public static File fisierZip = new File(String.valueOf(fileLocation));
    private static By uploadFileElement = By.id("uploadFile");

    public static void clickUploadFile() {

        WebElement uploadFile = driver().findElement(uploadFileElement);
        uploadFile.click();
    }


    //Upload the file
    public static void uploadFile() {

        WebElement uploadFile = driver().findElement(uploadFileElement);
        uploadFile.sendKeys((CharSequence) fisierZip);
    }
    public static void uploadFileDisplayed() {

        WebElement uploadFile = driver().findElement(uploadFileElement);
        Assert.assertTrue(uploadFile.isDisplayed());
    }
}
