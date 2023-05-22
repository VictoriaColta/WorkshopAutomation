package testsPractice;

import model.ApplicationDemoQa;
import model.HomePageDemoQa;
import org.testng.annotations.Test;
import pages.AccordianPage;

public class Cerinta10 {
    @Test
    public void cerinta10() {
        ApplicationDemoQa.start();
        HomePageDemoQa.clickTab(HomePageDemoQa.widgets);
        AccordianPage.click(AccordianPage.accordian);
        AccordianPage.getTextWhyDoWeUseIt();

        ApplicationDemoQa.close();

    }
}
