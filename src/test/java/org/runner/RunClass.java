package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.juv.report.JvmRe;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFile\\test.feature", glue = "org.stepdefinition",
				monochrome = false,
				dryRun = false
//				tags="@Regression or @smoke",
//				plugin= {"html:E:\\eclipse_workspace\\CucumberPractice\\target",
//						"json:E:\\eclipse_workspace\\CucumberPractice\\target\\jsonReport.json",
//						"junit:E:\\eclipse_workspace\\CucumberPractice\\target\\JunitREport.xml",
//						"rerun:Rerunfile\\failedReport.txt"}
				)
public class RunClass {

	@AfterClass
	public static void JvmreportGeneratio() {
		JvmRe.generateReport(System.getProperty("user.dir")+"\\target\\jsonReport.json");
		
		
	}
}
