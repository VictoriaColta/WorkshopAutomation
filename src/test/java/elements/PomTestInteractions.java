package elements;

import model.ApplicationNumberTwo;
import model.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


//  cerinta_12:
//          Step 1: Click pe Interactions de pe pagina principala
//          Step 2: Click pe "Sortable" din lista
//          Step 3: Sorteaza lista in formatul urmator Six, One, Five, Three, Four, Two ( 6 1 5 3 4 2 )


public class PomTestInteractions {

    @Test

    public static void testPomInteractions() throws InterruptedException {

        ApplicationNumberTwo.start();
        HomePage.clickInteractions();
        Interactions.clickSortable();
        Sortable.moveSixInList();
        Sortable.moveFiveInList();
        Sortable.moveThreeInList();
        Sortable.moveFourInList();
        Assert.assertEquals(Sortable.checkFirstNumber(), "Six\n" + "One\n" + "Five\n" + "Three\n" + "Four\n" + "Two"); // am scris asa pt a aparea unele sub altele
        ApplicationNumberTwo.close();


    }


}


// Prima incercare:


//        Sortable.sortNumbers(six,firstPlace);
//        Sortable.sortNumbers(five,thirdPlace);
//        Sortable.sortNumbers(three,fourthPlace);
//        Sortable.sortNumbers(four,fifthPlace);
//        Assert.assertEquals(Sortable.verifyNumber(),"Six\n" + "One\n" + "Five\n" + "Three\n" + "Four\n" + "Two");

















