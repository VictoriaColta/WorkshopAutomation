package testsPractice;

import Utils.Drivers;
import Utils.ElementHandler;
import elements.DynamicProprietes;
import elements.Elements;
import org.testng.Assert;
import org.testng.annotations.Test;

//    cerinta_8:
//    Step 1: Click pe Elements de pe pagina principala
//    Step 2: Click pe "Dynamic properties" din lista
//    Step 3: Verificat ca butonul cu textul "Visible After 5 Seconds" apare dupa 5 secunde, inclusiv schimbare culorii de la butonul
//                "Color change"


public class Cerinta8 {
    @Test
    public void testCerinta6() {
        Drivers.startDriver();
        Elements.openElementsPage();
        ElementHandler.scrollDown();
        Elements.dynamicProperties();
        Assert.assertFalse(DynamicProprietes.isButtonVisible());
        Assert.assertTrue(DynamicProprietes.isButtonWhite());
        ElementHandler.waitForElement(DynamicProprietes.VisibleAfter5SecondsButton);
        Assert.assertTrue(DynamicProprietes.isButtonVisible());
        ElementHandler.waitForElement(DynamicProprietes.redButton);
        Assert.assertTrue(DynamicProprietes.isButtonRed());
    }


}
