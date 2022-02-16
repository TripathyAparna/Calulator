package StepDefinitions;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.utils.Reader;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/resources/Features/calculate.feature",glue= {"StepDefinitions"},
	plugin = {"com.cucumber.listener.Reporter:target/cucumber-reports/report.html"},
	monochrome = true
	)
	 

	public class TestRunner {

//		public static String getReportConfigPath(){
//			String Projpath = System.getProperty("user.dir");
//			String reportConfigPath=Projpath+"/extent-config.xml";
//			if(reportConfigPath!= null) return reportConfigPath;
//			else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
//		}
		@AfterClass
		public static void writeExtentReport() {
			String Projpath = System.getProperty("user.dir");
			String reportConfigPath=Projpath+"/extent-config.xml";
			Reader.readAllText(new File(reportConfigPath));
			//loadXMLConfig(new File(reportConfigPath));
		}
	}











