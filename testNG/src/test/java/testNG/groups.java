package testNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class groups {
  @Test(groups = {"high"} , priority = 2 )
  public void launchbrowser(){
	  System.out.println("launch");
	  
  }
  @Test(groups = {"high"})
  public void hiturl() {
	  System.out.println("hit");
	  
  }
  @Test(groups = {"high"} , invocationCount = 5 )
  public void click() {
	  System.out.println("click on button");
  }
  @Test(groups = {"low"} , priority = 1 )
  public void search() {
	  System.out.println("search button");
  }
  @Test(groups = {"medium"} , enabled = false)
  public void overlap() {
	  System.out.println("overlapping is there");
	  
  }
}
