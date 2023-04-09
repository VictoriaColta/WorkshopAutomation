package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static model.ApplicationNumberTwo.driver;

//cerinta_3
//        Step 1: Click pe Elements de pe pagina principala
//        Step 2: Click pe Web Tables din lista
//        Step 3: Editeaza al 2lea rand cu urmatoarele valori: First Name: Ion, Last Name: Pop, Age: 40, Email: test@automation.com, Salary: 15000, Department: Legal
//        Step 4: Sa se stearga al 3lea rand din tabel
//        Step 5: Adauga o noua linie in tabel cu orice valori

// A doua rezolvare
    public class WebTables {

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


// Prima rezolvare

//public class WebTables {
//
//    private static By secondEditButtonLocator = By.xpath("//span[@id='edit-record-2']");
//
//    private static By firstNameFieldLocator = By.xpath("//input[@id='firstName']");
//
//    private static By lastNameFieldLocator = By.xpath("//input[@id='lastName']");
//
//    private static By emailFieldLocator = By.xpath("//input[@placeholder='name@example.com']");
//
//    private static By ageFieldLocator = By.xpath("//input[@id='age']");
//
//    private static By salaryFieldLocator = By.xpath("//input[@id='salary']");
//
//    private static By departmentFieldLocator = By.xpath("//input[@id='department']");
//
//    private static By submitButtonLocator = By.xpath("//button[@id='submit']");
//
//    private static By thirdDeleteButtonLocator = By.xpath("//span[@id='delete-record-3']");
//
//    private static By addButtonLocator = By.id("addNewRecordButton");
//
//    public static void clickSecondEditButton() {
//
//        WebElement secondEditButton = driver().findElement(secondEditButtonLocator);
//        secondEditButton.click();
//    }
//    public static void manipulateFirstNameField(String firstName) {
//
//        WebElement firstNameField = driver().findElement(firstNameFieldLocator);
//        firstNameField.click();
//        firstNameField.clear();
//        firstNameField.sendKeys(firstName);
//
//    }
//    public static void manipulateLastNameField(String lastName) {
//
//        WebElement lastNameField = driver().findElement(lastNameFieldLocator);
//        lastNameField.click();
//        lastNameField.clear();
//        lastNameField.sendKeys(lastName);
//    }
//
//    public static void manipulateEmailField(String email) {
//
//        WebElement emailField = driver().findElement(emailFieldLocator);
//        emailField.click();
//        emailField.clear();
//        emailField.sendKeys(email);
//    }
//
//    public static void manipulateAgeField(String age) {
//
//        WebElement ageField = driver().findElement(ageFieldLocator);
//        ageField.click();
//        ageField.clear();
//        ageField.sendKeys(age);
//    }
//
//    public static void manipulateSalaryField(String salary) {
//
//        WebElement salaryField = driver().findElement(salaryFieldLocator);
//        salaryField.click();
//        salaryField.clear();
//        salaryField.sendKeys(salary);
//    }
//
//    public static void manipulateDepartmentField(String department) {
//
//        WebElement departmentField = driver().findElement(departmentFieldLocator);
//        departmentField.click();
//        departmentField.clear();
//        departmentField.sendKeys(department);
//    }
//
//    public static void clickSubmitButton() {
//
//        WebElement submitButton = driver().findElement(submitButtonLocator);
//        submitButton.click();
//    }
//
//    public static void clickThirdDeleteButton() {
//
//        WebElement thirdDeleteButton = driver().findElement(thirdDeleteButtonLocator);
//        thirdDeleteButton.click();
//    }
//
//    public static void clickAddButton() {
//
//        WebElement addButton = driver().findElement(addButtonLocator);
//        addButton.click();
//    }
//
//}
