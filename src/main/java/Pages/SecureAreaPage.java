package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    WebDriver driver;
    public SecureAreaPage(WebDriver Driver){
        driver=Driver;
    }
    public String getLoginMassega(){
        return driver.findElement(By.id("flash")).getText();
    }
}
