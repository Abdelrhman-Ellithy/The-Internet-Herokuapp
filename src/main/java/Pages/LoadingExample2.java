package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoadingExample2 {
    WebDriver driver;
    public LoadingExample2(WebDriver driver){
        this.driver=driver;
    }
    public void clickStartBtn() {
        driver.findElement(By.tagName("button")).click();
    }
    public String getText(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        String text= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("finish")))).getText();
        return text;
    }
}
