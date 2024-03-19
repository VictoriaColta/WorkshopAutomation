package elements;

import model.SecondApplication;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Accordian {

    private static final By accordianElement = By.xpath("//span[normalize-space()='Accordian']");
    private static final By whyDoeWeUseItElement = By.id("section3Heading");
    private static final By textFromWhyDoWeUseItElement = By.xpath("//p[contains(text(),'It is a long established fact that a reader will b')]");

    public static void clickOnAccordianSection() {

        WebElement accordian = SecondApplication.driver().findElement(accordianElement);
        accordian.click();

    }
    public static void clickOnWhyDoWeUseItSection() {

        WebElement whyDoeWeUseItSection = SecondApplication.driver().findElement(whyDoeWeUseItElement);
        whyDoeWeUseItSection.click();

    }
    public static boolean isWhyDoWeUseItCollapsed() {

        WebElement whyDoeWeUseIt = SecondApplication.driver().findElement(whyDoeWeUseItElement);
        String whyDoeWeUseItClass = whyDoeWeUseIt.getAttribute("class");

        if(whyDoeWeUseItClass.contains("show")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean getTextFromWhyDoWeUseItAfterWaitingThreeSeconds() {

        WebElement textFromWhyDoWeUseItSection = SecondApplication.driver().findElement(textFromWhyDoWeUseItElement);

        // scroll up:
        JavascriptExecutor js = (JavascriptExecutor) SecondApplication.driver();
        js.executeScript("window.scrollBy(0,-250)");

        WebDriverWait wait = new WebDriverWait(SecondApplication.driver(), 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(textFromWhyDoWeUseItElement));

        return false;
    }

    public static String verifyInputFromWhyDoWeUseItSection() {

        WebElement textFromWhyDoWeUseItSection = SecondApplication.driver().findElement(textFromWhyDoWeUseItElement);
        Assert.assertEquals(getTextFromWhyDoWeUseItAfterWaitingThreeSeconds(), "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
            return textFromWhyDoWeUseItSection.getText();
    }

}
