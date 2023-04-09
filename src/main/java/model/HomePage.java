package model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static model.ApplicationNumberTwo.driver;


// A doua rezolvare
// Mai jos este clasa HomePage, unde am adaugat o metoda "clickAction", pe care am parametrizat-o.

public class HomePage {

    // locatori

    public static By elements = By.xpath("//*[text()='Elements']");
    public static By alertsFramesWindows = By.xpath("//*[text()='Alerts, Frame & Windows']");
    public static By widgets = By.xpath("//*[text()='Widgets']");

    public static void clickTab(By locator) {

        WebElement element = driver().findElement(locator);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver();
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }
}

// Prima rezolvare

//public class HomePage {
//
//
////    private  static By elementsLocator = By.xpath("(//div[@class = 'avatar mx-auto white']) [1]"); //- nu este la fel de sigur. E mai ok sa iei textul acelui element
//
//    private  static By elements = By.xpath("//h5[text()='Elements']");
//
//    public static By alertsFrameWindows = By.xpath("//*[text()='Alerts, Frame & Windows']");
//
//    public static void clickElements () {
//        WebElement elements = driver().findElement(HomePage.elements);
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver(); //JavascriptExecutor este o clasa, jsExecutor e un obiect al clasei
//        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elements);
//        elements.click();
//    }
//
//    public static void clickAlertsFrameWindows() {
//        WebElement alertsFrameWindows = driver().findElement(HomePage.alertsFrameWindows);
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver();
//        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", alertsFrameWindows);
//        alertsFrameWindows.click();
//    }
//}
