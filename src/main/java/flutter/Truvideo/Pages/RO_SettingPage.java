package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class RO_SettingPage extends UtilityClass {
	AppiumDriver driver;

	public RO_SettingPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Settings")
	@iOSXCUITFindBy(accessibility = "Settings")
	private WebElement settings;

	@AndroidFindBy(xpath = "//android.view.View[@index=\"1\"][@clickable=\"true\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Font Size')]")
	private WebElement fontSize;

	@AndroidFindBy(accessibility = "Small")
	@iOSXCUITFindBy(accessibility = "Small")
	private WebElement smallFont;

	@AndroidFindBy(accessibility = "Medium")
	@iOSXCUITFindBy(accessibility = "Medium")
	private WebElement mediumFont;

	@AndroidFindBy(accessibility = "Large")
	@iOSXCUITFindBy(accessibility = "Large")
	private WebElement largeFont;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Theme Mode')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Theme Mode')]")
	private WebElement themeMode;

	@AndroidFindBy(accessibility = "Dark")
	@iOSXCUITFindBy(accessibility = "Dark")
	private WebElement darkTheme;

	@AndroidFindBy(accessibility = "Light")
	@iOSXCUITFindBy(accessibility = "Light")
	private WebElement lightTheme;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Biometric login')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Biometric login')]")
	private WebElement biometric;

	@AndroidFindBy(accessibility = "1")
	private WebElement one;

	@AndroidFindBy(accessibility = "2")
	private WebElement two;

	@AndroidFindBy(accessibility = "3")
	@iOSXCUITFindBy(accessibility = "3")
	private WebElement three;

	@AndroidFindBy(accessibility = "4")
	private WebElement four;

	@AndroidFindBy(accessibility = "5")
	private WebElement five;

	@AndroidFindBy(accessibility = "6")
	private WebElement six;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'Default Country')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[contains(@name, 'Default Country')]")
	private WebElement countryOption;

	@AndroidFindBy(xpath = "//android.view.View/android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[contains(@name, 'Search')]")
	private WebElement searchbox;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'91')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[contains(@name, 'India')]")

	private WebElement indiaCountry;

	@AndroidFindBy(accessibility = "Default country updated")
	@iOSXCUITFindBy(accessibility = "Default country updated")
	private WebElement alertMessage;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2][@index='1']")

	private WebElement backArrow;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Camera Quality')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Camera Quality')]")
	private WebElement camQualityOption;

	@AndroidFindBy(accessibility = "Low")
	@iOSXCUITFindBy(accessibility = "Low")
	private WebElement lowQuality;

	@AndroidFindBy(accessibility = "Medium")
	@iOSXCUITFindBy(accessibility = "Medium")
	private WebElement mediumQuality;

	@AndroidFindBy(accessibility = "High")
	@iOSXCUITFindBy(accessibility = "High")
	private WebElement highQuality;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Open shaking the device')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Open shaking the device')]")
	private WebElement openShakingtheDevice;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Noise Canceling') or contains(@content-desc, 'Noise Cancelling')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Noise Cancelling')]")
	private WebElement noiceCancelling;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Camera Shake-to-play')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Camera Shake-to-play')]")
	private WebElement cameraShakeToPlay;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Shake Sensitivity')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Shake Sensitivity')]")
	private WebElement shakeSensitivity;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Shake Minimum Count')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Shake Minimum Count')]")
	private WebElement shakeMinimumCount;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Vibration')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Vibration')]")
	private WebElement vibrationMode;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Delete account')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label, 'Delete account')]")
	private WebElement deleteAccount;

	@AndroidFindBy(accessibility = "Settings")
	@iOSXCUITFindBy(accessibility = "Settings")
	private WebElement settingLabel;

	@AndroidFindBy(accessibility = "DELETE")
	@iOSXCUITFindBy(accessibility = "DELETE")
	private WebElement delete;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc='Not registered')]")
	private WebElement notRegisteredAlert;

	@AndroidFindBy(accessibility = "NO")
	@iOSXCUITFindBy(accessibility = "NO")
	private WebElement NO;

	public WebElement getSettingsLabel() {
		return settings;
	}

	public void checkElementofSetting() throws InterruptedException {
		Thread.sleep(2000);
		log.info("ByDefault Vibration mode is ON");
		vibrationMode.click();
		log.info("Disabled the Vibration Mode");
		vibrationMode.click();
		log.info("Disabled the Vibration Mode");
		openShakingtheDevice.click();
		log.info("Enabled the Open Shaking thr Device");
		scrollDown();
		scrollDown();
		log.info("ByDefault Noice cancelling is Enabled ");
		noiceCancelling.click();
		log.info("Disabled Noice cancelling");
		noiceCancelling.click();
		log.info("Enabled Noice cancelling");
		cameraShakeToPlay.click();
		log.info(" Enabled Camera Shake to Play ");
		scrollDown();
		Thread.sleep(3000);
		shakeSensitivity.click();
		highQuality.click();
		log.info("Changed Shake Sensitivity to High");
		Thread.sleep(2000);
		shakeMinimumCount.click();
		Thread.sleep(2000);
		three.click();
		log.info("Increased Shake count");
		log.info("Checked OverView of Setting Module");
		Thread.sleep(2000);
	}

	public boolean checkSmallFont() throws InterruptedException {
		scrollUp();
		scrollUp();
		Thread.sleep(2000);
		fontSize.click();
		log.info("Clicked on Font Button on Settings Screen");
		log.info("Default Medium font is Selected");
		String defaultFont;
		try {
			defaultFont = mediumFont.getAttribute("content-desc");
		} catch (Exception e) {
			defaultFont = mediumFont.getAttribute("label");
		}
		smallFont.click();
		log.info("Changed Font Medium to small");
		fontSize.click();
		String changedFont;
		try {
			changedFont = smallFont.getAttribute("content-desc");
		} catch (Exception e) {
			changedFont = smallFont.getAttribute("label");
		}

		if (!defaultFont.equals(changedFont)) {
			return true;
		} else {
			return false;
		}
	}

