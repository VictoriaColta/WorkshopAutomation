package testsPractice;

import model.ApplicationDemoQa;
import model.HomePageDemoQa;
import org.testng.annotations.Test;
import pages.SortablePage;

public class Cerinta12 {
    /*
     cerinta_12:
     Step 1: Click pe Interactions de pe pagina principala
     Step 2: Click pe "Sortable" din lista
     Step 3: Sorteaza lista in formatul urmator 1.Six, 2.One , 3.Five , 4.Three , 5.Four ,6.Two

initial web list 1.One,2.Two,3.Three,4.Four,5.Five, 6.Six
     */
    @Test
    public void cerinta12() {
        ApplicationDemoQa.start();
        HomePageDemoQa.clickTab(HomePageDemoQa.interactions);
        SortablePage.click(SortablePage.sortable);
      //  SortablePage.sortList(); // it does not work
        SortablePage.moveWebElementsInOrder();

    }


}
