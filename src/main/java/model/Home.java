package model;

import org.openqa.selenium.By;

public class Home {

    public static By addRemoveElementsButton = By.xpath("//a[@href='/add_remove_elements/']");
    public static By addElementButton = By.xpath("//button[@onclick='addElement()']");
    public static By deleteButton = By.xpath("//button[@class='added-manually']");

}
