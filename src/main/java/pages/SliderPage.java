package pages;

import model.ApplicationDemoQa;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static model.ApplicationDemoQa.driver;

public class SliderPage {
    public static By sliderSection = By.xpath("//span[normalize-space()='Slider']");
    public static By sliderElement = By.xpath("//input[@type='range']");

    public static void click(By locator) {
        WebElement element = ApplicationDemoQa.driver().findElement(locator);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) ApplicationDemoQa.driver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    //TODO
    public static void moveSlider(int percentage) throws InterruptedException {
        WebElement slider = driver().findElement(sliderElement);
        Actions actions = new Actions(driver());
        actions.clickAndHold(slider);
        actions.moveToElement(slider, (int) (-slider.getRect().width /2.1), 0) // move to the leftmost position of the
                // element
                .moveByOffset((int) (percentage * slider.getRect().width / 100), 0) // move the cursor by an offset
                // proportionate to the value passed
                .click().build().perform();
        Thread.sleep(3000);
    }

    public static int getSliderValue() {
        WebElement slider = driver().findElement(sliderElement);
        int sliderValue = Integer.parseInt(slider.getAttribute("value"));
        return sliderValue;
    }

    public static void sliderHasValue(int value) {Assert.assertEquals(value,getSliderValue());
    }
}
