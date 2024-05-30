package testpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PomClass.LogInOrSignUpPage;

public class LogInOrSignUpPageTestClass {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com");
		LogInOrSignUpPage logInOrSignUpPage = new LogInOrSignUpPage(driver);
		
		logInOrSignUpPage.sendUserName("suparna.patil6@gmail.com");
		logInOrSignUpPage.sendPassword("padmavati6");

		logInOrSignUpPage.clickOnLogInButton();
	}
}
