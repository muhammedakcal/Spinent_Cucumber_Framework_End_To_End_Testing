import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.MyReportPage;
import utils.AppConstants;
import utils.Credentials;

public class MyReportPageSD {
    BasePage basePage;
    Properties prop;
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    MyReportPage myReportPage;
    Credentials userCred;
    @Given("Necessary items for going to MyReport Page")
    public void necessaryItemsForGoingToMyReportPage() {
        basePage = new BasePage();
        prop = basePage.init_properties();
        String browserName = prop.getProperty("browser");
        driver = basePage.init_driver(browserName);
        driver.get(prop.getProperty("url"));
        loginPage = new LoginPage(driver);
        userCred = new Credentials(prop.getProperty("username"), prop.getProperty("password"));
        homePage = loginPage.doLogin(userCred);
        myReportPage=homePage.goToMyReportPage();

    }

    @When("I check the visibility of  table")
    public void iCheckTheVisibilityOfTable() {

        Assert.assertTrue(myReportPage.tableVisibilityMethod());
    }

    @Then("Verify the table and close the browser")
    public void verifyTheTableAndCloseTheBrowser() {
        String url= myReportPage.myreportPageUrl();
        System.out.println("The page url is : " + url);
        driver.quit();
    }
}
