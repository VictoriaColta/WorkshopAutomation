package learning.elements;

import learning.Application;
import learning.model.elements.DynamicProperties;
import learning.model.pages.Home;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static learning.Application.driver;

public class DynamicPropertiesTest {
    @Test
    public static void DynamicPropertiesTest() throws InterruptedException {
        Application.start();
        driver().get("https://demoqa.com/");
        Home.clickElements();

        ((JavascriptExecutor)driver()).executeScript("window.scrollBy(0,1000)");

        DynamicProperties.dynamicPropertiesClick();

        String firstButtonColor = DynamicProperties.getColorFromButton();
        boolean isDynamicPropertiesVisible = DynamicProperties.isButtonVisibleAfter5Seconds();
        String secondButtonColor =  DynamicProperties.getColorFromButton();

        Assert.assertTrue(isDynamicPropertiesVisible);
        Assert.assertNotEquals(firstButtonColor, secondButtonColor);
     }
}
