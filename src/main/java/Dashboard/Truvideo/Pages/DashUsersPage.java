package Dashboard.Truvideo.Pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import flutter.Truvideo.Pages.CreateNewUserPage;

public class DashUsersPage {

	public WebDriver webdriver;

	public DashUsersPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}


	@FindBy(xpath = "//input[@name='keyword']")
	private WebElement nameTitleRole_TextBox;

	@FindBy(xpath = "//button[text()='Search']")
	private WebElement searchButton;

	@FindBy(xpath = "//tr[1]/td[3]/p")
	private WebElement firstUser;

	@FindBy(xpath = "//button[text()='Approve']")
	private WebElement approveButton;

	@FindBy(id = "deactivate-user-button")
	private WebElement deactivateButton;

	public boolean ApproveUserFromDashboard() {
		WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofSeconds(10));
		webdriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(nameTitleRole_TextBox));
		nameTitleRole_TextBox.sendKeys(CreateNewUserPage.newUser);
		searchButton.click();
		wait.until(ExpectedConditions.visibilityOf(firstUser));
		firstUser.click();
		wait.until(ExpectedConditions.visibilityOf(approveButton));
		approveButton.click();
		wait.until(ExpectedConditions.visibilityOf(deactivateButton));
		if (deactivateButton.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
}
