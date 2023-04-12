package elements;
import Utils.GeneralMethods;
import org.openqa.selenium.By;

public class WebElements {

    public static By editRow2 = By.id("edit-record-2");
    public static By firstName = By.xpath("//input[@id='firstName']");
    public static By lastName = By.xpath("//input[@id='lastName']");
    public static By age = By.xpath("//input[@id='age']");
    public static By email = By.xpath("//input[@id='userEmail']");
    public static By salary = By.xpath("//input[@id='salary']");
    public static By department = By.xpath("//input[@id='department']");
    public static By submitButton = By.xpath("//button[@id='submit']");
    public static By deleteRecordButton = By.xpath("//span[@id='delete-record-3']");
    public static By addRecordButton = By.xpath("//button[@id='addNewRecordButton']");


    public static void openEditMode  (){
        GeneralMethods.clickElement(editRow2);

    }
    public static void editFirstName (String name) throws InterruptedException {
        GeneralMethods.clickElement(firstName);
        GeneralMethods.clearText(firstName);
        GeneralMethods.sendTextToElement(name, firstName );

    }

    public static void editLastName (String name) throws InterruptedException {
        GeneralMethods.clickElement(lastName);
        GeneralMethods.clearText(lastName);
        GeneralMethods.sendTextToElement(name, lastName );

    }

    public static void editAge (String userAge) throws InterruptedException {
        GeneralMethods.clickElement(age);
        GeneralMethods.clearText(age);
        GeneralMethods.sendTextToElement(userAge, age );

    }
    public static void editEmail (String userEmail) throws InterruptedException {
        GeneralMethods.clickElement(email);
        GeneralMethods.clearText(email);
        GeneralMethods.sendTextToElement(userEmail, email );

    }
    public static void editSalary (String userSalary) throws InterruptedException {
        GeneralMethods.clickElement(salary);
        GeneralMethods.clearText(salary);
        GeneralMethods.sendTextToElement(userSalary, salary );

    }
    public static void editDepartment (String userDepartment) throws InterruptedException {
        GeneralMethods.clickElement(department);
        GeneralMethods.clearText(department);
        GeneralMethods.sendTextToElement(userDepartment, department);

    }

    public static void submit () throws InterruptedException {
        GeneralMethods.clickElement(submitButton);

    }
    public static void deleteRecord () throws InterruptedException {
        GeneralMethods.clickElement(deleteRecordButton);

    }

    public static void addNewRecord (String name1, String name2, String userEmail, String userAge, String userSalary, String userDepartment) {
        GeneralMethods.clickElement(addRecordButton);
        GeneralMethods.sendTextToElement(name1, firstName);
        GeneralMethods.sendTextToElement(name2, lastName);
        GeneralMethods.sendTextToElement(userEmail, email);
        GeneralMethods.sendTextToElement(userAge, age);
        GeneralMethods.sendTextToElement(userSalary, salary);
        GeneralMethods.sendTextToElement(userDepartment, department);

    }



}
