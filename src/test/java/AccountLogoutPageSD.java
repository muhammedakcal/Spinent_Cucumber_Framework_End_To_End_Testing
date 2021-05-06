import base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AccountLogoutPage;
import pages.HomePage;
import pages.LoginPage;
import utils.AppConstants;
import utils.Credentials;

import java.util.Properties;

public class AccountLogoutPageSD {
    WebDriver driver;
    BasePage basePage;
    Properties prop;
    LoginPage loginPage;
    HomePage homePage;
    AccountLogoutPage accountLogoutPage;
    Credentials userCred;
    @Given("Necessary items for login out from the modules")
    public void necessaryItemsForLoginOutFromTheModules() {
        basePage = new BasePage();
        prop = basePage.init_properties();
        String browserName = prop.getProperty("browser");
        driver = basePage.init_driver(browserName);
        driver.get(prop.getProperty("url"));
        loginPage = new LoginPage(driver);
        userCred = new Credentials(prop.getProperty("username"), prop.getProperty("password"));
        homePage = loginPage.doLogin(userCred);
        accountLogoutPage = new AccountLogoutPage(driver);

    }

    @When("I click on the log-out button")
    public void iClickOnTheLogOutButton() {
        Assert.assertTrue(accountLogoutPage.logOutFunctionMethod());
    }

    @Then("I verify the account and Url Function")
    public void iVerifyTheAccountAndUrlFunction() {
        String expectedUrl= accountLogoutPage.logOutVerificationWithUrl();
        Assert.assertEquals(expectedUrl, AppConstants.ACCOUNT_PAGE_URL);
        driver.quit();
    }
}
