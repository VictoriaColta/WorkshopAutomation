package alertsFrameWindows;

import model.Application;
import org.openqa.selenium.By;
import utils.Handler;

public class Frames {

    private static By frames = By.xpath("//*[@id=\"item-2\"]/span[@class='text' and contains (text(), \"Frames\")]");

    private static By textIframe = By.id("sampleHeading");

    public static void clickFrames () {Handler.clickElement(frames);}


}
