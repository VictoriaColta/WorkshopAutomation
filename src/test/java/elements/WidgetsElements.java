package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static model.SecondApplication.driver;

public class WidgetsElements {
    private static By datePickerButtonElement = By.xpath("//span[normalize-space()='Date Picker']");
    private static By datePickerMonthYearInputElement = By.xpath("//input[@id='datePickerMonthYearInput']");
    private static By dateAndTimePickerInputElement = By.id("dateAndTimePickerInput");
    private static By dateAndTimeLabelElement = By.xpath("//div[contains(text(),'Date And Time')]");


    private static String dateForFirstInput = "05/04/2023";
    private static String dateForSecondInput = "May 4, 2023 4:34 PM";


    public static void clickDatePickerButton() {
        WebElement datePickerButton = driver().findElement(datePickerButtonElement);
        datePickerButton.click();
    }

    public static void selectDateOnFirstInput() {
        WebElement datePickerButton = driver().findElement(datePickerMonthYearInputElement);
        datePickerButton.click();
        datePickerButton.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE, dateForFirstInput);
    }
    public static void selectDateAndTimePicker() {
        WebElement dateAndTimePickerButton = driver().findElement(dateAndTimePickerInputElement);
        dateAndTimePickerButton.click();
        dateAndTimePickerButton.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE,dateForSecondInput);
    }
    public static void clickDateAndTimeLabel() {
        WebElement dateAndTimeLabel= driver().findElement(dateAndTimeLabelElement);
        dateAndTimeLabel.click();

    }
    public static void validateSelectedDate() {
        WebElement datePickerButton = driver().findElement(datePickerMonthYearInputElement);

        Assert.assertEquals(dateForFirstInput, datePickerButton);
    }

    public static void validateDateAndTimePicker() {
        WebElement datePickerButton = driver().findElement(datePickerMonthYearInputElement);

        Assert.assertEquals(dateForSecondInput, datePickerButton);
    }

}
