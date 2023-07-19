package testsPractice.Selenium;

import elements.*;
import model.SecondApplication;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class POM_WebTables {

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

    public static class POM_Widgets {

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
    }

    public static class testPOMDynamicProperties {
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
}
