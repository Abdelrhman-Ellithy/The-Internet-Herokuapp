package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DynamicLoadingPage {

    WebDriver driver;
    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }
    /**
     * @param index starts at 1 end at 2
     */
    public LoadingExample1 clickExample(int index) {
        switch (index){
            case 2 :
                driver.findElement(By.partialLinkText("Example 2")).click();
                return new LoadingExample1(driver) ;
            default:
                driver.findElement(By.partialLinkText("Example 1")).click();
                return new LoadingExample1(driver);
        }
    }

}
