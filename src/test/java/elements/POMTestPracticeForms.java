package elements;

import model.ApplicationNumberTwo;
import model.HomePage;
import org.apache.maven.surefire.shared.compress.archivers.dump.DumpArchiveEntry;
import org.testng.annotations.Test;

// Work in progress

public class POMTestPracticeForms {

    @Test

    public static void testPOMPracticeForms() {

    //Deschide aplicatia
        ApplicationNumberTwo.start();
    // Click pe Forms de pe pagina principala
        HomePage.clickForms();
    // Click pe Practice Form din stanga
        Forms.clickPracticeForm();
    // Click + introdu valoare pt first name, last name, email fields etc
        PracticeForm.setFirstName("Diana");
        PracticeForm.setLastName("Niculescu");
        PracticeForm.setEmail("diana@yahoo.com");
        PracticeForm.selectGender();
        PracticeForm.setMobileNumber("0745698233");
        PracticeForm.clickDateOfBirthField();
        PracticeForm.selectMonth();
        PracticeForm.selectYear();
        PracticeForm.selectDay();
        PracticeForm.setSubjects("ABC");
        PracticeForm.selectHobbies();





    }




}
