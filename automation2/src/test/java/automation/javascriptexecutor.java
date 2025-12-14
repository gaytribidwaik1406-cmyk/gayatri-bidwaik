package automation;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;

import dynamic_code.base_class;

public class javascriptexecutor extends base_class{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		launch_browser("chrome");
		screenshot("takescreenshot", "browser");
		
		hiturl("https://www.ixigo.com/");
		screenshot("takescreenshot", "hiturl");
		
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,400)");
	screenshot("takescreenshot", "scrolldown");
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	screenshot("takescreenshot", "toptobottom");
	Thread.sleep(4000);
	js.executeScript("window.scrollTo(0,0)");
	screenshot("takescreenshot", "bottomtotop");
	Thread.sleep(4000);
	js.executeScript("window.history.go(0)");//for refresh
	screenshot("takescreenshot", "refresh");
	Thread.sleep(4000);
	js.executeScript("window.history.back()");//for back
	screenshot("takescreenshot", "back");
	Thread.sleep(4000);
	js.executeScript("window.history.forward()");
	screenshot("takescreenshot", "forward");
	
	driver.close();
	}

}
