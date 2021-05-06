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
import utils.AppConstants;
import utils.Credentials;

public class HomePageSD {
    WebDriver driver;
    BasePage basePage;
    Properties prop;
    LoginPage loginPage;
    HomePage homePage;
    Credentials userCred;
    @Given("Necessary items for going to Home Page")
    public void necessaryItemsForGoingToHomePage() throws InterruptedException {
        basePage = new BasePage();
        prop = basePage.init_properties();
        String browserName = prop.getProperty("browser");
        driver = basePage.init_driver(browserName);
        driver.get(prop.getProperty("url"));
        loginPage=new LoginPage(driver);
        userCred = new Credentials(prop.getProperty("username"), prop.getProperty("password"));
        homePage = loginPage.doLogin(userCred);
        Thread.sleep(5000);
    }

    @When("The title of Home Page is been tested")
    public void theTitleOfHomePageIsBeenTested() {
        String title = homePage.getHomePageTitle();
        System.out.println("home page title is: "+ title);
        Assert.assertEquals(title, AppConstants.HOME_PAGE_TITLE);
    }

    @And("knowYourselfButton will be tested to see if it is clickable or not!")
    public void knowyourselfbuttonWillBeTestedToSeeIfItIsClickableOrNot() {
        Assert.assertTrue(homePage.enableCheckknowYourselfButton());
    }

    @And("determineProblemsButton will be tested to see if it is clickable or not!")
    public void determineproblemsbuttonWillBeTestedToSeeIfItIsClickableOrNot() {

        Assert.assertTrue(homePage.enableCheckdetermineProblemsButton());
    }

    @And("askToCustomerButton will be tested to see if it is clickable or not!")
    public void asktocustomerbuttonWillBeTestedToSeeIfItIsClickableOrNot() {
        Assert.assertTrue(homePage.enableCheckaskToCustomerButton());
    }

    @And("generateIdeasButton will be tested to see if it is clickable or not!")
    public void generateideasbuttonWillBeTestedToSeeIfItIsClickableOrNot() {

        Assert.assertTrue(homePage.enableCheckaskToCustomerButton());
    }

    @And("preapareMVPButton will be tested to see if it is clickable or not!")
    public void preaparemvpbuttonWillBeTestedToSeeIfItIsClickableOrNot() {
        Assert.assertTrue(homePage.enableCheckgenerateIdeasButton());
    }

    @And("givePresentationButton will be tested to see if it is clickable or not!")
    public void givepresentationbuttonWillBeTestedToSeeIfItIsClickableOrNot() {

        Assert.assertTrue(homePage.enableCheckgivePresentationButton());
    }

    @And("belowButtonAblems will be tested to see if it is visible or not!")
    public void belowbuttonablemsWillBeTestedToSeeIfItIsVisibleOrNot() {

        Assert.assertTrue(homePage.enableCheckbelowButtonAblems());
    }

    @And("languageButton will be tested to see if it is clickable or not!")
    public void languagebuttonWillBeTestedToSeeIfItIsClickableOrNot() {
        Assert.assertTrue(homePage.enableChecklanguageButton());
    }

    @And("userAccountNamesButton will be tested to see if it is clickable or not!")
    public void useraccountnamesbuttonWillBeTestedToSeeIfItIsClickableOrNot() {
        Assert.assertTrue(homePage.enableCheckuserAccountNamesButton());
    }

    @And("printCertificateButton will be tested to see if it is clickable or not!")
    public void printcertificatebuttonWillBeTestedToSeeIfItIsClickableOrNot() {
        Assert.assertTrue(homePage.enableCheckprintCertificateButton());
    }

    @Then("Verify that Home Page and close the browser")
    public void verifyThatHomePageAndCloseTheBrowser() {
        driver.quit();
    }


}