//	public boolean largeFontCheck()
//	{
//	    log.info("Clicked on Font Button on Settings Screen");
//	    String defaultFont = smallFont.getAttribute("content-desc");
//	    largeFont.click();
//	    log.info("Changed Font Small to Large");
//	    fontSize.click();
//	    String changedFont = largeFont.getAttribute("content-desc");
//
//	    if(!defaultFont.equals(changedFont))
//	    {
//	    	return true;   }
//	    else{
//	    	return false;
//	    }
//	}
//	public boolean mediumFontCheck() throws InterruptedException
//	{
//	    log.info("Clicked on Font Button on Settings Screen");
//	    String defaultFont = largeFont.getAttribute("content-desc");
//	    mediumFont.click();
//	    log.info("Changed Font Large to Medium");
//	    fontSize.click();
//	    String changedFont = mediumFont.getAttribute("content-desc");
//	    Thread.sleep(8000);
//
////	    settingLabel.click();
////        Thread.sleep(8000);
//	    if(!defaultFont.equals(changedFont))
//	    {
//	    	return true;   }
//	    else{
//	    	return false;
//	    }
//	}
//
	public boolean meduimFontCheck() {
		log.info("Clicked on Font Button on Settings Screen");
		String defaultFont;
		try {
			defaultFont = smallFont.getAttribute("content-desc");
		} catch (Exception e) {
			defaultFont = smallFont.getAttribute("label");
		}
		largeFont.click();
		log.info("Changed Font Small to Large");
		fontSize.click();
		String changedFont;
		try {
			changedFont = largeFont.getAttribute("content-desc");
		} catch (Exception e) {
			changedFont = largeFont.getAttribute("label");
		}

		if (!defaultFont.equals(changedFont)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean largeFontCheck() throws InterruptedException {
		log.info("Clicked on Font Button on Settings Screen");
		String defaultFont;
		try {
			defaultFont = largeFont.getAttribute("content-desc");
		} catch (Exception e) {
			defaultFont = largeFont.getAttribute("label");
		}
		mediumFont.click();
		log.info("Changed Font Large to Medium");
		fontSize.click();
		String changedFont;
		try {
			changedFont = mediumFont.getAttribute("content-desc");
		} catch (Exception e) {
			changedFont = mediumFont.getAttribute("label");
		}
		Thread.sleep(8000);

		if (!defaultFont.equals(changedFont)) {
			return true;
		} else {
			return false;
		}
	}

//	String defaultFont;
//	public boolean checkFontChange(WebElement fontElement) throws InterruptedException {
//	    log.info("Clicked on Font Button on Settings Screen +++++");
//	    defaultFont = mediumFont.getAttribute("content-desc");
//	    System.out.println(defaultFont);
//	    fontElement.click();
//	    log.info("Changed Font");
//
//	    // Sleep for a short duration to allow the font change to take effect
//	    Thread.sleep(2000);
//
//	    fontSize.click();
//	    String changedFont = fontElement.getAttribute("content-desc");
//	    System.out.println(changedFont);
//
//	    return defaultFont.equals(changedFont);
//	}
//
//	public void testFontChange() throws InterruptedException {
//	    Thread.sleep(2000); // Add sleep duration if necessary
//	    fontSize.click();
//
//	    Thread.sleep(5000);
//	    boolean isSmallFontChanged = checkFontChange(smallFont);
//	    if (isSmallFontChanged) {
//	        log.info("Small font changed successfully");
//	    } else {
//	        log.error("Small font change failed");
//	    }
//
//	    boolean isMediumFontChanged = checkFontChange(mediumFont);
//	    if (isMediumFontChanged) {
//	        log.info("Medium font changed successfully");
//	    } else {
//	        log.error("Medium font change failed");
//	    }
//
//	    boolean isLargeFontChanged = checkFontChange(largeFont);
//	    if (isLargeFontChanged) {
//	        log.info("Large font changed successfully");
//	    } else {
//	        log.error("Large font change failed");
//	    }
//	}

	public boolean checkTheme() {

		mediumFont.click();
		themeMode.click();
		log.info("Clicked on Theme mode :-Default System (Light) Theme is selected");
		String light;
		try {
			light = lightTheme.getAttribute("content-desc");
		} catch (Exception e) {
			light = lightTheme.getAttribute("label");
		}
		System.out.println(light);
		darkTheme.click();
		// log.info("Changed theme Light to Dark");
		themeMode.click();
		String dark = null;
		try {
			dark = darkTheme.getAttribute("content-desc");
		} catch (Exception e) {
			light = darkTheme.getAttribute("label");
		}
		System.out.println(dark);
		if (!light.equals(dark)) {
			log.info("Theme mode is changed from Light to Dark");
		} else {
			log.info("Theme is not changed from Light to Dark");
		}

		lightTheme.click();
		if (!light.equals(dark)) {
			log.info("Changed theme to Dark to Light");
			return true;
		} else {
			log.info("Theme is not changed");
			return false;
		}
	}

	public void biometricConfiguration() {
		biometric.click();
		log.info("Clicked on BioMetric Login");

		log.info("Insert your User PIN");
		one.click();
		two.click();
		three.click();
		four.click();
		five.click();
		six.click();

		log.info("Navigated to Authentication page  :---Due to Security Flag we can't Automate Authentication");

		log.info("Navigated to Authrntication page  :---Due to Security Flag we can't Automate Authentication");

	}

	public boolean defaultCountry(String country) throws InterruptedException {
		countryOption.click();
		log.info("Clicked on Country dropdown ");
		searchbox.click();
		searchbox.sendKeys(country);
		log.info("Typed India Country");
		indiaCountry.click();
		log.info("Default country selectes popup id displayed ::Selected India as Country");
		String text;
		if (isAndroid()) {
			text = alertMessage.getAttribute("content-desc");
		} else {
			text = alertMessage.getAttribute("label");
			System.out.println("value of text inside ios " + text);
		}
		System.out.println(text);
		Thread.sleep(4000);
		backArrow.click();
		log.info("Clicked back button and now user is on RO list page");
		System.out.println("value of text " + text);
		if (text.equals("Default country updated")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean lowCameraQuality() throws InterruptedException {
		RO_ListPage roListPage = new RO_ListPage(driver);
		scrollDown();
		Thread.sleep(3000);
		camQualityOption.click();
		log.info("Clicked on camera quality option:-'Low','Medium','High' option is displayed");
		Thread.sleep(3000);
		lowQuality.click();
		log.info("Changed camera quality to LOW");
		backArrow.click();
		// log.info("clicked on back arrow and user is navigated on RO List screen");
		if (roListPage.getOrderPageTitle().isDisplayed()) {
			log.info("clicked on back arrow and user is navigated on RO List screen");
			return true;
		} else {
			log.info("clicked on back arrow and but user is not navigated on RO List screen");
			return false;
		}

	}

	public boolean mediumCameraQuality() {
		RO_ListPage roListPage = new RO_ListPage(driver);

		log.info("clicked on back arrow and user is navigated on RO List screen");
		scrollDown();
		camQualityOption.click();
		log.info("Clicked on camera quality option:-'Low','Medium','High' option is displayed");
		mediumQuality.click();
		log.info("Changed camera quality to Medium");
		backArrow.click();
		log.info("clicked on back arrow and user is navigated on RO List screen");

		if (roListPage.getOrderPageTitle().isDisplayed()) {
			log.info("clicked on back arrow and user is navigated on RO List screen");
			return true;
		} else {
			log.info("clicked on back arrow and but user is not navigated on RO List screen");
			return false;
		}

	}

	public boolean highCameraQuality() {
		RO_ListPage roListPage = new RO_ListPage(driver);
		scrollDown();
		camQualityOption.click();
		log.info("Clicked on camera quality option:-'Low','Medium','High' option is displayed");
		highQuality.click();
		log.info("Changed camera quality to High");
		backArrow.click();
		log.info("clicked on back arrow and user is navigated on RO List screen");

		if (roListPage.getOrderPageTitle().isDisplayed()) {
			log.info("clicked on back arrow and user is navigated on RO List screen");
			return true;
		} else {
			log.info("clicked on back arrow and but user is not navigated on RO List screen");
			return false;
		}

	}

	public boolean deleteUser() throws InterruptedException {
		UserListPage user = new UserListPage(driver);
		scrollDown();
		scrollDown();
		Thread.sleep(2000);
		deleteAccount.click();
		log.info("Clicked on Delete Account Button:- Confirmation Dialog is displayed");
		delete.click();
		log.info("Account deleted succesfully");
		if (user.getDealerName().isDisplayed()) {
			log.info("Account of new User is  deleted succesfully");
			return true;
		} else {
			log.info("Can not delete user");
			return false;
		}

	}

}
