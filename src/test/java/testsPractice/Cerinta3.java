package testsPractice;
import Utils.Drivers;
import Utils.TestData;
import elements.Elements;
import elements.WebElements;
import org.testng.annotations.Test;

//    cerinta_3
//    Step 1: Click pe Elements de pe pagina principala
//    Step 2: Click pe Web Tables din lista
//    Step 3: Editeaza al 2lea rand cu urmatoarele valori: First Name: Ion, Last Name: Pop, Age: 40, Email: test@automation.com, Salary: 15000, Department: Legal
//    Step 4: Sa se stearga al 3lea rand din tabel
//    Step 5: Adauga o noua linie in tabel cu orice valori


public class Cerinta3 {

    @Test
    public void testCerinta3() throws Exception {
        Drivers.startDriver();
        Elements.openElementsPage();
        Elements.openWebTables();
        WebElements.openEditMode();
        WebElements.editFirstName(TestData.firstName);
        WebElements.editLastName(TestData.lastName);
        WebElements.editEmail(TestData.email);
        WebElements.editAge(TestData.age);
        WebElements.editSalary(TestData.salary);
        WebElements.editDepartment(TestData.department);
        WebElements.submit();
        WebElements.deleteRecord();
        WebElements.addNewRecord(TestData.firstName, TestData.lastName, TestData.email, TestData.age, TestData.salary,TestData.department);
        WebElements.submit();
    }


}
