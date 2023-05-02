package elements;

import static model.SecondApplication.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTables {
    private static By secondEditButtonElement = By.xpath("//span[@id='edit-record-2']");

    private static By firstNameFieldElement = By.xpath("//input[@id='firstName']");

    private static By lastNameFieldElement = By.xpath("//input[@id='lastName']");

    private static By emailFieldElement = By.xpath("//input[@placeholder='name@example.com']");

    private static By ageFieldElement = By.xpath("//input[@id='age']");

    private static By salaryFieldElement = By.xpath("//input[@id='salary']");

    private static By departmentFieldElement = By.xpath("//input[@id='department']");

    private static By submitButtonElement = By.xpath("//button[@id='submit']");

    private static By thirdDeleteButtonElement = By.xpath("//span[@id='delete-record-3']");

    private static By addButtonElement = By.id("addNewRecordButton");

    public static void clickSecondEditButton() {

        WebElement secondEditButton = driver().findElement(secondEditButtonElement);
        secondEditButton.click();
    }
    public static void setFirstNameField(String firstName) {

        WebElement firstNameField = driver().findElement(firstNameFieldElement);
        firstNameField.click();
        firstNameField.clear();
        firstNameField.sendKeys(firstName);

    }
    public static void setLastNameField(String lastName) {

        WebElement lastNameField = driver().findElement(lastNameFieldElement);
        lastNameField.click();
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }

    public static void setEmailField(String email) {

        WebElement emailField = driver().findElement(emailFieldElement);
        emailField.click();
        emailField.clear();
        emailField.sendKeys(email);
    }

    public static void setAgeField(String age) {

        WebElement ageField = driver().findElement(ageFieldElement);
        ageField.click();
        ageField.clear();
        ageField.sendKeys(age);
    }

    public static void setSalaryField(String salary) {

        WebElement salaryField = driver().findElement(salaryFieldElement);
        salaryField.click();
        salaryField.clear();
        salaryField.sendKeys(salary);
    }

    public static void setDepartmentField(String department) {

        WebElement departmentField = driver().findElement(departmentFieldElement);
        departmentField.click();
        departmentField.clear();
        departmentField.sendKeys(department);
    }

    public static void clickSubmitButton() {

        WebElement submitButton = driver().findElement(submitButtonElement);
        submitButton.click();
    }

    public static void clickDeleteThirdButton() {

        WebElement thirdDeleteButton = driver().findElement(thirdDeleteButtonElement);
        thirdDeleteButton.click();
    }

    public static void clickAddButton() {

        WebElement addButton = driver().findElement(addButtonElement);
        addButton.click();
    }
}
