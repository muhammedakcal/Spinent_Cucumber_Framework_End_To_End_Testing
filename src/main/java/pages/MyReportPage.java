package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementUtil;

public class MyReportPage extends BasePage {
    WebDriver driver;
    ElementUtil elementUtil;
    /**
     *
     *
     * MyReportPage Locators
     *
     */

    By myReportButton =By.xpath("//a[normalize-space()='My Report']");
    By tableButton= By.xpath("//table[contains(@class,'table table-striped table-hover')]");



    By beforePartXpath=By.xpath("/html/body/div[3]/div[3]/div/table/thead/tr/th[");
    By afterPartXpath = By.xpath("]\"");

    public MyReportPage(WebDriver driver) {
        this.driver = driver;
        elementUtil = new ElementUtil(driver);


        //1.METHOD --> Table Visibility
    }public boolean tableVisibilityMethod() {
        return elementUtil.doIsDisplayed(tableButton);

    }public String myreportPageUrl() {


        return driver.getCurrentUrl();
    }









}
