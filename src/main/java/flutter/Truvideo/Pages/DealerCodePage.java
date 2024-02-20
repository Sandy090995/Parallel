package flutter.Truvideo.Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.BaseClass.DealerCodes;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class DealerCodePage extends UtilityClass {
	AppiumDriver driver;

	public DealerCodePage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public static String dealerCode;
	public static String dealerName;

	@AndroidFindBy(accessibility = "Hello there!")
	@iOSXCUITFindBy(accessibility = "Hello there!")
	private WebElement helloThereText;

	public WebElement getHelloThereText() {
		return helloThereText;
	}

	@AndroidFindBy(accessibility = "Please type your Dealer Code to identify you")
	@iOSXCUITFindBy(accessibility = "Please type your Dealer Code to identify you")
	private WebElement enterDealerCodeMessage;

	@AndroidFindBy(xpath = "//android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "//*[@type='XCUIElementTypeImage']")
	private WebElement truVideoLogo;

	@iOSXCUITFindBy(accessibility = "OK")
	@AndroidFindBy(accessibility = "OK")
	private WebElement popUpOK;

	@iOSXCUITFindBy(accessibility = "1")
	@AndroidFindBy(accessibility = "1")
	private WebElement ONE;

	@iOSXCUITFindBy(accessibility = "2")
	@AndroidFindBy(accessibility = "2")
	private WebElement TWO;

	@iOSXCUITFindBy(accessibility = "3")
	@AndroidFindBy(accessibility = "3")
	private WebElement THREE;

	@iOSXCUITFindBy(accessibility = "4")
	@AndroidFindBy(accessibility = "4")
	private WebElement FOUR;

	@iOSXCUITFindBy(accessibility = "5")
	@AndroidFindBy(accessibility = "5")
	private WebElement FIVE;

	@iOSXCUITFindBy(accessibility = "6")
	@AndroidFindBy(accessibility = "6")
	private WebElement SIX;

	@iOSXCUITFindBy(accessibility = "7")
	@AndroidFindBy(accessibility = "7")
	private WebElement SEVEN;

	@iOSXCUITFindBy(accessibility = "8")
	@AndroidFindBy(accessibility = "8")
	private WebElement EIGHT;

	@iOSXCUITFindBy(accessibility = "9")
	@AndroidFindBy(accessibility = "9")
	private WebElement NINE;

	@iOSXCUITFindBy(accessibility = "0")
	@AndroidFindBy(accessibility = "0")
	private WebElement ZERO;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Something went wrong')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Something went wrong')]")
	private WebElement errorMessage;

	@iOSXCUITFindBy(accessibility = "Dealer not found")
	@AndroidFindBy(accessibility = "Dealer not found")
	private WebElement dealerNotFoundMessage;

	@iOSXCUITFindBy(accessibility = "OK")
	@AndroidFindBy(accessibility = "OK")
	private WebElement oKButton;

	public boolean applicationInstall_dealerCodePageLoad() {
		try {
			if (popUpOK.isDisplayed()) {
				log.info("PopUp Displayed");
				popUpOK.click();
			}
		} catch (NoSuchElementException e) {
			log.info("PopUp not present");
		}
		if (helloThereText.isDisplayed()) {
			log.info("App installed and Dealer Code Page Load");
			return true;
		} else {
			log.info("Error in App installed and Dealer Code Page Load");
			return false;
		}
	}

	public boolean visibleElements_DealerCodePage() {
		try {
			if (popUpOK.isDisplayed()) {
				log.info("PopUp Displayed");
				popUpOK.click();
			}
		} catch (NoSuchElementException e) {
			log.info("PopUp not present");
		}
		if (helloThereText.isDisplayed() && enterDealerCodeMessage.isDisplayed() && truVideoLogo.isDisplayed()) {
			log.info("All elements are Present on Dealer Screen");
			return true;
		} else {
			log.info("All elements are not Present on Dealer Screen");
			return false;
		}
	}

	public boolean dealerLogin_InvalidCredentials() throws InterruptedException {
		TWO.click();
		SEVEN.click();
		SEVEN.click();
		ONE.click();
		ZERO.click();
		TWO.click();
		Thread.sleep(5000);
		if (errorMessage.isDisplayed() && dealerNotFoundMessage.isDisplayed()) {
			log.info("Dealer Not found message is displayed");
			oKButton.click();
			return true;
		} else {
			return false;
		}
	}

	public boolean dealerLogin_ValidCredentials() throws Exception {
		navigateToUserListScreen_Order();
		UserListPage userListScreen = new UserListPage(driver);
		if (userListScreen.getDealerName(dealerName).isDisplayed()) {
			log.info("Dealer name is Displayed");
			return true;
		} else {
			log.info("Dealer name is not displayed");
			return false;
		}

	}

	public UserListPage navigateToUserListScreen_Order() throws Exception {
		try {
			if (popUpOK.isDisplayed()) {
				Thread.sleep(2000);
				log.info("PopUp Displayed");
				popUpOK.click();
			}
		} catch (NoSuchElementException e) {
			log.info("PopUp not present");
		}
		DealerCodes AllDealerCode = new DealerCodes(driver);
		AllDealerCode.enterDealerCode_TruvideoDealer_Order();// Change Dealer
		dealerCode = AllDealerCode.dealerCode;
		dealerName = AllDealerCode.dealerName;
		System.out.println(dealerCode);
		Thread.sleep(5000);
		return new UserListPage(driver);
	}

	public boolean salesDealerLogin_ValidCredentials() throws Exception {
		navigateToUserListScreen_Sales();
		UserListPage userListScreen = new UserListPage(driver);
		if (userListScreen.getDealerName(dealerName).isDisplayed()) {
			log.info("Dealer name is Displayed");
			return true;
		} else {
			log.info("Dealer name is not displayed");
			return false;
		}
	}

	public UserListPage navigateToUserListScreen_Sales() throws Exception {
		try {
			if (popUpOK.isDisplayed()) {
				Thread.sleep(2000);
				log.info("PopUp Displayed");
				popUpOK.click();
			}
		} catch (NoSuchElementException e) {
			log.info("PopUp not present");
		}
		DealerCodes AllDealerCode = new DealerCodes(driver);
		AllDealerCode.enterDealerCode_TruvideoDealer_Sales();// Change Dealer
		dealerCode = AllDealerCode.dealerCode;
		dealerName = AllDealerCode.dealerName;
		Thread.sleep(5000);
		return new UserListPage(driver);
	}
}
