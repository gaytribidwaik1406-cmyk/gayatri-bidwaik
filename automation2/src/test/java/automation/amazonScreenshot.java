package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import dynamic_code.base_class;

public class amazonScreenshot extends base_class {

	public static void main(String[] args) throws IOException {

	launch_browser("chrome");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./screenshot/chromeSS1.png");
	
	 FileHandler.copy(source, target);
	 
	 
	 hiturl("https://www.amazon.in/");
	 TakesScreenshot ts1= (TakesScreenshot) driver;
		File source1= ts1.getScreenshotAs(OutputType.FILE);
		
		File target1 = new File("./screenshot/hitURLSS2.png");
	
	 FileHandler.copy(source1, target1);
	 
//      Search_bar("manage");
//      TakesScreenshot ts2=(TakesScreenshot) driver;
//      File source2 =ts2.getScreenshotAs(OutputType.FILE);
//      File target2 = new File("./screenshot/searchSS3.png");
//      FileHandler.copy(source2, target2);
//	 
//	 
//      
//	  search("hp laptop");
//      TakesScreenshot ts3=(TakesScreenshot) driver;
//      File source3 =ts3.getScreenshotAs(OutputType.FILE);
//      File target3 = new File("./screenshot/searchSS4.png");
//      FileHandler.copy(source3, target3);
//	 
	}

}
