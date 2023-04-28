package testsPractice;

import Utils.Drivers;
import elements.CheckBox;
import elements.Elements;
import org.testng.annotations.Test;

//    Folosind model/Application.java, sa se deschida aplicatia https://demoqa.com/
//    cerinta_2:
//    Step 1: Click pe Elements de pe pagina principala
//    Step 2: Click pe Check Box din lista
//    Step 3: Expand Home prin click pe sageata
//    Step 4: Click pe checkbox-ul aferent "Desktop"
//    Step 5: Sa se salveze textul generat de checkbox-ul selectat intr-o variabila, apoi afisata in consola

public class Cerinta2 {

    @Test
    public void testCerinta2() {
        Drivers.startDriver();
        Elements.openElementsPage();
        CheckBox.openCheckBox();
        CheckBox.openArrow();
        CheckBox.checkDesktop();
        CheckBox.displayMessage();

    }
}
