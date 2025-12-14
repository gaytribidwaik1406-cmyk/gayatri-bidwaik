package automation;

import java.io.IOException;

import dynamic_code.base_class;

public class facebookscreenshot extends base_class {

	public static void main(String[] args) throws IOException {
		

		launch_browser("chrome");
		hiturl("https://www.facebook.com/");
	//	screenshot("screenshot", "fb"); 
		takesscreenshot("screenshot","fb2");
		
	}

}
