package testautomation.ui.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Level;
import org.apache.log4j.PropertyConfigurator;
import testautomation.ui.uibase.UI_Base;

import java.util.Properties;

public class HooksClass extends UI_Base {
    static Scenario sc;
    public static Properties properties;

    @Before
    public void beforeScenario(Scenario scenario) {
        properties = getPropertyFile();
        launchBrowser(getPropertyFileValue(properties,"chrome"));
        navigateToUrl(getPropertyFileValue(properties,"url"));
        setImplicitWait(10);
        PropertyConfigurator.configure("DemoFrameProject\\src\\main\\resources\\Log4j.properties");
        logger.setLevel(Level.DEBUG);
        sc = scenario;
    }

    @After
    public void afterScenario(Scenario s) {
        s.attach(screenshotForCucumber(), "images/png", s.getName() + getTimeStamp());


    }

}
