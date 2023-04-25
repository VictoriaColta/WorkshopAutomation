package elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static model.ApplicationNumberTwo.driver;


//cerinta_9:
//        Step 1: Click pe Alerts, Frame & Windows de pe pagina principala
//        Step 2: Click pe "Alerts" din lista
//        Step 3: Dai click pe butonul din dreptul textului "Click Button to see alert"
//        Step 3: Sa se verifice mesajul de alerta
//        Step 5: Inchide alerta, si dai click pe urmatorul buton
//        Step 6: Sa se repete aceeasi pasi pentru fiecare buton, toti pasi trebuie scrisi in acelasi TEST!!!



public class AlertsFrameWindowsCerinta9 {

    public static By alertsLocator = By.xpath("//span[text()='Alerts']");



    public static void clickAlerts() {

        WebElement element = driver().findElement(alertsLocator);
        element.click();
    }





}
