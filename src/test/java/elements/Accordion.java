package elements;

import model.SecondApplication;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Accordion {

    private static By accordianElement = By.xpath("//span[normalize-space()='Accordian']");
    private static By whyDoeWeUseItElement = By.id("section3Heading");
    private static By textFromWhyDoeWeUseIt = By.xpath("//p[contains(text(),'It is a long established fact that a reader will b')]");
    public static void clickOnAccordianSection() {

        WebElement accordian = SecondApplication.driver().findElement(accordianElement);
        accordian.click();

    }
    public static void clickOnWhyDoWeUseItSection() {

        WebElement whyDoeWeUseItSection = SecondApplication.driver().findElement(whyDoeWeUseItElement);
        whyDoeWeUseItSection.click();

    }
    public static void verifyInputFromWhyDoeWeUseItSection() {

        WebElement textFromWhyDoeWeUseItSection = SecondApplication.driver().findElement(textFromWhyDoeWeUseIt);
        Assert.assertTrue(textFromWhyDoeWeUseItSection.getText().contains("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like)."));

    }

}
