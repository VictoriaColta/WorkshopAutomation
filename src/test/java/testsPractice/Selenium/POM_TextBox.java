package testsPractice.Selenium;
import elements.Elements;
import elements.FindAndSend;
import elements.HomePage;
import elements.TextBox;
import model.Application;
import model.SecondApplication;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class POM_TextBox {
    @Test
    public void testPOM()  {
        SecondApplication.start();
        HomePage.clickOnElementsSection();
        Elements.validateTextBoxDisplayed();
        Elements.clickTextBox();
        TextBox.setFullName("James Bond");
        TextBox.setEmail("JamesBond007@yahoo.com");
        TextBox.setCurrentAddress("Current Address :Strada Octav Onicescu, Numarul 6, Scara Blocului, Apartament 6, Etaj 2");
        TextBox.setPermanentAddress("Strada Costea Voda, Numarul 8, Scara , Apartament 6, Etaj 2");


        TextBox.clickSubmitButton();

        TextBox.validateName();
        TextBox.validateEmail();
        TextBox.validateCurrentAddress();
        TextBox.validatePermanentAddress();

        TextBox.clickSubmitButton();
        SecondApplication.close();
    }

    public static class POM_FindAndSend {
        @Test
        public void testPOM() {
            Application.start();
            WebDriver driver = Application.driver();
            driver.get("https://demoqa.com/login");
            elements.FindAndSend.printUserName();
            elements.FindAndSend.userNameIsDisplayed();
            elements.FindAndSend.sendUserName("Ana");
            elements.FindAndSend.sendAnotherUserName();
            elements.FindAndSend.sendPassword();
            FindAndSend.clickLoginButton();

            Application.close();
        }
    }
}
