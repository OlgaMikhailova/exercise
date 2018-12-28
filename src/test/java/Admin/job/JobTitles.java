package Admin.job;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobTitles {
    WebDriver driver;
    private By btnAddJob= By.id("btnAdd");
    private By jobTitle= By.id("jobTitle_jobTitle");
    private By btnSaveJob= By.id("btnSave");
    private By tableJob= By.cssSelector("input[id^=ohrmList_chkSelectRecord]");//all job list
    //    private By tableJob= By.cssSelector("input[name='chkSelectRow[]']");//all job list
    private By btnDelete= By.id("btnDelete");
    private By dialogDeleteBtn= By.id("dialogDeleteBtn");
    private By tableList= By.cssSelector("tr td");
    public JobTitles(WebDriver driver) {
        this.driver = driver;
    }
void addJob(){
        driver.findElement(btnAddJob).click();
        driver.findElement(jobTitle).sendKeys("qwwe");
        driver.findElement(btnSaveJob).click();
    System.out.println("Add job ");
}
public void deleteJob() {
    for (int i = 0; i < 3; i++) {
        WebElement emptyTable = driver.findElements(tableList).get(0);
        if (emptyTable.getText().contains("No Records Found")) {
            addJob();
        }
        driver.findElements(tableJob).get(0).click();
        driver.findElement(btnDelete).click();
        driver.findElement(dialogDeleteBtn).click();
        System.out.println("Delete job");
    }
}

}
