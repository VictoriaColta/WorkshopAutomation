package elements;

import model.ApplicationNumberTwo;
import model.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

//cerinta_3
//        Step 1: Click pe Elements de pe pagina principala
//        Step 2: Click pe Web Tables din lista
//        Step 3: Editeaza al 2lea rand cu urmatoarele valori: First Name: Ion, Last Name: Pop, Age: 40,
//                Email: test@automation.com, Salary: 15000, Department: Legal
//        Step 4: Sa se stearga al 3lea rand din tabel
//        Step 5: Adauga o noua linie in tabel cu orice valori

// A doua rezolvare
public class POMTestWebTables {

    @Test

    public static void testPOMWebTables() {

//  Step 1: Click pe Elements de pe pagina principala
        ApplicationNumberTwo.start();
        HomePage.clickTab(HomePage.elements);
//  Step 2: Click pe Web Tables din lista
        Elements.click(Elements.webTables);
//  Step 3: Editeaza al 2lea rand cu urmatoarele valori: First Name: Ion, Last Name: Pop, Age: 40,
//  Email: test@automation.com, Salary: 15000, Department: Legal
        WebTables.click(WebTables.secondEditButton);
        WebTables.enterValues(WebTables.firstNameField,"Ion");
        WebTables.enterValues(WebTables.lastNameField,"Pop");
        WebTables.enterValues(WebTables.emailField,"test@automation.com");
        WebTables.enterValues(WebTables.ageField,"40");
        WebTables.enterValues(WebTables.salaryField,"15000");
        WebTables.enterValues(WebTables.departmentField,"Legal");
        WebTables.click(WebTables.submitButton);
//  Step 4: Sa se stearga al 3lea rand din tabel
        WebTables.click(WebTables.deleteButton);
//  Step 5: Adauga o noua linie in tabel cu orice valori
        Elements.click(WebTables.addNewRecord);
        WebTables.enterValues(WebTables.firstNameField,"Diana");
        WebTables.enterValues(WebTables.lastNameField,"Niculescu");
        WebTables.enterValues(WebTables.emailField,"Diana@yahoo.com");
        WebTables.enterValues(WebTables.ageField,"26");
        WebTables.enterValues(WebTables.salaryField,"5");
        WebTables.enterValues(WebTables.departmentField,"QA");
        WebTables.click(WebTables.submitButton);
//  Inchide aplicatia
        ApplicationNumberTwo.close();
    }
}

// Prima rezolvare

//public class POMTestWebTables {
//
//    @Test
//
//    public void testPomWebTables () {
//
//        ApplicationNumberTwo.start();
//        HomePage.clickElements();
//        Elements.clickWebTables();
//        WebTables.clickSecondEditButton();
//        WebTables.manipulateFirstNameField("Ion");
//        WebTables.manipulateLastNameField("Pop");
//        WebTables.manipulateEmailField("test@automation.com");
//        WebTables.manipulateAgeField("40");
//        WebTables.manipulateSalaryField("15000");
//        WebTables.manipulateDepartmentField("Legal");
//        WebTables.clickSubmitButton();
//        WebTables.clickThirdDeleteButton();
//        WebTables.clickAddButton();
//        WebTables.manipulateFirstNameField("Diana");
//        WebTables.manipulateLastNameField("Niculescu");
//        WebTables.manipulateEmailField("diana.niculescu@yahoo.com");
//        WebTables.manipulateAgeField("26");
//        WebTables.manipulateSalaryField("100000");
//        WebTables.manipulateDepartmentField("Criminalistica");
//        WebTables.clickSubmitButton();
//        ApplicationNumberTwo.close();
//    }
//}
