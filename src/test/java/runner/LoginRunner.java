package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.ReportingUtilityClass;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", 
glue = "stepDefinitions", 
tags = "@SmokeTest", 
dryRun = false, 
monochrome = true, 
strict = true, 
plugin = {
		"pretty", "html:output/site/cucumber-pretty", 
		"json:output/cucumber.json" }, 
publish = true

)
public class LoginRunner {
	
	@AfterClass
	public static void generatReports() {
		ReportingUtilityClass.reportConfig();
	}
}
