package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementUtil;

public class AccountLogoutPage  extends BasePage {
    WebDriver driver;
    ElementUtil elementUtil;

    /**
     *
     *
     * AccountLogoutPage Locators
     *
     */
    By logOutButton=By.xpath("/html/body/div/div[2]/ul/li[4]/a");
    // Constructor
    public AccountLogoutPage(WebDriver driver) {
        this.driver = driver;
        elementUtil = new ElementUtil(driver);


        //1. METHOD --> LogoutFunction
    }public boolean logOutFunctionMethod() {
        elementUtil.waitForElementToBeClickable(logOutButton);
        return elementUtil.doIsEnabled(logOutButton);

        //2.METHOD LOGOUT TEST METHOD WITH URL
    }public String logOutVerificationWithUrl() {

        return driver.getCurrentUrl();
    }
}