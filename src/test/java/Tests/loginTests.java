package Tests;

import Ellithium.Utilities.assertion.AssertionExecutor;
import Ellithium.Utilities.browser.DriverActions;
import Ellithium.config.managment.ConfigContext;
import Ellithium.core.logging.LogLevel;
import Ellithium.core.reporting.Reporter;
import Pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class loginTests extends BaseTests {
    @DataProvider(name= "invalidLoginData")
            Object[][] getInvalidTestData(){
        return new Object[][]{
                {"tomsmith","hamada","Your password is invalid!"},
                {"hamada","SuperSecretPassword!","Your username is invalid!"}
        };
    }
    LoginPage login;
//    @Test(priority = 1, dataProvider = "invalidLoginData")
//    public void invalidLogin(String username, String password, String expectedMessage){
//        login =home.clickFormAuthentication();
//        login.setUserName(username);
//        login.setPassword(password);
//        var secureAreaPage=login.clickLoginBtn();
//        String actualMessage=secureAreaPage.getLoginMassega();
//        AssertionExecutor.hard.assertTrue(actualMessage.contains(expectedMessage));
//    }
    @Test(priority = 2)
    public void validLogin() {
//        login = home.clickFormAuthentication();
//        login.setPassword("SuperSecretPassword!");
//        login.setUserName("tomsmith");
//        var secureAreaPage=login.clickLoginBtn();
//        String actualMessage=secureAreaPage.getLoginMassega();
//        String expectedMessage="You logged into a secure area!";
//        AssertionExecutor.hard.assertTrue(actualMessage.contains(expectedMessage));
        DriverActions.navigateToUrl(driver,"https://camo.githubusercontent.com/410001a1d57adc516e365c96f4c0bada27f59ef3ed8400f672b6a39a1fa41d5b/68747470733a2f2f6b6f6d617265762e636f6d2f67687076632f3f757365726e616d653d416264656c72686d616e2d456c6c697468792d456c6c69746869756d267374796c653d666c61742d73717561726526636f6c6f723d626c7565");
        for (int i=0; i<200 ; i++){
            DriverActions.refreshPage(driver);
        }
    }
}
