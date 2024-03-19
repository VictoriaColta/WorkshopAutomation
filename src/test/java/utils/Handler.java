package utils;
import model.SecondApplication;
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
        SecondApplication.driver().findElement(elementLocator).click();
    }

    public static void setFieldValue(By element, String value) {
        SecondApplication.driver().findElement(element).click();
        SecondApplication.driver().findElement(element).clear();
        SecondApplication.driver().findElement(element).sendKeys(value);
    }

    public static void scroll(WebElement element){
        ((JavascriptExecutor) SecondApplication.driver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static String returnText(By element) {
        return SecondApplication.driver().findElement(element).getText();
    }


    public static void assertElementIsDisplayed(By elementLocator){
        Assert.assertTrue(SecondApplication.driver().findElement(elementLocator).isDisplayed());
    }
}