package testsPractice;

import elements.ABTestngPageElements;
import elements.FindAndClickElements;
import model.Application;
import org.testng.annotations.Test;

public class POM_ABTestingPage {
    @Test
    public void testPOM() {
        Application.start();

        ABTestngPageElements.clickABTestingPage();
        ABTestngPageElements.getTitle();
        ABTestngPageElements.getParagraph();

        Application.close();
    }
}
