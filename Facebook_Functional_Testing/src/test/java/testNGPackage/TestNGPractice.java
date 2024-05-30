package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPractice {

	public class TestNG1st {
		@BeforeClass
		public void beforeclass() {
			System.out.println("beforeclass");
		}

		@BeforeMethod
		public void beforemethod() {
			System.out.println("beforemethod");
		}

		@Test (priority=-1,dependsOnMethods={"test1"})
		public void test2()

		{
			System.out.println("test 2");
		}

		@Test (priority=4)
		public void test1() {
			System.out.println("test 1");
			//Assert.fail();
			
		}

		@Test (priority=-2,invocationCount=2,enabled=true)
		public void test3() {
			System.out.println("test 3");
		}

		@Test (priority=0,invocationCount=2,timeOut=3000)
		public void test4() throws InterruptedException   {
			System.out.println("test 4");
			Thread.sleep(4-000);
			System.out.println("timeout experiment");
		}

		@AfterMethod
		public void aftermethod() {
			System.out.println("aftermethod");
		}

		@AfterClass
		public void afterclass() {
			System.out.println("afterclass");
		}

	}

}
