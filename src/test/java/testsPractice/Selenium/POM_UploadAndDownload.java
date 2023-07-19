package testsPractice.Selenium;

import elements.*;
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
        HomePage.clickOnElementsSection();

//    Step 2:
        Elements.clickUploadsAndDownloads();


        UploadAndDownload.uploadFileDisplayed();
//    Step 3:

        UploadAndDownload.clickUploadFile();
        UploadAndDownload.uploadFile();

        SecondApplication.close();
    }


    public static class POMTestAlertsFrameWindows {

    //    cerinta_9:
    //    Step 1: Click pe Alerts, Frame & Windows de pe pagina principala
    //    Step 2: Click pe "Alerts" din lista
    //    Step 3: Dai click pe butonul din dreptul textului "Click Button to see alert"
    //    Step 3: Sa se verifice mesajul de alerta
    //    Step 5: Inchide alerta, si dai click pe urmatorul buton
    //    Step 6: Sa se repete aceeasi pasi pentru fiecare buton, toti pasi trebuie scrisi in acelasi TEST!!!

        @Test

        public static void testPomAlertsFrameWindows() {

            SecondApplication.start();
            HomePage.clickOnAlertsSection();
            AlertsFrames.clickAlerts();
            Alerts.clickFirstAlertButton();
            Alerts.getFirstAlertMessage();
            Alerts.clickSecondAlertButton();
            Alerts.getSecondAlertMessage();
            Alerts.clickThirdAlertButton();
            Alerts.getThirdAlertMessage();
            Alerts.verifyMessage();
            Alerts.clickFourthAlertButton();
            Alerts.sendInputAlertField("Andreea G");
            Alerts.verifyInput();
            SecondApplication.close();

        }
    }
}
