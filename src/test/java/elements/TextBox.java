package elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static model.SecondApplication.driver;
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
        WebElement element = driver().findElement(By.id("submit"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver(); //JavascriptExecutor este o clasa, jsExecutor e un obiect al clasei
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);

        TextBox.clickSubmitButton();
    }

    public static void validateName() {
        WebElement firstField = driver().findElement(By.xpath("((//p[@class='mb-1']))[1]"));
        String expectedTextForFirstField = "Name:James Bond";
        Assert.assertEquals(expectedTextForFirstField,firstField.getText());
        System.out.println("James Bond is expected-Assert passed.");
    }
    public static void validateEmail() {
        WebElement secondField = driver().findElement(By.xpath("//p[@id='email']"));
        String expectedTextForSecondField = "Email:JamesBond007@yahoo.com";
        Assert.assertEquals(expectedTextForSecondField,secondField.getText());
        System.out.println("JamesBond007@yahoo.com is expected-Assert passed");
    }

    public static void validateCurrentAddress() {
        WebElement thirdField = driver().findElement(By.xpath("//p[@id='currentAddress']"));
        String expectedTextForThirdField = "Current Address :Strada Octav Onicescu, Numarul 6, Scara Blocului, Apartament 6, Etaj 2";
        Assert.assertEquals(expectedTextForThirdField,thirdField.getText());
        System.out.println("Strada  Octav Onicescu, Numarul 6, Scara Blocului, Apartament 6, Etaj 2 is expected-Assert passed");
    }

    public static void validatePermanentAddress() {
        WebElement fourthField = driver().findElement(By.xpath("//p[@id='permanentAddress']"));
        String expectedTextForFouthField = "Permanent Address :Strada Costea Voda, Numarul 8, Scara , Apartament 6, Etaj 2";
        Assert.assertEquals(expectedTextForFouthField,fourthField.getText());
        System.out.println("Strada Lalelelor, Numarul 8, Scara , Apartament 6, Etaj 2 is expected-Assert passed");
    }



}
