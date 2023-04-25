package elements;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Checkbox {

    /// Elemente si metode cerinta 2

    private static By checkBox = By.xpath("//*[@id=\"item-1\"]/span[@class='text' and contains (text(), \"Check Box\")]");
    private static By arrowHome = By.xpath("//button[@title='Toggle']");
    private static By checkboxDesktop = By.xpath("//label[@for=\"tree-node-desktop\"]");
    private static By result = By.id("result");



    public static void clickCheckBox () {
        Application.driver().findElement(checkBox).click();
    }
    public static void clickArrowHome () {
        Application.driver().findElement(arrowHome).click();
    }
    public static void clickCheckboxDesktop () {
        Application.driver().findElement(checkboxDesktop).click();
    }
    public static void getResultText () {Application.driver().findElement(result).getText();
    }


}
