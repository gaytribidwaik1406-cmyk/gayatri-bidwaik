package synchronisation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronosation {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		//web driver methods:
		
//		driver.get("https://www.amazon.in/");
//		driver.getTitle() //to capture title
//		driver.getCurrentUrl();  //to capture current url
//		driver.getPageSource();  //html code
//		driver.findElement("locators");  //single element
//		driver.findElements("");  //multiple element
//		driver.close(); //closed respective tab
//		driver.quit(); //closed all tabs
//		driver.getWindowHandle();  //we will get window ID
//		driver.getWindowHandles();  //we will get multiple window ID
//		driver.switchTo(); //used to switch from one tab to another tab and *switch into frame 
//		driver.navigate(); //to navigate , back,refresh,forward
//		driver.manage(); //to manage window like to maximize , implicit wait
		
		
		
		// to maximize
		driver.manage().window().maximize();

		
		// implicit (it take time for all) globally declared
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//if web page is not load according to the time which we given in the implicit ie 5sec then we used web driver wait
		
       //webdriver wait :syntax

	//	WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.elementToBeClickable("locators"));
		
       //fluent wait
        //FluentWait<WebDriver> Wait = new FluentWait<WebDriver> (driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchFieldException.class);

		//Thread.sleep(null);
	}

}
