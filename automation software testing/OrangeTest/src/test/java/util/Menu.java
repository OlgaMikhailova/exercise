package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu {
    WebDriver driver;
    Helper helper;
    public By menuAdmin = By.id("menu_admin_viewAdminModule");
    public By adminUserManagement = By.id("menu_admin_UserManagement");
    public By adminViewSystemUsers = By.id("menu_admin_viewSystemUsers");
    public By adminJob = By.id("menu_admin_Job");
    private By adminViewJobTitleList = By.id("menu_admin_viewJobTitleList");
    private By menuRecruitment = By.id("menu_recruitment_viewRecruitmentModule");
    private By recruitmentCandidates = By.id("menu_recruitment_viewCandidates");
    private By menuDashboard = By.id("menu_dashboard_index");
    private By menuPim = By.id("menu_pim_viewPimModule");
    private By pimEmployeeList = By.id("menu_pim_viewEmployeeList");

    public Menu(WebDriver driver) {
        this.driver = driver;
        helper = new Helper(driver);
    }

    public void viewSystemUsers() {
        helper.moveToElement(menuAdmin);
        helper.moveToElement(adminUserManagement);
        helper.moveToElement(adminViewSystemUsers);
        driver.findElement(adminViewSystemUsers).click();
    }

    public void viewJobTitle() {
        helper.moveToElement(menuAdmin);
        helper.moveToElement(adminJob);
        helper.moveToElement(adminViewJobTitleList);
        driver.findElement(adminViewJobTitleList).click();
    }

    public void viewCandidates() {
        helper.moveToElement(menuRecruitment);
        helper.moveToElement(recruitmentCandidates);
        driver.findElement(recruitmentCandidates).click();
    }

    public void viewDashboard() {
        driver.findElement(menuDashboard).click();
    }

    public void viewEmployeeList() {
        helper.moveToElement(menuPim);
        helper.moveToElement(pimEmployeeList);
        driver.findElement(pimEmployeeList).click();
    }
}
