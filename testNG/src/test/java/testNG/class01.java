package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class01 {
  @Test
  
 
  public void f() {
	  System.out.println("test");
  }
  @BeforeClass
  public void f6() {
	  System.out.println("before class");
  }
  @BeforeMethod
  public void f7() {
	  System.out.println("before method");
  }
  @BeforeSuite
  public void f3() {
	  System.out.println("before suite");
  }
  @BeforeTest
  public void f8() {
	  System.out.println("before test");
  }
  @AfterClass
  public void f5() {
	  System.out.println("after class");
  }
  @Test
  public void f12() {
	  System.out.println("testing");
  }
  @AfterMethod
  public void f1() {
	  System.out.println("after method");
  }
  @AfterSuite
  public void f2() {
	  System.out.println("after suite");
  }
  @AfterTest
  public void f4() {
	  System.out.println("after test");
	  
  } 
  @Test
  public void f11() {
	  System.out.println("testing");
  }
}
