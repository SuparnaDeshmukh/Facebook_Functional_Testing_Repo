package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClass.LogInOrSignUpPage;

public class VerifyingForgotpasswordLink {
   public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.Facebook.com");
	 LogInOrSignUpPage lsp=new  LogInOrSignUpPage(driver);
	 lsp.clickOnforgotpasswordlink();
}
}
