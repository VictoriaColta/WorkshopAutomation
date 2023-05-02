package testsPractice;

import elements.DynamicProperties;
import elements.Elements;
import elements.HomePage;
import model.SecondApplication;
import org.testng.annotations.Test;

public class testPOMDynamicProperties {
//    cerinta_8:
//    Step 1: Click pe Elements de pe pagina principala
//    Step 2: Click pe "Dynamic properties" din lista
//    Step 3: Verificat ca butonul cu textul "Visible After 5 Seconds" apare dupa 5 secunde, inclusiv schimbare culorii de la butonul
//                "Color change"
    @Test
    public static void dynamicProperties() {

        SecondApplication.start();
        HomePage.clickOnElementsSection();
        Elements.clickDynamicProperties();
        DynamicProperties.checkButtonIsVisibleAfterFiveSeconds(3);

        SecondApplication.close();

    }
}
