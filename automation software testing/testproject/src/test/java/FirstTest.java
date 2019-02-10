import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://google.com";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void googleTest() {
        driver.get(baseUrl);
        WebElement seach = driver.findElement(By.name("q"));
        seach.sendKeys("Selenium");
        seach.sendKeys(Keys.ENTER);
        WebElement first = driver.findElements(By.className("r")).get(0);
        Assert.assertEquals("Selenium - Поиск в Google",driver.getTitle());
        if (first.getText().contains("Selenium")) {
            System.out.printf("Pass");
        } else {
            System.out.printf("Fall");
        }
    }

    @After
    public void shutDown() {
        driver.quit();
    }
}