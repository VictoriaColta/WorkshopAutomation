package elements;

import model.Application;
import model.SecondApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utils.Handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortableMethods {

    private static final By sortable = By.id("item-0");
    public static final WebElement one = (WebElement) By.xpath("//div[text()='One']");
    public static final By three = By.xpath("//div[text()='Three']");
    public static final By two = By.xpath("//div[text()='Two']");
    public static final By four = By.xpath("//div[text()='Four']");
    public static final By five = By.xpath("//div[text()='Five']");
    public static final By six = By.xpath("//div[text()='Six']");
    public static final By list = By.xpath("//div[@class='vertical-list-container mt-4']");
    Actions action = new Actions(SecondApplication.driver());

    public static void clickSortableSection() {
        Handler.clickElement(sortable);
    }


    public static void moveElementsInList(WebElement source, WebElement target, int y) {
        Actions action = new Actions(SecondApplication.driver());
        action.clickAndHold(source);
        action.moveToElement(target);
        action.moveByOffset(0, y);
        action.release(source).build().perform();


    }
    public static void moveSixInList(){
        moveElementsInList((WebElement) six, one, 5);
    }
    public static void moveFiveInList(){
        moveElementsInList((WebElement) five, (WebElement) two, 3);
    }
    public static void moveThreeInList(){
        moveElementsInList((WebElement) three, (WebElement) two, 1);
    }
    public static void moveFourInList(){
        moveElementsInList((WebElement) five, (WebElement) two, 1);
    }
    public static void assertOrderInList(){
        List<Object> listWebElement = Arrays.asList(six,one, five, three, four,two);
        Assert.assertEquals( list, listWebElement);
    }
}
