package Dashboard.Truvideo.Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import flutter.Truvideo.Pages.AddOrderPage;
import flutter.Truvideo.Pages.UserListPage;

public class DashRepairOrderPage {

	public WebDriver webdriver;

	public DashRepairOrderPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);
	}

	@FindBy(id = "repair-order-page-title-text")
	private WebElement repairOrder_PageTitle;

	public WebElement getRepairOrderPageTitle() {
		return repairOrder_PageTitle;
	}

	@FindBy(id = "LBL_ALL_OPEN")
	private WebElement label_AllOpen;

	@FindBy(xpath = "//*[@id='repair-order-results']/tbody/tr/td[4]")
	private List<WebElement> repairOrderNo_List;
	
	public WebElement getNewlyCreatedRO() {
		return webdriver.findElement(By.xpath("//p[text()='"+AddOrderPage.orderNumber+"']"));
	}

	@FindBy(id = "view-orderStatus.value")
	private WebElement status_RO;

	@FindBy(id = "view-ownerName")
	private WebElement advisorName;

	@FindBy(id = "view-technicianName")
	private WebElement technicianName;

	@FindBy(id = "view-customer.email")
	private WebElement emailAdd;

	@FindBy(xpath = "//span[text()='Play Video']")
	private WebElement video_PlayButton;
	//title-display-main id

	@FindBy(xpath = "//div[text()='Uploaded new video. ']")
	private WebElement activity_Uploaded;

	public boolean verifyNewlyCreatedRO() {
		WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofMinutes(2));
		wait.withTimeout(Duration.ofSeconds(60));
		try {
			label_AllOpen.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		wait.withTimeout(Duration.ofMinutes(1));
		//clickOnElement(repairOrderNo_List, AddOrderPage.orderNumber);
		getNewlyCreatedRO().click();
		wait.until(ExpectedConditions.visibilityOf(technicianName));
		wait.withTimeout(Duration.ofSeconds(40));
		if (advisorName.getText().contains(AddOrderPage.advisorName)
				
				&& emailAdd.getText().contains(AddOrderPage.emailId)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean verifyVideoUploading() {
		scrollforElement(activity_Uploaded);
		if (video_PlayButton.isDisplayed() && activity_Uploaded.isDisplayed()) {
         return true;
		}else {
			return false;
		}
	}

	private void scrollforElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)webdriver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	private void clickOnElement(List<WebElement> elementList, String RONumber) {
		for (WebElement element : elementList) {
			if (element.getText().equals(RONumber)) {
				element.click();
				break;
			}
		}
	}
}
