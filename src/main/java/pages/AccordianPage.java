package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static model.ApplicationDemoQa.driver;

public class AccordianPage {
    public static By accordian = By.xpath("//span[normalize-space()='Accordian']");
    public static By thirdCard = By.id("section3Heading");
    public static By thirdCardText = By.id("section3Content");

    public static void click(By locator) {
        WebElement element = driver().findElement(locator);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public static boolean isThirdCardCollapsed(By locator) {
        WebElement element = driver().findElement(locator);
        String checkClass = element.getAttribute("class");
        System.out.println(checkClass);
        if (checkClass.contains("show")) {
            return true;
        } else {
            return false;
        }
    }

    public static String getTextWhyDoWeUseIt() {
        WebElement thirdElement = driver().findElement(thirdCard);
        WebElement thirdElementContent = driver().findElement(thirdCardText);
        String accordianText = null;
        boolean isCollapsed = !thirdElementContent.isDisplayed();
        System.out.println(isCollapsed);
        if(isCollapsed) {
            thirdElement.click();
            accordianText = thirdElementContent.getText();
            System.out.println("Accordian text is: " + accordianText);

        } else {
            accordianText = thirdElementContent.getText();
            System.out.println("Accordian text is: " + accordianText);
        }
return accordianText;

    }

}
