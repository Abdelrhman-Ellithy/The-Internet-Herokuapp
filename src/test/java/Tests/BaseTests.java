package Tests;

import Ellithium.core.driver.DriverFactory;
import Ellithium.core.base.NonBDDSetup;
import Ellithium.core.driver.LocalDriverType;
import Pages.HomPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
public class BaseTests extends NonBDDSetup {
    WebDriver driver;
    HomPage home;
    @BeforeClass
    public void Setup(){
        driver= DriverFactory.getNewLocalDriver(LocalDriverType.Chrome);
        home=new HomPage(driver);
    }
    @AfterClass
    public void tareDown(){
        DriverFactory.quitDriver();
    }
}
