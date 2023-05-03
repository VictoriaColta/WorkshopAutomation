package utils;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Handler {

    public static void clickElement(By elementLocator){
        Application.driver().findElement(elementLocator).click();
    }

    public static void setFieldValue(By element, String value) {
        Application.driver().findElement(element).click();
        Application.driver().findElement(element).clear();
        Application.driver().findElement(element).sendKeys(value);
    }

    public static void scroll(WebElement element){
        ((JavascriptExecutor) Application.driver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static String returnText(By element) {
        return Application.driver().findElement(element).getText();
    }

    public static String returnCurrentDatePlusDays1(int days) {
        String format = "MM/dd/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, days);
        Date futureDateTime = calendar.getTime();
        String formatted = simpleDateFormat.format(futureDateTime);
        return formatted;
    }

    public static void assertElementIsDisplayed(By elementLocator){
        Assert.assertTrue(Application.driver().findElement(elementLocator).isDisplayed());
    }
}
