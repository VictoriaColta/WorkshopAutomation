package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class FindAndSend {
    @Test
    public void findAndSendKeys() {
        Application.start();

        //Go to Form Authentication
        WebElement basicAuth = Application.driver().findElement(By.xpath("//a[@href='/login']"));
        basicAuth.click();

        //Gaseste campul username si insereaza username numele tau
        WebElement username = Application.driver().findElement(By.id("username"));
        username.sendKeys("Cozmina");


        //Gaseste campul username si sterge ce ai scris in pasul anterior(metoda clear()) si insereaza username tomsmith
        username.clear();
        username.sendKeys("tomsmith");


        //Gaseste campul password si insereaza SuperSecretPassword!
        WebElement password = Application.driver().findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");


        //Fa click pe butonul Login
        WebElement loginButton = Application.driver().findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginButton.click();

        Application.close();
    }
}
