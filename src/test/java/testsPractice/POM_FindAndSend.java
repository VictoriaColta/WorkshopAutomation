package testsPractice;

import elements.ABTestngPageElements;
import elements.FindAndClickElements;
import elements.FindAndSendElements;
import model.Application;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class POM_FindAndSend {
    @Test
    public void testPOM() {
        Application.start();
        WebDriver driver = Application.driver();
        driver.get("https://demoqa.com/login");
        FindAndSendElements.printUserName();
        FindAndSendElements.userNameIsDisplayed();
        FindAndSendElements.sendUserName();
        FindAndSendElements.sendAnotherUserName();
        FindAndSendElements.sendPassword();
        FindAndSendElements.clickLoginButton();

        Application.close();
    }
}
