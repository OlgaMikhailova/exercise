import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstTest {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
//        baseUrl = "https://google.com";
        baseUrl = "https://accounts.google.com";

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void googleTest() {
        driver.get(baseUrl);
        //*enter login
        WebElement login = driver.findElement(By.cssSelector("#identifierId"));
        login.sendKeys("login");
        WebElement next = driver.findElement(By.cssSelector("#identifierNext"));
        next.click();
        //*enter password
        WebElement password = driver.findElement(By.cssSelector("input.whsOnd.zHQkBf[type='password']"));
        password.sendKeys("password");
        WebElement next2 = driver.findElement(By.cssSelector("#passwordNext"));
        Wait<WebElement> wait4 = new FluentWait<WebElement>(next2)
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(250, TimeUnit.MICROSECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
        next2.click();
        //*choose gmail
        WebElement gmail = driver.findElement(By.cssSelector("a.WaidBe"));
        gmail.click();

        WebElement menu = driver.findElement(By.cssSelector("div.ajl.aib.aZ6 div.n6"));
        Wait<WebElement> wait = new FluentWait<WebElement>(gmail)
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(250, TimeUnit.MICROSECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(menu);
        actions1.perform();
        menu.click();
        WebElement spamButton = driver.findElement(By.cssSelector("div.TN.bzz.aHS-bnv div.aio.UKr6le span.nU.n1 > a.J-Ke.n0"));
        Wait<WebElement> wait3 = new FluentWait<WebElement>(spamButton)
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(250, TimeUnit.MICROSECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
        spamButton.click();
        //spam
        WebElement countSpam = driver.findElement(By.cssSelector("div.nH.aqK div.Cr.aqJ div.ar5.J-J5-Ji span.Di div.J-J5-Ji.amH.J-JN-I:nth-child(1) span.Dj > span.ts:nth-child(2)"));
        List<WebElement> letters = driver.findElements(By.cssSelector("tr[jsaction='bjyjJe:NOSeAe;pInidd:NOSeAe;']"));
        Integer count = 0;
        for (WebElement letter : letters) {
            count++;
        }
        System.out.println("Spam " + count);

        //choose enter letters
        WebElement enterLetters = driver.findElement(By.cssSelector("a[title='Входящие']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(enterLetters);
        actions.perform();

        Wait<WebElement> wait6 = new FluentWait<WebElement>(spamButton)
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(250, TimeUnit.MICROSECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);

        enterLetters.click();
        //enter letters
        WebElement countLeters = driver.findElement(By.cssSelector("div.J-J5-Ji.amH.J-JN-I:nth-child(1) span.Dj > span.ts:nth-child(2)"));
        System.out.println("LETTERS " + countLeters.getText());

        //choose delete_list(корзина)
        WebElement menu2 = driver.findElement(By.cssSelector("div.ajl.aib.aZ6 div.n6"));
        Wait<WebElement> wait7 = new FluentWait<WebElement>(menu2)
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(250, TimeUnit.MICROSECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
        Actions actions6 = new Actions(driver);
        actions1.moveToElement(menu);
        actions1.perform();
        menu2.click();
        WebElement deleteLetter = driver.findElement(By.cssSelector("a[title='Корзина']"));

        deleteLetter.click();
        //delete_list(корзина)
        WebElement checkboxAll = driver.findElement(By.cssSelector("span[role='checkbox']"));
        checkboxAll.click();
        WebElement delete = driver.findElements(By.cssSelector("div.Bn")).get(0);
//        WebElement delete = driver.findElement(By.cssSelector("div.Bn"));
        Wait<WebElement> wait5 = new FluentWait<WebElement>(delete)
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(250, TimeUnit.MICROSECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
        delete.click();

        //*logout
        WebElement logoutMenu = driver.findElement(By.cssSelector("div.gb_ib.gb_nd.gb_eh.gb_R.gb_2f.gb_rb div.gb_3c.gb_lb.gb_eh.gb_R > a.gb_b.gb_hb.gb_R"));
        logoutMenu.click();
        WebElement logout = driver.findElement(By.cssSelector("#gb_71"));
        logout.click();

    }

    @After
    public void shutDown() {
        driver.quit();
    }
}
