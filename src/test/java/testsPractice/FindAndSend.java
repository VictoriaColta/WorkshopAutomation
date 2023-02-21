package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;


public class FindAndSend {
    @Test
    public void findAndSendKeys() throws InterruptedException {

        //Go to Form Authentication
        Application.start();
        WebDriver driver = Application.driver();
        driver.get("https://demoqa.com/login");


        //Gaseste campul username si insereaza username numele tau
        WebElement userName = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"userName\"]")));

        userName.sendKeys("roxanapaula");
        //Gaseste campul username si sterge ce ai scris in pasul anterior(metoda clear()) si insereaza username tomsmith
        sleep(2000);
        userName.clear();
        userName.sendKeys("tomsmith");

        //Gaseste campul password si insereaza SuperSecretPassword!
        WebElement password = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]")));
        password.sendKeys("SuperSecretPassword!");

        //Fa click pe butonul Login
        WebElement loginButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login\"]")));
        loginButton.click();

        sleep(10000);

        Application.close();
    }


}
