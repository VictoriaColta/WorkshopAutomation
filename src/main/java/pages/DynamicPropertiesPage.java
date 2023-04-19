package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicPropertiesPage {
    WebDriver driver;
    public DynamicPropertiesPage(WebDriver driver) {

        this.driver=driver;
    }

    By btnEnableAfter = By.id("enableAfter");
    By btnColorChange = By.id("colorChange");
    By btnVisibleAfter = By.id("visibleAfter");

    public boolean isEnableAfterEnabled(){
       return driver.findElement(btnEnableAfter).isEnabled();
    }

    public boolean isVisibleAfterDisplayed(){
        try{
            return driver.findElement(btnVisibleAfter).isDisplayed();
        } catch (Exception e){
            return false;
        }

    }

    public String getColorChangeTextColor(){
        return driver.findElement(btnColorChange).getCssValue("color");
    }
}
