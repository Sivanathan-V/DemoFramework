package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import testautomation.mobile.mobilebase.MobileBase;
import testautomation.mobile.report.Reporting;
import testautomation.mobile.stepdefinition.HooksClass;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\svaithyanathan\\IdeaProjects\\DemoFrameProject\\src\\test\\resources\\Mobile_Features", dryRun = false, tags = (""), glue = "testautomation\\mobile\\stepdefinition", plugin = {
        "pretty", "json:target\\mobileOutput.json", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true)
public class Mobile_Runner extends MobileBase {
    @AfterClass
    public static void afterClass() {
        Reporting.generateJvmReport(getPropertyFileValue(HooksClass.properties, "jsonPath"));
        mobileTearDown();

    }
}
