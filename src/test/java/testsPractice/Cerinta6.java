package testsPractice;

import model.ApplicationDemoQa;
import model.HomePageDemoQa;
import org.testng.annotations.Test;
import pages.DatePickerPage;

public class Cerinta6 {
    @Test
    public void cerinta6() {
        ApplicationDemoQa.start();
        HomePageDemoQa.clickTab(HomePageDemoQa.widgets);
        DatePickerPage.setDate();
        ApplicationDemoQa.close();
    }

}
