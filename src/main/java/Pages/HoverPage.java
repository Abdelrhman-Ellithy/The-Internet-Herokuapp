package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    WebDriver driver;
    private Actions actions;
    private String locator;
    public HoverPage(WebDriver driver){
        this.driver=driver;
        actions=new Actions(driver);
    }

    /**
     * @param index starts at 1 ends at 3
     */
    public void hoverOverFigure(int index){
        locator="(//div[@class='figure'])["+ Integer.toString(index)+ "]";
        actions.moveToElement(driver.findElement(By.xpath(locator))).perform();
    }
    public String getTitle(){
        return driver.findElement(By.xpath(locator))
                .findElement(By.className("figcaption"))
                .findElement(By.tagName("h5")).getText();
    }
    public String getLink(){
        String path= driver.findElement(By.xpath(locator))
                .findElement(By.className("figcaption"))
                .findElement(By.tagName("a")).getAttribute("href");
        return "https://the-internet.herokuapp.com/"+path;
    }
    public boolean isCaptionDisplayed(){
        return driver.findElement(By.xpath(locator))
                .findElement(By.className("figcaption"))
                .findElement(By.tagName("a")).isDisplayed();
    }
}
