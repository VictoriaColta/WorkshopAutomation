package testsPractice;

import elements.HomePage;
import model.SecondApplication;
import org.testng.annotations.Test;

public class POM_Hompage {


    @Test
    public void testPOM_Hompage() {
        SecondApplication.start();

        HomePage.clickOnElementsSection();
        SecondApplication.backFromBrowser();

        HomePage.validateHomePageDisplayed();
        HomePage.clickFormsSection();
        SecondApplication.backFromBrowser();

        HomePage.clickOnAlertsSection();
        SecondApplication.backFromBrowser();

        HomePage.clickWidgetsSection();
        SecondApplication.backFromBrowser();
        HomePage.validateHomePageDisplayed();


        HomePage.clickInteractionsSection();
        SecondApplication.backFromBrowser();
        HomePage.validateHomePageDisplayed();

        HomePage.clickBookStoreApplicationSection();
        SecondApplication.backFromBrowser();

        SecondApplication.close();
    }


}
