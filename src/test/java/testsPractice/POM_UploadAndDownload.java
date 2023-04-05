package testsPractice;

import elements.Elements;
import elements.HomePageElements;
import elements.UploadAndDownloadElements;
import model.SecondApplication;
import org.testng.annotations.Test;

public class POM_UploadAndDownload {

//    cerinta_4
//    Step 1: Click pe Elements de pe pagina principala
//    Step 2: Click pe Upload and Download din lista
//    Step 3: Sa se faca un upload cu un fisier de tip .zip


    @Test
    public void testPOM() {
        SecondApplication.start();
        HomePageElements.clickOnElementsSection();

//    Step 2:
        Elements.clickUploadsAndDownloads();


        UploadAndDownloadElements.uploadFileDisplayed();
//    Step 3:

        UploadAndDownloadElements.clickUploadFile();
        UploadAndDownloadElements.uploadFile();

        SecondApplication.close();
    }


}
