package Dashboard.Truvideo.Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashLoginPage {
	WebDriver webdriver;
	
	public DashLoginPage(WebDriver webdriver){
		this.webdriver=webdriver;
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Email/Username']")
	private static WebElement email_textBox;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private static WebElement password_textBox;
	
	@FindBy(xpath="//input[@value='Log In']")
	private static WebElement logIn_Button;
	
	public void loginToWebApplication() {
		WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.visibilityOf(email_textBox));
		email_textBox.sendKeys("disha.gupta@5exceptions.com");
		password_textBox.sendKeys("disha@123");
		logIn_Button.click();
		DashHomePage dashHomePage=new DashHomePage(webdriver);
		wait.until(ExpectedConditions.visibilityOf(dashHomePage.getTruVideoLogo()));
		}
	}
	

