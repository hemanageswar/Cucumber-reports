package testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import JVM.JvmReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="stepdefinition",dryRun=false,plugin= {"html:D:\\Eclipse Oxygen WorkSpace\\Data\\Report\\HtmlReport","json:D:\\Eclipse Oxygen WorkSpace\\Data\\Report\\jsonReport.json","rerun:D:\\Eclipse Oxygen WorkSpace\\Data\\Report\\Failed.txt"})
public class TestRunner1 {
@AfterClass
public static void report() {
JvmReport.generateJvm("D:\\Eclipse Oxygen WorkSpace\\Data\\Report\\jsonReport.json");
}
}
