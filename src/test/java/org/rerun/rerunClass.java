package org.rerun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Rerunfile\\\\failedReport.txt", glue = "org.stepdefinition",
				monochrome = true,
				dryRun = false,tags="@Regression or @smoke",
				plugin= {"html:E:\\eclipse_workspace\\CucumberPractice\\target",
						"json:E:\\eclipse_workspace\\CucumberPractice\\target\\jsonReport.json",
						"junit:E:\\eclipse_workspace\\CucumberPractice\\target\\JunitREport.xml",
						"rerun:Rerunfile\\failedReport.txt"})
public class rerunClass {

}
