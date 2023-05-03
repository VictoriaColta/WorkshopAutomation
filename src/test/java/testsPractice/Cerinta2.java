package testsPractice;

import elements.Checkbox;
import org.testng.Assert;
import pages.Homepage;
import model.Application;
import org.testng.annotations.Test;

public class Cerinta2 {

@Test
    public void cerinta2() {

    //  Step 1: Click pe Elements de pe pagina principala
    Application.start();
    Homepage.clickElementsMenu();

    //  Step 2: Click pe Check Box din lista
    Checkbox.clickCheckBox();

    //  Step 3: Expand Home prin click pe sageata
    Checkbox.clickArrowHome();

    //  Step 4: Click pe checkbox-ul aferent "Desktop"
    Checkbox.clickCheckboxDesktop();

    //  Step 5: Sa se salveze textul generat de checkbox-ul selectat intr-o variabila, apoi afisata in consola
    Checkbox.getResultText();


 /*   // Step 6: Close browser
    Application.close();*/

    }
}
