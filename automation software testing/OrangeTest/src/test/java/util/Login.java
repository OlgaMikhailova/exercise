package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
    private By username =By.name("txtUsername");
    private By password =By.name("txtPassword");
    private By btnLogin =By.cssSelector("input.button");
    private String myUsername="Admin ";
    private String myPassword="admin123";

    public Login(WebDriver driver) {
        this.driver = driver;
    }
    public void enter(){
        driver.findElement(username).sendKeys(myUsername);
        driver.findElement(password).sendKeys(myPassword);
        driver.findElement(btnLogin).click();
    }
}
