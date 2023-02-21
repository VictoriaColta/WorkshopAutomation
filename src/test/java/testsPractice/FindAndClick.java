package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.security.Key;

import static java.lang.Thread.sleep;
import static org.apache.commons.io.ThreadMonitor.sleep;

public class FindAndClick {

    @Test
    public void findElementAndClick() throws InterruptedException {
        //Deschide browser si deschide applicatia web
        Application.start();

        WebDriver driver = Application.driver();

        //cauta un singur element si il salveaza intr-o variabila de tip WebElement
        WebElement formsIcon = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]")));

        //Face click pe acel element
        formsIcon.click();

        sleep(4000);
        driver.get("https://demoqa.com/");


        //Cauta butonul "Add Element" si fa click pe el
        WebElement elementsIcon = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]")));
        elementsIcon.click();

        System.out.println("Debug");

        //Inchide applicatia
        Application.close();


    }

}
