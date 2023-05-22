package testsPractice;

import model.ApplicationDemoQa;
import model.HomePageDemoQa;
import org.testng.annotations.Test;
import pages.DatePickerPage;

public class Cerinta6 {
    @Test
    public void cerinta6() {
        ApplicationDemoQa.start();
        HomePageDemoQa.clickTab(HomePageDemoQa.widgets);
        DatePickerPage.click(DatePickerPage.datePicker);
        DatePickerPage.click(DatePickerPage.monthYearInput);
        DatePickerPage.click(DatePickerPage.monthToggle);
        DatePickerPage.click(DatePickerPage.month);
        DatePickerPage.click(DatePickerPage.day);
        DatePickerPage.click(DatePickerPage.dateAndTimeInput);
        DatePickerPage.click(DatePickerPage.nextMonthArrow);
        DatePickerPage.click(DatePickerPage.futureMonthDay);
        DatePickerPage.click(DatePickerPage.futureTime);
        ApplicationDemoQa.close();
    }

}
