package testsPractice;


import elements.CheckBoxElements;
import elements.HomePageElements;
import model.Application;
import model.SecondApplication;
import org.testng.annotations.Test;

public class POM_CheckBox {
    @Test
    public void testCheckBox() {

        SecondApplication.start();
//    Step 1: Click pe Elements de pe pagina principala

        HomePageElements.clickOnElementsSection();
//    Step 2: Click pe Check Box din lista
        CheckBoxElements.clickOnCheckBoxSection();

//    Step 3: Expand Home prin click pe sageata
        CheckBoxElements.clickExpandHomeArrow();

//    Step 4: Click pe checkbox-ul aferent "Desktop"
        CheckBoxElements.clickDesktopArrowElement();

//    Step 5: Sa se salveze textul generat de checkbox-ul selectat intr-o variabila, apoi afisata in consola
        CheckBoxElements.assertDisplayedText();

        SecondApplication.close();
    }
}
