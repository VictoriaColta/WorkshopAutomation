package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static model.ApplicationNumberTwo.driver;

//Scrierea unui test aplicand design pattern-ul POM pentru pagina Elements->TextBox de pe https://demoqa.com

public class TextBox {

    // locators
    private static By fullNameLocator = By.id("userName");
    private static By emailLocator = By.id("userEmail");
    private static By currentAddressLocator = By.id("currentAddress");
    private static By permanentAddressLocator = By.id("permanentAddress");

    private static By submitButtonLocator = By.xpath("//*[@id='submit']");

    public static void setFullName(String value) {

        WebElement fullName = driver().findElement(fullNameLocator);
        fullName.click();
        fullName.sendKeys(value);
    }

    public static void setEmail(String value) {

        WebElement email = driver().findElement(emailLocator);
        email.click();
        email.sendKeys(value);

    }

    public static void setCurrentAddress(String value) {

        WebElement currentAdress = driver().findElement(currentAddressLocator);
        currentAdress.click();
        currentAdress.sendKeys(value);
    }

    public static void setPermanentAddress(String value) {

        WebElement permanentAddress = driver().findElement(permanentAddressLocator);
        permanentAddress.click();
        permanentAddress.sendKeys(value);
    }

    public static void clickSubmitButton() {

        WebElement submitButton = driver().findElement(submitButtonLocator);
        submitButton.click();
    }
}
