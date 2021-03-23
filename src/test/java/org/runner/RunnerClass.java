package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReportGeneration;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources",
glue ="org.stepdefinition",monochrome=true,dryRun=false,strict=false,
plugin= {"pretty","html:src\\test\\resources\\Reports",
		"json:src\\test\\resources\\Reports\\Adactin.json",
		"junit:src\\test\\resources\\Reports\\output.xml",
		"rerun:src\\test\\resources\\failedscenarios.txt"},
tags="@EndtoendTesting")
public class RunnerClass {
@AfterClass
public static void jvmReportGen() {
	JVMReportGeneration.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\Adactin.json");
}

}
