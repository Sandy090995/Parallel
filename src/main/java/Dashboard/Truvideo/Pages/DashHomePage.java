package Dashboard.Truvideo.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashHomePage {
	public WebDriver webdriver;
	
	public DashHomePage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//img[@class='buffer-line_logo']")
	private WebElement truVideo_Logo;
	
	public WebElement getTruVideoLogo() {
		return  truVideo_Logo;
	}

	@FindBy(xpath = "//li[@class='nav-other hide dropdown active']")
	private WebElement others_Dropdown;

	@FindBy(xpath = "//a[@href='/organization/tce-users/']")
	private WebElement users_Button;
	
	@FindBy(xpath = "//a[@href='/crud/repair-order']")
	private WebElement repairOrder_Button;
	
	@FindBy(xpath = "//a[@href='/crud/sales']")
	private WebElement prospects_Button;
	

	public void navigateToUserSetting() {
		WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(others_Dropdown));
		others_Dropdown.click();
		users_Button.click();
	}
	
	public void navigateToRepairOrderList() {
		WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofSeconds(30));
		repairOrder_Button.click();
		DashRepairOrderPage orderList=new DashRepairOrderPage(webdriver);
		wait.until(ExpectedConditions.visibilityOf(orderList.getRepairOrderPageTitle()));
	}
	
	public void navigateToProspectsList() {
		WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofSeconds(30));
		prospects_Button.click();
		DashProspectsPage prospectsPage=new DashProspectsPage(webdriver);
		wait.until(ExpectedConditions.visibilityOf(prospectsPage.getprospectTitle()));
	}
}
