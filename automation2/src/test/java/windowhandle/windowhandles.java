package windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import dynamic_code.base_class;

public class windowhandles extends base_class {

	public static void main(String[] args) throws InterruptedException {

		launch_browser("chrome");
		hiturl("https://www.naukri.com/");

		javascriptexecutor("window.scrollBy(0,document.body.scrollHeight)\r\n");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"About us\"]")).click();

		Set<String> window_id = driver.getWindowHandles(); //getWindowHandles we are getting window id by using this method
		//window_id.iterator();
		Iterator<String> id = window_id.iterator();
		
		 String parent_id = id.next();
		//id.next(); // get the parent id
        //String parent_id = id.next();
        System.out.println("parent id is as:"+parent_id);
        
       // id.next();
        String child_id = id.next();
        System.out.println("child id is as:"+child_id);
        //switch driver
        driver.switchTo().window(child_id);
        driver.findElement(By.xpath("//a[text()=\"BUSINESSES\"]")).click();
        
        //need to switch driver from child id to parent id
        driver.switchTo().window(parent_id);
        driver.findElement(By.xpath("//a[text()=\"Careers\"]"));
        
	}

}
