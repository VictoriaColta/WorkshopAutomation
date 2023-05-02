package testsPractice;

import elements.Accordion;
import elements.HomePage;
import model.SecondApplication;
import org.testng.annotations.Test;

public class POM_Widgets_Accordion {

//    cerinta_10:
//    Step 1: Click pe Widgets de pe pagina principala
//    Step 2: Click pe "Accordion" din lista
//    Step 3: Sa se creeze o metoda prin care se verifica textul dinauntru "Why do we use it?"
//    Step 4: In test, sa ve face check numai la textul din interior, actiunea de a inchide si deschide accordion-ul
//    se va face inauntru metodei de getTextWhyDoWeUseIt sau orice denumire doriti.

    @Test
    public void widgets_Accordion() {
        SecondApplication.start();
        HomePage.clickWidgetsSection();
        Accordion.clickOnAccordianSection();

        Accordion.clickOnWhyDoWeUseItSection();
        Accordion.verifyInputFromWhyDoeWeUseItSection();


        SecondApplication.close();

    }
}
