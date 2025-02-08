package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Ellithium.Utilities.interactions.DriverActions;

public class AlertsPage {
    WebDriver driver;
    DriverActions driverActions;
    public AlertsPage(WebDriver driver){
        this.driver=driver;
        driverActions=new DriverActions(driver);
    }
    public void clickJsAlert(){
        driverActions.clickOnElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
    }
    public void clickJsConfirm(){
        driverActions.clickOnElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
    }
    public void clickJsPrompt(){
        driverActions.clickOnElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
    }
    public void alert_accept(){
        driverActions.acceptAlert(5);
    }
    public void alert_Cancel(){
        driverActions.dismissAlert(5);
    }
    public void sendPrompt(String input){
        driverActions.sendDataToAlert(input);
    }
    public String getAlertMessage(){
       return driverActions.getAlertText(5);
    }
    public String getResultMessage(){
        return  driverActions.getText(By.id("result"));
    }

}
