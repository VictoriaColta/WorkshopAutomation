package learning.model.elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static learning.Application.driver;

public class Alerts {

    public static By alerts = By.xpath("//span[text()='Alerts']");
    public static By alertButton= By.id("alertButton");
    public static By timerAlertButton = By.id("timerAlertButton");
    public static By confirmButton = By.id("confirmButton");


    public static void clickAlertsSubcategory() {
        WebDriver driver = driver();
        WebElement element = driver().findElement(alerts);
        element.click();
    }
    public static void clickFirstAlertButton() {
        WebElement element=driver().findElement(alertButton);
        element.click();
    }
    public static String getFirstAlertText(){
        Alert alert = driver().switchTo().alert();
        String alertFirstText= alert.getText();
        alert.accept();
        return alertFirstText;
    }
    public static void clickSecondAlertButton(){
        WebElement element=driver().findElement(timerAlertButton);
        element.click();
    }
    public static String getSecondAlertText(){
        WebDriverWait wait = new WebDriverWait(driver(),6);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver().switchTo().alert();
        String alertSecondText= alert.getText();
        alert.accept();
        return alertSecondText;
    }
    public static void clickThirdAlertButton(){
        WebElement element= driver().findElement(confirmButton);
    }
    public static String getThirdAlertText(){
        Alert alert = driver().switchTo().alert();
        String alertThirdText= alert.getText();
        alert.accept();
        return alertThirdText;
    }
    public static void thisAlertCancelClick() {
        Alert alert = driver().switchTo().alert();
        alert.dismiss();
    }
}
