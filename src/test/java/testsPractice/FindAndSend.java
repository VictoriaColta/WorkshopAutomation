package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class FindAndSend {

    public final By username=By.xpath("//input[@id='userName']");
    public final By password=By.xpath("//input[@id='password']");
    public final By login=By.xpath("//button[@id='login']");

    @Test
    public void findAndSendKeys() {

        //Go to Form Authentication
        Application.start();
        WebDriver driver = Application.driver();
        driver.get("https://demoqa.com/login");//mie imi spune ca acest site e unreachable

        //Gaseste campul username si insereaza username numele tau
        WebElement user=Application.driver().findElement(username);
        user.sendKeys("Alex");

        //Gaseste campul username si sterge ce ai scris in pasul anterior(metoda clear()) si insereaza username tomsmith
        user.clear();
        user.sendKeys("tomsmith");

        //Gaseste campul password si insereaza SuperSecretPassword!
        WebElement pass=Application.driver().findElement(password);
        pass.sendKeys("SuperSecretPassword!");

        //Fa click pe butonul Login
        WebElement logIN=Application.driver().findElement(login);
        logIN.click();

        driver.close();
    }
}
