package testsPractice;

import elements.FramesElements;
import elements.HomePageElements;
import model.Application;
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
        HomePageElements.clickOnAlertsSection();

        //    Step 2:
        FramesElements.clickFrameButton();

        //    Step 3:
        FramesElements.getText();

        SecondApplication.close();
    }

}
