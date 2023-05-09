package elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    public static By promtButton = By.id("promtButton");
    public static By promptResult = By.id("promptResult");


    // click pe primul buton de alerta
    public static void clickFirstAlertButton() {

        WebElement element = driver().findElement(alertButton);
        element.click();

    }

    public static void clickAlertAccept() {

        Alert alert = driver().switchTo().alert();
        alert.accept();
    }

    public static String getAlertText() {

        // am scris o metoda generala pentru a lua mesajul fiecarei alerte. Si am pus explicit wait 5 secunde pt a treia alerta
        // cele 5 secunde vor fi doar pt a treia alerta, pt ca la celelalte mesajul de alerta va aparea imediat dupa click
        // asa ca explicit wait nu se va executa

        WebDriverWait wait = new WebDriverWait(driver(), 5);
        wait.until(ExpectedConditions.alertIsPresent());

        String alertMessage = driver().switchTo().alert().getText();
        return alertMessage;

    }

    //click pe al doilea buton de alerta

    public static void clickSecondAlertButton() {

        WebElement element = driver().findElement(timerAlertButton);
        element.click();
    }

    //click pe al treilea buton de alerta

    public static void clickThirdAlertButton() {

        WebElement element = driver().findElement(confirmButton);
        element.click();
    }

    //click pe al patrulea buton de alerta

    public static void clickFourthAlertButton() {

        WebElement element = driver().findElement(promtButton);
        element.click();
    }

    // metoda ce introduce input in field-ul care se afiseaza in pop-up-ul de alerta

    public static void sendAlertInput(String value) {

        Alert alert = driver().switchTo().alert();
        alert.sendKeys(value);
        alert.accept();

    }

    // metoda ce verifica daca mesajul ce apare pe UI contine input-ul pe care l-am trimis in metoda de mai sus

    public static String verifyMessageAfterSendingInput() {

        WebElement element = driver().findElement(promptResult);
        return element.getText();
    }
}


// metode folosite la prima rezolvare

//metoda ce verifica primul mesaj de alerta "You clicked a button"
//    public static String getFirstAlertMessage() {
//
//        Alert alert = driver().switchTo().alert();
//        String alertMessage = driver().switchTo().alert().getText();
//        alert.accept(); // pt a apasa ok pe alerta- a inchide fereastra
//        return alertMessage;
//
//    }

//    //metoda ce verifica mesajul al doilea de alerta "This alert appeared after 5 seconds"
//
//    public static String getSecondAlertMessage() {
//
//        WebDriverWait wait = new WebDriverWait(driver(), 5);
//        wait.until(ExpectedConditions.alertIsPresent());
//
//        Alert alert = driver().switchTo().alert();
//        String alertMessage = driver().switchTo().alert().getText();
//        alert.accept();// pt a apasa ok pe alerta- a inchide fereastra
//        return alertMessage;
//    }


//    // metoda ce verifica al treilea mesaj de alerta "Do you confirm action?"
//
//    public static String getThirdAlertMessage() {
//
//        Alert alert = driver().switchTo().alert();
//        String alertMessage = driver().switchTo().alert().getText();
//        alert.dismiss(); // pt a da click pe cancel button
//        return alertMessage;
//    }

//metoda ce verifica faptul ca am dat click pe "Cancel" si nu pe "Ok"
//
//    public static String getMessageAfterCancelingThirdAlert() {
//
//        WebElement element = driver().findElement(verifyThirdAlertMessage);
//        return element.getText();
//    }

//    public static By verifyThirdAlertMessage = By.xpath("//span[text()='Cancel']");
