package util;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

public class Helper {
    private WebDriver driver;

    public Helper(WebDriver driver) {
        this.driver = driver;
    }
    public void moveToElement(By element){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(element)).build().perform();
    }

   public FluentWait<WebElement> wait(WebElement element) {
        return new FluentWait<WebElement>(element)
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(250, TimeUnit.MICROSECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
    }

     public void comparisonLink(By element) {

     }
        public void comparisonElementOnApage(By element) {
        if (isElementPresent(element)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fall");
        }
    }

     boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
public WebElement byToWebelement(By by){
        return driver.findElement(by);
}
    public void comparisonActualAndExpected(String text, WebElement element) {
        Assert.assertEquals(text, element.getText());
        if (element.getText().contains(text)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fall");
        }
    }
}
