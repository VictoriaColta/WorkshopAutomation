package testsPractice;

import elements.ABTestngPageElements;
import elements.FindAndClickElements;
import model.Application;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POM_ABTestingPage {
    @Test
    public void testPOM() {

        Application.start();

        ABTestngPageElements.clickABTestingPage();

        Assert.assertEquals("A/B Test Variation 1", ABTestngPageElements.getTitle());

        Assert.assertTrue(ABTestngPageElements.getParagraph().contains("Also known as split"));

        Application.close();
    }
}
