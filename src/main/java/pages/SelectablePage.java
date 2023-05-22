package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

import static model.ApplicationDemoQa.driver;

public class SelectablePage {
    public static By selectable = By.xpath("//span[normalize-space()='Selectable']");
    public static By gridTab = By.id("demo-tab-grid");
    public static By gridCell = By.xpath("(//li[@class='list-group-item list-group-item-action'])");

    public static void click(By locator) {
        WebElement element = driver().findElement(locator);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public static void clickOnDiagonalBoxes(By locator) {
        List<WebElement> cells = driver().findElements(locator);
        for (int i = 0; i <= cells.size(); i++) {
            int row = i / 3 + 1;
            int col = i % 3 + 1;
            if (row == col) {
                cells.get(i).click();
            }
        }
    }
}
