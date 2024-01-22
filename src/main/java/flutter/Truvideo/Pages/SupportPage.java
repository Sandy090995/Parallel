package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SupportPage extends UtilityClass {

	AppiumDriver driver;

	public SupportPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Support")
	@iOSXCUITFindBy(accessibility = "Support")
	private WebElement supportPageTitle;
	
	public WebElement getSupportPageTitle() {
		return supportPageTitle;
	}
	
	@AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	@iOSXCUITFindBy(xpath =  "")
	private WebElement backArrowButton;
	
	public WebElement getBackArrowButton() {
		return backArrowButton;
	}
	
	@AndroidFindBy(accessibility = "CONTINUE")
	@iOSXCUITFindBy(accessibility = "CONTINUE")
	private WebElement continueButton;
	
	@AndroidFindBy(xpath = "//android.view.View[3]/android.widget.EditText[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[1]")
	private WebElement emailTextbox;

	@AndroidFindBy(xpath = "//android.view.View[3]/android.widget.EditText[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[2]")
	private WebElement phoneTextbox;

	@AndroidFindBy(xpath = "//android.view.View[3]/android.widget.EditText[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[3]")
	private WebElement commentTextbox;

	@AndroidFindBy(accessibility = "SEND TO SUPPORT")
	@iOSXCUITFindBy(accessibility = "SEND TO SUPPORT")
	private WebElement sendToSupportButton;

	@AndroidFindBy(accessibility = "Application Settings")
	@iOSXCUITFindBy(accessibility = "Application Settings")
	private WebElement headerClick;

	@AndroidFindBy(accessibility = "Successfully sent application settings to support.")
	@iOSXCUITFindBy(accessibility = "Successfully sent application settings to support.")
	private WebElement successMessage;

	@AndroidFindBy(accessibility = "Successfully sent application settings to support.")
	@iOSXCUITFindBy(accessibility = "Successfully sent application settings to support.")
	private WebElement acceptButton;

	public boolean checkSupportFunctionality(String email, String phone, String comment) throws InterruptedException {
		continueButton.click();
		log.info("Clicked on Continue Button");
		Thread.sleep(40000);
		emailTextbox.click();
		emailTextbox.sendKeys(email);
		log.info("Email Address is written");
		phoneTextbox.click();
		phoneTextbox.sendKeys(phone);
		log.info("Phone number is entered");
		commentTextbox.click();
		commentTextbox.sendKeys(comment);
		log.info("Written some Comment");
		headerClick.click();
		sendToSupportButton.click();
		log.info("Sended Health Status to Support");
		Thread.sleep(1000);
		if (acceptButton.isDisplayed()) {
			// acceptButton.click();
			return true;
		} else {
			return false;
		}
	}

}
