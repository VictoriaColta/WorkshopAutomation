package testsPractice;
import elements.Elements;
import elements.HomePageElements;

import elements.WebTablesElements;
import model.SecondApplication;
import org.testng.annotations.Test;

public class POM_WebTables {

//    Step 1: Click pe Elements de pe pagina principala
//    Step 2: Click pe Web Tables din lista
//    Step 3: Editeaza al 2lea rand cu urmatoarele valori: First Name: Ion, Last Name: Pop, Age: 40, Email: test@automation.com, Salary: 15000, Department: Legal
//    Step 4: Sa se stearga al 3lea rand din tabel
//    Step 5: Adauga o noua linie in tabel cu orice valori

    @Test
    public void testPOM() {
        SecondApplication.start();
        HomePageElements.clickOnElementsSection();
        Elements.clickWebTables();

//        Step 3:
        WebTablesElements.clickSecondEditButton();
        WebTablesElements.setFirstNameField("Ion");
        WebTablesElements.setLastNameField("Pop");
        WebTablesElements.setEmailField("test@automation.com");
        WebTablesElements.setSalaryField("15000");
        WebTablesElements.setDepartmentField("Legal");
        WebTablesElements.clickSubmitButton();

//       Step 4:
        WebTablesElements.clickDeleteThirdButton();

//       Step 5:
        WebTablesElements.clickAddButton();

        SecondApplication.close();
    }

}
