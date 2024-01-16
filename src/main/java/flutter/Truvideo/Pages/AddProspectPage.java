package flutter.Truvideo.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Dashboard.Truvideo.Pages.DashHomePage;
import Dashboard.Truvideo.Pages.DashLoginPage;
import Dashboard.Truvideo.Pages.DashProspectsPage;
import Dashboard.Truvideo.Pages.DashRepairOrderPage;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AddProspectPage extends UtilityClass {

	AppiumDriver driver;
	WebDriver webdriver;
	
	public AddProspectPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public static String orderNumber;
	public static String emailId;
	public static String customerName_InList;
	public static String customerName;
	public static String lastName;
	
	@AndroidFindBy(accessibility = "Add Prospect")
	@iOSXCUITFindBy(accessibility = "Add Prospect")
	private WebElement addProspect_Title;
	
	public WebElement getAddProspect_Title() {
		return addProspect_Title;
	}
	
	@AndroidFindBy(xpath = "//android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	private List<WebElement> textBoxList;
	
	@AndroidFindBy(accessibility = "Required")
	@iOSXCUITFindBy( accessibility= "Required")
	private List<WebElement> required_Message;
	
	@AndroidFindBy(accessibility = "CREATE")
	@iOSXCUITFindBy( accessibility= "CREATE")
	private WebElement createButton;
	
	@AndroidFindBy(accessibility = "CANCEL")
	@iOSXCUITFindBy( accessibility= "CANCEL")
	private WebElement cancelButton;
	
	public boolean checkCancelButton() {
		cancelButton.click();
		RO_ListPage roListPage=new RO_ListPage(driver);
		if(roListPage.getCreateButton().isDisplayed()) {
			log.info("User navigated back to Prospect Screen");
			return true;
		}else {
			log.info("User not able to navigat back to Prospect Screen");
			return false;
		}
	}
	
	public boolean checkRequired_Fields() {
		createButton.click();
		if(required_Message.get(0).isDisplayed()&&required_Message.get(1).isDisplayed()) {
			log.info("Required Fields Messages is Display");
			return true;
		}else {
			log.info("Required Fields Messages is Not Display");
			return false;
		}
	}
	
	
	public boolean checkCreateProspect() throws InterruptedException {
		navigateTOProspectDetails();
		ProspectDetailsPage prospectDetails=new ProspectDetailsPage(driver);
		if(prospectDetails.getProspectDetails_PageTitle().isDisplayed()) {
			log.info("Prospect added successfully");
			return true;
		}else {
			log.info("Prospect not added");
			return false;
		}
	}
	
	public ProspectDetailsPage navigateTOProspectDetails() throws InterruptedException {
		textBoxList.get(0).click();
		textBoxList.get(0).sendKeys("First"+randomString(5));
		String firstName=textBoxList.get(0).getText();
		addProspect_Title.click();
		textBoxList.get(1).click();
		textBoxList.get(1).sendKeys("Last"+randomString(5));
		lastName=textBoxList.get(1).getText();
		customerName=firstName+" "+lastName;
		customerName_InList=lastName+", "+firstName;
		log.info("Custome In List"+ customerName_InList);
		addProspect_Title.click();
		textBoxList.get(2).click();
		textBoxList.get(2).sendKeys("7812059487");
		addProspect_Title.click();
		textBoxList.get(3).click();
		textBoxList.get(3).sendKeys(randomString(5)+"@gmail.com");
		emailId=textBoxList.get(3).getText();
		addProspect_Title.click();
		createButton.click();
		Thread.sleep(3000);
		return new ProspectDetailsPage(driver);
	}
	
	public void verifyCreatedRO_OnDashboard() {
		/*Web Browser Execution Starts*/
		webdriver=BaseClass.setDashboardBrowser();
		DashLoginPage dashLoginPage=new DashLoginPage(webdriver);
		dashLoginPage.loginToWebApplication();
		DashHomePage dashHomePage=new DashHomePage(webdriver);
		dashHomePage.navigateToProspectsList();
		DashProspectsPage dashProspectPage=new DashProspectsPage(webdriver);
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(dashProspectPage.verifyNewlyCreatedProspect());
		soft.assertAll();
		webdriver.close();
		/*Web Browser Execution Closed*/
	}
	
	
	
	

}
