
package util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Helper;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    WebDriver driver;
    Helper helper;
    private By jobTitleList = By.cssSelector("td.left:nth-child(5)");
    private By idList = By.cssSelector("td.left:nth-child(2)");
    private By profilePhotoName = By.cssSelector("#profile-pic");
    private By photo = By.cssSelector("a.tiptip");
    private By profileName = By.cssSelector("#profile-pic h1");
    private By headPersonalInf = By.cssSelector("#pdMainContainer div h1");
    private By textFullName = By.cssSelector("label.hasTopFieldHelp");
    private By tipNameList = By.cssSelector("div.fieldDescription");
    private By txtEmployeeId = By.cssSelector("label[for='personal_txtEmployeeId']");
    private By txtLicenNo = By.cssSelector("label[for='personal_txtLicenNo']");
    private By txtOtherID = By.cssSelector("label[for='personal_txtOtherID']");
    private By calendarList = By.cssSelector("img.ui-datepicker-trigger");
    private By firstName = By.id("personal_txtEmpFirstName");
    private By middleName = By.id("personal_txtEmpMiddleName");
    private By lastName = By.id("personal_txtEmpLastName");
    private By employeeId = By.id("personal_txtEmployeeId");
    private By licenNo = By.id("personal_txtLicenNo");
    private By otherID = By.id("personal_txtOtherID");
    private By licExpDate = By.id("personal_txtLicExpDate");
    private By sidebar = By.id("sidebar");

    public EmployeeList(WebDriver driver) {
        this.driver = driver;
        helper = new Helper(driver);
    }

    public void verificateElements() {
        helper.comparisonElementOnApage(profilePhotoName);
        helper.comparisonElementOnApage(sidebar);
        helper.comparisonElementOnApage(photo);
        helper.comparisonElementOnApage(profileName);
        helper.comparisonElementOnApage(headPersonalInf);
        helper.comparisonElementOnApage(firstName);
        helper.comparisonElementOnApage(middleName);
        helper.comparisonElementOnApage(lastName);
        helper.comparisonElementOnApage(employeeId);
        helper.comparisonElementOnApage(licenNo);
        helper.comparisonElementOnApage(otherID);
        helper.comparisonElementOnApage(calendarList);
        helper.comparisonElementOnApage(licExpDate);
    }

    public void verificateLegends() {
        helper.comparisonActualAndExpected("Personal Details", driver.findElement(headPersonalInf));
        helper.comparisonActualAndExpected("Full Name", driver.findElement(textFullName));
        helper.comparisonActualAndExpected("First Name", driver.findElements(tipNameList).get(0));
        helper.comparisonActualAndExpected("Middle Name", driver.findElements(tipNameList).get(1));
        helper.comparisonActualAndExpected("Last Name", driver.findElements(tipNameList).get(2));
        helper.comparisonActualAndExpected("Employee Id", driver.findElement(txtEmployeeId));
        helper.comparisonActualAndExpected("Driver's License Number", driver.findElement(txtLicenNo));
        helper.comparisonActualAndExpected("Other Id", driver.findElement(txtOtherID));
    }

    public void findSubUnitElement(String text) {
        List<WebElement> list = new ArrayList<WebElement>();
        list.addAll(driver.findElements(jobTitleList));
        Integer i = 0;
        Integer idSales = -1;
        for (WebElement index : list) {
            if (index.getText().contains(text)) {
                idSales = i;
            }
            i++;
        }
        if (idSales == -1) {
            System.out.println("no Sales");
        } else driver.findElements(idList).get(idSales).click();
    }
}

