package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import testautomation.ui.report.Reporting;
import testautomation.ui.stepdefinition.HooksClass;
import testautomation.ui.uibase.UI_Base;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\svaithyanathan\\IdeaProjects\\DemoFrameProject\\src\\test\\resources\\UI_Features", dryRun = true, tags = (""), glue = "testautomation\\ui\\stepdefinition", plugin = {
        "pretty", "json:target\\uiOutput.json", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true)
public class UI_Runner extends UI_Base {
    @AfterClass
    public static void afterClass() {

        Reporting.generateJvmReport(getPropertyFileValue(HooksClass.properties, "jsonPath"));


    }
}
