package testautomation.api.report;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import testautomation.api.apibase.API_Base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Report extends API_Base {


    public static void generateJvmReport(String jsonFile){
        try {
            File f = new File(getPropertyFileValue("jvmPath"));
            Configuration confi = new Configuration(f, "DemoProject");
            confi.addClassifications("OS", "Windows");
            List<String> jsonFiles = new ArrayList<>();
            jsonFiles.add(jsonFile);
            ReportBuilder builder = new ReportBuilder(jsonFiles,confi);
            builder.generateReports();
        }catch (Exception e){

        }


    }
}
