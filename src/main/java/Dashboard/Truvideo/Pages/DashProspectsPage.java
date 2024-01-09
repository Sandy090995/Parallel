package Dashboard.Truvideo.Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import flutter.Truvideo.Pages.AddProspectPage;
import flutter.Truvideo.Pages.UserListPage;

public class DashProspectsPage {
	public WebDriver webdriver;
	
	public DashProspectsPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(id="sales-order-page-title-text")
	private WebElement prospectTitle; 
	
	public WebElement getprospectTitle() {
		return prospectTitle;
	}
	
	@FindBy(id = "LBL_ALL_OPEN")
	private WebElement label_AllOpen;
	
	@FindBy(xpath = "//tbody/tr/td[6][1]")
	List<WebElement> Customer_List;
	
	@FindBy(xpath = "//tbody/tr[1]/td[4]/p")
	WebElement firstSalesAgent;
	
	public WebElement getNewCreatedProspect(String lastName) {
		return webdriver.findElement(By.xpath("//p[contains(text(),'"+lastName+"')]"));
	}
	
	@FindBy(id = "view-agentName")
	private WebElement saleAgent_Name;
	
	public WebElement getSalesAgentName() {
		return saleAgent_Name;
	}
	
	@FindBy(id = "view-customer.email")
	private WebElement emailId;
	
	@FindBy(id = "view-orderStatus.value")
	private WebElement prospects_Status;
	
	@FindBy(id = "order-page-title")
	private WebElement customerName;
	
	@FindBy(id = "title-display-main")
	private WebElement videoTitle;
	
	@FindBy(xpath = "//div[text()='Uploaded new video. ']")
	WebElement activity_Uploaded;
	
	public boolean verifyNewlyCreatedProspect() {
		WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofMinutes(2));
		wait.withTimeout(Duration.ofSeconds(30));
		try {
			wait.withTimeout(Duration.ofSeconds(60));
			label_AllOpen.click();
			}catch(Exception e) {
				e.printStackTrace();
			}
		wait.until(ExpectedConditions.elementToBeClickable(getNewCreatedProspect(AddProspectPage.lastName)));
		getNewCreatedProspect(AddProspectPage.lastName).click();
		wait.until(ExpectedConditions.visibilityOf(saleAgent_Name));
		if(saleAgent_Name.getText().contains(UserListPage.userName)
				&& customerName.getText().equalsIgnoreCase(AddProspectPage.customerName)	&& emailId.getText().contains(AddProspectPage.emailId)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifyVideoUploading() {
		WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofMinutes(2));
		wait.withTimeout(Duration.ofSeconds(10));
		scrollforElement(videoTitle);
		wait.withTimeout(Duration.ofSeconds(20));
		if (videoTitle.isDisplayed() && activity_Uploaded.isDisplayed()) {
         return true;
		}else {
			return false;
		}
	}

	private void scrollforElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)webdriver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	private void clickOnElement(List<WebElement>elementList, String customer) {
		for (WebElement element : elementList) {
			if (element.getText().equals(customer)) {
				element.click();
				break;
			}
		}
	}
}
