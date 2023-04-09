package elements;

import model.ApplicationNumberTwo;
import model.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static model.ApplicationNumberTwo.driver;

//Scrierea unui test aplicand design pattern-ul POM pentru pagina Elements->TextBox de pe https://demoqa.com

// A doua rezolvare

public class POMTestTextBox {

    @Test

    public void testPOMTextBox() {

        ApplicationNumberTwo.start();
        HomePage.clickTab(HomePage.elements);
        Elements.click(Elements.textBox);
        TextBox.enterValue(TextBox.fullNameField, "John");
        TextBox.enterValue(TextBox.emailField, "John@yahoo.com");
        TextBox.enterValue(TextBox.currentAddressField, "Strada Libertatii");
        TextBox.enterValue(TextBox.permanentAddressField,"Strada Viorica");
        TextBox.click(TextBox.submitButton);
        Assert.assertTrue(TextBox.getResultText(TextBox.nameSubmitted).contains("Name:John"));
        Assert.assertTrue(TextBox.getResultText(TextBox.emailSubmitted).contains("John@yahoo.com"));
        Assert.assertTrue(TextBox.getResultText(TextBox.currentAddressSubmitted).contains("Strada Libertatii"));
        Assert.assertTrue(TextBox.getResultText(TextBox.permanentAddressSubmitted).contains("Strada Viorica"));
        ApplicationNumberTwo.close();
    }

}


// PRima rezolvare

//public class POMTestTextBox {
//    @Test
//    public void testPOM() throws InterruptedException {
//        ApplicationNumberTwo.start();
//        HomePage.clickElements();
//        Elements.clickTextBox();
//        TextBox.setFullName("James Bond");
//        TextBox.setEmail("JamesBond007@yahoo.com");
//        TextBox.setCurrentAddress("Strada Veseliei, Numarul 1, Scara Blocului, Apartament 3, Etaj 10");
//        TextBox.setPermanentAddress("Strada Lalelelor, Numarul 25, Scara A, Apartament 45, Etaj 5");
//        TextBox.clickSubmitButton();
//        Assert.assertEquals(TextBox.expectedOutputNameField,TextBox.getNameOutput());
//        Assert.assertEquals(TextBox.expectedOutputEmailField,TextBox.getEmailOutput());
//        Assert.assertEquals(TextBox.expectedOutputCurrentAddressField,TextBox.getCurrentAddressOutput());
//        Assert.assertEquals(TextBox.expectedOutputForPermanentAddress,TextBox.getPermanentAddressOutput());
//        ApplicationNumberTwo.close();
//
//    }
//}
//



