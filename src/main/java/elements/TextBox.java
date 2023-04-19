package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static model.ApplicationNumberTwo.driver;

//Enunt: scrierea unui test aplicand design pattern-ul POM pentru pagina Elements->TextBox de pe https://demoqa.com

// A doua rezolvare
public class TextBox {

    public static By fullNameField = By.id("userName");
    public static By emailField = By.id("userEmail");
    public static By currentAddressField = By.id("currentAddress");
    public static By permanentAddressField = By.id("permanentAddress");
    public static By submitButton = By.id("submit");
    public static By nameSubmitted = By.id("name");
    public static By emailSubmitted = By.id("email");
    public static By currentAddressSubmitted = By.xpath("//p[@id='currentAddress']");
    public static By permanentAddressSubmitted = By.xpath("//p[@id='permanentAddress']");


    public static void enterValue(By locator, String value) {

        WebElement field = driver().findElement(locator);
        field.sendKeys(value);

    }
    public static void click(By locator) {

        WebElement button = driver().findElement(locator);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver();
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", button);
        button.click();
    }

    public static String getResultText(By locator) {

        WebElement nameField = driver().findElement(locator);
        return nameField.getText();
    }

}


// PRima rezolvare

//public class TextBox {
//
//
//    // locatori pentru field-urile din pagina TextBox(inainte de a apasa pe butonul Submit)
//
//    private static By fullNameLocator = By.id("userName");
//    private static By emailLocator = By.id("userEmail");
//    private static By currentAddressLocator = By.id("currentAddress");
//    private static By permanentAddressLocator = By.id("permanentAddress");
//
//    private static By submitButtonLocator = By.xpath("//*[@id='submit']");
//
//    // Locatori pentru field-urile name, email, current and permanent address (ce apar dupa ce apasam pe "submit" button)
//
//    private static By firstFieldLocator = By.xpath("//p[@id='name']");
//
//    private static By secondFieldLocator = By.xpath("//p[@id='email']");
//
//    private static By thirdFieldLocator = By.xpath("//p[@id='currentAddress']");
//
//    private static By fourthFieldLocator = By.xpath("//p[@id='permanentAddress']");
//
//
//    // Variabile pt expectedOutput ale field-urilor name,email,current and permanent address(care apar dupa ce apasam pe butonul submit). Pt a face assert in POMTextBoxTest
//    // Am folosit "final" pt a nu putea fi modificate valorile.
//
//    public static final String expectedOutputNameField = "Name:James Bond";
//
//    public static final String expectedOutputEmailField = "Email:JamesBond007@yahoo.com";
//
//    public static final String expectedOutputCurrentAddressField = "Current Address :Strada Veseliei, Numarul 1, Scara Blocului, Apartament 3, Etaj 10";
//
//    public static final String expectedOutputForPermanentAddress = "Permananet Address :Strada Lalelelor, Numarul 25, Scara A, Apartament 45, Etaj 5";
//
//
//
//    public static void setFullName(String value) {
//
//        WebElement fullName = driver().findElement(fullNameLocator);
//        fullName.click();
//        fullName.sendKeys(value);
//    }
//
//    public static void setEmail(String value) {
//
//        WebElement email = driver().findElement(emailLocator);
//        email.click();
//        email.sendKeys(value);
//
//    }
//
//    public static void setCurrentAddress(String value) {
//
//        WebElement currentAdress = driver().findElement(currentAddressLocator);
//        currentAdress.click();
//        currentAdress.sendKeys(value);
//    }
//
//    public static void setPermanentAddress(String value) {
//
//        WebElement permanentAddress = driver().findElement(permanentAddressLocator);
//        permanentAddress.click();
//        permanentAddress.sendKeys(value);
//    }
//    public static void clickSubmitButton() {
//
//        WebElement submitButton = driver().findElement(submitButtonLocator);
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver(); //JavascriptExecutor este o clasa, jsExecutor e un obiect al clasei
//        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", submitButton);
//        submitButton.click();
//    }
//
//    public static String getNameOutput() {
//
//        WebElement nameField = driver().findElement(firstFieldLocator);
//        return nameField.getText();
//    }
//
//    public static String getEmailOutput() {
//
//        WebElement emailField = driver().findElement(secondFieldLocator);
//        return emailField.getText();
//    }
//
//    public static String getCurrentAddressOutput() {
//
//        WebElement currentAddressField = driver().findElement(thirdFieldLocator);
//        return currentAddressField.getText();
//    }
//
//    public static String getPermanentAddressOutput() {
//
//        WebElement permanentAddressField = driver().findElement(fourthFieldLocator);
//        return permanentAddressField.getText();
//    }
//}
//
//// Pt ca nu imi gasea elemenetul in pagina (butonul submit) am incercat modalitati de a-l face vizibil.
////Prima incercare: (nu a mers)
////WebDriverWait wait = new WebDriverWait(driver(),10);
////wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
//
//// La metoda clickSubmitButton, pt a putea da click pe buton, trebuia intai sa se faca scroll la pagina(altfel nu gasea butonul submit) :
//// - am facut casting de la WebDriver ( driver() ) la JavaScript executor pentru a putea apela metoda "executeScript"
//// - "argument[0]"  va fi inlocuit cu "element". Pe element se va apela metoda "scrollIntoView(true)"
