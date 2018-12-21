import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstTest {
    private WebDriver driver;
    private String baseUrl;
    private String cssTitleWoman = "a[title='Women']";
    private String cssTitleDresses = "a[title='Dresses']";
    private String cssTitleTshirts = "a[title='T-shirts']";
    private String cssListWoman = "ul[class='product_list grid row']>li";
    private String cssListDresses = "ul[class='product_list grid row']>li";
    private String cssListTshirts = "ul[class='product_list grid row']>li";
    private String cssInStock = "span[class='available-now']";
    private String cssAddToCart = "a[title='Add to cart']";
    private String cssContinueShopping = "span[title='Continue shopping']";
    private String cssShoppingCart = " a[title='View my shopping cart']";
    private String cssSubtractItemInCart = "a[title='Subtract']";
    private String cssCountItemInCart = "td>input[type='text']";
    private String cssDeleteItemInCart = "a[title='Delete']";
    private String cssImgItemAddCart = "div[class='product-image-container layer_cart_img']>img"; //when add to cart
    private String cssImgItemMain = " div>a>img[class='replace-2x img-responsive'] "; //main


    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "http://automationpractice.com/index.php";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterTest
    public void shutDown() {
        driver.quit();
    }

    @Test
    public void googleTest() {
        driver.get(baseUrl);
//Women
        WebElement titleWoman = driver.findElement(By.cssSelector(cssTitleWoman));
        titleWoman.click();
        wait(titleWoman);
        List<WebElement> itemWoman = driver.findElements(By.cssSelector(cssListWoman));
        System.out.println("Item woman " + counter(itemWoman));

        String imgWoman = getImgSrc(cssImgItemMain);
        addToCart();
        String imgCartW = getImgSrc(cssImgItemAddCart);
        equalsStringItemSrc(imgWoman, imgCartW);
        driver.findElement(By.cssSelector(cssContinueShopping)).click();


//Dresses
        WebElement titleDresses = driver.findElements(By.cssSelector(cssTitleDresses)).get(1);
        titleDresses.click();
        wait(titleDresses);
        List<WebElement> itemDresses = driver.findElements(By.cssSelector(cssListDresses));
        System.out.println("Item dresses " + counter(itemDresses));

        String imgDresses = getImgSrc(cssImgItemMain);
        addToCart();
        String imgCartD = getImgSrc(cssImgItemAddCart);
        equalsStringItemSrc(imgDresses, imgCartD);
        driver.findElement(By.cssSelector(cssContinueShopping)).click();


//T-shirts
        WebElement titleTshirts = driver.findElements(By.cssSelector(cssTitleTshirts)).get(1);
        titleTshirts.click();
        wait(titleTshirts);
        List<WebElement> itemTshirts = driver.findElements(By.cssSelector(cssListTshirts));
        System.out.println("Item t-shirts " + counter(itemTshirts));

        String imgTshirts = getImgSrc(cssImgItemMain);
        addToCart();
        String imgCartT = getImgSrc(cssImgItemAddCart);
        equalsStringItemSrc(imgTshirts, imgCartT);
        driver.findElement(By.cssSelector(cssContinueShopping)).click();

//delete(value=1) or subtract(value>1) item from cart
        driver.findElement(By.cssSelector(cssShoppingCart)).click();
        WebElement delete = driver.findElements(By.cssSelector(cssDeleteItemInCart)).get(0);
        scroll(delete);
        WebElement count = driver.findElements(By.cssSelector(cssCountItemInCart)).get(0);
        String countItem = count.getAttribute("value");
        System.out.printf("value item = " + countItem);
        if (Integer.parseInt(countItem) > 1) {
            driver.findElements(By.cssSelector(cssSubtractItemInCart)).get(0).click();
            System.out.println(" ,so we subtract item on cart");
        } else {
            delete.click();
            System.out.println(" ,so we delete item from cart");
        }

    }

    private void addToCart() {
        driver.findElement(By.cssSelector(cssInStock)).click();
        driver.findElement(By.cssSelector(cssAddToCart)).click();
    }

    private String getImgSrc(String element) {
        WebElement img = driver.findElements(By.cssSelector(element)).get(0);
        return img.getAttribute("src");
    }

    private void equalsStringItemSrc(String imgMenu, String imgCart) {
        System.out.println("Item on cart it is item, that we wont add on cart -> " + imgMenu.equals(imgCart));
    }

    private static FluentWait<WebElement> wait(WebElement element) {
        return new FluentWait<WebElement>(element)
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(250, TimeUnit.MICROSECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
    }

    private void scroll(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element);
        action.perform();
    }

    private Integer counter(List<WebElement> items) {
        Integer count = 0;
        for (WebElement item : items) {
            count++;
        }
        return count;
    }
}