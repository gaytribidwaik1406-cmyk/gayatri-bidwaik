package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jiohotstar {
	
	WebDriver driver;
  @Test
  public void launch() {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	  
  }
  
  @Test
  public void url() {
	  driver.get("https://www.hotstar.com/in/mypage");
  }
  
  @Test(priority = 1)
  public void login() {
	  WebElement login = driver.findElement(By.xpath("(//button[@type=\"button\"])[10]"));
	  login.click();
	  
  }
  
  @Test(priority = 2)
  public void mobile_no() throws InterruptedException {
	 WebElement mobile_no = driver.findElement(By.xpath("//input[@inputmode=\"text\"]"));
	 mobile_no.click();
	// Thread.sleep(2000);
	// mobile_no.sendKeys("9607142402");
	 
  }
}
