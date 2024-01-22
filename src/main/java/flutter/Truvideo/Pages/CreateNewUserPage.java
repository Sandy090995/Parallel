package flutter.Truvideo.Pages;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import Dashboard.Truvideo.Pages.DashHomePage;
import Dashboard.Truvideo.Pages.DashLoginPage;
import Dashboard.Truvideo.Pages.DashUsersPage;

import java.util.List;

public class CreateNewUserPage extends UtilityClass {

	AppiumDriver driver;
	WebDriver webdriver;
	UserListPage userlist;

	public CreateNewUserPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public static String newUser;

	@AndroidFindBy(xpath = "//android.view.View[@index='0']")
	private List<WebElement> backButton;// index=4

	public WebElement getBackButton() {
		return backButton.get(4);
	}

	@iOSXCUITFindBy(accessibility = "Create user")
	@AndroidFindBy(accessibility = "Create user")
	private WebElement createUserPage_Title;

	public WebElement getCreateUserPage_Title() {
		return createUserPage_Title;
	}

	@AndroidFindBy(xpath = "//android.widget.EditText[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[1]")
	private WebElement fNameBox;

	public WebElement getfNameBox() {
		return fNameBox;
	}

	@AndroidFindBy(xpath = "//android.widget.EditText[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[2]")
	private WebElement lNameBox;

	@AndroidFindBy(xpath = "//android.widget.EditText[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[3]")
	private WebElement jobTitle;

	@AndroidFindBy(accessibility = "CANCEL")
	@iOSXCUITFindBy(accessibility = "CANCEL")
	private WebElement cancelButton;

	public WebElement getCancelButton() {
		return cancelButton;
	}

	// @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"CREATE\"]")
	@AndroidFindBy(accessibility = "NEXT")
	@iOSXCUITFindBy(accessibility = "NEXT")
	private WebElement createButton;

	@AndroidFindBy(accessibility = "Almost done!")
	@iOSXCUITFindBy(accessibility = "Almost done!")
	private WebElement almostDoneText;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement closeBtn;

