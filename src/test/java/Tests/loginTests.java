package Tests;

import Pages.LoginPage;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTests extends BaseTests {
    LoginPage login;
    @Step("tc001")
    @Test(priority = 1)
    public void invalidPassword(){
        login =home.clickFormAuthentication();
        login.setUserName("tomsmith");
        login.setPassword("hamada");
        var secureAreaPage=login.clickLoginBtn();
        String actualMassege=secureAreaPage.getLoginMassega();
        String expectedMassege="Your password is invalid!";
        Assert.assertTrue(actualMassege.contains(expectedMassege));
    }
    @Step("tc002")
    @Test(priority = 1)
    public void invalidUsername(){
        login =home.clickFormAuthentication();
        login.setUserName("hamada");
        login.setPassword("SuperSecretPassword!");
        var secureAreaPage=login.clickLoginBtn();
        String actualMassege=secureAreaPage.getLoginMassega();
        String expectedMassege="Your username is invalid!";
        Assert.assertTrue(actualMassege.contains(expectedMassege));
    }
    @Step("tc003")
    @Test(priority = 2)
    public void validLogin() {
        login = home.clickFormAuthentication();
        login.setPassword("SuperSecretPassword!");
        login.setUserName("tomsmith");
        var secureAreaPage=login.clickLoginBtn();
        String actualMassege=secureAreaPage.getLoginMassega();
        String expectedMassege="You logged into a secure area!";
        Assert.assertTrue(actualMassege.contains(expectedMassege));
    }
}
