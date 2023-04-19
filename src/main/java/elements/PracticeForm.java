package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static model.ApplicationNumberTwo.driver;

// Work in progress


public class PracticeForm {

    // locatori
    public static By firstName = By.id("firstName");
    public static By lastName = By.id("lastName");
    public static By email = By.id("userEmail");
    public static By gender = By.xpath("//input[@value='Female']");
    public static By number = By.id("userNumber");
    public static By date = By.id("dateOfBirthInput");
    public static By month = By.xpath("//option[text()='February']");
    public static By year = By.xpath("//option[text()='1997']");
    public static By day = By.xpath("(//div[text()='1'])[1]");
    public static By subjects = By.id("subjectsContainer");
    public static By hobbies = By.id("hobbies-checkbox-2");


    public static void setFirstName(String value) {

        WebElement element = driver().findElement(firstName);
        element.sendKeys(value);
    }

    public static void setLastName(String value) {

        WebElement element = driver().findElement(lastName);
        element.sendKeys(value);
    }

    public static void setEmail(String value) {

        WebElement element = driver().findElement(email);
        element.sendKeys(value);
    }

    public static void selectGender() {

        WebElement element = driver().findElement(gender);
        Actions actions = new Actions(driver());
        actions.moveToElement(element).click().build().perform();
    }

    public static void setMobileNumber(String value) {

        WebElement element = driver().findElement(number);
        element.sendKeys(value);
    }

    public static void clickDateOfBirthField() {

        WebElement element = driver().findElement(date);
        element.click();

    }

    public static void selectMonth() {

        WebElement element = driver().findElement(month);
        element.click();

    }

    public static void selectYear() {

        WebElement element = driver().findElement(year);
        element.click();

    }

    public static void selectDay() {

        WebElement element = driver().findElement(day);
        element.click();

    }

    public static void setSubjects(String value) {

        WebElement element = driver().findElement(subjects);
        Actions actions = new Actions(driver());
        actions.moveToElement(element).click().sendKeys(value);
    }

    public static void selectHobbies() {

        WebElement element = driver().findElement(hobbies);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver();
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        Actions actions = new Actions(driver());
        actions.moveToElement(element).click().build().perform();
    }
}
