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

	public class TestNGAnnotations2 {

		@BeforeSuite
		public void beforeSuite()
		{
			System.out.println("Before suite-TestClass_2");
		}
		@BeforeTest
		public void beforeTest()
		{
			System.out.println("Before Test-TestClass_2");
		}
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("Before Class-TestClass_2");
		}
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("Before method-TestClass_2");
		}
		@Test
		public void test1()
		{
			System.out.println("Test1-TestClass_2");
		}
		@Test
		public void test3()
		{
			System.out.println("Test3-TestClass_2");
		}
		@Test
		public void test4()
		{
			System.out.println("Test4-TestClass_2");
		}
		@Test
		public void test2()
		{
			System.out.println("Test2-TestClass_2");
		}
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("After method-TestClass_2");
		}
		@AfterClass
		public void afterClass()
		{
			System.out.println("After Class-TestClass_2");
		}
		@AfterTest
		public void afterTest()
		{
			System.out.println("After Test-TestClass_2");
		}
		@AfterSuite
		public void afterSuite()
		{
			System.out.println("After suite-TestClass_2");
		}
		@DataProvider
		public void dataProvider()
		{
			System.out.println("data provider");
		}
		
	}

		
		



