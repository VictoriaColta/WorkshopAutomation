package Utils;
import elements.Widgets;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Utils.Drivers.driver;
import static elements.Widgets.selectDatefield;

public class ElementHandler {

    public static void waitForElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void clickElement (By locator) {
        waitForElement(locator);
        WebElement element = driver.findElement(locator);
        element.click();
    }

    public static void forcedClickElement(By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public static void clearText(By locator) {
        waitForElement(locator);
        WebElement element = driver.findElement(locator);
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        element.sendKeys(Keys.DELETE);
    }

    public static void sendTextToElement(String text, By locator) {
        waitForElement(locator);
        WebElement element = driver.findElement(locator);
        clearText(locator);
        element.sendKeys(text);
    }

    public static void scrollDown () {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }

    public static boolean elementVisibilityValidation(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception) {
           // exception.printStackTrace();
            return false;
        }
    }

    public static void addDate (String date) {
        WebElement datePicker= driver.findElement(selectDatefield);
        datePicker.sendKeys(date);

    }

}