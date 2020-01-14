package JVM;

import java.io.File;
import java.util.*;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvm(String s) {

		File f = new File("D:\\Eclipse Oxygen WorkSpace\\Data\\Report");
		Configuration c = new Configuration(f, "GummyBear");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("os", "Windows 10");
		List<String> js = new ArrayList<String>();
		js.add(s);
		ReportBuilder r = new ReportBuilder(js, c);
		r.generateReports();
	}
}
