package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadingPageTests extends BaseTests{
    @Test
    public void example1TextIsDisplayed() throws InterruptedException {
        var DynamicloadingPage=home.clickDynamicLoading();
        var loadingExample1Page=DynamicloadingPage.clickExample(1);
        loadingExample1Page.clickStartBtn();
        String expectedResult="Hello World!";
        String actualResult=loadingExample1Page.getText();
        Assert.assertEquals(actualResult,expectedResult,"Element Is not visable");
    }
    @Test
    public void example2TextIsDisplayed() throws InterruptedException {
        var DynamicloadingPage=home.clickDynamicLoading();
        var loadingExample2Page=DynamicloadingPage.clickExample(2);
        loadingExample2Page.clickStartBtn();
        String expectedResult="Hello World!";
        String actualResult=loadingExample2Page.getText();
        Assert.assertEquals(actualResult,expectedResult,"Element Is not visable");
    }
}
