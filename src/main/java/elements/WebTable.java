package elements;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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


    public static void clickWebTables () {
        Application.driver().findElement(webTables).click();
    }
    public static void clickEditButton () {
        Application.driver().findElement(editButtonSecondRow).click();
    }
    public static void updateFirstName () {
        WebElement element = Application.driver().findElement(firstName);
        element.clear();
        element.sendKeys("Ion");
    }
    public static void updateLastName () {
        WebElement element = Application.driver().findElement(lastName);
        element.clear();
        element.sendKeys("Pop");
    }
    public static void updateAge () {
        WebElement element = Application.driver().findElement(age);
        element.clear();
        element.sendKeys("40");
    }
    public static void updateEmail () {
        WebElement element = Application.driver().findElement(email);
        element.clear();
        element.sendKeys("test@automation.com");
    }
    public static void updateSalary () {
        WebElement element = Application.driver().findElement(salary);
        element.clear();
        element.sendKeys("15000");
    }
    public static void updateDepartment () {
        WebElement element = Application.driver().findElement(department);
        element.clear();
        element.sendKeys("Legal");
    }
    public static void clickSubmit () {
        Application.driver().findElement(submitButton).click();
    }
    public static void deleteThirdRow () {
        Application.driver().findElement(deleteButtonThirdRow).click();
    }
    public static void addNewRow () {
        Application.driver().findElement(addButton).click();
    }
    public static void addFirstName () {
        Application.driver().findElement(firstName).sendKeys("Marian");
    }
    public static void addLastName () {
        Application.driver().findElement(lastName).sendKeys("Lascu");
    }
    public static void addEmail () {
        Application.driver().findElement(email).sendKeys("marian.lascu@gmail.com");
    }
    public static void addAge () {
        Application.driver().findElement(age).sendKeys("35");
    }
    public static void addSalary () {
        Application.driver().findElement(salary).sendKeys("18000");
    }
    public static void addDepartment () {Application.driver().findElement(department).sendKeys("Software Engineering");}



}
