package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    WebDriver driver;
    public FramesPage(WebDriver driver) {
        this.driver=driver;
    }

    By iframeText = By.id("sampleHeading");

    public String getIframeText(){
        driver.switchTo().frame("frame1");
        String text = driver.findElement(iframeText).getText();
        driver.switchTo().parentFrame();
        return text;
    }
}
