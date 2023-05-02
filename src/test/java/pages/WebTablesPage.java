package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static model.ApplicationDemoQa.driver;

public class WebTablesPage {
    public static By webTablesSection = By.xpath("//span[normalize-space()='Web Tables']");
    public static By secondEditButton = By.xpath("//span[@id='edit-record-2']");
    public static By firstNameField = By.id("firstName");
    public static By lastNameField = By.id("lastName");
    public static By emailField = By.id("userEmail");
    public static By ageField = By.id("age");
    public static By salaryField = By.id("salary");
    public static By departmentField = By.id("department");
    public static By submitButton = By.id("submit");
    public static By deleteButton = By.id("delete-record-3");
    public static By addNewRecord = By.id("addNewRecordButton");

    public static void click(By locator) {

        WebElement secondEditButton = driver().findElement(locator);
        secondEditButton.click();
    }

    public static void enterValues(By locator, String value) {

        WebElement field = driver().findElement(locator);
        field.clear();
        field.sendKeys(value);
    }
}
