package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoadingExample1 {
    WebDriver driver;
    public LoadingExample1(WebDriver driver){
        this.driver=driver;
    }
    public void clickStartBtn() throws InterruptedException {
        driver.findElement(By.tagName("button")).click();
    }
    public String getText(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("loading"))));
        String text= driver.findElement(By.id("finish")).getText();
        return text;
    }
}
