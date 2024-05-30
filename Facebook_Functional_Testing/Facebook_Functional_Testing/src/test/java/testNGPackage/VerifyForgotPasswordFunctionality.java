package testNGPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClass.ForgotPasswordPage;
import PomClass.LogInOrSignUpPage;
import util.Utility;

public class VerifyForgotPasswordFunctionality {

	WebDriver driver;
	@BeforeClass
	public void LauchtheBrowser()
	{
		System.out.println("beforeclass");
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
	}
	@BeforeMethod
	public void Signup() throws IOException
	{
		System.out.println("beforemethod");
		driver.get("https://www.facebook.com/");
		 LogInOrSignUpPage loginSignUpPage =new  LogInOrSignUpPage (driver);
		loginSignUpPage.sendUserName(Utility.getDataFromExcelSheet("suparna",2,2));
		loginSignUpPage.sendPassword("124354");
	        loginSignUpPage.clickOnforgotpasswordlink();
	}
	@Test
	public void verifyErrorMessageWhenPasswordFunctionltyIsused()
	{
		System.out.println("test");
		ForgotPasswordPage forgotpassword = new ForgotPasswordPage(driver);
		 forgotpassword.sendmailornumber("asdfgh");
		 forgotpassword.Cancelbutton();
		 
	}
    @AfterMethod
    public void CaptureScreenshotofFailedTest()
    {
    	System.out.println("aftermethod");
    }
    @AfterClass
    public void afterclass()
    {
    	System.out.println("afterclass");
    }

}

