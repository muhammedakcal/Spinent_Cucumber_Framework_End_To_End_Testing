package pages;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.AppConstants;
import utils.Credentials;
import utils.ElementUtil;


public class LoginPage extends BasePage{
    WebDriver driver;
    ElementUtil elementUtil;
    By redlLoginBtn=By.xpath("//a[@class='active']");
    By greenLoginBtn=By.xpath("//button[contains(@type,'submit')]");
    By email=By.xpath("//*[@id=\"email\"]");
    By password=By.xpath("//*[@id=\"password\"]");
    By errorMessage = By.xpath("//*[@id=\"swal2-content\"]");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        elementUtil = new ElementUtil(driver);}


    /**
     * 1.METHOD --> TITLE
     * @return
     */

    public String getPageTitle() {
        elementUtil.waitForTitlePresent(AppConstants.LOGIN_PAGE_TITLE);
        return elementUtil.doGetPageTitle();
/**
 * 2.METHOD --> URL
 * @return
 */
    }public String getPageUrl() {
        elementUtil.waitForTitlePresent(AppConstants.LOGIN_PAGE_TITLE);
        return driver.getCurrentUrl();
/**
 * 3.METHOD --> RED COLOR LOGIN BUTTON FUNCTIONALITY
 * @return
 */
    }public boolean checkRedLoginPageButton() {
        elementUtil.waitForElementPresent(redlLoginBtn);
        return elementUtil.doIsDisplayed(redlLoginBtn);
/**
 * 4.METHOD --> GREEN COLOR LOGIN BUTTON FUNCTIONALITY
 * @return
 */
    }public boolean checkGreenLoginPageButton() {
        elementUtil.waitForElementPresent(greenLoginBtn);
        return elementUtil.doIsDisplayed(greenLoginBtn);

/**
 *
 * 5.METHOD -->LOGIN METHOD*/


    }public HomePage doLogin(Credentials userCred) {

        elementUtil.doSendKeys(email, userCred.getAppUsername());
        elementUtil.doSendKeys(password, userCred.getAppPassword());

        elementUtil.doClick(greenLoginBtn);

        return new HomePage(driver);

    }
    public void createNewContact(String firstUserMail, String firstUserPassword,
                                 String secondUserMail, String secondUserPassword,
                                 String thirdUserMail, String thirdUserPassword,
                                 String fourthUserMail, String fourthPassword
                                 ) throws InterruptedException {
/**
 * First User
        elementUtil.waitForElementPresent(email);

        elementUtil.doSendKeys(email, firstUserMail);

        elementUtil.doSendKeys(password, firstUserPassword);

        elementUtil.doClick(greenLoginBtn);

        System.out.println(elementUtil.doGetText(email));

        /**
         * Second User
         */
       Thread.sleep(4000);
        elementUtil.doSendKeys(email, secondUserMail);

        elementUtil.doSendKeys(password, secondUserPassword);

        elementUtil.doClick(greenLoginBtn);

        System.out.println(elementUtil.doGetText(email));



        /**
         * ThirdUser
         */

        Thread.sleep(4000);

        elementUtil.doSendKeys(email, thirdUserMail);

        elementUtil.doSendKeys(password, thirdUserPassword);

        elementUtil.doClick(greenLoginBtn);

        System.out.println(elementUtil.doGetText(email));

        /**
         * Fourth User
         */
        Thread.sleep(4000);


        elementUtil.doSendKeys(email, fourthUserMail);

        elementUtil.doSendKeys(password, fourthPassword);

        elementUtil.doClick(greenLoginBtn);

        System.out.println(elementUtil.doGetText(email));

    }public boolean gettingErrorMessage() {

        return elementUtil.doIsDisplayed(errorMessage);

    }public String errorText() {
        return elementUtil.doGetText(errorMessage);
    }
/**
 *
 * 6.METHOD -->LOGIN ClICK METHOD
 */
public  void doClick(){
    elementUtil.doClick(greenLoginBtn);

    System.out.println(elementUtil.doGetText(email));
}

}
