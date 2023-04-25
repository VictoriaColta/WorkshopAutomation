package testsPractice;

import model.Application;
import org.testng.annotations.Test;
import pages.Homepage;
import widgets.DatePicker;

public class Cerinta6 {

    @Test
    public void cerinta6 () {
        //  Step 1: Click pe Widgets de pe pagina principala
        Application.start();
        Homepage.scrollUntilElementIsVisible();
        Homepage.clickWidgetsMenu();

        //  Step 2: Click pe "Date Picker" din lista
        DatePicker.clickDatePicker();

        //  Step 3: Sa se adauge o data pentru fiecare input, cu exact 30 de zile in viitor de la momentul rularii



        // Step 4: Close browser
        Application.close();
    }


}
