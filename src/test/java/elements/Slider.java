package elements;

import model.SecondApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utils.Handler;


import static model.SecondApplication.driver;

public class Slider {
    private static final By sliderValue = By.id("sliderValue");
    public static By sliderButton = By.xpath("//span[@class='range-slider__wrap']");
    public static By rangeElement = By.xpath("//input[@type='range']");
    Actions action = new Actions(SecondApplication.driver());
    public static int getSliderValue(){
        return Integer.parseInt(SecondApplication.driver().findElement(sliderValue).getAttribute("value"));
    }

    public static void setSliderValue(int value) throws InterruptedException {
        Actions action = new Actions(SecondApplication.driver());
        Handler.clickElement(sliderButton);
        if (value < getSliderValue()){
            while (getSliderValue() != value){
                action.sendKeys(Keys.ARROW_LEFT).build().perform();
            }
        } else {
            while (getSliderValue() != value){
                action.sendKeys(Keys.ARROW_RIGHT).build().perform();
            }
        }

    }

    public static void assertSliderValue(int value){
        Assert.assertEquals(Slider.getSliderValue(), value);
    }

    public static void setAndCheckSlider(int value) throws InterruptedException {
        setSliderValue(value);
        assertSliderValue(value);

    }
}
