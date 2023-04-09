package elements;

import model.ApplicationNumberTwo;
import model.HomePage;
import org.testng.annotations.Test;

//cerinta_2:
//        Step 1: Click pe Elements de pe pagina principala
//        Step 2: Click pe Check Box din lista
//        Step 3: Expand Home prin click pe sageata
//        Step 4: Click pe checkbox-ul aferent "Desktop"
//        Step 5: Sa se salveze textul generat de checkbox-ul selectat intr-o variabila, apoi afisata in consola

//Aceasta este a doua rezolvare
    public class POMTestCheckBox {
        @Test
        public void testPOMCheckBox (){

//        Step 1: Click pe Elements de pe pagina principala
            ApplicationNumberTwo.start();
            HomePage.clickTab(HomePage.elements);
//        Step 2: Click pe Check Box din lista
            Elements.click(Elements.checkBox);
//        Step 3: Expand Home prin click pe sageata
            CheckBox.click(CheckBox.toggle);
//        Step 4: Click pe checkbox-ul aferent "Desktop"
            CheckBox.click(CheckBox.desktop);
//        Step 5: Sa se salveze textul generat de checkbox-ul selectat intr-o variabila, apoi afisata in consola
            CheckBox.getText(CheckBox.text);
//            Inchide aplicatia
            ApplicationNumberTwo.close();
        }
}


// Aceasta este prima rezolvare.

//public class POMTestCheckBox {
//
//    @Test
//
//    public void testPomCheckbox () {
//        ApplicationNumberTwo.start();
//        HomePage.clickElements();
//        Elements.clickCheckBox();
//        CheckBox.clickToggle();
//        CheckBox.clickDesktopCheckBox();
//        CheckBox.getText();
//        ApplicationNumberTwo.close();
//    }
//}
