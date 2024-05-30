package testNGPackage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertPractice {

	private WebDriver driver;
	//private SoftAssert soft;

	@BeforeClass
	public void launchBrowsser() {
		System.out.println("Before class");
	}

	@BeforeMethod
	public void launchForgetPasswordPage() {
		System.out.println("Before method");
		//soft = new SoftAssert();
	}

	@Test(priority = -1)
	public void verifyHomePage() {
		System.out.println("verifying home page");
		String actualurl = "www.facebook.com/hom";
		String expectedurl = "www.facebook.com/home";

		String actualtittle = "Facebook1-HomePage";
		String expectedtittle = "Facebook1-HomePag";

		Assert.assertEquals(actualurl, expectedurl);

		Assert.assertEquals(actualtittle, expectedtittle);
		//soft.assertAll();

	}

	@Test(priority = 1)
	public void verifySettingPage() {
		System.out.println("verify setting page");

		String actualurl = "www.facebook.com/setting";
		String expectedurl = "www.facebook.com/settin";

		String actualtittle = "Facebook1-SettingPag";
		String expectedtittle = "Facebook1-SettingPage";

		Assert.assertEquals(actualurl, expectedurl);

		Assert.assertEquals(actualtittle, expectedtittle);
		//Assert.assertAll();

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("this after method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}

}
