package testsPractice;

import model.Application;
import model.ApplicationDemoQa;
import model.HomePageDemoQa;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UploadAndDownloadPage;

public class UploadAndDownload {
    @Test
    public void cerinta4()  {
        ApplicationDemoQa.start();
        HomePageDemoQa.clickTab(HomePageDemoQa.elements);
        UploadAndDownloadPage.click(UploadAndDownloadPage.uploadAndDownloadSection);
        UploadAndDownloadPage.upload(UploadAndDownloadPage.chooseFileButton);
        String filePath=UploadAndDownloadPage.getText(UploadAndDownloadPage.uploadedFilePath);
        System.out.println(filePath);
        Assert.assertTrue(filePath.contains("C:\\fakepath\\myFiles.zip"));
        ApplicationDemoQa.close();
    }
}
