package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import static model.SecondApplication.driver;

public class DynamicProperties {

    public static By visibleAfter = By.id("visibleAfter");
    public static By colorChangeButton = By.id("colorChange");
    public static By whiteButton = By.xpath("//button[contains(text(),'Color Change')]");
    public static By redButton = By.xpath("//button[contains(text(),'Color Change')]");


    public static boolean checkButtonIsVisibleAfterFiveSeconds(long value) {
        WebElement visibleAfterFiveSec = driver().findElement(visibleAfter);
        WebDriverWait wait = new WebDriverWait(driver(), value);
       try {
           wait.until(ExpectedConditions.visibilityOfElementLocated(visibleAfter));
           Assert.assertTrue(visibleAfterFiveSec.isDisplayed());
           Assert.assertTrue(visibleAfterFiveSec.getText().contains("Visible After 5 Seconds"));
       } catch (TimeoutException exception){
           return false;
       }
       return true;
    }

//    public static boolean isButtonIsVisibleAfter(int seconds) {
//
//        try {
//            Handler.waitForVisibilityOf(visibleAfter, seconds);
//        } catch (TimeoutException e) {
//            return false;
//        }
//        return true;
//    }


}