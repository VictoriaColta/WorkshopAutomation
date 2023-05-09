package testsPractice;
import elements.Elements;
import elements.HomePage;

import elements.WebTables;
import model.SecondApplication;
import org.testng.annotations.Test;

public class POM_WebTables {

//    Step 1: Click pe Elements de pe pagina principala
//    Step 2: Click pe Web Tables din lista
//    Step 3: Editeaza al 2lea rand cu urmatoarele valori: First Name: Ion, Last Name: Pop, Age: 40, Email: test@automation.com, Salary: 15000, Department: Legal
//    Step 4: Sa se stearga al 3lea rand din tabel
//    Step 5: Adauga o noua linie in tabel cu orice valori

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
