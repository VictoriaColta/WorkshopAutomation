package testsPractice;

import alertsFrameWindows.Frames;
import model.Application;
import org.testng.annotations.Test;
import pages.Homepage;

public class Cerinta5 {

    @Test
    public void cerinta5 () {
        // Step 1: Click pe Alerts, Frame & Windows de pe pagina principala
        Application.start();
        Homepage.scrollUntilElementIsVisible();
        Homepage.clickAlertsMenu();

        // Step 2: Click pe "Frames" din lista
        Frames.clickFrames();

        // Step 3: Sa se salveze textul ce apare in iframe, intr-o variabila String





        // Step 4: Close browser
        Application.close();



    }
}
