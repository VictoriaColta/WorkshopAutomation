package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static model.ApplicationDemoQa.driver;

public class AlertsPage {
    public static By alertsSection = By.xpath("(//li[@id='item-1'])[2]");
    public static By alertButton = By.id("alertButton");
    public static By timerAlertButton = By.id("timerAlertButton");
    public static By confirmButton = By.id("confirmButton");
    public static By promtButton = By.id("promtButton");
    public static By verifyThirdAlertMessage = By.xpath("//span[text()='Cancel']");
    public static By promptResult = By.id("promptResult");


    public static void click(By locator) {
        WebElement element = driver().findElement(locator);
        element.click();
    }

    public static String getFirstAlertBoxMessage() {
        Alert alert = driver().switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        System.out.println("First alert message is:  " + alertText);
        return alertText;
    }

    public static String getSecondAlertBoxMessage() {
        WebDriverWait wait = new WebDriverWait(driver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver().switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        System.out.println("Second alert message is:  " + alertText);
        return alertText;
    }

    public static String getThirdAlertMessage() {

        Alert alert = driver().switchTo().alert();
        String alertMessage = driver().switchTo().alert().getText();
        alert.dismiss(); // pt a da click pe cancel button
        return alertMessage;
    }

    public static String getMessageAfterCancelingThirdAlert(){

        WebElement element = driver().findElement(verifyThirdAlertMessage);
        return element.getText();
    }

    public static void sendInputAlertField(String value) {
        Alert alert = driver().switchTo().alert();
        alert.sendKeys(value);
        alert.accept();
    }

    public static String getMessageAfterSendingInput() {
        WebElement element = driver().findElement(promptResult);
       String text= element.getText();
        System.out.println("Text that you entered is:  " + text);
       return text;
    }


}
