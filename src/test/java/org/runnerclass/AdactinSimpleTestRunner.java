package org.runnerclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFiles", glue = "org.adactinsimplestepdef", dryRun = false, monochrome = true, strict = true, tags = {
		"@Login" }, 
plugin = { "pretty","html:src\\test\\resources\\Reports",
					"json:src\\test\\resources\\Reports\\report.json",
					"junit:src\\test\\resources\\Reports\\report.xml",
					"rerun:src\\test\\resources\\Failed\\failedscenarios.txt"})
public class AdactinSimpleTestRunner {
	
	@AfterClass
	public static void jvmReportGeneration() {
		
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\report.json");

	}

}
