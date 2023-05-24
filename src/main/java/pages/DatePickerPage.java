package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static model.ApplicationDemoQa.driver;

public class DatePickerPage {
    public static By datePicker = By.xpath("//*[text()='Date Picker']");
    public static By monthYearInput = By.id("datePickerMonthYearInput");
    public static By monthToggle = By.xpath("//select[@class='react-datepicker__month-select']");
    public static By month = By.xpath("//option[text()='June']");
    public static By day = By.xpath("(//div[text()='1'])[1]");
    public static By dateAndTimeInput = By.id("dateAndTimePickerInput");
    public static By nextMonthArrow = By.xpath("//button[@aria-label='Next Month']");
    public static By futureMonthDay = By.xpath("//div[@aria-label='Choose Thursday, June 1st, 2023']");
    public static By futureTime = By.xpath("//li[text()='15:30']");

    public static void click(By locator) {
        WebElement element = driver().findElement(locator);
        element.click();
    }
    public static void setDate(){
        click(datePicker);
        click(monthYearInput);
        click(monthToggle);
        click(month);
        click(day);
        click(dateAndTimeInput);
        click(nextMonthArrow);
        click(futureMonthDay);
        click(futureTime);
    }

    public static String getDate(By locator) {
        WebElement dateFiled = driver().findElement(locator);
        return dateFiled.getText();

    }
}
