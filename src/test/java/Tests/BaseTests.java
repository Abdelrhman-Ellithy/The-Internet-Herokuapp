package Tests;

import Pages.HomPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
public class BaseTests {
    WebDriver driver;
    HomPage home;
    @BeforeClass
    @Parameters("BrowserName")
    public void Setup(String BrowserName){
        switch (BrowserName){
            case "Chrome": driver=new ChromeDriver(); break;
            case "Edge": driver=new EdgeDriver();break;
            case "Firefox": driver=new FirefoxDriver();break;
            default : driver=new ChromeDriver();
        }
        home=new HomPage(driver);
    }
    @AfterClass
    public void tareDown(){
        driver.quit();
    }
}
