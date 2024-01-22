package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EditOrder_ProspectPage extends UtilityClass {
	AppiumDriver driver;

	public EditOrder_ProspectPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Edit Order")
	@iOSXCUITFindBy(accessibility = "Edit Order")
	private WebElement editOrder_Title;

	public WebElement getEditOrderTitle() {
		return editOrder_Title;
	}

	@AndroidFindBy(accessibility = "Edit Prospect")
	@iOSXCUITFindBy(accessibility = "Edit Prospect")
	private WebElement editProspect_Title;

	public WebElement getEditPropspectTitle() {
		return editProspect_Title;
	}

	@AndroidFindBy(accessibility = "Fleet Customer")
	@iOSXCUITFindBy(accessibility = "Fleet Customer")
	private WebElement fleetCustomer;

	@AndroidFindBy(xpath = "//android.widget.EditText[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[2]")
	private WebElement companyName;

	@AndroidFindBy(xpath = "//android.view.View[6]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[3]")
	private WebElement advisor_DropDown;

	@AndroidFindBy(xpath = "//android.widget.EditText[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[3]")
	private WebElement firstName_textBox;

	@AndroidFindBy(xpath = "//android.widget.EditText[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[4]")
	private WebElement lastName_textBox;

	@AndroidFindBy(xpath = "//android.widget.EditText[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[3]")
	private WebElement mobile_textBox;

	@AndroidFindBy(xpath = "//android.widget.EditText[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[4]")
	private WebElement email_textBox;

	@AndroidFindBy(accessibility = "Do not send video directly to customer")
	@iOSXCUITFindBy(accessibility = "Do not send video directly to customer")
	private WebElement doNotSendDirectly;

	@AndroidFindBy(accessibility = "CANCEL")
	@iOSXCUITFindBy(accessibility = "CANCEL")
	private WebElement cancel_Button;
	
	public WebElement getCancelButton() {
		return cancel_Button;
	}

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'SAVE')]")
	@iOSXCUITFindBy(accessibility = "SAVE")
	private WebElement saveChanges_button;

	public boolean checkFleetCustomerFunction() {
		fleetCustomer.click();
		if (companyName.isDisplayed()) {
			fleetCustomer.click();
			log.info("Fleet customer is working");
			return true;
		} else {
			fleetCustomer.click();
			log.info("Fleet customer is not working");
			return false;
		}
	}

	public boolean editOrder() throws InterruptedException {
		firstName_textBox.click();
		firstName_textBox.sendKeys("Edit");
		editOrder_Title.click();// hiding keyboard
		lastName_textBox.click();
		lastName_textBox.sendKeys("Edit");
		editOrder_Title.click();// hiding keyboard
		mobile_textBox.click();
		editOrder_Title.click();// hiding keyboard
		email_textBox.click();
		email_textBox.clear();
		email_textBox.sendKeys(randomString(5) + "@yahoo.com");
		editOrder_Title.click();// hiding keyboard
		saveChanges_button.click();
		OrderDetailsPage orderDetailsPage = new OrderDetailsPage(driver);
		Thread.sleep(5000);
		if (orderDetailsPage.getOrderNumber().isDisplayed()) {
			log.info("Order modified successfully");
			return true;
		} else {
			log.info("Order modified unsuccessful");
			return false;
		}
	}

	public boolean editProspect() throws InterruptedException {
		firstName_textBox.click();
		firstName_textBox.sendKeys("Edit");
		editProspect_Title.click();// hiding keyboard
		lastName_textBox.click();
		lastName_textBox.sendKeys("Edit");
		editProspect_Title.click();// hiding keyboard
		mobile_textBox.click();
		editProspect_Title.click();// hiding keyboard
		email_textBox.click();
		email_textBox.clear();
		email_textBox.sendKeys(randomString(5) + "@yahoo.com");
		editProspect_Title.click();// hiding keyboard
		saveChanges_button.click();
		ProspectDetailsPage prospectDetailsPage = new ProspectDetailsPage(driver);
		Thread.sleep(3000);
		if (prospectDetailsPage.getProspectDetails_PageTitle().isDisplayed()) {
			log.info("Prospect modified successfully");
			return true;
		} else {
			log.info("Prospect modified unsuccessful");
			return false;
		}
	}

}
