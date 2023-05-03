package widgets;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utils.Handler;

import java.util.List;

public class Slider {
    private static final By slider = By.xpath("//span[@class='range-slider__wrap']/input");

    private static final By sliderValue = By.id("sliderValue");

    public static int getSliderValue(){
        return Integer.valueOf(Application.driver().findElement(sliderValue).getAttribute("value"));
    }

    public static void setSliderValue(int value) throws InterruptedException {
        Actions action = new Actions(Application.driver());
        Handler.clickElement(slider);
        if (value < getSliderValue()){
            while (getSliderValue() != value){
                action.sendKeys(Keys.ARROW_LEFT).build().perform();
            }
        } else {
            while (getSliderValue() != value){
                action.sendKeys(Keys.ARROW_RIGHT).build().perform();
            }
        }
        Thread.sleep(300);
    }

    public static void assertSliderHasValue(int value){
        Assert.assertEquals(Slider.getSliderValue(), value);
    }

    public static void setAndCheckSlider(int value) throws InterruptedException {
            setSliderValue(value);
            assertSliderHasValue(value);

    }

}
