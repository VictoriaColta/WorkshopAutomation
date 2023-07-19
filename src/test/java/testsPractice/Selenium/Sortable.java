package testsPractice.Selenium;

import elements.Accordian;
import elements.HomePage;
import elements.SortableMethods;
import model.SecondApplication;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sortable {
//cerinta_12:
//    Step 1: Click pe Interactions de pe pagina principala
//    Step 2: Click pe "Sortable" din lista
//    Step 3: Sorteaza lista in formatul urmator Six, One, Five, Three, Four, Two


    @Test
    public void sortable() {
        SecondApplication.start();
        HomePage.clickInteractionsSection();
        SortableMethods.clickSortableSection();
        SortableMethods.moveSixInList();
        SortableMethods.moveFiveInList();
        SortableMethods.moveThreeInList();
        SortableMethods.moveFourInList();
        SortableMethods.assertOrderInList();

        SecondApplication.close();

    }
}
