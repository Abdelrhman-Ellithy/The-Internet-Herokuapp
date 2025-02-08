package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Ellithium.Utilities.interactions.DriverActions;
public class SecureAreaPage {
    WebDriver driver;
    DriverActions driverActions;
    public SecureAreaPage(WebDriver Driver){
        driver=Driver;
        driverActions=new DriverActions(driver);
    }
    public String getLoginMassega(){
        return driverActions.getText(By.id("flash"));
    }
}
