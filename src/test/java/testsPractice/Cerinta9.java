package testsPractice;

import model.ApplicationDemoQa;
import model.HomePageDemoQa;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class Cerinta9 {
    @Test
    public void cerinta9() throws InterruptedException {
        ApplicationDemoQa.start();
        HomePageDemoQa.clickTab(HomePageDemoQa.alertsFramesWindows);
        AlertsPage.click(AlertsPage.alertsSection);
       //first button
        AlertsPage.click(AlertsPage.alertButton);
        Assert.assertTrue(AlertsPage.getFirstAlertBoxMessage().contains("You clicked a button"));
        //second button
        AlertsPage.click(AlertsPage.timerAlertButton);
        Assert.assertTrue(AlertsPage.getSecondAlertBoxMessage().contains("This alert appeared after 5 seconds"));
        //third button
        AlertsPage.click(AlertsPage.confirmButton);
        Assert.assertTrue(AlertsPage.getThirdAlertMessage().contains("Do you confirm action?"));
        Assert.assertTrue(AlertsPage.getMessageAfterCancelingThirdAlert().contains("Cancel"));
        //fourth button
        AlertsPage.click(AlertsPage.promtButton);
        AlertsPage.sendInputAlertField("Madalina");
        Assert.assertTrue(AlertsPage.getMessageAfterSendingInput().contains("Madalina"));
        ApplicationDemoQa.close();
    }
}
