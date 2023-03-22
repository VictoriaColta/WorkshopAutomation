package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static model.Application.driver;

public class ABTestngPageElements {
    // locators
    private static final By abTestingPageElement = By.xpath("//a[normalize-space()='A/B Testing']");
    private static final By titleElement = By.xpath("//h3[normalize-space()='A/B Test Variation 1']");
    private static final By paragraphElement = By.xpath("//p[contains(text(),'Also known as split testing. This is a way in whic')]");


    public static void clickABTestingPage() {
        WebElement abTestingPageElementButton = driver().findElement(abTestingPageElement);

        abTestingPageElementButton.click();
    }

    public static void getTitle() {
        WebElement title = driver().findElement(titleElement);

        System.out.println(title.getText());
    }
    public static void getParagraph() {
        WebElement paragraph = driver().findElement(paragraphElement);

        System.out.println(paragraph.getText());
    }
}
