package testautomation.mobile.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import testautomation.mobile.mobilebase.MobileBase;

import java.io.IOException;
import java.util.Properties;


public class HooksClass extends MobileBase {


    static Scenario sc;
    public static Properties properties;

    @Before
    public void beforeScenario(Scenario scenario) {
        properties = getPropertyFile();
        Logger logger = Logger.getLogger("MobileAutomation");
        PropertyConfigurator.configure("DemoFrameProject\\src\\main\\resources\\Log4j.properties");
        logger.setLevel(Level.DEBUG);
        sc = scenario;
    }

    @After
    public void afterScenario(Scenario s) throws IOException {

        s.attach(takesScreenshot(), "images/png", s.getName() + getTimeStamp());


    }


}
