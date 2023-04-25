package widgets;

import model.Application;
import org.openqa.selenium.By;

public class DatePicker {

    private static By datePicker = By.xpath("//*[@id=\"item-2\"]/span[@class='text' and contains (text(), \"Date Picker\")]");

    public static void clickDatePicker () {
        Application.driver().findElement(datePicker).click();
    }
}
