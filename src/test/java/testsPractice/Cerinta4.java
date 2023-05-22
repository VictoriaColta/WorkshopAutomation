package testsPractice;

import model.ApplicationDemoQa;
import model.HomePageDemoQa;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UploadAndDownloadPage;

public class Cerinta4 {
    @Test
    public void cerinta4() {
        ApplicationDemoQa.start();
        HomePageDemoQa.clickTab(HomePageDemoQa.elements);
        UploadAndDownloadPage.click(UploadAndDownloadPage.uploadAndDownloadSection);
        UploadAndDownloadPage.upload(UploadAndDownloadPage.chooseFileButton);
        String uploadMessage = UploadAndDownloadPage.getText(UploadAndDownloadPage.uploadedFilePath);
        System.out.println(uploadMessage);
        Assert.assertTrue(uploadMessage.contains("fisier.txt"));
        ApplicationDemoQa.close();
    }
}