	@AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Required\"])[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Required\"])[1]")
	private WebElement errorMsg_required_Name;

	@AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Required\"])[2]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Required\"])[2]")
	private WebElement errorMsg_required_LastName;

	@AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Required\"])[3]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Required\"])[3]")
	private WebElement errorMsg_required_JobTitle;

	@AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Required\"])[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@index='12']")
	private WebElement errorMsg_required_Email;

	@AndroidFindBy(xpath = "//android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	private List<WebElement> textBox;

	@AndroidFindBy(accessibility = "0")
	@iOSXCUITFindBy(accessibility = "0")
	private WebElement zero;

	@AndroidFindBy(accessibility = "1")
	@iOSXCUITFindBy(accessibility = "1")
	private WebElement one;

	@AndroidFindBy(accessibility = "2")
	@iOSXCUITFindBy(accessibility = "2")
	private WebElement two;

	@AndroidFindBy(accessibility = "3")
	@iOSXCUITFindBy(accessibility = "3")
	private WebElement three;

	@AndroidFindBy(accessibility = "4")
	@iOSXCUITFindBy(accessibility = "4")
	private WebElement four;

	@AndroidFindBy(accessibility = "5")
	@iOSXCUITFindBy(accessibility = "5")
	private WebElement five;

	@AndroidFindBy(accessibility = "6")
	@iOSXCUITFindBy(accessibility = "6")
	private WebElement six;

	@AndroidFindBy(accessibility = "7")
	@iOSXCUITFindBy(accessibility = "7")
	private WebElement seven;

	@AndroidFindBy(accessibility = "8")
	@iOSXCUITFindBy(accessibility = "8")
	private WebElement eight;

	@AndroidFindBy(accessibility = "9")
	@iOSXCUITFindBy(accessibility = "9")
	private WebElement nine;

	@AndroidFindBy(accessibility = "Create your pin")
	@iOSXCUITFindBy(accessibility = "Create your pin")
	private WebElement createYourPinText;

	@AndroidFindBy(accessibility = "Confirm your pin")
	@iOSXCUITFindBy(accessibility = "Confirm your pin")
	private WebElement confirmYourPinText;

	@AndroidFindBy(accessibility = "Invalid confirmation")
	@iOSXCUITFindBy(accessibility = "Invalid confirmation")
	private WebElement errorText;

	@AndroidFindBy(accessibility = "Pins don't match.")
	@iOSXCUITFindBy(accessibility = "Pins don't match.")
	private WebElement pinDoNotMatchText;

	@AndroidFindBy(accessibility = "ACCEPT")
	@iOSXCUITFindBy(accessibility = "ACCEPT")
	private WebElement acceptButton;

	public boolean check_cancelButton() throws InterruptedException {
		fNameBox.click();
		createUserPage_Title.click();// hiding keyboard
		// ((HidesKeyboard) driver).hideKeyboard();
		Thread.sleep(3000);
		cancelButton.isDisplayed();
		log.info("Verify Cancel button is displayed");
		cancelButton.click();
		UserListPage userListPage = new UserListPage(driver);
		if (userListPage.getDealerName().isDisplayed()) {
			log.info("Cancel Button is Working");
			return true;
		} else {
			log.info("Cancel Button is not Working");
			return false;
		}
	}

	public boolean checkErrorMessage_NullValue() {
		createUserPage_Title.click();// hiding keyboard
		// ((HidesKeyboard) driver).hideKeyboard();
		createButton.click();
		if (errorMsg_required_Name.isDisplayed() && errorMsg_required_LastName.isDisplayed()
				&& errorMsg_required_JobTitle.isDisplayed()) {
			log.info("Error message is Displayed when trying to create user with null values");
			return true;
		} else {
			return false;
		}
	}

	public void checkNewUserCreationAndVerificationFromDashboard() throws InterruptedException {
		SoftAssert soft = new SoftAssert();
		Thread.sleep(3000);
		System.out.println("inside check new user page");
		fNameBox.click();
		fNameBox.sendKeys("Automation" + randomString(3));
		newUser = fNameBox.getText();
		System.out.println("inside check new user page1");
		lNameBox.click();
		lNameBox.sendKeys("User" + randomString(3));
		jobTitle.click();
		jobTitle.sendKeys("technician");
		createUserPage_Title.click();// hiding keyboard
		// ((HidesKeyboard) driver).hideKeyboard();
		createButton.click();
		soft.assertTrue(createYourPinText.isDisplayed());
		log.info("Create Your Pin text is Displayed");
		enter_pin();
		soft.assertTrue(confirmYourPinText.isDisplayed());
		log.info("Confirm Your Pin text is Displayed");
		// Entering Wrong pin in Confirm pin Screen
		one.click();
		two.click();
		three.click();
		two.click();
		one.click();
		three.click();
		soft.assertTrue(errorText.isDisplayed() && pinDoNotMatchText.isDisplayed());
		log.info("Error & The pin code do not match text is displayed");
		acceptButton.click();
		enter_pin();
		soft.assertTrue(almostDoneText.isDisplayed());
		log.info("Almost done message displayed...");
		/* Web Browser Execution Starts */
		webdriver = BaseClass.setDashboardBrowser();
		DashLoginPage dashLoginPage = new DashLoginPage(webdriver);
		dashLoginPage.loginToWebApplication();
		DashHomePage dashHomePage = new DashHomePage(webdriver);
		dashHomePage.navigateToUserSetting();
		DashUsersPage dashUserPage = new DashUsersPage(webdriver);
		soft.assertTrue(dashUserPage.ApproveUserFromDashboard());
		webdriver.close();
		/* Web Browser Execution Closed */
		userlist = new UserListPage(driver);
		userlist.getNoButton().click();
		RO_ListPage rolist = new RO_ListPage(driver);
		soft.assertTrue(rolist.getOrderPageTitle().isDisplayed());
		// closeBtn.click();
		soft.assertAll();
	}

	public void enter_pin() {
		one.click();
		two.click();
		three.click();
		four.click();
		five.click();
		six.click();
	}

	public boolean checkErrorMessage_NullValue_Sales() {
		createUserPage_Title.click();// hiding keyboard
		// ((HidesKeyboard) driver).hideKeyboard();
		createButton.click();
		if (errorMsg_required_Name.isDisplayed() && errorMsg_required_LastName.isDisplayed()
				&& errorMsg_required_JobTitle.isDisplayed() && errorMsg_required_Email.isDisplayed()) {
			log.info("Error message is Displayed when trying to create user with null values");
			return true;
		} else {
			return false;
		}
	}

	public void checkNewUserCreation_Sales() throws InterruptedException {
		SoftAssert soft = new SoftAssert();
		createUserPage_Title.click();
		textBox.get(0).click();
		textBox.get(0).sendKeys("AutomationFirst" + randomString(5));
		newUser = textBox.get(0).getText();
		createUserPage_Title.click();
		textBox.get(1).click();
		textBox.get(1).sendKeys("Last" + randomString(5));
		createUserPage_Title.click();
		textBox.get(2).click();
		textBox.get(2).sendKeys("Job");
		createUserPage_Title.click();
		soft.assertEquals(textBox.get(2).getText(), "Job");
		textBox.get(3).click();
		textBox.get(3).sendKeys(randomString(7) + "@gmail.com");
		createUserPage_Title.click();
		Thread.sleep(1000);
		scrollDown();
		textBox.get(textBox.size() - 1).click();
		Thread.sleep(2000);
		textBox.get(textBox.size() - 1).sendKeys("7812059487");
		createUserPage_Title.click();
		soft.assertEquals(textBox.get(textBox.size() - 1).getText(), "(781) 205-9487");
		textBox.get(textBox.size() - 2).click();
		Thread.sleep(2000);
		textBox.get(textBox.size() - 1).sendKeys("password");
		createUserPage_Title.click();
		textBox.get(textBox.size() - 3).click();
		Thread.sleep(2000);
		textBox.get(textBox.size() - 1).sendKeys("password");
		createUserPage_Title.click();
		textBox.get(textBox.size() - 4).click();
		Thread.sleep(2000);
		textBox.get(textBox.size() - 2).sendKeys(randomString(10));
		createUserPage_Title.click();
		createButton.click();
		soft.assertTrue(createYourPinText.isDisplayed());
		log.info("Create Your Pin text is Displayed");
		enter_pin();
		soft.assertTrue(confirmYourPinText.isDisplayed());
		log.info("Confirm Your Pin text is Displayed");
		// Entering Wrong pin in Confirm pin Screen
		one.click();
		two.click();
		three.click();
		two.click();
		one.click();
		three.click();
		soft.assertTrue(errorText.isDisplayed() && pinDoNotMatchText.isDisplayed());
		log.info("Error & The pin code do not match text is displayed");
		acceptButton.click();
		enter_pin();
		Thread.sleep(2000);
		soft.assertTrue(almostDoneText.isDisplayed());
		log.info("Almost done message displayed...");
		/* Web Browser Execution Starts */
		webdriver = BaseClass.setDashboardBrowser();
		DashLoginPage dashLoginPage = new DashLoginPage(webdriver);
		dashLoginPage.loginToWebApplication();
		DashHomePage dashHomePage = new DashHomePage(webdriver);
		dashHomePage.navigateToUserSetting();
		DashUsersPage dashUserPage = new DashUsersPage(webdriver);
		soft.assertTrue(dashUserPage.ApproveUserFromDashboard());
		webdriver.close();
		/* Web Browser Execution Closed */
		// closeBtn.click();
		userlist = new UserListPage(driver);
		userlist.getNoButton().click();
		RO_ListPage rolist = new RO_ListPage(driver);
		soft.assertTrue(rolist.getprospects_PageTitle().isDisplayed());
		soft.assertAll();
	}

}
