package testsPractice;

import model.Application;
import model.ApplicationDemoQa;
import model.HomePageDemoQa;
import org.testng.annotations.Test;
import pages.FramesPage;

public class Frames {

@Test
public void cerinta5(){
    ApplicationDemoQa.start();
    HomePageDemoQa.clickTab(HomePageDemoQa.alertsFramesWindows);
    FramesPage.click(FramesPage.frames);
    FramesPage.getText(FramesPage.textLocator);
    ApplicationDemoQa.close();
}
}
