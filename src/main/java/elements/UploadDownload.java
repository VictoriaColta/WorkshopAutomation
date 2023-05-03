package elements;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Handler;

import java.io.File;

public class UploadDownload {

    private static By uploadDownloadSection = By.xpath("//*[@id=\"item-7\"]/span[@class='text' and contains (text(), \"Upload and Download\")]");
    private static By chooseFileButton = By.xpath("//input[@id='uploadFile']");


    public static void clickUploadDownload () {Handler.clickElement(uploadDownloadSection);}

    public static void clickChooseFile () {Handler.forcedClickElement(chooseFileButton);}

    public static void uploadFile () {
        WebElement choosedFile = Application.driver().findElement(chooseFileButton);
        choosedFile.sendKeys("C:\\Users\\catalina.bogdan\\Downloads\\automation_test");
    }



}
