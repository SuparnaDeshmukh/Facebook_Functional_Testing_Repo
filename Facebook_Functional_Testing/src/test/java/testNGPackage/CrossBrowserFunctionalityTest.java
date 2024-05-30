package testNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import PomClass.ForgotPasswordPage;
import PomClass.LogInOrSignUpPage;
import browsersetting.Browsers;

public class CrossBrowserFunctionalityTest  extends Browsers{
     private WebDriver driver;
     private LogInOrSignUpPage loginSignUpPage;
     private ForgotPasswordPage forgotpassword;
     
     
     @Parameters("browser")
    
	@BeforeTest
	public void launchBrowser(String browserName) {
	  System.out.println("Before  Test");
	  System.out.println(browserName);
	  if(browserName.equals("Chrome"))
	  {
		driver=openChromeBrowser();
	  }	
		if(browserName.equals("Firefox"))
		{
		   driver=openFirefoxBrowser();
		}
		if(browserName.equals("Edge"))
		{
			driver=openEdgeBrowser();
		}
		driver.manage().window().maximize();
	}
	
	
		
	
	@BeforeClass
	public void LauchtheBrowser()
	{
		System.out.println("Before class");	
		loginSignUpPage =new  LogInOrSignUpPage (driver);
		forgotpassword = new ForgotPasswordPage(driver);
		
		
	}
	@BeforeMethod
	public void Signup()
	{
		System.out.println("beforemethod");
		driver.get("https://www.facebook.com/");
		// LogInOrSignUpPage loginSignUpPage =new  LogInOrSignUpPage (driver);
		loginSignUpPage.sendUserName("suparna.patil6@com");
		loginSignUpPage.sendPassword("suparna");
	        loginSignUpPage.clickOnforgotpasswordlink();
	}
	@Test
	public void verifyErrorMessageWhenPasswordFunctionltyIsused()
	{
		System.out.println("test");
		//ForgotPasswordPage forgotpassword = new ForgotPasswordPage(driver);
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
    	 loginSignUpPage=null;
    	 forgotpassword=null;
    }
    @AfterTest
    public void closeBrowser()
    {
    	System.out.println("After test");
    	driver.close();
    	driver=null;
    	System.gc();
    	}

}



