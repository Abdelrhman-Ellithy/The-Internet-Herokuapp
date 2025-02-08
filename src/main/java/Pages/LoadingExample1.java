package Pages;

import Ellithium.Utilities.interactions.DriverActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoadingExample1 {
    WebDriver driver;
    DriverActions driverActions;
    public LoadingExample1(WebDriver driver){
        this.driver=driver;
        driverActions=new DriverActions<>(driver);
    }
    public void clickStartBtn()  {
        driverActions.clickOnElement(By.tagName("button"));
    }
    public String getText(){
        return driverActions.getText(By.id("finish"));
    }
}
