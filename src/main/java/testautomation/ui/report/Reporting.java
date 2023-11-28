package testautomation.ui.report;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import testautomation.ui.stepdefinition.HooksClass;
import testautomation.ui.uibase.UI_Base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Reporting extends UI_Base {
    public static void generateJvmReport(String jsonFile) {

        File f = new File(getPropertyFileValue(HooksClass.properties,"jvmPath"));
        Configuration confi = new Configuration(f, "DemoFrameProject");
        confi.addClassifications("platForm", "Windows");
        confi.addClassifications("appName", "Cyclos");
        confi.addClassifications("Browser", "Edge");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(jsonFile);
        ReportBuilder builder = new ReportBuilder(jsonFiles,confi);
        builder.generateReports();

    }
}
