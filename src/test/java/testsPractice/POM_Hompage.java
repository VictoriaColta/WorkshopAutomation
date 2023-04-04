package testsPractice;

import elements.FramesElements;
import elements.HomePageElements;
import model.SecondApplication;
import org.testng.annotations.Test;

public class POM_Hompage {


    @Test
    public void testPOM_Hompage() {
        SecondApplication.start();

        HomePageElements.clickOnElementsSection();
        SecondApplication.backFromBrowser();

        HomePageElements.clickFormsSection();
        SecondApplication.backFromBrowser();

        HomePageElements.clickOnAlertsSection();
        SecondApplication.backFromBrowser();

        HomePageElements.clickWidgetsSection();
        SecondApplication.backFromBrowser();

        HomePageElements.clickInteractionsSection();
        SecondApplication.backFromBrowser();


        HomePageElements.clickBookStoreApplicationSection();
        SecondApplication.backFromBrowser();

        SecondApplication.close();
    }


}
