package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class FindAndSend {
    @Test
    public void findAndSendKeys() {

        //Go to Form Authentication

        Application.start();
        WebElement formPage = Application.driver().findElement(By.xpath("//a[@href='/login']"));
        formPage.click();

        //Gaseste campul username si insereaza username numele tau

        WebElement usernameField = Application.driver().findElement(By.xpath("//input[@id='username']"));
        usernameField.click();
        usernameField.sendKeys("Niculescu Diana Elena");

        //Gaseste campul username si sterge ce ai scris in pasul anterior(metoda clear()) si insereaza username tomsmith

        usernameField.click();
        usernameField.clear();
        usernameField.sendKeys("Tom Smith");

        //Gaseste campul password si insereaza SuperSecretPassword!

        WebElement passwordField = Application.driver().findElement(By.xpath("//input[@id='password']"));
        passwordField.click();
        passwordField.sendKeys("SuperSecretPassword!");

        //Fa click pe butonul Login

        WebElement loginButton = Application.driver().findElement(By.tagName("button"));
        loginButton.click();

    }
}
