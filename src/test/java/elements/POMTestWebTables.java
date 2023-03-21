package elements;

import model.ApplicationNumberTwo;
import model.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

//cerinta_3
//        Step 1: Click pe Elements de pe pagina principala
//        Step 2: Click pe Web Tables din lista
//        Step 3: Editeaza al 2lea rand cu urmatoarele valori: First Name: Ion, Last Name: Pop, Age: 40, Email: test@automation.com, Salary: 15000, Department: Legal
//        Step 4: Sa se stearga al 3lea rand din tabel
//        Step 5: Adauga o noua linie in tabel cu orice valori

public class POMTestWebTables {

    @Test

    public void testPomWebTables () {

        ApplicationNumberTwo.start();
        HomePage.clickElements();
        Elements.clickWebTables();
        WebTables.clickSecondEditButton();
        WebTables.manipulateFirstNameField("Ion");
        WebTables.manipulateLastNameField("Pop");
        WebTables.manipulateEmailField("test@automation.com");
        WebTables.manipulateAgeField("40");
        WebTables.manipulateSalaryField("15000");
        WebTables.manipulateDepartmentField("Legal");
        WebTables.clickSubmitButton();
        WebTables.clickThirdDeleteButton();
        WebTables.clickAddButton();
        WebTables.manipulateFirstNameField("Diana");
        WebTables.manipulateLastNameField("Niculescu");
        WebTables.manipulateEmailField("diana.niculescu@yahoo.com");
        WebTables.manipulateAgeField("26");
        WebTables.manipulateSalaryField("100000");
        WebTables.manipulateDepartmentField("Criminalistica");
        WebTables.clickSubmitButton();
        ApplicationNumberTwo.close();
    }
}
