package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
    WebDriver driver;
    private By welcome = By.id("welcome");
    private By btnLogout = By.cssSelector("a[href='/index.php/auth/logout']");

    public Logout(WebDriver driver) {
        this.driver = driver;
    }

    public void logout() {
        driver.findElement(welcome).click();
        driver.findElement(btnLogout).click();
    }
}
