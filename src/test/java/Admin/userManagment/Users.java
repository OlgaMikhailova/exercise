package Admin.userManagment;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Helper;

public class Users {
    private WebDriver driver;
    Helper helper;
    private By btnAddUser = By.id("btnAdd");
    private By userRole = By.id("systemUser_userType");
    private By userRoleAdmin = By.cssSelector("select.valid:nth-child(2) > option:nth-child(1)");
    private By userRoleESS = By.cssSelector("select.valid:nth-child(2) > option:nth-child(2)");
    private By employeeNamer = By.id("systemUser_employeeName_empName");
    private By userName = By.id("systemUser_userName");
    private By userStatus = By.id("systemUser_status");
    private By userStatusEnabled = By.cssSelector("#systemUser_status>option:nth-child(1)");
    private By userStatusDisabled = By.cssSelector("#systemUser_status>option:nth-child(2)");
    private By userPassword = By.id("systemUser_password");
    private By txtHelpPassword = By.id("systemUser_password_strength_meter");//Very Weak Weak Better
    private By txtHelpUnderPassword = By.cssSelector("span.validation-error:nth-child(3)");//    Should have at least 8 characters        Should be less than 64 characters
    private By txtHelpUnderUserName = By.cssSelector("span[for='systemUser_userName']");//   Should have at least 5 characters   Required
    private By txtHelpUnderEmployeeName = By.cssSelector("span[for='systemUser_employeeName_empName']");//  John Smith Invalid    Required
    private By userConfirmPassword = By.id("systemUser_confirmPassword");
    private By txtHelpConfirmPassword = By.id("span[for='systemUser_confirmPassword']"); //Passwords do not match  Please enter at least 8 characters.   Passwords do not match
    private By userSave = By.id("btnSave");

    public Users(WebDriver driver) {
        this.driver = driver;
        helper = new Helper(driver);
    }

    public void addUser() {
        driver.findElement(btnAddUser).click();

        driver.findElement(userRole).click();
        driver.findElement(userRoleAdmin).click();
        helper.comparisonActualAndExpected("Admin", driver.findElement(userRole));
        driver.findElement(userRole).click();
        driver.findElement(userRoleESS).click();
        helper.comparisonActualAndExpected("ESS", driver.findElement(userRole));

        driver.findElement(userStatus).click();
        driver.findElement(userStatusDisabled).click();
        helper.comparisonActualAndExpected("Disabled", driver.findElement(userStatusDisabled));
        driver.findElement(userStatus).click();
        driver.findElement(userStatusEnabled).click();
        helper.comparisonActualAndExpected("Enabled", driver.findElement(userStatusEnabled));

        driver.findElement(userSave).click();
        helper.comparisonActualAndExpected("Employee does not exist", driver.findElement(txtHelpUnderEmployeeName));
        helper.comparisonActualAndExpected("Required", driver.findElement(txtHelpUnderUserName));
//employee name
        driver.findElement(employeeNamer).sendKeys("Jasmine Morgan", Keys.ENTER);
        helper.comparisonActualAndExpected("Jasmine Morgan", driver.findElement(employeeNamer));
        driver.findElement(employeeNamer).clear();

        driver.findElement(employeeNamer).sendKeys("bdki", Keys.ENTER);
        helper.comparisonActualAndExpected("Employee does not exist", driver.findElement(txtHelpUnderEmployeeName));
        driver.findElement(employeeNamer).clear();

        driver.findElement(employeeNamer).sendKeys("J", Keys.ENTER);
        helper.comparisonActualAndExpected("Jasmine Morgan", driver.findElement(employeeNamer));
//user name
        driver.findElement(userName).sendKeys("f");
        helper.comparisonActualAndExpected("Should have at least 5 characters", driver.findElement(txtHelpUnderUserName));
        driver.findElement(txtHelpUnderUserName).clear();

        driver.findElement(userName).sendKeys("fsgtef");
//        helper.comparisonActualAndExpected("Should have at least 5 characters", driver.findElement(txtHelpUnderUserName));
//        driver.findElement(txtHelpUnderUserName).clear();

        driver.findElement(userSave).click();
    }
}
