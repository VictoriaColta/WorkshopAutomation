package Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.LocalDate;
import static Utils.Drivers.driver;

public class GeneralMethods {

    public static void waitForElement(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void clickElement (By webelement) {
        waitForElement(webelement);
        WebElement element = driver.findElement(webelement);
        element.click();
    }

    public static void elementIsDisplayed(By webelement) {
    boolean validateElementIsDisplayed = driver.findElement(webelement).isDisplayed();
}

    public static void waitForElementToDisapear(By webelement) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(webelement));
    }

    public static void forcedClickElement(By webelement) throws Exception {
        // waitForElementtoBeClickable(webelement);
        WebElement element = driver.findElement(webelement);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public static void clearText(By webelement) throws InterruptedException {
        waitForElement(webelement);
        WebElement element = driver.findElement(webelement);
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        // element.sendKeys(Keys.chord(Keys.CONTROL, "v"));
        element.sendKeys(Keys.DELETE);
    }

    public static void sendTextToElement(String text, By webelement) {
        waitForElement(webelement);
        WebElement element = driver.findElement(webelement);
        element.sendKeys(text);
    }

    public static void scrollDown () {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }

//        public static void addDate () {
//            Calendar c = Calendar.getInstance();
//            c.add(Calendar.DATE, 30);
//            Date d = c.getTime();
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            System.out.println("30 days after today is: " + d);
//
//        }
//public static void addDate () {
//    Calendar cal = Calendar.getInstance();
//    System.out.println("Current Date = " + cal.getTime());
//    cal.add(Calendar.DATE, + 30);
//    System.out.println("Updated Date = " + cal.getTime());
//}

    public static void addDate () {
        LocalDate date = LocalDate.now();
        System.out.println("Date: "+date);
        LocalDate newDate = date.plusDays(30);
        System.out.println("New Date: "+newDate);

//        Date date = new Date();
//        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
//        String stringDate= DateFor.format(date);
//        System.out.println(stringDate);


    }
}