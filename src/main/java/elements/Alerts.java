package elements;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static model.ApplicationNumberTwo.driver;



//cerinta_9:
//        Step 1: Click pe Alerts, Frame & Windows de pe pagina principala
//        Step 2: Click pe "Alerts" din lista
//        Step 3: Dai click pe butonul din dreptul textului "Click Button to see alert"
//        Step 3: Sa se verifice mesajul de alerta
//        Step 5: Inchide alerta, si dai click pe urmatorul buton
//        Step 6: Sa se repete aceeasi pasi pentru fiecare buton, toti pasi trebuie scrisi in acelasi TEST!!!


public class Alerts {

    public static By alertButton = By.id("alertButton");
    public static By timerAlertButton = By.id("timerAlertButton");
    public static By confirmButton = By.id("confirmButton");
    public static By verifyThirdAlertMessage = By.id("confirmResult'");

// click pe primul buton de alerta
    public static void clickFirstAlertButton() {

        WebElement element = driver().findElement(alertButton);
        element.click();
    }

    //metoda pt a verifica mesajul de alerta + a apasa "ok" pe alerta
    public static void getFirstAlertMessage() {

        Alert alert = driver().switchTo().alert();
        String alertMessage = driver().switchTo().alert().getText();
        Assert.assertTrue(alertMessage.contains("You clicked a button"));
        alert.accept(); // pt a apasa ok pe alerta- a inchide fereastra

    }

    //click pe al doilea buton de alerta

    public static void clickSecondAlertButton() {

        WebElement element = driver().findElement(timerAlertButton);
        element.click();
    }

    //metoda pt a verifica mesajul al doilea de alerta + a apasa "ok" pe alerta

    public static void getSecondAlertMessage() {

        WebDriverWait wait = new WebDriverWait(driver(),5);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver().switchTo().alert();
        String alertMessage = driver().switchTo().alert().getText();
        Assert.assertTrue(alertMessage.contains("This alert appeared after 5 seconds"));
        alert.accept();
    }
    //click pe al doilea buton de alerta

    public static void clickThirdAlertButton() {

        WebElement element = driver().findElement(confirmButton);
        element.click();
    }

    // pt a verifica al treilea mesaj de alerta si a da click pe "Cancel" button + assert ca am dat click pe Cancel si nu pe Ok

    public static void getThirdAlertMessage() {

        Alert alert = driver().switchTo().alert();
        String alertMessage = driver().switchTo().alert().getText();
        Assert.assertTrue(alertMessage.contains("Do you confirm action?"));
        alert.dismiss(); // pt a da click pe cancel button
    }








}
