package testNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGAnnotations1 {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite-TestClass_1");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test-TestClass_1");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class-TestClass_1");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method-TestClass_1");
	}
	@Test
	public void test1()
	{
		System.out.println("Test1-TestClass_1");
	}
	@Test
	public void test3()
	{
		System.out.println("Test3-TestClass_1");
	}
	@Test
	public void test4()
	{
		System.out.println("Test4-TestClass_1");
	}
	@Test
	public void test2()
	{
		System.out.println("Test2-TestClass_1");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method-TestClass_1");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class-TestClass_1");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test-TestClass_1");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite-TestClass_1");
	}
	@DataProvider
	public void dataProvider()
	{
		System.out.println("data provider");
	}
	
}

	
	

