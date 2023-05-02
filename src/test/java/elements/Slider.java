package elements;

import model.SecondApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static model.SecondApplication.driver;

public class Slider {

    public static By sliderButton = By.xpath("//span[normalize-space()='Slider']");
    public static By rangeElement = By.xpath("//input[@type='range']");
    Actions action = new Actions(SecondApplication.driver());

    public static void clickSlider() {

        WebElement slider = driver().findElement(sliderButton);
        slider.click();
    }

    public static void moveSliderToForty() {

        WebElement slider = driver().findElement(rangeElement);
        Actions action = new Actions(SecondApplication.driver());
        action.clickAndHold(slider);
        action.moveByOffset(40, 0).build().perform();
    }
    public static void checkSliderValueIsForty() {
//        Assert.assertEquals("40", rangeElement.);

    }

}
