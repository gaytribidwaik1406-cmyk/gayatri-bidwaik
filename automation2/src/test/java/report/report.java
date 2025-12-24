package report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamic_code.base_class;

public class report extends base_class {

	public static void main(String[] args) {
		
		
		String projectpath = System.getProperty("user.dir");
		ExtentSparkReporter ESR = new ExtentSparkReporter(projectpath+"\\report\\reportGenerated\\");

		ESR.config().setDocumentTitle("Automation report");
		ESR.config().setReportName("ecommerce report");
		ESR.config().setTheme(Theme.STANDARD);
		
		
		
		ExtentReports ER = new ExtentReports();
		ER.attachReporter(ESR);
		
		//system configuration
		ER.setSystemInfo("OS", "window");
		ER.setSystemInfo("browser", "chrome");
		ER.setSystemInfo("domain", "ecommerce");
		ER.setSystemInfo("application", "flipkart");
		ER.setSystemInfo("QA", "Gayatri");
		
	 ExtentTest et = ER.createTest("Launch_browser");
	 et.log(Status.INFO, "Launchbrower");
	 
	 ExtentTest et1 = ER.createTest("hiturl");
     et.log(Status.PASS, "hiturl");
	
     ExtentTest et2 = ER.createTest(" clicked on search functionality");
     et.log(Status.FAIL, " clicked on search functionality");
     
	 ExtentTest et3 = ER.createTest("send data");
	 et.log(Status.SKIP, "send data");
	 
	 launch_browser("chrome");
		hiturl("https://www.bing.com/");
		ER.flush();
     
	}

}

