package flutter.Truvideo.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import Dashboard.Truvideo.Pages.DashHomePage;
import Dashboard.Truvideo.Pages.DashLoginPage;
import Dashboard.Truvideo.Pages.DashRepairOrderPage;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AddOrderPage extends UtilityClass{
	AppiumDriver driver;
	WebDriver webdriver;
	
	public AddOrderPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public static String orderNumber;
	public static String advisorName;
	public static String emailId;
	
	
	@AndroidFindBy(accessibility = "Add Order")
	@iOSXCUITFindBy(accessibility = "Add Order")
	private WebElement addOrder_Title;
	
	public WebElement getAddOrder_Title() {
		return addOrder_Title;
	}
	
	@AndroidFindBy(accessibility = "Add Prospect")
	@iOSXCUITFindBy(accessibility = "Add Prospect")
	private WebElement addProspect_Title;
	
	public WebElement getAddProspect_Title() {
		return addProspect_Title;
	}
	
	
	
	@AndroidFindBy(accessibility = "CANCEL")
	@iOSXCUITFindBy(accessibility = "CANCEL")
	private WebElement cancelButton;
	
	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	@AndroidFindBy(xpath = "//android.widget.EditText[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[1]")
	private WebElement order_textBox;
	
	@AndroidFindBy(xpath="//android.view.View[7]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@index='8']")
	private WebElement advisor_DropDown;
	
	@AndroidFindBy(accessibility = "Advisor")
	@iOSXCUITFindBy(accessibility = "Advisor")
	private WebElement advisor_Title;
	
	//@AndroidFindBy(xpath = "//android.widget.EditText")
	//@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@index='3']")
	//private WebElement searchBox_advisor;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Disha Gupta')]")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@label,'Disha')]")
	private WebElement DishaGupta_advisor;
	
	public WebElement Searched_Advisor(String advisorName) {
		if(isAndroid()) {
     return driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'"+advisorName+"')]"));
		}else {
			return driver.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@label,'"+advisorName+"')]"));	
		}
	}
	
	@AndroidFindBy(xpath="//android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@index='3']")
	private WebElement advisor_SearchBox;
	
	@AndroidFindBy(xpath="//android.widget.EditText[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[2]")
	private WebElement firstName_textBox;
	
	@AndroidFindBy(xpath="//android.widget.EditText[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[3]")
	private WebElement lastName_textBox;
	
	@AndroidFindBy(xpath="//android.widget.Button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton")
	private WebElement country_DropDown;
	
	@AndroidFindBy(xpath="//android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	private WebElement country_SearchBar;
	
	@AndroidFindBy(accessibility = "//android.widget.ImageView[contains(@content-desc,'United States')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='United States 1']")
	private WebElement unitedState;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[4]")
	private WebElement mobileTextBox;
	
	@AndroidFindBy(xpath="//android.widget.EditText[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[4]")
	private WebElement mobileNumber_enter;
	
	@AndroidFindBy(xpath="//android.widget.EditText[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[5]")
	private WebElement eMail_textBox;
	
	@AndroidFindBy(xpath="//android.widget.EditText[5]")//Changed Dated 26/06/23
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[5]")
	private WebElement eMail_textBox1;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[5]")
	private WebElement email_enter;
	
	@AndroidFindBy(accessibility = "Do not send video directly to customer")
	@iOSXCUITFindBy(accessibility = "Do not send video directly to customer")
	private WebElement checkBox_DoNotSendDirectly;
	
	@AndroidFindBy(accessibility = "CREATE")
	@iOSXCUITFindBy(accessibility = "CREATE")
	private WebElement createButton;
	
	@AndroidFindBy(xpath="(//android.view.View[@content-desc=\"Required\"])[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Required\"])[1]")
	private WebElement required_order;
	
	@AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Required\"])[2]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Required\"])[2]")
	private WebElement required_advisor;
	
	@AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Required\"])[3]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Required\"])[3]")
	private WebElement required_firstName;
	
	@AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Required\"])[4]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Required\"])[4]")
	private WebElement required_lastName;
	
	
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView//android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeOther")
	private List<WebElement> ro_ID;
	
	public boolean checkErrorMessage() {
		createButton.click();
		if(required_order.isDisplayed()&&required_advisor.isDisplayed()&&required_firstName.isDisplayed()
				&&required_lastName.isDisplayed()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean checkCreateOrder() throws Exception {
		CreateNewRO_NavigateToRODetail();
		OrderDetailsPage orderDetails=new OrderDetailsPage(driver);
		String roNumber=ro_ID.get(0).getText();
		System.out.println("New RO number is :-"+roNumber);
		if(orderDetails.getStatus_New().isDisplayed()) {
			log.info("New Ro Created Successfully");
			return true;
		}else {
			log.info("New Ro Creation Unsuccessfull");
			return false;
		}
	}
	
	public OrderDetailsPage CreateNewRO_NavigateToRODetail() throws Exception {
		Thread.sleep(2000);
		order_textBox.click();
		order_textBox.sendKeys("RO"+randomNumber());
		orderNumber =order_textBox.getText();
		advisor_DropDown.click();
		Thread.sleep(2000);
		advisor_Title.click();//hiding keyboard
		advisor_SearchBox.click();//need to delete in next build
		advisor_SearchBox.sendKeys("Sandip Advisor");
		advisorName=advisor_SearchBox.getText();
		Searched_Advisor(advisorName).click();
		//DishaGupta_advisor.click();
		Thread.sleep(2000);
		firstName_textBox.click();
		firstName_textBox.sendKeys("First"+randomString(5));
		addOrder_Title.click();//hiding keyboard	
		lastName_textBox.click();
		lastName_textBox.sendKeys("Last"+randomString(5));
		addOrder_Title.click();//hiding keayboard
		//country_DropDown.click();
		//country_SearchBar.sendKeys("united");
		//unitedState.click();
		mobileTextBox.click();
		//mobileTextBox.sendKeys("7812059487");
		mobileNumber_enter.sendKeys("7812059487");
		addOrder_Title.click();//hiding keayboard
		if(eMail_textBox.getText().equals("")) {
			eMail_textBox.click();
			email_enter.sendKeys(randomString(5)+"abc"+"@gmail.com");
			emailId=email_enter.getText();
		}else {
			eMail_textBox1.click();
			email_enter.sendKeys(randomString(5)+"abc"+"@gmail.com");
			emailId=email_enter.getText();
		}
		addOrder_Title.click();//hiding keayboard
		createButton.click();
		Thread.sleep(15000);
		return new OrderDetailsPage(driver);
	}
	
	public void verifyCreatedRO_OnDashboard() {
		/*Web Browser Execution Starts*/
		webdriver=BaseClass.setDashboardBrowser();
		DashLoginPage dashLoginPage=new DashLoginPage(webdriver);
		dashLoginPage.loginToWebApplication();
		DashHomePage dashHomePage=new DashHomePage(webdriver);
		dashHomePage.navigateToRepairOrderList();
		DashRepairOrderPage dashRepairOrderPage=new DashRepairOrderPage(webdriver);
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(dashRepairOrderPage.verifyNewlyCreatedRO());
		soft.assertAll();
		webdriver.close();
		/*Web Browser Execution Closed*/
	}
	
}
