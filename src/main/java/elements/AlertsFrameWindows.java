package elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static model.ApplicationNumberTwo.driver;

//cerinta_5
//        Step 1: Click pe Alerts, Frame & Windows de pe pagina principala
//        Step 2: Click pe "Frames" din lista
//        Step 3: Sa se salveze textul ce apare in iframe, intr-o variabila String


public class AlertsFrameWindows {

    public static By frames = By.xpath("//*[text()='Frames']");

    public static void click(By locator) {

        WebElement element = driver().findElement(locator);
        element.click();
    }
}
