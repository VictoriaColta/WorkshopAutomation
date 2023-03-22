package elements;

import model.Application;
import org.openqa.selenium.By;


public class TextBox {
    private static By fullName = By.id("userName");

    private static By email = By.id("userEmail");

    private static By currentAddress = By.id("currentAddress");

    private static By permanentAddress = By.id("permanentAddress");

    private static By submitButton = By.id("submit");

    private static By resultName = By.id("name");

    public static void setFullName(String value) {
        setFieldValue(fullName, value);
    }

    public static void setEmail(String value) {
        setFieldValue(email, value);
    }

    public static void setCurrentAddress(String value) {
        setFieldValue(currentAddress, value);
    }

    public static void setPermanentAddress(String value) {
        setFieldValue(permanentAddress, value);
    }

    private static void setFieldValue(By element, String value) {
        Application.driver().findElement(element).click();
        Application.driver().findElement(element).clear();
        Application.driver().findElement(element).sendKeys(value);
    }

    public static void clickSubmit() {
        Application.driver().findElement(submitButton).click();
    }

    public static String getResultText() {
        String resultFullName = Application.driver().findElement(resultName).getText();
        String[] getOnlyName = resultFullName.split(":");
        return getOnlyName[1];
    }
}
