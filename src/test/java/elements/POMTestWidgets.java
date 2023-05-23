package elements;

import model.ApplicationNumberTwo;
import model.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


//cerinta_6
//        Step 1: Click pe Widgets de pe pagina principala
//        Step 2: Click pe "Date Picker" din lista
//        Step 3: Sa se adauge o data pentru fiecare input, cu exact 30 de zile in viitor de la momentul rularii

public class POMTestWidgets {

    @Test

    public static void testPOMWidgets() {

//        Deschide aplicatia
        ApplicationNumberTwo.start();
//        Step 1: Click pe Widgets de pe pagina principala
        HomePage.clickTab(HomePage.widgets);
//        Step 2: Click pe "Date Picker" din lista
        Widgets.click(Widgets.datePicker);
//        Step 3: Sa se adauge o data pentru fiecare input, cu exact 30 de zile in viitor de la momentul rularii
        DatePicker.click(DatePicker.monthYearInput);
        DatePicker.click(DatePicker.monthToggle);
        DatePicker.click(DatePicker.month);
        DatePicker.click(DatePicker.day);
        DatePicker.click(DatePicker.dateAndTimeInput);
        DatePicker.click(DatePicker.monthDropDown);
        DatePicker.click(DatePicker.futureMonth);
        DatePicker.click(DatePicker.futureTime);
        ApplicationNumberTwo.close();

    }

}
