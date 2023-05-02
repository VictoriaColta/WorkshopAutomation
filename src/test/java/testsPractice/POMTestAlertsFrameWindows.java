package testsPractice;

import elements.Alerts;
import elements.AlertsFrames;
import elements.HomePage;
import model.SecondApplication;
import org.testng.annotations.Test;

public class POMTestAlertsFrameWindows {

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
