package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    WebDriver driver;
    public DropDownPage(WebDriver driver){
        this.driver=driver;
    }
    public void dropDownSelect(String option){
        Select dropdown=new Select(driver.findElement(By.cssSelector("select#dropdown")));
        dropdown.selectByVisibleText(option);
    }
    /**
     * @param index starts at 1
     */
    public void dropDownSelect(int index){
        Select dropdown=new Select(driver.findElement(By.cssSelector("select#dropdown")));
        dropdown.selectByIndex(index-1);
    }
    public String dropDownGetSelected(){
        Select dropdown=new Select(driver.findElement(By.cssSelector("select#dropdown")));
        return dropdown.getFirstSelectedOption().getText();
    }

}
