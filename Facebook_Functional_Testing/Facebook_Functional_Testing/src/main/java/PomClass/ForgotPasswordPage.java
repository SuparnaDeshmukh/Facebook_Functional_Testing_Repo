package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPasswordPage {


	@FindBy(xpath = ("//td//div[@class='_9nq2 marginBottom16px']"))
	private WebElement text;

	@FindBy(xpath = ("//input [@id='identify_email']"))
	private WebElement mailOrNumber;

	@FindBy(xpath = ("//a[text()='Cancel']"))
	private WebElement cancel;

	@FindBy(xpath = ("//input [//button [@id='did_submit']"))
	private WebElement findOut;

	
    private	WebDriverWait wait;
    private WebDriver driver;


	
	
	// creating constructor which is always public
	public ForgotPasswordPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public String gettext() {
		return text.getText();
	}
	public void sendmailornumber(String userId) {
		mailOrNumber.sendKeys(userId);
	}
	public void Cancelbutton() {
		cancel.click();
	}
	public void findoutbuttonclick() {
		findOut.click();
	}
	
	
}
