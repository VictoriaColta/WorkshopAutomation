package testsPractice.Selenium;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class FindAndSend {

    private By userName = By.xpath("//input[@id='userName']");
    private By passWord = By.xpath("//input[@id='password']");
    private By login = By.xpath("//button[@id='login']");

    @Test
    public void findAndSendKeys() {

        //Go to Form Authentication

        Application.start();
        WebDriver driver = Application.driver();
        driver.get("https://demoqa.com/login");

        //Gaseste campul username si insereaza username numele tau
        WebElement username = Application.driver().findElement(userName);

        username.sendKeys("Andreea");

        //Gaseste campul username si sterge ce ai scris in pasul anterior(metoda clear()) si insereaza username tomsmith
         username.clear();
        username.sendKeys("tomsmith");

        //Gaseste campul password si insereaza SuperSecretPassword!
        WebElement password = Application.driver().findElement(passWord);
        password.sendKeys("SuperSecretPassword!");

        //Fa click pe butonul Login
        WebElement loginButton = Application.driver().findElement(login);
        loginButton.click();
        driver.close();

    }
}
