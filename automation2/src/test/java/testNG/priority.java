package testNG;


import org.testng.annotations.Test;

public class priority {
  @Test(invocationCount = 3 , description = "above test case will be execute 3 times ")
  public void z() {
	  System.out.println("high");
  }
  @Test(priority = 1 , enabled = false)
  public void b() {
	  System.out.println("low");
  }
  @Test(priority = 2)
  public void a() {
	  System.out.println("medium");
  }
  
  
 }
