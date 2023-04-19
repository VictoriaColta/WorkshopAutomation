package testsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DatePickerPage;
import pages.HomePage;
import pages.SideMenu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cerinta6 {
    /*
    *             cerinta_6
                Step 1: Click pe Widgets de pe pagina principala
                Step 2: Click pe "Date Picker" din lista
                Step 3: Sa se adauge o data pentru fiecare input, cu exact 30 de zile in viitor de la momentul rularii*/

    @Test
    public void testCerinta6(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        HomePage homePage = new HomePage(driver);
        homePage.clickWidgets();

        SideMenu sideMenu = new SideMenu(driver);
        sideMenu.ClickOnSubmenuItem("Date Picker");

        DatePickerPage datePickerPage = new DatePickerPage(driver);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime dateInTheFuture = LocalDateTime.now().plusDays(30);
        String dateInTheFutureText = dtf.format(dateInTheFuture);

        datePickerPage.setDate(dateInTheFutureText);
        Assert.assertEquals(datePickerPage.getInputDateValue(), dateInTheFutureText);

        driver.close();
    }
}
