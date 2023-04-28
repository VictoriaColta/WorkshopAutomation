package elements;


//cerinta_9:
//        Step 1: Click pe Alerts, Frame & Windows de pe pagina principala
//        Step 2: Click pe "Alerts" din lista
//        Step 3: Dai click pe butonul din dreptul textului "Click Button to see alert"
//        Step 3: Sa se verifice mesajul de alerta
//        Step 5: Inchide alerta, si dai click pe urmatorul buton
//        Step 6: Sa se repete aceeasi pasi pentru fiecare buton, toti pasi trebuie scrisi in acelasi TEST!!!


import model.ApplicationNumberTwo;
import model.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POMTestAlertsFrameWindowsCerinta9 {

    @Test

    public static void testPomAlertsFrameWindows() {

        ApplicationNumberTwo.start();
        HomePage.clickAlertsFrameWindows();
        AlertsFrameWindowsCerinta9.clickAlerts();
        Alerts.clickFirstAlertButton();
        Assert.assertTrue(Alerts.getFirstAlertMessage().contains("You clicked a button"));
        Alerts.clickSecondAlertButton();
        Assert.assertTrue(Alerts.getSecondAlertMessage().contains("This alert appeared after 5 seconds"));
        Alerts.clickThirdAlertButton();
        Assert.assertTrue(Alerts.getThirdAlertMessage().contains("Do you confirm action?"));
        Assert.assertTrue(Alerts.getMessageAfterCancelingThirdAlert().contains("Cancel"));
        Alerts.clickFourthAlertButton();
        Alerts.sendInputAlertField("Niculescu Diana Elena");
        Assert.assertTrue(Alerts.getMessageAfterSendingInput().contains("Niculescu Diana Elena"));
        ApplicationNumberTwo.close();

    }

}
