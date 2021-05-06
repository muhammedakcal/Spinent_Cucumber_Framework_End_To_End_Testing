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

public class LoginPageUserSecurity {
    WebDriver driver;
    BasePage basePage;
    Properties prop;
    LoginPage loginPage;
    Credentials userCred;
    @Given("I should be at the login page")
    public void iShouldBeAtTheLoginPage() {
        basePage = new BasePage();
        prop = basePage.init_properties();
        String browserName = prop.getProperty("browser");
        driver = basePage.init_driver(browserName);
        driver.get(prop.getProperty("url"));
        loginPage = new LoginPage(driver);
        userCred = new Credentials(prop.getProperty("username"), prop.getProperty("password"));
    }@And("Sending invalid user name and passwords to the systemas {string} {string} {string} {string} {string} {string} {string} {string}")
    public void sendingInvalidUserNameAndPasswordsToTheSystemas(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws InterruptedException {
        loginPage.createNewContact("muhammed@hotmail.com","123",
                "mehmet@hotmail.com","spinit123",
                "ahmet@hotmail.com","abc123",
                "ali@gmail.com","Kon123"


        );
        Assert.assertTrue(loginPage.gettingErrorMessage());

    }

    @Then("Because of the incorrect information, I should be at the login page.")
    public void becauseOfTheIncorrectInformationIShouldBeAtTheLoginPage() {
        String url = loginPage.getPageUrl();
        System.out.println("login page url is: "+ url);
        Assert.assertEquals(url, AppConstants.LOGIN_PAGE_URL);

        driver.quit();
    }


    @And("Sending four different types of invalid user name and password information to the systemas {string} {string} {string} {string} {string} {string} {string} {string}")
    public void sendingFourDifferentTypesOfInvalidUserNameAndPasswordInformationToTheSystemas(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7,String arg8) {


    }



    }


