package utils;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handler {

    //// Wait for Elements

    public static void waitForElement(By element) {
        WebDriverWait wait = new WebDriverWait(Application.driver(), 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }


    public static void waitForElementtoBeClickable(By webelement) {
        WebDriverWait wait = new WebDriverWait(Application.driver(), 25);
        wait.until(ExpectedConditions.elementToBeClickable(webelement));
    }


    //// Click Elements

    public static void clickElement(By webelement) {
        waitForElement(webelement);
        waitForElementtoBeClickable(webelement);
        WebElement element = Application.driver().findElement(webelement);
        element.click();
    }

        public static void forcedClickElement(By webelement) {
        WebElement element = Application.driver().findElement(webelement);
        ((JavascriptExecutor) Application.driver()).executeScript("arguments[0].click();", element);
    }

    //// Element Visibility
    public static void isElementDisplayed (By webelement) {
        waitForElement(webelement);
        WebElement element = Application.driver().findElement(webelement);
        element.isDisplayed();
    }

    public static boolean elementVisibilityValidation (By webelement) {
        try {
            Application.driver().findElement(webelement);

        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    //// Send text to Elements

    public static void sendTextToElement(By webelement, String input) {
        waitForElement(webelement);
        WebElement element = Application.driver().findElement(webelement);
        element.clear();
        element.sendKeys(input);
    }


    //// Get Text from Element

    public static String getTextFromElement(By webelement) {
        waitForElement(webelement);
        WebElement element = Application.driver().findElement(webelement);
        String valueInitial = element.getAttribute("innerText");
        return valueInitial;
    }

    /// Scroll

        public static void scrollUntilElementIsVisible (By webelement) {
        JavascriptExecutor js = (JavascriptExecutor) Application.driver();
        WebElement Element = Application.driver().findElement(webelement);
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }


}
