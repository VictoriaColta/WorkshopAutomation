package testsPractice;

import model.ApplicationDemoQa;
import model.HomePageDemoQa;
import org.testng.annotations.Test;
import pages.SelectablePage;

public class Cerinta14 {
    @Test
    public void cerinta14() throws InterruptedException {
        ApplicationDemoQa.start();
        HomePageDemoQa.clickTab(HomePageDemoQa.interactions);
        SelectablePage.click(SelectablePage.selectable);
        SelectablePage.click(SelectablePage.gridTab);
        SelectablePage.clickOnDiagonalBoxes(SelectablePage.gridCell);
        Thread.sleep(2000);
        ApplicationDemoQa.close();
    }
}
