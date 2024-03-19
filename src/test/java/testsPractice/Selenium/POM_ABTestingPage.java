package testsPractice.Selenium;

import elements.ABTestngPage;
import model.Application;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POM_ABTestingPage {
    @Test
    public void testPOM() {

        Application.start();

        ABTestngPage.clickABTestingPage();

        Assert.assertEquals("A/B Test Variation 1", ABTestngPage.getTitle());

        Assert.assertTrue(ABTestngPage.getParagraph().contains("Also known as split"));

        Application.close();
    }
}
