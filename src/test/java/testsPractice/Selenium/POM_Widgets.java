package testsPractice.Selenium;

import elements.*;
import elements.FindAndClick;
import model.Application;
import model.SecondApplication;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class POM_Widgets {

    // cerinta_6
//                Step 1: Click pe Widgets de pe pagina principala
//                Step 2: Click pe "Date Picker" din lista
//                Step 3: Sa se adauge o data pentru fiecare input, cu exact 30 de zile in viitor de la momentul rularii
    @Test
    public void testPOM_Widgets() {
        SecondApplication.start();

//        Step 1:
        HomePage.clickWidgetsSection();
//        Step 2:
        Widgets.clickDatePickerButton();

        //                Step 3:
        Widgets.selectDateOnFirstInput();
        Widgets.clickDateAndTimeLabel();

       Widgets.selectDateAndTimePicker();

        Widgets.clickDateAndTimeLabel();

        Widgets.validateSelectedDate();
       Widgets.validateDateAndTimePicker();

       SecondApplication.close();
    }

    public static class POM_ABTestingPage {
        @Test
        public void testPOM() {

            Application.start();

            ABTestngPage.clickABTestingPage();

            Assert.assertEquals("A/B Test Variation 1", ABTestngPage.getTitle());

            Assert.assertTrue(ABTestngPage.getParagraph().contains("Also known as split"));

            Application.close();
        }
    }

    public static class POM_FindAndClick {

        @Test
        public void testPOM() {
            Application.start();

    //        Step 1: Click pe Add/Remove Elements de pe pagina principala
            elements.FindAndClick.clickElementFromTextBox();

    //        Step 2: Click pe butonul Add Element
            elements.FindAndClick.clickAddElement();

    //        add another element button
            elements.FindAndClick.clickAddElement();

    //      Step 3: Sa se verifice display la butonul Delete
            elements.FindAndClick.deleteButtonIsDisplayed();

    //        Step 4: Click pe button Delete
            elements.FindAndClick.clickDeleteButton();

    //        Step 4: Click pe button Delete
            FindAndClick.deleteButtonIsNotDisplayed();


            Application.close();

        }
    }

    public static class FindAndSend {

        private By userName = By.xpath("//input[@id='userName']");
        private By passWord = By.xpath("//input[@id='password']");
        private By login = By.xpath("//button[@id='login']");

        @Test
        public void findAndSendKeys() {

            //Go to Form Authentication

            Application.start();
            WebDriver driver = Application.driver();
            driver.get("https://demoqa.com/login");

            //Gaseste campul username si insereaza username numele tau
            WebElement username = Application.driver().findElement(userName);

            username.sendKeys("Andreea");

            //Gaseste campul username si sterge ce ai scris in pasul anterior(metoda clear()) si insereaza username tomsmith
             username.clear();
            username.sendKeys("tomsmith");

            //Gaseste campul password si insereaza SuperSecretPassword!
            WebElement password = Application.driver().findElement(passWord);
            password.sendKeys("SuperSecretPassword!");

            //Fa click pe butonul Login
            WebElement loginButton = Application.driver().findElement(login);
            loginButton.click();
            driver.close();

        }
    }

    public static class POM_Slider {
    //    cerinta_11:
    //    Step 1: Click pe Widgets de pe pagina principala
    //    Step 2: Click pe "Slider" din lista
    //    Step 3: Muta slider-ul la 40, asteapta 3 secunde (puteti folosi thread.sleep) - Important pentru demo
    //    Step 4: Verifica valoare de input ca este egal cu 40
    //    Step 5: Repeta pasul 3 si 4 pentru valorile, 80, 30, 20, 99, 5, 15, 10

        @Test
        public void widgets_Slider() throws InterruptedException {
            SecondApplication.start();
            HomePage.clickWidgetsSection();
            Widgets.clickSlider();
            Slider.setAndCheckSlider(40);
            Slider.setAndCheckSlider(10);
            Slider.setAndCheckSlider(40);

            SecondApplication.close();
        }

    }

    public static class POM_WebTables {

    //    Step 1: Click pe Elements de pe pagina principala
    //    Step 2: Click pe Web Tables din lista
    //    Step 3: Editeaza al 2lea rand cu urmatoarele valori: First Name: Ion, Last Name: Pop, Age: 40, Email: test@automation.com, Salary: 15000, Department: Legal
    //    Step 4: Sa se stearga al 3lea rand din tabel
    //    Step 5: Adauga o noua linie in tabel cu orice valori

        @BeforeSuite
        public void beforeSuite(){
            System.out.println("this method runs before suite ");
        }
        @Before
        public void beforeMethod(){
            System.out.println("link will be opened!");
        }

        @After
        public void afterDriverClose(){
            System.out.println("this is the after method");
        }

        @Test
        public void testPOM_WebTables() {
            SecondApplication.start();
            HomePage.clickOnElementsSection();
            Elements.clickWebTables();

    //        Step 3:
            WebTables.clickSecondEditButton();
            WebTables.setFirstNameField("Ion");
            WebTables.setLastNameField("Pop");
            WebTables.setEmailField("test@automation.com");
            WebTables.setSalaryField("15000");
            WebTables.setDepartmentField("Legal");
            WebTables.clickSubmitButton();

    //       Step 4:
            WebTables.clickDeleteThirdButton();

    //       Step 5:
            WebTables.clickAddButton();

            SecondApplication.close();
        }

    }

    public static class POM_Widgets_Accordian {

    //    cerinta_10:
    //    Step 1: Click pe Widgets de pe pagina principala
    //    Step 2: Click pe "Accordion" din lista
    //    Step 3: Sa se creeze o metoda prin care se verifica textul dinauntru "Why do we use it?"
    //    Step 4: In test, sa ve face check numai la textul din interior, actiunea de a inchide si deschide accordion-ul
    //    se va face inauntru metodei de getTextWhyDoWeUseIt sau orice denumire doriti.

        @Test
        public void widgets_Accordion() {
            SecondApplication.start();
            HomePage.clickWidgetsSection();
            Accordian.clickOnAccordianSection();
            Assert.assertFalse(Accordian.isWhyDoWeUseItCollapsed());
            Accordian.clickOnWhyDoWeUseItSection();
            Accordian.verifyInputFromWhyDoWeUseItSection();

            SecondApplication.close();

        }
    }
}
