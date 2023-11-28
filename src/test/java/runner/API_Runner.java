package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import testautomation.api.apibase.API_Base;
import testautomation.api.report.Report;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\svaithyanathan\\IdeaProjects\\DemoFrameProject\\src\\test\\resources\\API_Features", dryRun = false, tags = (""), glue = "testautomation\\api\\stepdefinition", plugin = {
        "pretty", "json:target\\apiOutput.json","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, monochrome = true, publish = true)
public class API_Runner extends API_Base {
    @AfterClass
    public static void afterClass(){

        Report.generateJvmReport(getPropertyFileValue("jsonPath"));

    }

}
