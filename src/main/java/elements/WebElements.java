package elements;

import Utils.ElementHandler;
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


    public static void submit() {
        ElementHandler.clickElement(submitButton);

    }

    public static void deleteRecord() {
        ElementHandler.clickElement(deleteRecordButton);

    }

    public static void editSecondRow(String v1, String v2, String v3, String userAge, String userSalary, String userDepartment) {
        ElementHandler.clickElement(editRow2);
        ElementHandler.sendTextToElement(v1, firstName);
        ElementHandler.sendTextToElement(v2, lastName);
        ElementHandler.sendTextToElement(v3, email);
        ElementHandler.sendTextToElement(userAge, age);
        ElementHandler.sendTextToElement(userSalary, salary);
        ElementHandler.sendTextToElement(userDepartment, department);

    }

    public static void addNewRecord(String name1, String name2, String userEmail, String userAge, String userSalary, String userDepartment) {

        ElementHandler.clickElement(addRecordButton);
        ElementHandler.sendTextToElement(name1, firstName);
        ElementHandler.sendTextToElement(name2, lastName);
        ElementHandler.sendTextToElement(userEmail, email);
        ElementHandler.sendTextToElement(userAge, age);
        ElementHandler.sendTextToElement(userSalary, salary);
        ElementHandler.sendTextToElement(userDepartment, department);

    }

    public static boolean isRowDeleted() {
        return ElementHandler.elementVisibilityValidation(deleteRecordButton);
    }

}
