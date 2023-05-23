package elements;

import model.ApplicationNumberTwo;
import model.HomePage;
import org.testng.annotations.*;

//cerinta_2:
//        Step 1: Click pe Elements de pe pagina principala
//        Step 2: Click pe Check Box din lista
//        Step 3: Expand Home prin click pe sageata
//        Step 4: Click pe checkbox-ul aferent "Desktop"
//        Step 5: Sa se salveze textul generat de checkbox-ul selectat intr-o variabila, apoi afisata in consola

//Aceasta este a doua rezolvare

    public class POMTestCheckBox {
        @BeforeSuite
        public static void printBeforeSuiteText() {

            System.out.println("This is before suite text for POMTestCheckBox");

        }
        @BeforeMethod
        public static void printBeforeMethodText() {

            System.out.println("This is before method text for POMTestCheckBox");

        }
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
        @AfterSuite
        public static void printAfterSuiteText() {

            System.out.println("This is after suite text for POMTestCheckBox");

        }

        @AfterMethod

        public static void printAfterMethodText() {

            System.out.println("This is after method text for POMTestCheckBox");

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
