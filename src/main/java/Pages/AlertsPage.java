package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static Ellithium.Utilities.browser.DriverActions.*;

public class AlertsPage {
    WebDriver driver;
    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickJsAlert(){
        clickOnElement(driver,By.xpath("//button[@onclick=\"jsAlert()\"]"));

    }
    public void clickJsConfirm(){
        clickOnElement(driver,By.xpath("//button[@onclick=\"jsConfirm()\"]"));
    }
    public void clickJsPrompt(){
        clickOnElement(driver,By.xpath("//button[@onclick=\"jsPrompt()\"]"));
    }
    public void alert_accept(){
        acceptAlert(driver);
    }
    public void alert_Cancel(){
        dismissAlert(driver);
    }
    public void sendPrompt(String input){
        sendDataToAlert(driver,input);
    }
    public String getAlertMessage(){
       return getAlertText(driver);
    }
    public String getResultMessage(){
        return  getText(driver,By.id("result"));
    }

}
