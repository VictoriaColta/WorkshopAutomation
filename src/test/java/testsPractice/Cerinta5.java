package testsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.HomePage;
import pages.SideMenu;

public class Cerinta5 {
    /*            cerinta_5
                Step 1: Click pe Alerts, Frame & Windows de pe pagina principala
                Step 2: Click pe "Frames" din lista
                Step 3: Sa se salveze textul ce apare in iframe, intr-o variabila String*/

    @Test
    public void testCerinta5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickAlertsFrameWindows();

        SideMenu sideMenu = new SideMenu(driver);
        sideMenu.ClickOnSubmenuItem("Frames");

        FramesPage framesPage = new FramesPage(driver);
        Assert.assertEquals(framesPage.getIframeText(), "This is a sample page");

        driver.close();
    }
}
