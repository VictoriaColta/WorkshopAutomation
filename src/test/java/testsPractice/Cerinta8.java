package testsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicPropertiesPage;
import pages.HomePage;
import pages.SideMenu;


public class Cerinta8 {
    /*            cerinte_8:
                Step 1: Click pe Elements de pe pagina principala
                Step 2: Click pe "Dynamic properties" din lista
                Step 3: Verificat ca butonul cu textul "Visible After 5 Seconds" apare dupa 5 secunde, inclusiv schimbare culorii de la butonul
                "Color change"
                */

    @Test
    public void testCerinta8() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

        HomePage homePage = new HomePage(driver);
        homePage.clickElements();

        SideMenu sideMenu = new SideMenu(driver);
        sideMenu.ClickOnSubmenuItem("Dynamic Properties");

        DynamicPropertiesPage dynamicPropertiesPage = new DynamicPropertiesPage(driver);

        Assert.assertFalse(dynamicPropertiesPage.isEnableAfterEnabled());
        Assert.assertEquals(dynamicPropertiesPage.getColorChangeTextColor(), "rgba(255, 255, 255, 1)");
        Assert.assertFalse(dynamicPropertiesPage.isVisibleAfterDisplayed());

        Thread.sleep(5000);

        Assert.assertTrue(dynamicPropertiesPage.isEnableAfterEnabled());
        Assert.assertEquals(dynamicPropertiesPage.getColorChangeTextColor(), "rgba(228, 100, 112, 1)");
        Assert.assertTrue(dynamicPropertiesPage.isVisibleAfterDisplayed());

        driver.close();
    }
}
