package org.stepdefinition;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReportGeneration {
	public static void generateJVMReport(String a) {
File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReport");
Configuration config = new Configuration(f, "Adactin Hotel Reservation App");
	config.addClassifications("Platform", "Windows");
	config.addClassifications("Platform ver.", "10");
	config.addClassifications("Browser", "Chrome");
	config.addClassifications("Browser ver.", "89.0.4389.90");
	config.addClassifications("Total pages", "5");
List<String> li =new LinkedList<String>();
li.add(a);
ReportBuilder r = new ReportBuilder(li, config);
r.generateReports();
	
	}

}
