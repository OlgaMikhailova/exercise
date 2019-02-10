package util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Helper;

import java.util.List;

public class Dashboard {
    WebDriver driver;
    Helper helper;
    private By panelForm = By.id("panel_resizable_0_0");
    private By listPanelForm = By.cssSelector("div.quickLaunge");
    private By listPanelFormLegend = By.cssSelector("div.quickLaunge span");// Assign Leave  Leave List  Timesheets
    private By panelFormLegend = By.cssSelector("fieldset[id='panel_resizable_0_0'] legend");//Quick Launch

    private By firstForm = By.id("panel_resizable_1_0");
    private By secondForm = By.id("panel_draggable_1_1");
    private By thirdForm = By.id("task-list-group-panel-menu_holder");
    private By firstFormLegend = By.cssSelector("fieldset[id='panel_resizable_1_0'] legend");// Employee Distribution by Subunit
    private By secondFormLegend = By.cssSelector("fieldset[id='panel_resizable_1_1'] legend");// Legend
    private By thirdFormLegend = By.cssSelector("fieldset[id='panel_resizable_1_2'] legend");// Pending Leave Requests

    public Dashboard(WebDriver driver) {
        this.driver = driver;
        helper=new Helper(driver);
    }

    public void verificationFormOnAPage() {
        System.out.println("Start form");
        helper.comparisonElementOnApage(firstForm);
        helper.comparisonElementOnApage(secondForm);
        helper.comparisonElementOnApage(thirdForm);
        helper.comparisonElementOnApage(listPanelForm);
        helper.comparisonElementOnApage(panelForm);
        System.out.println("End form");
    }

    public void verificationLegendOnAPage() {
        System.out.println("Start legend");
        helper.comparisonActualAndExpected("Assign Leave", driver.findElements(listPanelFormLegend).get(0));
        helper.comparisonActualAndExpected("Leave List", driver.findElements(listPanelFormLegend).get(1));
        helper.comparisonActualAndExpected("Timesheets", driver.findElements(listPanelFormLegend).get(2));
        helper.comparisonActualAndExpected("Employee Distribution by Subunit", driver.findElement(firstFormLegend));
        helper.comparisonActualAndExpected("Legend", driver.findElement(secondFormLegend));
        helper.comparisonActualAndExpected("Pending Leave Requests", driver.findElement(thirdFormLegend));
        helper.comparisonActualAndExpected("Quick Launch", driver.findElement(panelFormLegend));
        System.out.println("End legend");
    }


}
