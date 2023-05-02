package testsPractice;

import elements.AlertsFrames;
import elements.HomePage;
import model.SecondApplication;
import org.testng.annotations.Test;

public class POM_Frames {
//    cerinta_5
//    Step 1: Click pe Alerts, Frame & Windows de pe pagina principala
//    Step 2: Click pe "Frames" din lista
//    Step 3: Sa se salveze textul ce apare in iframe, intr-o variabila String

    @Test
    public void testPOM_Frames() {
        SecondApplication.start();

//         Step 1:
        HomePage.clickOnAlertsSection();

        //    Step 2:
        AlertsFrames.clickFrameButton();

        //    Step 3:
        AlertsFrames.getText();

        SecondApplication.close();
    }

}
