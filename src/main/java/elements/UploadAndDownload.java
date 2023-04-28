package elements;

import Utils.ElementHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utils.Drivers.driver;

public class UploadAndDownload {

    public static By UploadAndDownloadButton = By.xpath("//li[@class='btn btn-light ']//span[contains(text(),'Upload and Download')]");
    public static By clickChooseFileButton = By.xpath("//input[@id='uploadFile']");

    public static By fileLoaded = By.id("uploadedFilePath");
    public static void openUploadAndDownload() {
        ElementHandler.scrollDown();
        ElementHandler.clickElement(UploadAndDownloadButton);
        ElementHandler.forcedClickElement(clickChooseFileButton);
        WebElement chooseFile = driver.findElement(clickChooseFileButton);
        chooseFile.sendKeys("C:\\Users\\petronela.zuzuleac\\OneDrive - Fortech srl\\Desktop");
    }

    public static boolean isFileLoaded() {
        return ElementHandler.elementVisibilityValidation(fileLoaded);
    }


}

