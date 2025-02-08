package Tests;

import Ellithium.Utilities.helpers.PropertyHelper;
import Ellithium.core.driver.DriverFactory;
import Ellithium.core.base.NonBDDSetup;
import Ellithium.core.driver.DriverType;
import Ellithium.core.driver.LocalDriverType;
import Pages.HomPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
public class BaseTests extends NonBDDSetup {
    WebDriver driver;
    HomPage home;
    @BeforeSuite
    public void openReport(){
        PropertyHelper.setDataToProperties("src/main/resources/properties/allure.properties",
                "allure.generate.report",
                "true");
        PropertyHelper.setDataToProperties("src/main/resources/properties/allure.properties",
                "allure.open.afterExecution",
                "true");
    }
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
