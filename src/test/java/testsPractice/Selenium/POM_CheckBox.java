package testsPractice.Selenium;


import elements.CheckBox;
import elements.HomePage;
import model.SecondApplication;
import org.testng.annotations.Test;

public class POM_CheckBox {
    @Test
    public void testCheckBox() {

        SecondApplication.start();
//    Step 1: Click pe Elements de pe pagina principala

        HomePage.clickOnElementsSection();
//    Step 2: Click pe Check Box din lista
        CheckBox.clickOnCheckBoxSection();

//    Step 3: Expand Home prin click pe sageata
        CheckBox.clickExpandHomeArrow();

//    Step 4: Click pe checkbox-ul aferent "Desktop"
        CheckBox.clickDesktopArrowElement();

//    Step 5: Sa se salveze textul generat de checkbox-ul selectat intr-o variabila, apoi afisata in consola
        CheckBox.assertDisplayedText();

        SecondApplication.close();
    }
}
