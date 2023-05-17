package learning.elements;

import learning.Application;
import learning.model.elements.Alerts;
import learning.model.pages.Home;
import org.testng.Assert;
import org.testng.annotations.Test;

import static learning.Application.driver;

public class AlertsTest {
    @Test
    public static void alertsTest() {
        Application.start();
        driver().get("https://demoqa.com");

        Home.clickAlertsFrameWindows();
        Alerts.clickAlertsSubcategory();

        Alerts.clickFirstAlertButton();
        String alertFirstText = Alerts.getFirstAlertText();
        Assert.assertEquals(alertFirstText, "You clicked a button");

        Alerts.clickSecondAlertButton();
        String alertSecondText = Alerts.getSecondAlertText();
        Assert.assertEquals(alertSecondText, "This alert appeared after 5 seconds");

        Alerts.clickThirdAlertButton();
//        String alertThirdText = Alerts.getThirdAlertText();
//        Assert.assertEquals(alertThirdText,"Do you confirm action?");
        Alerts.clickOkButton();
        String thirdButtonLabelText = Alerts.getThirdButtonLabelText();
        Assert.assertEquals(thirdButtonLabelText, "You selected Ok");

        Alerts.clickThirdAlertButton();
        Alerts.clickCancelButton();
        thirdButtonLabelText = Alerts.getThirdButtonLabelText();
        Assert.assertEquals(thirdButtonLabelText,"You selected Cancel");



    }

}
