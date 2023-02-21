package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.session.StripAnyPlatform;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static model.Application.driver;

public class DragAndDrop {
    /**
     * Pentru acest test se va folosi alt site
     * Pentru ca se v-a folosi alt site va trebui initializat driver aici
     * WebDriver driver = new ChromeDriver();
     * System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
     * driver.get("https://demoqa.com/droppable/");
     * driver.manage().window().maximize();
     *******/

    @Test
    public void dragAndDrop() throws InterruptedException {
        //Deschidem aplicatia web in browser avand pagina dorita in URL https://demoqa.com/droppable/
        Application.start();

        WebDriver driver = Application.driver();
        driver.get("https://demoqa.com/droppable/");

        //Creeam un obiect din clasa Actions
        Actions actions = new Actions(driver);

        //Indentificam elementele cu care vom interactiona
        WebElement draggableDiv = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"draggable\"]")));

        WebElement droppedBox = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"droppable\"]")));


        //Apelam metoda dragAndDrop folosind obiectul creat

        actions.dragAndDrop(draggableDiv, droppedBox).build().perform();

        sleep(5000);

        Application.close();
    }

}
