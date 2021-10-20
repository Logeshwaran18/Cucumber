package org.juv.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmRe {
	
	public static void generateReport(String json) {
		
		File f =new File(System.getProperty("user.dir")+"\\target\\jvmReport");
		
		Configuration c = new Configuration(f, "faceBook");
		c.addClassifications("Platfrom+", "window");
		c.addClassifications("version", "10");
		c.addClassifications("Browser", "chrome");
		c.addClassifications("version", "4.8");
		
		List<String> li = new ArrayList<String>();
		li.add(json);
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();	

	}

}
