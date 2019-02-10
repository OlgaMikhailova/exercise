import util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void googleTest() {
        driver.get(baseUrl);
        Login login = new Login(driver);
        login.enter();
        Menu menu = new Menu(driver);

        menu.viewSystemUsers();
        Users users=new Users(driver);
        users.addUser();

        menu.viewJobTitle();
        JobTitles jobTitles = new JobTitles(driver);
        jobTitles.deleteJob();

        menu.viewCandidates();
        Candidates candidates = new Candidates(driver);
        candidates.add();

        menu.viewDashboard();
        Dashboard dashboard = new Dashboard(driver);
        dashboard.verificationFormOnAPage();
        dashboard.verificationLegendOnAPage();

        menu.viewEmployeeList();
        EmployeeList employeeList = new EmployeeList(driver);
        employeeList.findSubUnitElement("Sales");

        Logout logout = new Logout(driver);
        logout.logout();

    }

    @After
    public void shutDown() {
        driver.quit();
    }
}
