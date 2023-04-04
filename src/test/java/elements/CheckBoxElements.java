package elements;

import model.Application;
import model.SecondApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckBoxElements {

    private static By checkBoxSectionElement = By.xpath("//span[normalize-space()='Check Box']");
    private static By expandHomeArrowElement = By.className("rct-icon rct-icon-expand-clos");
    private static By desktopArrowElement = By.xpath("//label[@for='tree-node-desktop']");
    private static By resultElement = By.id("result");


    public static void clickOnCheckBoxSection() {

        WebElement checkBoxSection = SecondApplication.driver().findElement(checkBoxSectionElement);
        checkBoxSection.click();

    }
    public static void clickExpandHomeArrow() {

        WebElement expandHomeArrow = SecondApplication.driver().findElement(expandHomeArrowElement);
        expandHomeArrow.click();

    }
    public static void clickDesktopArrowElement() {

        WebElement desktopArrow = SecondApplication.driver().findElement(desktopArrowElement);
        desktopArrow.click();

    }
    public static void assertDisplayedText() {

        WebElement result = SecondApplication.driver().findElement(resultElement);
        Assert.assertEquals(result, "You have selected :\n" +
                "desktop\n" +
                "notes\n" +
                "commands");

    }
}
