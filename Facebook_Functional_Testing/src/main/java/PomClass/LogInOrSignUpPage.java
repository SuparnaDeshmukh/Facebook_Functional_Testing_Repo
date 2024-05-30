package PomClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInOrSignUpPage {

	@FindBy(xpath = ("//input[@name='email']"))
	private WebElement username;

	@FindBy(xpath = ("//input[@type='password']"))
	private WebElement password;

	@FindBy(xpath = ("//button[@name='login']"))
	private WebElement logInButton;

	@FindBy(xpath = ("//a[text()='Create new account']"))
	private WebElement createNewAccButton;

	
    private	WebDriverWait wait;
    private WebDriver driver;


	@FindBy(xpath = ("//a[text()='Forgotten password?']"))
	private WebElement forgotpasswardlink;

	
	// creating constructor which is always public
	public LogInOrSignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		 wait = new WebDriverWait(driver, Duration.ofMillis(50000));
	}
	// creating public methods

	public void sendUserName(String userid)
	{
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys(userid);
	}

	public void sendPassword(String userpassword) 
	{
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys(userpassword);
	}
	
	public void clickOnLogInButton() 
	{
		wait.until(ExpectedConditions.visibilityOf(logInButton));
		logInButton.click();
	}
	public void clickOnCreateNewAccButton() 
	{
		wait.until(ExpectedConditions.visibilityOf(createNewAccButton));
		createNewAccButton.click();
	}

	public void clickOnforgotpasswordlink() 
	{
		//wait.until(ExpectedConditions.visibilityOf(createNewAccButton));
		forgotpasswardlink.click();
	}

}
