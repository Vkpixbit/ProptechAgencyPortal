package com.pixbit.agencyportal.globalfiles;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportNG {

	static ExtentReports extent;

	public static ExtentReports reportConfig() {
		String reportsFolderPath = System.getProperty("user.dir") + File.separator + "reports";
		new File(reportsFolderPath).mkdirs();

		String path = reportsFolderPath + File.separator + "index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Prosper Agency Portal");
		report.config().setDocumentTitle("Test Case Report");

		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("QA ENGINEER", "Vishnudas K");
		return extent;
	}
}
