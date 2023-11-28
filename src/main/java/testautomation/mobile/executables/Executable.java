package testautomation.mobile.executables;

import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testautomation.mobile.mobilebase.MobileBase;
import testautomation.mobile.pageobjectmanager.PageObjectManager;

import java.util.Properties;

public class Executable extends MobileBase {
    static Scenario sc;
    public static Properties properties;
    PageObjectManager pom = new PageObjectManager();

    @BeforeMethod
    public void beforeMethod(Scenario scenario) {
        sc = scenario;
        properties = getPropertyFile();

    }

    @Test
    public void tc1(){

        service = initializeServer(getPropertyFileValue(properties,"host"), getPropertyFileValue(properties,"port"));
        pom.launchingMobileApp(getPropertyFileValue(properties,"deviceType"), getPropertyFileValue(properties,"deviceName"),
                getPropertyFileValue(properties,"platformName"), getPropertyFileValue(properties,"platformVersion"),
                getPropertyFileValue(properties,"automationName"), getPropertyFileValue(properties,"udid"),
                getPropertyFileValue(properties,"appPackage"), getPropertyFileValue(properties,"appActivity2"));

        WebElement txtSearchTab = pom.getHomePage().getTxtSearchTab();
        click(txtSearchTab);
        WebElement txtSearchField = pom.getHomePage().getTxtSearchField();
        sendKeys(txtSearchField, getPropertyFileValue(properties,"product"));

        pom.getHomePage().search("android");
        String actMessage1 = getText(pom.getProductList().getBtnFilter());
        Assert.assertEquals("Verify after selecting the product", getPropertyFileValue(properties,"expMessage1"), actMessage1);
        sc.log("Verify after selecting the product" + ", " + "Expected Message: " + getPropertyFileValue(properties,"expMessage1") + ", "
                + "Actual Message: " + actMessage1);


        localScreenshot(sc.getName());
        sc.attach(takesScreenshot(), "images/png", sc.getName() + getTimeStamp());

        pom.getProductList().scroll();

        pom.getProductList().selectProduct();

        String actMessage2 = getText(pom.getProductPage().getTxtProductPage());
        Assert.assertEquals("Verify Product Page Success Message", getPropertyFileValue(properties,"expMessage2"), actMessage2);
        sc.log("Verify Product Page Success Message" + ", " + "Expected Message: " + getPropertyFileValue(properties,"expMessage2") + ", " + "Actual Message: " + actMessage2);

        localScreenshot(sc.getName());
        sc.attach(takesScreenshot(), "images/png", sc.getName() + getTimeStamp());

        pom.getProductPage().scrollDownUntilElementFound();

        click(pom.getProductPage().getBtnAddToCart());
        click(pom.getProductPage().getBtnDone());

        click(pom.getCartPage().getBtnCart());
        String actMessage3 = getText(pom.getCartPage().getTxtCustomessage());
        System.out.println(actMessage3);
        Assert.assertEquals("Verify after adding product to the cart", getPropertyFileValue(properties,"expMessage3"), actMessage3);
        sc.log("Verify after adding product to the cart" + ", " + "Expected Message: " + getPropertyFileValue(properties,"expMessage3") + ", "
                + "Actual Message: " + actMessage3);

        localScreenshot(sc.getName());
        sc.attach(takesScreenshot(), "images/png", sc.getName() + getTimeStamp());

        String text = getText(pom.getCartPage().getTxtCartProductName());
        System.out.println(text);

        click(pom.getCartPage().getBtnDelete());

        String actMessage4 = getText(pom.getCartPage().getTxtRemoved());
        Assert.assertEquals("Verify after removed the product", getPropertyFileValue(properties,"expMessage4"), actMessage4);
        sc.log("Verify after removed the product" + ", " + "Expected Message: " + getPropertyFileValue(properties,"expMessage4") + ", "
                + "Actual Message: " + actMessage4);



    }

    @AfterMethod
    public void afterMethod() {
        adbCommandToCloseApp(getPropertyFileValue(properties,"adbCommand"), getPropertyFileValue(properties,"appPackage"));
        // Assert.assertTrue(false);
        service.stop();

    }


}
