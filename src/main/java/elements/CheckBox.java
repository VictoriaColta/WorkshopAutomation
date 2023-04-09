package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static model.ApplicationNumberTwo.driver;

//cerinta_2:
//        Step 1: Click pe Elements de pe pagina principala
//        Step 2: Click pe Check Box din lista
//        Step 3: Expand Home prin click pe sageata
//        Step 4: Click pe checkbox-ul aferent "Desktop"
//        Step 5: Sa se salveze textul generat de checkbox-ul selectat intr-o variabila, apoi afisata in consola

// A doua rezolvare

public class CheckBox {

    public static By toggle = By.xpath("//button[@aria-label='Toggle']");
    public static By desktop = By.xpath("(//span[@class='rct-checkbox'])[2]");

    public static By text = By.id("result");

    public static void click(By locator) {

        WebElement toggle = driver().findElement(locator);
        toggle.click();
    }

    public static void getText(By locator) {

        WebElement text = driver().findElement(locator);
        System.out.println("Textul generat este: " + text.getText());
    }
}



// Aceasta este prima rezolvare

//public class CheckBox {
//
//    private static By toggleLocator = By.xpath("//button[@class = \"rct-collapse rct-collapse-btn\"]");
//    private static By desktopCheckBoxLocator = By.xpath("(//span[@class='rct-checkbox'])[2]");
//
//    private static By textLocator = By.id("result");
//
//    public static void clickToggle() {
//
//        WebElement toggle = driver().findElement(toggleLocator);
//        toggle.click();
//
//    }
//
//    public static void clickDesktopCheckBox() {
//
//        WebElement desktopCheckBox = driver().findElement(desktopCheckBoxLocator);
//        desktopCheckBox.click();
//    }
//
//    public static void getText() {
//
//        WebElement text = driver().findElement(textLocator);
//        text.getText();
//        System.out.println("Textul generat este --> " + text.getText());
//    }
//}
