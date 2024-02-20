package flutter.Truvideo.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class DealerCodes extends UtilityClass {
	AppiumDriver driver;

	public DealerCodes(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

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

	public String dealerCode;
	public String dealerName;

	public void enterDealerCode_TruvideoDealer_Order() throws InterruptedException {
		dealerName="TruVideo";
		if (isAndroid()) {
			String first = ZERO.getAttribute("content-desc");
			String second = SIX.getAttribute("content-desc");
			String third = FIVE.getAttribute("content-desc");
			String fourth = FOUR.getAttribute("content-desc");
			String fifth = SEVEN.getAttribute("content-desc");
			String sixth = SEVEN.getAttribute("content-desc");
			dealerCode = first + second + third + fourth + fifth + sixth;
		} else {
			String first = ZERO.getAttribute("label");
			String second = SIX.getAttribute("label");
			String third = FIVE.getAttribute("label");
			String fourth = FOUR.getAttribute("label");
			String fifth = SEVEN.getAttribute("label");
			String sixth = SEVEN.getAttribute("label");
			dealerCode = first + second + third + fourth + fifth + sixth;
		}
		log.info("Entering Dealer code");
		ZERO.click();
		SIX.click();
		FIVE.click();
		FOUR.click();
		SEVEN.click();
		SEVEN.click();
		log.info("Order Dealer code is entered");
		Thread.sleep(1000);
	}

	public String enterDealerCode_TruvideoDealer_Sales() {
		dealerName="TruVideo";
		if (isAndroid()) {
			String first = TWO.getAttribute("content-desc");
			String second = FOUR.getAttribute("content-desc");
			String third = FIVE.getAttribute("content-desc");
			String fourth = NINE.getAttribute("content-desc");
			String fifth = EIGHT.getAttribute("content-desc");
			String sixth = ONE.getAttribute("content-desc");
			dealerCode = first + second + third + fourth + fifth + sixth;
		} else {
			String first = TWO.getAttribute("label");
			String second = FOUR.getAttribute("label");
			String third = FIVE.getAttribute("label");
			String fourth = NINE.getAttribute("label");
			String fifth = EIGHT.getAttribute("label");
			String sixth = ONE.getAttribute("label");
			dealerCode = first + second + third + fourth + fifth + sixth;
		}
		log.info("Entering Dealer code");
		TWO.click();
		FOUR.click();
		FIVE.click();
		NINE.click();
		EIGHT.click();
		ONE.click();
		log.info("Sales Dealer code is entered");
		return dealerCode;
	}

	public String enterDealerCode_DemoMainSteetToyotaDealer_Order() {
		dealerName="DEMO Main Street Toyota";
		if (isAndroid()) {
			String first = TWO.getAttribute("content-desc");
			String second = FOUR.getAttribute("content-desc");
			String third = SEVEN.getAttribute("content-desc");
			String fourth = THREE.getAttribute("content-desc");
			String fifth = ZERO.getAttribute("content-desc");
			String sixth = ONE.getAttribute("content-desc");
			dealerCode = first + second + third + fourth + fifth + sixth;
		} else {
			String first = TWO.getAttribute("label");
			String second = FOUR.getAttribute("label");
			String third = SEVEN.getAttribute("label");
			String fourth = THREE.getAttribute("label");
			String fifth = ZERO.getAttribute("label");
			String sixth = ONE.getAttribute("label");
			dealerCode = first + second + third + fourth + fifth + sixth;
		}
		log.info("Entering Dealer code");
		TWO.click();
		FOUR.click();
		SEVEN.click();
		THREE.click();
		ZERO.click();
		ONE.click();
		log.info("Sales Dealer code is entered");
		// dealerName_UserListScreen = "DEMO Main Street Toyota";
		return dealerCode;
	}

	public String enterDealerCode_DemoMainSteetToyotaDealer_Sales() {
		dealerName="DEMO Main Street Toyota";
		if (isAndroid()) {
			String first = EIGHT.getAttribute("content-desc");
			String second = ZERO.getAttribute("content-desc");
			String third = TWO.getAttribute("content-desc");
			String fourth = SEVEN.getAttribute("content-desc");
			String fifth = NINE.getAttribute("content-desc");
			String sixth = SEVEN.getAttribute("content-desc");
			dealerCode = first + second + third + fourth + fifth + sixth;
		} else {
			String first = EIGHT.getAttribute("label");
			String second = ZERO.getAttribute("label");
			String third = TWO.getAttribute("label");
			String fourth = SEVEN.getAttribute("label");
			String fifth = NINE.getAttribute("label");
			String sixth = SEVEN.getAttribute("label");
			dealerCode = first + second + third + fourth + fifth + sixth;
		}
		log.info("Entering Dealer code");
		EIGHT.click();
		ZERO.click();
		TWO.click();
		SEVEN.click();
		NINE.click();
		SEVEN.click();
		log.info("Sales Dealer code is entered");
		// dealerName_UserListScreen = "DEMO Main Street Toyota";
		return dealerCode;
	}

}
