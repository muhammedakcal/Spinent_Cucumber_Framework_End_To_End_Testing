import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pages.LoginPage;
import utils.AppConstants;
import utils.Credentials;

import java.util.Properties;


public class LoginPageSD {
    WebDriver driver;
    BasePage basePage;
    Properties prop;
    LoginPage loginPage;
    Credentials userCred;
    @Given("Necessary items for going to Login Page")
    public void necessaryItemsForGoingToLoginPage() {
        basePage = new BasePage();
        prop = basePage.init_properties();
        String browserName = prop.getProperty("browser");
        driver = basePage.init_driver(browserName);
        driver.get(prop.getProperty("url"));
        loginPage = new LoginPage(driver);
        userCred = new Credentials(prop.getProperty("username"), prop.getProperty("password"));
    }

    @When("The title of Login Page is been tested")
    public void theTitleOfLoginPageIsBeenTested() {
        String title = loginPage.getPageTitle();
        System.out.println("login page title is: "+ title);
        Assert.assertEquals(title, AppConstants.LOGIN_PAGE_TITLE);
    }

    @And("The url of Login Page is tested")
    public void theUrlOfLoginPageIsTested() {
        String url = loginPage.getPageUrl();
        System.out.println("login page url is: "+ url);
        Assert.assertEquals(url, AppConstants.LOGIN_PAGE_URL);
    }

    @And("The RedColorLoginButton is tested")
    public void theRedColorLoginButtonIsTested() {
        Assert.assertTrue(loginPage.checkRedLoginPageButton());
    }



    @And("The GreenColorLoginButton is tested")
    public void theGreenColorLoginButtonIsTested() {
        Assert.assertTrue(loginPage.checkGreenLoginPageButton());

    }

    @Then("Verify that Login Pages is not from the Test")
    public void verifyThatLoginPagesIsNotFromTheTest() {

        driver.quit();
    }
}
