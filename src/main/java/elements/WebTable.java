package elements;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Handler;

public class WebTable {

    private static By webTables = By.xpath("//*[@id=\"item-3\"]/span[@class='text' and contains (text(), \"Web Tables\")]");
    private static By editButtonSecondRow = By.xpath("//div[@class='action-buttons']/span[@id='edit-record-2']");
    private static By deleteButtonThirdRow = By.xpath("//div[@class='action-buttons']/span[@id='delete-record-3']");
    private static By addButton = By.id("addNewRecordButton");
    private static By firstName = By.id("firstName");
    private static By lastName = By.id("lastName");
    private static By email = By.id("userEmail");
    private static By age = By.id("age");
    private static By salary = By.id("salary");
    private static By department = By.id("department");
    private static By submitButton = By.id("submit");


    public static void clickWebTables () {Handler.clickElement(webTables);}

    public static void clickEditButton () {Handler.clickElement(editButtonSecondRow);};

    public static void clickAddRow () {Handler.clickElement(addButton);}

    public static void updateRecords (String name1, String name2, String userEmail, String userAge, String userSalary, String userDepartment) {
    Handler.sendTextToElement(firstName, name1);
    Handler.sendTextToElement(lastName, name2);
    Handler.sendTextToElement(email, userEmail);
    Handler.sendTextToElement(age,userAge);
    Handler.sendTextToElement(salary, userSalary);
    Handler.sendTextToElement(department, userDepartment);
    }

    public static void addRecord (String name1, String name2, String userEmail, String userAge, String userSalary, String userDepartment) {
        Handler.sendTextToElement(firstName, name1);
        Handler.sendTextToElement(lastName, name2);
        Handler.sendTextToElement(email, userEmail);
        Handler.sendTextToElement(age,userAge);
        Handler.sendTextToElement(salary, userSalary);
        Handler.sendTextToElement(department, userDepartment);
    }

    public static void clickSubmit () {Handler.clickElement(submitButton);};

    public static void deleteThirdRow () {Handler.clickElement(deleteButtonThirdRow);}


}
