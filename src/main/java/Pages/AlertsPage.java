package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    WebDriver driver;
    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickJsAlert(){
        driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
    }
    public void clickJsConfirm(){
        driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
    }
    public void clickJsPrompt(){
        driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
    }
    public void alert_accept(){
        driver.switchTo().alert().accept();
    }
    public void alert_Cancel(){
        driver.switchTo().alert().dismiss();
    }
    public void sendPrompt(String input){
        driver.switchTo().alert().sendKeys(input);
    }
    public String getAlertMessage(){
       return driver.switchTo().alert().getText();
    }
    public String getResultMessage(){
        return  driver.findElement(By.id("result")).getText();
    }

}
