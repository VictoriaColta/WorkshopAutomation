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
        Homepage.clickElementsMenu();

        // Step 2: Click pe Web Tables din lista
        WebTable.clickWebTables();

        // Step 3: Editeaza al 2lea rand cu urmatoarele valori: First Name: Ion, Last Name: Pop, Age: 40, Email: test@automation.com, Salary: 15000, Department: Legal
        WebTable.clickEditButton();
        WebTable.updateRecords("Ion", "Cojocaru", "ion.cojocaru@yahoo.com", "45","15000","IT");
        WebTable.clickSubmit();
        // Add assert dupa submit

        // Step 4: Sa se stearga al 3lea rand din tabel
        WebTable.deleteThirdRow();

        // Step 5: Adauga o noua linie in tabel cu orice valori
        WebTable.clickAddRow();
        WebTable.addRecord("Maria","Calinescu","maria.calinescu@gmail.com","66","18000","HR");
        WebTable.clickSubmit();
        // Add assert dupa submit

        // Step 6: Close browser
        Application.close();
    }
}
