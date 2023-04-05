package testsPractice;
import elements.Elements;
import elements.HomePageElements;
import elements.TextBox;
import model.SecondApplication;
import org.testng.annotations.Test;

public class POM_TextBox {
    @Test
    public void testPOM()  {
        SecondApplication.start();
        HomePageElements.clickOnElementsSection();
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

}
