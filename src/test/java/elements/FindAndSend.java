package elements;

import model.Application;
import model.SecondApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static model.Application.driver;

public class FindAndSend {
    private static By basicAuthPageElement = By.xpath("//a[normalize-space()='Basic Auth']");
    private static By userNameElement = By.xpath("//input[@id='userName']");
    private static By passWordElement = By.xpath("//input[@id='password']");
    private static By loginElement = By.xpath("//button[@id='login']");

    public static void printUserName() {

        WebElement username = SecondApplication.driver().findElement(userNameElement);
        System.out.println(username);
    }
    public static void userNameIsDisplayed() {

        WebElement username = SecondApplication.driver().findElement(userNameElement);
        Assert.assertTrue(username.isDisplayed());
    }

    public static void sendUserName(String user) {

        WebElement username = SecondApplication.driver().findElement(userNameElement);
        username.sendKeys();
    }

    public static void sendAnotherUserName() {

        //Gaseste campul username si sterge ce ai scris in pasul anterior(metoda clear()) si insereaza username tomsmith
        WebElement username = Application.driver().findElement(userNameElement);
        username.clear();
        username.sendKeys("tomsmith");

    }
    public static void sendPassword() {
        //Gaseste campul password si insereaza SuperSecretPassword!
        WebElement password = Application.driver().findElement(passWordElement);
        password.sendKeys("SuperSecretPassword!");
    }


    public static void clickLoginButton() {
        WebElement loginButton = Application.driver().findElement(loginElement);
        loginButton.click();
    }



}

