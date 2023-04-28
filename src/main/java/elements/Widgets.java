package elements;

import Utils.ElementHandler;
import org.openqa.selenium.By;


import static Utils.Drivers.driver;

public class Widgets {

    public static By datePickerButton = By.xpath("//li[@class='btn btn-light ']//span[contains(text(),'Date Picker')]");
    public static By selectDatefield = By.xpath("//input[@id='datePickerMonthYearInput']");

    public static void datePicker() {
        ElementHandler.clickElement(datePickerButton);

    }

    public static void selectDate() {
        ElementHandler.clearText(selectDatefield);
        ElementHandler.addDate("2023/11/03");

    }

    public static void selectDateSecondMethod() {

        String month = "November";
        String year = "2023";
        ElementHandler.clickElement(selectDatefield);

        while (true) {
            String dateText = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']")).getText();
            System.out.println(dateText);
            if (dateText.contains(month) && dateText.contains(year)) {
                break;
            } else {
                driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']")).click();
            }
        }

        driver.findElement(By.xpath("//div[contains(text(),'13')]")).click();

//        WebElement date1 = driver.findElement(By.xpath("//div[@class='react-datepicker__month']"));
//        List<WebElement> activedates = date1.findElements(By.xpath("//div[@class='react-datepicker__month']"));
//        for (WebElement dates : activedates) {
//            String date = dates.getText();
//            System.out.println(date);
//            if (date.equals("25")) {
//                dates.click();
//                break;  (I stll have to figure it out, just ignore it )
    }
}


