package testsPractice;

import Utils.Drivers;
import elements.AlertsFrameWindows;
import elements.Elements;
import org.testng.annotations.Test;

//    cerinta_5
//    Step 1: Click pe Alerts, Frame & Windows de pe pagina principala
//    Step 2: Click pe "Frames" din lista
//    Step 3: Sa se salveze textul ce apare in iframe, intr-o variabila String


public class Cerinta5 {
    @Test
    public void testCerinta5() {
        Drivers.startDriver();
        Elements.alertsFrameWindows();
        AlertsFrameWindows.saveTextFromIframes();


    }

}
