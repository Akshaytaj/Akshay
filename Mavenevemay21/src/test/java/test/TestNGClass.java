package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClass {
	
	//@BeforeClass 
	@Test (priority=1)
	public void beforeClass() {
		System.out.println("Before Class");
	}
	//@BeforeMethod
	@Test (priority=2)
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	//@Test
	@Test (priority=3)
	public void test()
	{
		System.out.println("test");
	}
	//@AfterMethod
	@Test (priority=4)
	public void afterMethod() {
		System.out.println("After Method");
	}
	//@AfterClass
	@Test (priority=5,invocationCount=4)
	public void afterClass() {
		System.out.println("After Class");
	}


}
