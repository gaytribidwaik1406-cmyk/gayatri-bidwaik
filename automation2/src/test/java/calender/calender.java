package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.base_class;

public class calender extends base_class {

	public static void main(String[] args) {

		launch_browser("chrome");
		hiturl("https://www.irctc.co.in/nget/train-search");

		// alert
		driver.findElement(By.xpath("//button[text()=\"OK\"]")).click();

		WebElement calender = driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[3]"));
		calender.click();
		System.out.println("current date is as:" + calender.getAttribute("value"));

		javascriptexecutor("window.scrollBy(0,300)");
        //select specific date
		driver.findElement(By.xpath("//a[text()=\"25\"]")); 
		
		
		
		
	}

}
