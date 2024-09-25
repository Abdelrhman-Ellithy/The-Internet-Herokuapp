package Pages;

import org.openqa.selenium.AcceptedW3CCapabilityKeys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropPage {
    WebDriver driver;

    public DragDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dragDropBox(int indexSource, int indexDestnation) {
        Actions actions = new Actions(driver);
        switch (indexSource) {
            case 1:
                actions.dragAndDrop(driver.findElement(By.id("column-a")), driver.findElement(By.id("column-b"))).perform();
                break;
            case 2:
                actions.dragAndDrop(driver.findElement(By.id("column-b")), driver.findElement(By.id("column-a"))).perform();
                break;
        }
    }

    public String getBoxText(int index) {
        switch (index){
            case 1: return  driver.findElement(By.id("column-a")).findElement(By.tagName("header")).getText();
            case 2: return driver.findElement(By.id("column-b")).findElement(By.tagName("header")).getText();
            default: return "failed";
        }
    }
}
