package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.base_class;

public class slider extends base_class{

	public static void main(String[] args) {
		launch_browser("chrome");
		hiturl("https://jqueryui.com/slider/");
		
		WebElement IF = driver.findElement(By.cssSelector("iframe.demo-frame"));
		
		driver.switchTo().frame(IF);
		
		Actions act  = new Actions(driver);
		WebElement slider = driver.findElement(By.xpath("//span[@tabindex=\"0\"]"));
		
		act.moveToElement(slider).clickAndHold().moveByOffset(100, 0).release().build().perform();	
		
		//switch drive outside to frame
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()=\"Selectable\"]")).click();
		

	}

}
