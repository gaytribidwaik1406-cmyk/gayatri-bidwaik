package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.base_class;

public class mouseaction extends base_class {

	public static void main(String[] args) {
		
		launch_browser("chrome");
		hiturl("https://www.railyatri.in/");
		
		
		Actions act = new Actions(driver);
		WebElement TS = driver.findElement(By.cssSelector("input#pnrField"));
	
		
		act.moveToElement(TS).click().build().perform();
		act.moveToElement(TS).contextClick().build().perform();
	}

}
