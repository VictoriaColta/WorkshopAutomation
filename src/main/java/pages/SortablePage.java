package pages;


import model.ApplicationDemoQa;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

import static model.ApplicationDemoQa.driver;


public class SortablePage {
    public static By sortable = By.xpath("//span[normalize-space()='Sortable']");
    public static By gridTab = By.id("demo-tab-grid");
    public static By gridCell = By.xpath("(//li[@class='list-group-item list-group-item-action'])");
    public static By list = By.xpath("//* [@id='demo-tabpane-list']/div/div");
    public static By element1 = By.xpath("//*[@id='demo-tabpane-list']/div/div[1]");
    public static By element2 = By.xpath("//*[@id='demo-tabpane-list']/div/div[2]");
    public static By element3 = By.xpath("//*[@id='demo-tabpane-list']/div/div[3]");
    public static By element4 = By.xpath("//*[@id='demo-tabpane-list']/div/div[4]");
    public static By element5 = By.xpath("//*[@id='demo-tabpane-list']/div/div[5]");
    public static By element6 = By.xpath("//*[@id='demo-tabpane-list']/div/div[6]");
    public static List<WebElement> initialOrder = driver().findElements(list);


    public static void click(By locator) {
        WebElement element = ApplicationDemoQa.driver().findElement(locator);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) ApplicationDemoQa.driver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

//    public static void moveInList(By source, By destination) {
//        Actions actions = new Actions(ApplicationDemoQa.driver());
//        WebElement sourceElement = ApplicationDemoQa.driver().findElement(source);
//        WebElement destinationElement = ApplicationDemoQa.driver().findElement(destination);
//        actions.dragAndDrop(sourceElement, destinationElement).build().perform();
//    }

//    public static void sortList(By source, By destination) {
//        List<WebElement> list = driver().findElements(By.xpath("//* [@id='demo-tabpane-list']/div/div"));
//        System.out.println(list.size());
//        List<String> elementsName = list.stream().map(n -> n.getText()).collect((Collectors.toList()));
//        System.out.println(elementsName); //to check that the list is correctly displayed;
//        for (int i = list.size(); i-- > 0; ) {
//            System.out.println(list.get(3).getText());//check the list is reverse parsed
//            WebElement element = driver().findElement(By.xpath("//*[@id='demo-tabpane-list']/div/div[" + i + "]"));
//            if (element != null) {
//                Actions action = new Actions(driver());
//                action.dragAndDrop(element, destination1).perform();
//                action.dragAndDrop(element, destination2).perform();
//                action.dragAndDrop(element, destination3).perform();
//                action.dragAndDrop(element, destination4).perform();
//                action.dragAndDrop(element, destination5).perform();
//                action.dragAndDrop(element, destination6).perform();
//                break;
//            }
//        }
//    }

    public static void sortList() {
        WebElement elem1 = driver().findElement(element1);
        WebElement elem2 = driver().findElement(element2);
        WebElement elem3 = driver().findElement(element3);
        WebElement elem4 = driver().findElement(element4);
        WebElement elem5 = driver().findElement(element5);
        WebElement elem6 = driver().findElement(element6);
        List<WebElement> desiredOrder = new ArrayList<>();
        desiredOrder.add(elem6);
        desiredOrder.add(elem1);
        desiredOrder.add(elem5);
        desiredOrder.add(elem3);
        desiredOrder.add(elem4);
        desiredOrder.add(elem2);
        for (WebElement element : desiredOrder) {
            Actions actions = new Actions(ApplicationDemoQa.driver());
            actions.moveToElement(element).perform();
            actions.dragAndDrop(element, elem1).perform();
            actions.dragAndDrop(element, elem2).perform();
            actions.dragAndDrop(element, elem3).perform();
            actions.dragAndDrop(element, elem4).perform();
            actions.dragAndDrop(element, elem5).perform();
            actions.dragAndDrop(element, elem5).perform();
            break;
        }
    }


    public static void moveWebElementsInOrder() {
        WebElement elem1 = driver().findElement(element1);
        WebElement elem2 = driver().findElement(element2);
        WebElement elem3 = driver().findElement(element3);
        WebElement elem4 = driver().findElement(element4);
        WebElement elem5 = driver().findElement(element5);
        WebElement elem6 = driver().findElement(element6);
        // Iterate over the desired order list
        List<WebElement> desiredOrder = new ArrayList<>();
        desiredOrder.add(elem6);
        desiredOrder.add(elem1);
        desiredOrder.add(elem5);
        desiredOrder.add(elem3);
        desiredOrder.add(elem4);
        desiredOrder.add(elem2);
        for (WebElement element : desiredOrder) {
            // Locate the corresponding web element in the initial list
            WebElement initialElement = findWebElement(element);

            // Perform drag and drop operation to move the web element to the desired position
            Actions actions = new Actions(driver());
            actions.moveToElement(initialElement).perform();
            actions.dragAndDrop(initialElement,elem1).perform();
            actions.dragAndDrop(initialElement,elem2).perform();
            actions.dragAndDrop(initialElement,elem3).perform();
            actions.dragAndDrop(initialElement,elem4).perform();
            actions.dragAndDrop(initialElement,elem5).perform();
            actions.dragAndDrop(initialElement,elem6).perform();
            break;
        }
    }
    private static WebElement findWebElement(WebElement targetElement) {
        for (WebElement element : initialOrder) {
            if (element.equals(targetElement)) {
                return element;
            }
        }
        throw new RuntimeException("Web element not found: " + targetElement);
    }


    public static void sortGridCells(By locator) {
        Actions actions = new Actions(ApplicationDemoQa.driver());
        List<WebElement> cells = ApplicationDemoQa.driver().findElements(locator);
        WebElement one = cells.get(0);
        System.out.println(one);
        WebElement[] sortedCells = new WebElement[cells.size()];
        int[] sortedIndices = {8, 5, 7, 1, 2, 4, 0, 3, 6};
        for (int i = 0; i < cells.size(); i++) {
            sortedCells[sortedIndices[i]] = cells.get(i);
            System.out.println(sortedCells);
        }
        for (WebElement cell : sortedCells) {
            actions.dragAndDrop(cell, sortedCells[0]).perform();
        }
    }
}
