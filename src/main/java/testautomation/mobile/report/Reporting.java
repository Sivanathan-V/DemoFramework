package testautomation.mobile.report;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import testautomation.mobile.mobilebase.MobileBase;
import testautomation.mobile.stepdefinition.HooksClass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Reporting extends MobileBase {



    public static void generateJvmReport(String jsonFile) {
        File f = new File(getPropertyFileValue(HooksClass.properties,"jvmPath"));
        Configuration confi = new Configuration(f, "DemoProject");
        confi.addClassifications("platForm", "Android");
        confi.addClassifications("appName", "Amazon");
        confi.addClassifications("MobileName", "Emulator");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(jsonFile);
        ReportBuilder builder = new ReportBuilder(jsonFiles,confi);
        builder.generateReports();

    }


}
