package utils;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
    public static void waitForVisibilityOf(By locator, int time){
        WebDriverWait wait = new WebDriverWait(Application.driver(), time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForVisibilityOfAlert(int time){
        WebDriverWait wait = new WebDriverWait(Application.driver(), time);
        wait.until(ExpectedConditions.alertIsPresent());
    }
}
