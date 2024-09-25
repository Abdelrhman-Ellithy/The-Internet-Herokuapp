package Tests;

import Pages.HomPage;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    WebDriver driver;
    HomPage home;
    @BeforeClass
    @Parameters({"BrowserName"})
    public void Setup(@Optional("Chrome") String BrowserName){
        switch (BrowserName){
            case "Edge": driver=new EdgeDriver();break;
            case "Firefox": driver=new FirefoxDriver();break;
            default:driver=new ChromeDriver();
        }
        home=new HomPage(driver);
    }
    @AfterClass
    public void tareDown(){
        driver.quit();
    }
    @AfterMethod
    public void TakeScreenShot(ITestResult result) throws IOException {
        var camera=(TakesScreenshot)driver;
        File screenShot;
        switch (result.getStatus()){
            case ITestResult.FAILURE :
                screenShot= camera.getScreenshotAs(OutputType.FILE);
                Files.move(screenShot, new File("Test-Output/ScreenShots/Failed/"+result.getTestClass().getName()+"_"+result.getName()+".png"));
                break;
            case ITestResult.SUCCESS:
                screenShot = camera.getScreenshotAs(OutputType.FILE);
                Files.move(screenShot, new File("Test-Output/ScreenShots/Passed/" + result.getTestClass().getName() + "_" + result.getName() + ".png"));
                break;
            case ITestResult.SKIP :
                screenShot= camera.getScreenshotAs(OutputType.FILE);
                Files.move(screenShot, new File("Test-Output/ScreenShots/Skipped/"+result.getTestClass().getName()+"_"+result.getName()+".png"));
                break;
        }
    }
}
