package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

import static model.ApplicationDemoQa.driver;

public class UploadAndDownloadPage {
    public static By uploadAndDownloadSection = By.xpath("//span[normalize-space()='Upload and Download']");
    public static By chooseFileButton = By.id("uploadFile");
    public static By uploadedFilePath = By.id("uploadedFilePath");

    public static void click(By locator) {
        driver().findElement(locator).click();
    }

    public static void upload(By locator) {
        WebElement chooseFile = driver().findElement(locator);
        File file = new File(System.getProperty("user.dir")+"/fisier.txt");
        String filePath= file.getAbsolutePath();
        System.out.println(filePath);
        chooseFile.sendKeys(filePath);
    }
    public static String getText(By locator) {
        return driver().findElement(locator).getText();
    }
}