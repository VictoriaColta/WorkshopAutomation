package testsPractice;

import Utils.Drivers;
import elements.Elements;
import elements.Widgets;
import org.testng.annotations.Test;

//    cerinta_6
//    Step 1: Click pe Widgets de pe pagina principala
//    Step 2: Click pe "Date Picker" din lista
//    Step 3: Sa se adauge o data pentru fiecare input, cu exact 30 de zile in viitor de la momentul rularii


public class Cerinta6 {

    @Test
    public void testCerinta6() {
        Drivers.startDriver();
        Elements.widgets();
        Widgets.datePicker();
        Widgets.selectDate();
        //Assert.assertTrue(); to do => check if date is correct selected

    }

}
