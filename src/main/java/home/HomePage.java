package home;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import utils.Handler;

public class HomePage {
    static WebElement elementsButton = Application.driver().findElement(By.xpath("//h5[text()='Elements']"));

    static WebElement alertsButton = Application.driver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));

    static WebElement widgetsButton = Application.driver().findElement(By.xpath("//h5[text()='Widgets']"));

    public static void clickElements() {
        Handler.scroll(elementsButton);
        elementsButton.click();
    }

    public static void clickAlertsFramesAndWindows(){
        Handler.scroll(alertsButton);
        alertsButton.click();
    }

    public static void clickWidgets(){
        Handler.scroll(widgetsButton);
        widgetsButton.click();
    }
}
