package widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import utils.Handler;

public class Accordian {
    private static final By whyUncollapsed = By.xpath("//div[@class='collapse']/../div[@id='section3Heading']");

    private static final By whyCollapsed = By.xpath("//div[@class='collapse show']/../div[@id='section3Heading']");

    private static final By whyText = By.xpath("//div[@id='section3Content']/p");

    public static void collapseWhySection() {
        try {
            Handler.clickElement(whyUncollapsed);
        } catch (NoSuchElementException e){
            System.out.println("Section might be already collapsed");
        }
    }

    public static void closeWhySection() {
        try {
            Handler.clickElement(whyCollapsed);
        } catch (NoSuchElementException e){
            System.out.println("Section might be already closed");
        }
    }

    public static String getTextWhy(){
        collapseWhySection();
        String whyDoWeUseItText = Handler.returnText(whyText);
        closeWhySection();
        return whyDoWeUseItText;
    }
}
