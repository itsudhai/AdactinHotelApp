package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvmReport(String jsonpath) {

		// 1. mention target folder location

		File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\JvmReport");

		// 2. Add configuration to report

		Configuration con = new Configuration(f, "Adactin Hotel Web App");
		con.addClassifications("Platfrom Name", "Windows 10");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser version", "8.9");
		con.addClassifications("Sprint Number", "23");

		// 3. String to List<String>

		List<String> list = new ArrayList<String>();
		list.add(jsonpath);

		// 4. Create object for ReportBuilder class - using which will generateReports
		// methods
		ReportBuilder r = new ReportBuilder(list, con);
		r.generateReports();

	}

}
