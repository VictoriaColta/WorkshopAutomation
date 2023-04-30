package learning.practice;

import learning.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class FindAndClick {




    @Test
    public void findElementAndClick() throws InterruptedException {
        //Deschide browser si deschide applicatia web
        Application.start();

        WebDriver driver = Application.driver();
        driver.get("https://demoqa.com/");

        //cauta un singur element si il salveaza intr-o variabila de tip WebElement
        WebElement formsIcon = new WebDriverWait(driver, 50)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]")));

        //Face click pe acel element
        formsIcon.click();

        sleep(4000);



        //Cauta butonul "Add Element" si fa click pe el
        WebElement elementsIcon = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]")));
        elementsIcon.click();
        sleep(2000);
        System.out.println("Debug");

        //Inchide applicatia
        Application.close();


    }

}
