package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomPage {
    WebDriver driver;
    private final String homeUrl="https://the-internet.herokuapp.com/";
    public HomPage(WebDriver driver){
        this.driver=driver;
    }
    public LoginPage clickFormAuthentication(){
        returnHome();
        driver.findElement(By.partialLinkText("Form Authentication")).click();
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown(){
        driver.findElement(By.partialLinkText("Dropdown")).click();
        return new DropDownPage(driver);

    }
    public HoverPage clickHover(){
        returnHome();
        driver.findElement(By.partialLinkText("Hovers")).click();
        return new HoverPage(driver);
    }
    public HorizontalSliderPage clickHorizontalSlider(){
        returnHome();
        driver.findElement(By.partialLinkText("Horizontal Slider")).click();
        return new HorizontalSliderPage(driver);
    }
    public DragDropPage clickDragDrop(){
        returnHome();
        driver.findElement(By.partialLinkText("Drag and Drop")).click();
        return new DragDropPage(driver);
    }
    public AlertsPage clickAlerts(){
        returnHome();
        driver.findElement(By.partialLinkText("JavaScript Alerts")).click();
        return new AlertsPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        returnHome();
        driver.findElement(By.partialLinkText("Dynamic Loading")).click();
        return new DynamicLoadingPage(driver);
    }
    private void returnHome(){
        driver.get(homeUrl);
    }
}
