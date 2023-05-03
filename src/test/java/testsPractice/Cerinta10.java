package testsPractice;

import home.HomePage;
import model.Application;
import org.testng.Assert;
import org.testng.annotations.Test;
import widgets.Accordian;
import widgets.Widgets;

public class Cerinta10 {
        @Test
        public void cerinta10() {
            Application.start();

//            Step 1: Click pe Widgets de pe pagina principala
            HomePage.clickWidgets();

//            Step 2: Click pe "Accordion" din lista
            Widgets.clickAccordian();

//            Step 3: Sa se creeze o metoda prin care se verifica textul dinauntru "Why do we use it?"
//            Step 4: In test, sa ve face check numai la textul din interior, actiunea de a inchide si deschide accordion-ul
//            se va face inauntru metodei de getTextWhyDoWeUseIt sau orice denumire doriti.
            Assert.assertTrue(Accordian.getTextWhy().contains("Content here, content here"));

            Application.close();
        }
}
