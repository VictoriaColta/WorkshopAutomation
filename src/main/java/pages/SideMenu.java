package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SideMenu {
    WebDriver driver;
    public SideMenu(WebDriver driver) {
        this.driver=driver;
    }

    public void ClickOnSubmenuItem(String name){
        WebElement item = driver.findElement(
                By.xpath("//*[@class='menu-list']//*[@class='text'][contains(text(), '" + name + "')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", item);
        item.click();
    }

    public void ClickOnMenuAndSubmenuItem(String menuName, String submenuName){
        WebElement menuItem = driver.findElement(
                By.xpath("//*[@class='menu-list']//*[@class='text'][contains(text(), '" + menuName + "')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menuItem);
        menuItem.click();

        WebElement submenuItem = driver.findElement(
                By.xpath("//*[@class='menu-list']//*[@class='text'][contains(text(), '" + submenuName + "')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submenuItem);
        submenuItem.click();
    }
}
