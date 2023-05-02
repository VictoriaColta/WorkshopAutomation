package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static model.Application.driver;

public class ABTestngPage {
    // locators
    private static final By abTestingPageElement = By.xpath("//a[normalize-space()='A/B Testing']");
    private static final By titleElement = By.xpath("//h3[normalize-space()='A/B Test Variation 1']");
    private static final By paragraphElement = By.xpath("//p[contains(text(),'Also known as split testing. This is a way in whic')]");


    public static void clickABTestingPage() {
        WebElement abTestingPageElementButton = driver().findElement(abTestingPageElement);

        abTestingPageElementButton.click();
    }

    public static String getTitle() {
        WebElement title = driver().findElement(titleElement);

        return title.getText();
    }
    public static String getParagraph() {
        WebElement paragraph = driver().findElement(paragraphElement);

        return paragraph.getText();
    }
}
