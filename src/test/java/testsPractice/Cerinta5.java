package testsPractice;

import model.ApplicationDemoQa;
import model.HomePageDemoQa;
import org.testng.annotations.Test;
import pages.FramesPage;

public class Cerinta5 {

@Test
public void cerinta5(){
    ApplicationDemoQa.start();
    HomePageDemoQa.clickTab(HomePageDemoQa.alertsFramesWindows);
    FramesPage.click(FramesPage.frames);
    FramesPage.getText(FramesPage.textLocator);
    ApplicationDemoQa.close();
}
}