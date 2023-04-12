package testsPractice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import theInternet.AddRemoveElementsPage;
import theInternet.Homepage;
import static Utils.Drivers.driver;

//    cerinta_1:
//    Step 1: Click pe Add/Remove Elements de pe pagina principala
//    Step 2: Click pe butonul Add Element
//    Step 3: Sa se verifice display la butonul Delete
//    Step 4: Click pe button Delete
//    Step 5: Sa se verifice ca butonul Delete nu mai apare -> Foloseste assert


public class Cerinta1  {

 public static String url = "https://the-internet.herokuapp.com/";

 public static void startDriver() {
  System.setProperty("webdriver.chrome.driver", "C:\\Projects\\WorkshopAutomation\\driver\\chromedriver.exe");
  ChromeOptions options = new ChromeOptions();
  driver = new ChromeDriver(options);
  driver.manage().window().maximize();
  driver.get(url);
 }


 @Test
    public void testCerinta1() {
     startDriver();
     Homepage.clickAddRemoveElements();
     AddRemoveElementsPage.addElement();
     AddRemoveElementsPage.deleteElement();
     //Assert.assertNotEquals(AddRemoveElementsPage.deleteElementButton, AddRemoveElementsPage.deleteElementButton);


 }
}
