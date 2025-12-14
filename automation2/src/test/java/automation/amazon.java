package automation;

import java.io.IOException;

import org.openqa.selenium.devtools.idealized.Javascript;

import dynamic_code.base_class;

public class amazon extends base_class{

	public static void main(String[] args) throws IOException {
		
		launch_browser("chrome");
		
		hiturl("https://www.amazon.in/");
		
		
		
	javascriptexecutor("window.scrollBy(0,200)");
		screenshot("screenshot", "amazonscroll");	

	}

	
	

}
