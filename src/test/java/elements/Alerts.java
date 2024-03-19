package elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static model.SecondApplication.driver;
public class Alerts {

    public static By alertButton = By.id("alertButton");
    public static By timerAlertButton = By.id("timerAlertButton");
    public static By confirmButton = By.id("confirmButton");
    public static By verifyThirdAlertMessage = By.xpath("//span[text()='Cancel']");
    public static By promtButton = By.id("promtButton");
    public static By promptResult = By.id("promptResult");

    public static void clickFirstAlertButton() {

        WebElement element = driver().findElement(alertButton);
        element.click();
    }

    public static void getFirstAlertMessage() {

        Alert alert = driver().switchTo().alert();
        String alertMessage = driver().switchTo().alert().getText();
        Assert.assertTrue(alertMessage.contains("You clicked a button"));
        alert.accept();
    }
    public static void clickSecondAlertButton() {

        WebElement element = driver().findElement(timerAlertButton);
        element.click();
    }


    public static void getSecondAlertMessage() {

        WebDriverWait wait = new WebDriverWait(driver(),5);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver().switchTo().alert();
        String alertMessage = driver().switchTo().alert().getText();
        Assert.assertTrue(alertMessage.contains("This alert appeared after 5 seconds"));
        alert.accept();
    }

    public static void clickThirdAlertButton() {

        WebElement element = driver().findElement(confirmButton);
        element.click();
    }

    public static void getThirdAlertMessage() {

        Alert alert = driver().switchTo().alert();
        String alertMessage = driver().switchTo().alert().getText();
        Assert.assertTrue(alertMessage.contains("Do you confirm action?"));
        alert.dismiss(); // pt a da click pe cancel button
    }

    public static void verifyMessage(){


        WebElement element = driver().findElement(verifyThirdAlertMessage);
        String message = element.getText();
        Assert.assertTrue(message.contains("Cancel"));
    }

    public static void clickFourthAlertButton() {

        WebElement element = driver().findElement(promtButton);
        element.click();
    }


    public static void sendInputAlertField(String value) {

        Alert alert = driver().switchTo().alert();
        alert.sendKeys(value);
        alert.accept();

    }

    public static void verifyInput() {

        WebElement element = driver().findElement(promptResult);
        Assert.assertTrue(element.getText().contains("Andreea G"));
    }

}
