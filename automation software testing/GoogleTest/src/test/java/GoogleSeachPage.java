import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class GoogleSeachPage {
    WebDriver driver;
    By q = By.name("q");
    By list = By.name("q");


    public GoogleSeachPage(WebDriver driver) {
        this.driver = driver;
    }

    void open(String url) {
        driver.get(url);
    }

    void seachFor(String text) {
        driver.findElement(q).sendKeys(text);
        driver.findElements(list).get(0);
    }

    public void checkSeachResult(String text) {
        WebElement first = driver.findElements(list).get(0);
        Assert.assertEquals("Google", driver.getTitle());
        if (first.getText().contains(text)) {
            System.out.printf("Pass");
        } else {
            System.out.printf("Fall");
        }
    }
}
