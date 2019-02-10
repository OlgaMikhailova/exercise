import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

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

    @After
    public void shutDown() {
        driver.quit();
    }

    @Test
    public void googleTest() {
        GoogleSeachPage page = new GoogleSeachPage(driver);
        page.open(baseUrl);
        page.seachFor("Selenium");
        page.checkSeachResult("Selenium");
    }
}
