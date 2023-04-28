package elements;
import model.ApplicationNumberTwo;
import model.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


//cerinta_10:
//        Step 1: Click pe Widgets de pe pagina principala
//        Step 2: Click pe "Accordion" din lista
//        Step 3: Sa se creeze o metoda prin care se verifica textul dinauntru "Why do we use it?"
//        Step 4: In test, sa ve face check numai la textul din interior, actiunea de a inchide si deschide accordion-ul
//        se va face inauntru metodei de getTextWhyDoWeUseIt sau orice denumire doriti.




public class POMTestWidgetsAccordion {

    @Test

    public static void testPOMWidgetsAccordion() {

        ApplicationNumberTwo.start();
        HomePage.clickWidgets();
        Widgets.clickAccordian();
        Assert.assertFalse(Accordian.isFieldWhyDoWeUseItCollapsed());
        Accordian.clickThirdField();
        Assert.assertEquals(Accordian.getThirdFieldContentAfterWaitingThreeSeconds(), "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
        ApplicationNumberTwo.close();
    }
}
