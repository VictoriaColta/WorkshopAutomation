package learning.elements;

import learning.Application;
import learning.model.elements.Alerts;
import learning.model.elements.Widgets;
import learning.model.pages.Home;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import static learning.Application.driver;


public class WidgetsTest {
    @Test
    public static void WidgetsTest(){
        Application.start();
        driver().get("https://demoqa.com/");

        Home.clickWidgets();
        Widgets.clickWidgetsSubcategory();
        ((JavascriptExecutor)driver()).executeScript("window.scrollBy(0,1000)");
        Widgets.clickAccordion();

        String whyDoWeUseItText = Widgets.retrieveWhyDoWeUseItText();

        String myText = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
        boolean contains = whyDoWeUseItText.contains(myText);
        Assert.assertTrue(contains);

        Widgets.clickAccordion();

    }
}
