package org.stepdefinition;

import java.io.IOException;
import java.util.Collection;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {



	@Before
	public void tc3() { 
		System.out.println("Started1");
		loadBrowser();
		maximizeWindow();
		implicitWait(10);
	}

	@After
	public void tc5(Scenario sc) {
	
		if(sc.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshotAs, "image/png");	
		}
		
	}
	


}

