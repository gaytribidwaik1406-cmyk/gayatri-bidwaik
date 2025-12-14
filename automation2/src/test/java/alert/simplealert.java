package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.base_class;

public class simplealert extends base_class {

	public static void main(String[] args) throws InterruptedException {
		
		launch_browser("chrome");
		hiturl("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
	Alert S = driver.switchTo().alert();
	Thread.sleep(800);
	S.accept();
	
	//System.out.println(S.getText());
	//NoAlertPresentException
	
	System.out.println("---------------confirmation alert--------------");
	driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]")).click();
	
	driver.findElement(By.xpath("//button[text()=\"click the button to display a confirm box \"]")).click();
	 Alert CA = driver.switchTo().alert();
	 Thread.sleep(3000);
	//CA.accept();
	 CA.dismiss();
	

	WebElement text = driver.findElement(By.cssSelector("p#demo"));
	 System.out.println("the text present is as"+text.getText());
	 
	 WebElement txt = driver.findElement(By.cssSelector("p#demo"));
	 System.out.println("the text present is as: "+txt.getText());
	 
	 driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[3]")).click();
	 driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
	 
	 Alert pa=driver.switchTo().alert();
	 Thread.sleep(3000);
	pa.accept();
	 
	
	 
	 
	 
	 
	}

}
