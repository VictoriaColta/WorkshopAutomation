package learning.practice;

import learning.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FindAndGet {

    @Test
    public void findElementAndGet(){
        Application.start();
        WebDriver driver = Application.driver();

        //Deschide browser si deschide applicatia web
        driver.get("https://demoqa.com/");

        //cauta un element (text) si il salveaza intr-o variabila
        WebElement alertsText = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[3]/h5")));

        //Printeaza acel text in consola
        System.out.println("Am printat textul: " + alertsText.getText());

        //Inchide applicatia
        Application.close();
    }


}
