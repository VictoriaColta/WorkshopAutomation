package elements;

//import Utilities.ElementsActions;
import model.ApplicationNumberTwo;
import model.HomePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

// CERINTA 5
//        Step 1: Click pe Alerts, Frame & Windows de pe pagina principala
//        Step 2: Click pe "Frames" din lista
//        Step 3: Sa se salveze textul ce apare in iframe, intr-o variabila String

// A doua rezolvare

public class POMTestAlertsFrameWindows {

    @Test

    public static void testPOMAlertsFrameWindows() {

//        Deschide aplicatia
        ApplicationNumberTwo.start();
//        Step 1: Click pe Alerts, Frame & Windows de pe pagina principala
        HomePage.clickTab(HomePage.alertsFramesWindows);
//        Step 2: Click pe "Frames" din lista
        AlertsFrameWindows.click(AlertsFrameWindows.frames);
//        Step 3: Sa se salveze textul ce apare in iframe, intr-o variabila String
        Frames.getText(Frames.textLocator);
//        Inchide aplicatia
        ApplicationNumberTwo.close();
    }
}


// Prima rezolvare

//public class POMTestAlertsFrameWindows {
//
//    @Test

//    public void testAlertsFrameWindows() {
//
//        ApplicationNumberTwo.start();
//        HomePage.clickAlertsFrameWindows();
//        ElementsActions.click(By.xpath("//span[text()='Frames']"));
//        Frames.getText();
//
////    }
//}
