package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.AppConstants;
import utils.ElementUtil;

public class HomePage extends BasePage {

    WebDriver driver;
    ElementUtil elementUtil;
    /**
     * HOMEPAGE LOCATORS
     *
     *
     */

    By introToSportsTechButton=By.xpath("//a[normalize-space()='Intro to SportsTech']");
    By knowYourselfButton = By.xpath("//a[normalize-space()='Know Yourself']");
    By determineProblemsButton=By.xpath("//img[contains(@ng-src,'https://api.guide.spinent.eu/uploads/124/3.png')]");  // <-----
    By askToCustomerButton=By.xpath("//a[normalize-space()='Ask to Customer']");
    By generateIdeasButton=By.xpath("//a[normalize-space()='Generate Ideas']");
    By preapareMVPButton=By.xpath("//a[normalize-space()='Prepare MVP']");
    By givePresentationButton= By.xpath("//a[normalize-space()='Prepare MVP']");
    By belowButtonAblems = By.xpath("//img[@alt='EU Supported Project']");     //
    By languageButton=By.xpath("//a[normalize-space()='Logout from Muhammed Zahid Akcal']");   //
    By userAccountNamesButton=By.xpath("//a[normalize-space()='Logout from Muhammed Zahid Akcal']");  // <-----
    By printCertificateButton=By.xpath("//a[normalize-space()='Print Certificate']");
    By myReportButton =By.xpath("//a[normalize-space()='My Report']");
    By tableButton= By.xpath("//table[contains(@class,'table table-striped table-hover')]");   //
    By beforePartXpath=By.xpath("/html/body/div[3]/div[3]/div/table/thead/tr/th[");
    By afterPartXpath = By.xpath("]\"");


    public HomePage(WebDriver driver) {
        this.driver = driver;
        elementUtil = new ElementUtil(driver);

        //1.TEST -GETTING TITLE
    }public String getHomePageTitle() {
        elementUtil.waitForTitlePresent(AppConstants.HOME_PAGE_TITLE);
        return elementUtil.doGetPageTitle();

        //2.TEST --> introToSportsTechButton
    }public boolean enableCheckIntroToSportsTechButton() {
        elementUtil.waitForElementToBeClickable(introToSportsTechButton);
        return elementUtil.doIsEnabled(introToSportsTechButton);

        //3.TEST -->knowYourselfButton
    }public boolean enableCheckknowYourselfButton() {
        elementUtil.waitForElementToBeClickable(knowYourselfButton);
        return elementUtil.doIsEnabled(knowYourselfButton);

        //4.TEST -->determineProblemsButton
    }public boolean enableCheckdetermineProblemsButton() {
        elementUtil.waitForElementToBeClickable(determineProblemsButton);
        return elementUtil.doIsEnabled(determineProblemsButton);

        //5.TEST -->askToCustomerButton
    }public boolean enableCheckaskToCustomerButton() {
        elementUtil.waitForElementToBeClickable(askToCustomerButton);
        return elementUtil.doIsEnabled(askToCustomerButton);

        //6.TEST -->generateIdeasButton
    }public boolean enableCheckgenerateIdeasButton() {
        elementUtil.waitForElementToBeClickable(generateIdeasButton);
        return elementUtil.doIsEnabled(generateIdeasButton);

        //7.TEST -->preapareMVPButton
    }public boolean enableCheckpreapareMVPButton() {
        elementUtil.waitForElementToBeClickable(preapareMVPButton);
        return elementUtil.doIsEnabled(preapareMVPButton);

        //8.TEST --> givePresentationButton
    }public boolean enableCheckgivePresentationButton() {
        elementUtil.waitForElementToBeClickable(givePresentationButton);
        return elementUtil.doIsEnabled(givePresentationButton);
    }
    //9.TEST --> belowButtonAblems
    public boolean enableCheckbelowButtonAblems() {
        elementUtil.waitForElementToBeClickable(belowButtonAblems);
        return elementUtil.doIsEnabled(belowButtonAblems);

        //10.TEST -->languageButton
    }public boolean enableChecklanguageButton() {
        elementUtil.waitForElementToBeClickable(languageButton);
        return elementUtil.doIsEnabled(languageButton);

        //11.TEST -->userAccountNamesButton
    }public boolean enableCheckuserAccountNamesButton() {
        elementUtil.waitForElementToBeClickable(userAccountNamesButton);
        return elementUtil.doIsEnabled(userAccountNamesButton);

    }//12.TEST -->printCertificateButton
    public boolean enableCheckprintCertificateButton() {
        elementUtil.waitForElementToBeClickable(printCertificateButton);
        return elementUtil.doIsEnabled(printCertificateButton);

    }//Helper method to go My ReportPage

    public void clickon() {
        elementUtil.waitForElementToBeClickable(myReportButton);
        elementUtil.doClick(myReportButton);


}public MyReportPage goToMyReportPage() {
        clickon();

        return new MyReportPage(driver);
    }}
