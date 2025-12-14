package actionclass;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.base_class;

public class keyboardclass extends base_class {

	public static void main(String[] args) throws InterruptedException {

		launch_browser("chrome");
		hiturl("https://www.jeevansathi.com/");

		// keyboard action - keydown - page down
		// create object of actions class , pass parameter

		Actions act = new Actions(driver);

		act.keyDown(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.UP).build().perform();

		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		WebElement email = driver.findElement(By.cssSelector("input#email"));

		email.click();
		email.sendKeys("gayatri@123");

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		act.keyDown(Keys.TAB).build().perform();
		act.keyDown(Keys.TAB).build().perform();
		act.keyDown(Keys.TAB).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

	}

}
