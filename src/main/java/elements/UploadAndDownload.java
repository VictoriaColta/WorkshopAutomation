package elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

import static model.ApplicationNumberTwo.driver;


//  cerinta_4
//          Step 1: Click pe Elements de pe pagina principala
//          Step 2: Click pe Upload and Download din lista
//          Step 3: Sa se faca un upload cu un fisier de tip .zip

public class UploadAndDownload {

    public static By textPath = By.id("uploadedFilePath");

    public static void sendFile() {

        WebElement file = driver().findElement(By.xpath("//input[@id='uploadFile']"));
        file.sendKeys("C:\\Users\\diana.niculescu\\Desktop\\http status codes.PNG");
    }

    public static String getText(By locator ) {

        WebElement textDisplayed = driver().findElement(locator);
        return textDisplayed.getText();
    }

}
