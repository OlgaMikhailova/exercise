package recruitment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Candidates {
    WebDriver driver;
private By btnAddCandidates= By.id("btnAdd");
private By firstName= By.id("addCandidate_firstName");
private By lastName= By.id("addCandidate_lastName");
private By email= By.id("addCandidate_email");
private By btnSave= By.id("btnSave");
    public Candidates(WebDriver driver) {
    this.driver = driver;
}
public void add(){
        driver.findElement(btnAddCandidates).click();
driver.findElement(firstName).sendKeys("abc");
driver.findElement(lastName).sendKeys("xyz");
driver.findElement(email).sendKeys("abc@xyz.com");
driver.findElement(btnSave).click();
    System.out.println("Add candidate");
}
}
