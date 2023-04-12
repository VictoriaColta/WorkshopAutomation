package elements;

import Utils.GeneralMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utils.Drivers.driver;

public class UploadAndDownload {

    public static By UploadAndDownloadButton = By.xpath("//li[@id='item-7']//span[contains(text(),'Upload and Download')]");
    public static By clickChooseFileButton = By.xpath("//input[@id='uploadFile']");

    public static void openUploadAndDownload  () throws Exception {
        GeneralMethods.scrollDown();
        GeneralMethods.clickElement(UploadAndDownloadButton);
        GeneralMethods.forcedClickElement(clickChooseFileButton);
        WebElement chooseFile = driver.findElement(clickChooseFileButton);
        chooseFile.sendKeys("C:\\Users\\petronela.zuzuleac\\OneDrive - Fortech srl\\Desktop");
    }

}

