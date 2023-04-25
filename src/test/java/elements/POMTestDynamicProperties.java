package elements;


//cerinta_8:
//Step 1: Click pe Elements de pe pagina principala
//Step 2: Click pe "Dynamic properties" din lista
// Step 3: Verificat ca butonul cu textul "Visible After 5 Seconds" apare dupa 5 secunde, inclusiv schimbare culorii de la butonul
//"Color change"

import model.ApplicationNumberTwo;
import model.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POMTestDynamicProperties {

    @Test

    public static void testPOMDynamicPRoperties() {

        ApplicationNumberTwo.start();
        HomePage.clickElements();
        Elements.clickDynamicProperties();
        DynamicProperties.checkVisibleAfterFiveSecondsButton();
        DynamicProperties.checkColorChange();
        ApplicationNumberTwo.close();

    }
}
