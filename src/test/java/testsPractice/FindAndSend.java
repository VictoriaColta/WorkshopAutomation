package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FindAndSend {
    @Test
    public void findAndSendKeys() {

        //Go to Form Authentication
        Application.start();
        WebElement btnFormAuthentication = Application.driver().findElement(By.xpath("//a[@href='/login']"));
        btnFormAuthentication.click();

        //Gaseste campul username si insereaza username numele tau
        WebElement inputUsername = Application.driver().findElement(By.xpath("//*[@id=\"username\"]"));
        inputUsername.sendKeys("numele_tau");
        inputUsername.sendKeys(Keys.TAB);
        Assert.assertEquals(inputUsername.getAttribute("value"), "numele_tau");

        //Gaseste campul username si sterge ce ai scris in pasul anterior(metoda clear()) si insereaza username tomsmith
        inputUsername.clear();
        inputUsername.sendKeys("tomsmith");

        //Gaseste campul password si insereaza SuperSecretPassword!
        WebElement inputPassword = Application.driver().findElement(By.xpath("//*[@id=\"password\"]"));
        inputPassword.sendKeys("SuperSecretPassword!");

        //Fa click pe butonul Login
        WebElement btnLogin = Application.driver().findElement(By.xpath("//*[@type=\"submit\"]"));
        btnLogin.click();

        WebElement subheader = Application.driver().findElement(By.xpath("//*[@class=\"subheader\"]"));
        Assert.assertEquals(subheader.getText(), "Welcome to the Secure Area. When you are done click logout below.");

        Application.close();
    }
}
