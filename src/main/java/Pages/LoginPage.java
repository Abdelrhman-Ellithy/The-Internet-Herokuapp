package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    public void setUserName(String username){
        driver.findElement(By.id("username")).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(By.id("password")).sendKeys(password);
    }
    public SecureAreaPage clickLoginBtn(){
        driver.findElement(By.tagName("button")).click();
        return new SecureAreaPage(driver);
    }

}
