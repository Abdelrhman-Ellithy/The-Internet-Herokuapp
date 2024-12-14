package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Ellithium.Utilities.interactions.DriverActions;

public class LoginPage {
    WebDriver driver;
    DriverActions driverActions;
    public LoginPage(WebDriver driver) {
        this.driver=driver;
        driverActions=new DriverActions<>(driver);
    }
    public void setUserName(String username){
        driverActions.sendData(By.id("username"),username);
    }
    public void setPassword(String password){
        driverActions.sendData(By.id("password"),password);
    }
    public SecureAreaPage clickLoginBtn(){
        driverActions.clickOnElement(By.tagName("button"));
        return new SecureAreaPage(driver);
    }

}
