package testsPractice;

import elements.HomePageElements;
import elements.WidgetsElements;
import model.SecondApplication;
import org.testng.annotations.Test;

public class POM_Widgets {

    // cerinta_6
//                Step 1: Click pe Widgets de pe pagina principala
//                Step 2: Click pe "Date Picker" din lista
//                Step 3: Sa se adauge o data pentru fiecare input, cu exact 30 de zile in viitor de la momentul rularii
    @Test
    public void testPOM_Widgets() {
        SecondApplication.start();

//        Step 1:
        HomePageElements.clickWidgetsSection();
//        Step 2:
        WidgetsElements.clickDatePickerButton();

        //                Step 3:
        WidgetsElements.selectDateOnFirstInput();
        WidgetsElements.clickDateAndTimeLabel();

       WidgetsElements.selectDateAndTimePicker();

        WidgetsElements.clickDateAndTimeLabel();

        WidgetsElements.validateSelectedDate();
       WidgetsElements.validateDateAndTimePicker();

       SecondApplication.close();
    }
}
