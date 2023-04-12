package elements;
import Utils.GeneralMethods;
import org.openqa.selenium.By;

public class Widgets {

    public static By datePickerButton = By.xpath("//li[@id='item-2']//span[contains(text(),'Date Picker')]");
    public static By selectDatefield = By.xpath("//input[@id='datePickerMonthYearInput']");
    public static void datePicker  (){
        GeneralMethods.clickElement(datePickerButton);

    }
    public static void selectDate  () throws InterruptedException {
        GeneralMethods.clickElement(selectDatefield);
        GeneralMethods.clearText(selectDatefield);
        GeneralMethods.addDate();

    }


}
