package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static model.ApplicationNumberTwo.driver;



public class DatePicker {

    public static By monthYearInput = By.id("datePickerMonthYearInput");
    public static By monthToggle = By.xpath("//select[@class='react-datepicker__month-select']");
    public static By month = By.xpath("//option[text()='May']");
    public static By day = By.xpath("(//div[text()='9'])[1]");
    public static By dateAndTimeInput = By.id("dateAndTimePickerInput");
    public static By monthDropDown = By.xpath("//span[text()='April']");
    public static By futureMonth = By.xpath("//div[text()='May']");
    public static By futureTime = By.xpath("//li[text()='21:30']");

    public static void click(By locator) {

        WebElement element = driver().findElement(locator);
        element.click();
    }

    public static String getDate(By locator) {

        WebElement dateFiled = driver().findElement(locator);
        return dateFiled.getText();

    }
}
