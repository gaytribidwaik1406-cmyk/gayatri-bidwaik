package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// id
		// 1 of 1
		driver.findElement(By.id("nav-top"));

		// name
		driver.findElement(By.name("vjs-styles-dimensions"));

		// classname
		driver.findElement(By.className("vjs-styles-defaults"));

		// tagname
		driver.findElements(By.tagName("script"));

		// css selector cascading style sheet

		// 1)//if we have tagname and id value
		// tagname#idvalue
		driver.findElement(By.cssSelector("div#a-page"));

		// 2)//if we have tagname and classname
		// tagname.valueofclass
		// if spaces then removed by .
		driver.findElement(By.cssSelector("div.a-carousel-col.a-carousel-right.celwidget"));

		// 3)//tagname and attribute
        //tagname[attribute="value"]
		driver.findElement(By.cssSelector("meta[name=\"flow-closure-id\"]"));

		// 4)//tagname and multiple attribute
		// tagname[attribute1="value1"][attribute2="value2"]

		// 5)//contains
		// tagname[attribute*="value"]
		driver.findElement(By.cssSelector("class=\"vjs-styles-defaults\""));

		// 6) startwith ^=cap
		// tagname[attribute^="value"]
		driver.findElement(By.cssSelector("style[class^=\"vjs-styles-dimensions\"]"));

		// 7)//endswith$ //$doller
		driver.findElement(By.cssSelector("style[class$=\"vjs-styles-dimensions\"]"));

		// 8)//xpath
		// tagname and attribute
		driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-none\"])[15]"));

		// if multiple attribute
		// tagname[attribute1="value1"][attribute2="value2"]
		driver.findElement(By.xpath("//div[@id=\"nav-flyout-icp\"][@aria-modal=\"false\"]"));

		// if multiple attribute with AND
		driver.findElement(By.xpath("//div[@id=\"nav-flyout-icp\" and @aria-modal=\"false\"]"));

		// if multiple attribute with OR
		driver.findElement(By.xpath("(//div[@id=\"nav-flyout-icp\" or @aria-modal=\"false\"])[34]"));

		// contains
		// tagname[contains(@attribute,"value")]
		// (//div[contains(@aria-modal,"false")])[34]

		// startswith
		// (//div[startswith(@aria-modal,"false")])[34]

		// text
		// a[text()="customer service"]

		// xpath : parent and child relationship

		// syntax://parenttagname[@parentattribute="value"]//child[@childattribute="value]

	}

}
