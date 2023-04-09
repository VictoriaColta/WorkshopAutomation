package elements;

//import Utilities.ElementsActions;
import model.ApplicationNumberTwo;
import model.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//  CERINTA 4
//          Step 1: Click pe Elements de pe pagina principala
//          Step 2: Click pe Upload and Download din lista
//          Step 3: Sa se faca un upload cu un fisier de tip .zip

//A doua rezolvare

public class POMTestUploadAndDownload {

    @Test

    public static void testPOMUploadAndDownload() {

//  Step 1: Click pe Elements de pe pagina principala
        ApplicationNumberTwo.start();
        HomePage.clickTab(HomePage.elements);
//  Step 2: Click pe Upload and Download din lista
        Elements.click(Elements.uploadAndDownload);
//  Step 3: Sa se faca un upload cu un fisier de tip .zip
        UploadAndDownload.sendFile();
        Assert.assertTrue(UploadAndDownload.getText(UploadAndDownload.textPath).contains("C:\\fakepath\\http status codes.PNG"));
//  Inchide aplicatia
        ApplicationNumberTwo.close();
    }
}


// Prima rezolvare
//public class POMTestUploadAndDownload {
//
//    @Test
//
//    public void testUploadAndDownload() {
//
//        ApplicationNumberTwo.start();
//        HomePage.clickElements();
//        ElementsActions.click(By.xpath("//span[text()='Upload and Download']"));
//        UploadAndDownload.sendFile();
//    }
//
//}
