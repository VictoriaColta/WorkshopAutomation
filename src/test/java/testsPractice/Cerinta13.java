package testsPractice;

import model.ApplicationDemoQa;
import model.HomePageDemoQa;
import org.testng.annotations.Test;
import pages.SortablePage;

public class Cerinta13 {
    @Test
    public void cerinta13()  {
        ApplicationDemoQa.start();
        HomePageDemoQa.clickTab(HomePageDemoQa.interactions);
        SortablePage.click(SortablePage.sortable);
        SortablePage.click(SortablePage.gridTab);
        SortablePage.sortGridCells(SortablePage.gridCell);

    }
}
