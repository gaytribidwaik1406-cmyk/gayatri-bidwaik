package dynamic_code;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class base_class {

	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");

	public static void launch_browser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		}

		System.out.println("The browser launched is as:" + browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public static void hiturl(String url) {

		driver.get(url);
		System.out.println("The title of web page is : " + driver.getTitle());

	}

	// way 1 of taking screenshot
	public static void screenshot(String foldername, String Screenshotname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		File target = new File("./" + foldername + "/" + Screenshotname + ".png");

		FileHandler.copy(source, target);

	}

	// way 2 of taking screenshot
	public static void takesscreenshot(String foldername1, String Screenshotname1) throws IOException {
		String projectpath = System.getProperty("user.dir");
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source = ts1.getScreenshotAs(OutputType.FILE);

		File target = new File(projectpath + "\\" + foldername1 + "\\" + Screenshotname1 + ".png");

		FileHandler.copy(source, target);

	}

	public static void javascriptexecutor(String scroll) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(scroll);
	}

}
