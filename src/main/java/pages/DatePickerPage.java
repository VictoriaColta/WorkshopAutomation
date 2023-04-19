package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickerPage {
    WebDriver driver;
    public DatePickerPage(WebDriver driver) {

        this.driver=driver;
    }

    By datePickerInput = By.id("datePickerMonthYearInput");

    public void setDate(String date){
        WebElement datePicker = driver.findElement(datePickerInput);
        datePicker.click();
        datePicker.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        datePicker.sendKeys(date);
    }

    public String getInputDateValue(){
        WebElement datePicker = driver.findElement(datePickerInput);
        return datePicker.getAttribute("value");
    }
}
