package testautomation.mobile.stepdefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import testautomation.mobile.mobilebase.MobileBase;
import testautomation.mobile.pageobjectmanager.PageObjectManager;

public class TC1_HomePageStep extends MobileBase {

    PageObjectManager pom = new PageObjectManager();

    @Given("User Should be on HomPage")
    public void userShouldBeOnHomPage() {
        service = initializeServer(getPropertyFileValue(HooksClass.properties, "host"), getPropertyFileValue(HooksClass.properties, "port"));
        pom.launchingMobileApp(getPropertyFileValue(HooksClass.properties, "deviceType"), getPropertyFileValue(HooksClass.properties, "deviceName"),
                getPropertyFileValue(HooksClass.properties, "platformName"), getPropertyFileValue(HooksClass.properties, "platformVersion"),
                getPropertyFileValue(HooksClass.properties, "automationName"), getPropertyFileValue(HooksClass.properties, "udid"),
                getPropertyFileValue(HooksClass.properties, "appPackage"), getPropertyFileValue(HooksClass.properties, "appActivity2"));
//        capabilities(getPropertyFileValue(HooksClass.properties, "deviceType"), getPropertyFileValue(HooksClass.properties, "deviceName"),
//                getPropertyFileValue(HooksClass.properties, "platformName"), getPropertyFileValue(HooksClass.properties, "platformVersion"),
//                getPropertyFileValue(HooksClass.properties, "automationName"), getPropertyFileValue(HooksClass.properties, "udid"),
//                getPropertyFileValue(HooksClass.properties, "appPackage"), getPropertyFileValue(HooksClass.properties, "appActivity2"));
//        getDriver("android");
    }

    @When("User should Search for Product {string}")
    public void userShouldSearchForProduct(String product) {
        WebElement txtSearchTab = pom.getHomePage().getTxtSearchTab();
        click(txtSearchTab);
        WebElement txtSearchField = pom.getHomePage().getTxtSearchField();
        sendKeys(txtSearchField, product);

    }

    @When("user should click on enter")
    public void userShouldClickOnEnter() {
        pom.getHomePage().search("android");

    }

    @Then("User should verify after product search success message {string}")
    public void userShouldVerifyAfterProductSearchSuccessMessage(String expMessage) {
        String actMessage = getText(pom.getProductList().getBtnFilter());
        Assert.assertEquals("Verify after selecting the product", expMessage, actMessage);
        HooksClass.sc.log("Verify after selecting the product" + ", " + "Expected Message: " + expMessage + ", "
                + "Actual Message: " + actMessage);

    }


}
