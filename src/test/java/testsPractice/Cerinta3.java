package testsPractice;

import elements.WebTable;
import pages.Homepage;
import model.Application;
import org.testng.annotations.Test;

public class Cerinta3 {

    @Test
    public void cerinta3 () {
        //  Step 1: Click pe Elements de pe pagina principala
        Application.start();
        Homepage.scrollUntilElementIsVisible();
        Homepage.clickElementsMenu();

        // Step 2: Click pe Web Tables din lista
        WebTable.clickWebTables();

        // Step 3: Editeaza al 2lea rand cu urmatoarele valori: First Name: Ion, Last Name: Pop, Age: 40, Email: test@automation.com, Salary: 15000, Department: Legal
        WebTable.clickEditButton();
        WebTable.updateFirstName();
        WebTable.updateLastName();
        WebTable.updateEmail();
        WebTable.updateAge();
        WebTable.updateSalary();
        WebTable.updateDepartment();
        WebTable.clickSubmit();

        // Step 4: Sa se stearga al 3lea rand din tabel
        WebTable.deleteThirdRow();

        // Step 5: Adauga o noua linie in tabel cu orice valori
        WebTable.addNewRow();
        WebTable.addFirstName();
        WebTable.addLastName();
        WebTable.addEmail();
        WebTable.addAge();
        WebTable.addSalary();
        WebTable.addDepartment();
        WebTable.clickSubmit();

        // Step 6: Close browser
        Application.close();
    }
}
