package testsPractice.Selenium;

import elements.FindAndSend;
import model.Application;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class POM_FindAndSend {
    @Test
    public void testPOM() {
        Application.start();
        WebDriver driver = Application.driver();
        driver.get("https://demoqa.com/login");
        FindAndSend.printUserName();
        FindAndSend.userNameIsDisplayed();
        FindAndSend.sendUserName("Ana");
        FindAndSend.sendAnotherUserName();
        FindAndSend.sendPassword();
        FindAndSend.clickLoginButton();

        Application.close();
    }
}
