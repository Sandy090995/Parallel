package flutter.Truvideo.Pages;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import flutter.Truvideo.BaseClass.BaseClass;
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
	
	static String dealerCode;
	
	@AndroidFindBy(accessibility = "Hello there!")
	@iOSXCUITFindBy(accessibility = "Hello there!")
	private WebElement helloThereText;
	
	public WebElement getHelloThereText() {
		return helloThereText;
	}
	
	@AndroidFindBy(accessibility = "Please type your Dealer Code to identify you")
	@iOSXCUITFindBy(accessibility = "Please type your Dealer Code to identify you")
	private WebElement enterDealerCodeMessage;
	
	@AndroidFindBy(xpath="//android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "//*[@type='XCUIElementTypeImage']")
	private WebElement truVideoLogo;
	
	@iOSXCUITFindBy(accessibility = "OK")
	@AndroidFindBy(accessibility = "OK")
	private   WebElement popUpOK;

	@iOSXCUITFindBy(accessibility = "1")
	@AndroidFindBy(accessibility = "1")
	private  WebElement ONE;

	@iOSXCUITFindBy(accessibility = "2")
	@AndroidFindBy(accessibility = "2")
	private  WebElement TWO;

	@iOSXCUITFindBy(accessibility = "3")
	@AndroidFindBy(accessibility = "3")
	private  WebElement THREE;

	@iOSXCUITFindBy(accessibility = "4")
	@AndroidFindBy(accessibility = "4")
	private  WebElement FOUR;

	@iOSXCUITFindBy(accessibility = "5")
	@AndroidFindBy(accessibility = "5")
	private  WebElement FIVE;

	@iOSXCUITFindBy(accessibility = "6")
	@AndroidFindBy(accessibility = "6")
	private  WebElement SIX;

	@iOSXCUITFindBy(accessibility = "7")
	@AndroidFindBy(accessibility = "7")
	private  WebElement SEVEN;

	@iOSXCUITFindBy(accessibility = "8")
	@AndroidFindBy(accessibility = "8")
	private  WebElement EIGHT;

	@iOSXCUITFindBy(accessibility = "9")
	@AndroidFindBy(accessibility = "9")
	private  WebElement NINE;

	@iOSXCUITFindBy(accessibility = "0")
	@AndroidFindBy(accessibility = "0")
	private  WebElement ZERO;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@label,'Something went wrong')]")
	@AndroidFindBy(xpath="//android.view.View[contains(@content-desc,'Something went wrong')]")
	private  WebElement errorMessage;
	
	@iOSXCUITFindBy(accessibility = "Dealer not found")
	@AndroidFindBy(accessibility = "Dealer not found")
	private  WebElement dealerNotFoundMessage;
	
	@iOSXCUITFindBy(accessibility = "OK")
	@AndroidFindBy(accessibility = "OK")
	private  WebElement oKButton;
	
	
	public boolean visibleElements_DealerCodePage() {
		try {
	        if (popUpOK.isDisplayed()) {
	            log.info("PopUp Displayed");
	            popUpOK.click();
	        }
	    } catch (NoSuchElementException e) {
	        log.info("PopUp not present");
	    }
		if(helloThereText.isDisplayed() && enterDealerCodeMessage.isDisplayed() && 
				truVideoLogo.isDisplayed()) {
			log.info("All elements are Present on Dealer Screen");
			return true;
		}else {
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
		if(errorMessage.isDisplayed() && dealerNotFoundMessage.isDisplayed()) {
			log.info("Dealer Not found message is displayed");
			oKButton.click();
			return true;
		}else {
			return false;
		}
	}
	
	public boolean dealerLogin_ValidCredentials() throws Exception {
		navigateToUserListScreen_Order();
		UserListPage userListpage=new UserListPage(driver);
		if(userListpage.getDealerName().isDisplayed())
		{
			log.info("Dealer name is Displayed");
			return true;
		}
		else
		{
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
		log.info("Entering Dealer code");
		if(isAndroid()) {
			String first=TWO.getAttribute("content-desc");
			String second=FOUR.getAttribute("content-desc");
			String third=SEVEN.getAttribute("content-desc");
			String fourth=THREE.getAttribute("content-desc");
			String fifth=ZERO.getAttribute("content-desc");
			String sixth=ONE.getAttribute("content-desc");
			dealerCode=first+second+third+fourth+fifth+sixth;
		}else if(isiOS()) {
			String first=TWO.getAttribute("label");
			String second=FOUR.getAttribute("label");
			String third=SEVEN.getAttribute("label");
			String fourth=THREE.getAttribute("label");
			String fifth=ZERO.getAttribute("label");
			String sixth=ONE.getAttribute("label");
			dealerCode=first+second+third+fourth+fifth+sixth;
		}
		TWO.click();
		FOUR.click();
		SEVEN.click();
		THREE.click();
		ZERO.click();
		ONE.click();
		log.info("Dealer code is entered");
		return new UserListPage(driver);
	}
	
	public boolean salesDealerLogin_ValidCredentials() throws Exception {
		try {
	        if (popUpOK.isDisplayed()) {
	        	Thread.sleep(2000);
	            log.info("PopUp Displayed");
	            popUpOK.click();
	        }
	    } catch (NoSuchElementException e) {
	        log.info("PopUp not present");
	    }
		if(isAndroid()) {
			String first=EIGHT.getAttribute("content-desc");
			String second=ZERO.getAttribute("content-desc");
			String third=TWO.getAttribute("content-desc");
			String fourth=SEVEN.getAttribute("content-desc");
			String fifth=NINE.getAttribute("content-desc");
			String sixth=SEVEN.getAttribute("content-desc");
			dealerCode=first+second+third+fourth+fifth+sixth;
		}else if(isiOS()) {
			String first=EIGHT.getAttribute("label");
			String second=ZERO.getAttribute("label");
			String third=TWO.getAttribute("label");
			String fourth=SEVEN.getAttribute("label");
			String fifth=NINE.getAttribute("label");
			String sixth=SEVEN.getAttribute("label");
			dealerCode=first+second+third+fourth+fifth+sixth;
		}
		log.info("Entering Dealer code");
		EIGHT.click();
		ZERO.click();
		TWO.click();
		SEVEN.click();
		NINE.click();
		SEVEN.click();
		log.info("Sales Dealer code is entered");
		UserListPage userListpage=new UserListPage(driver);
		if(userListpage.getDealerName().isDisplayed())
		{
			log.info("Dealer name is Displayed");
			return true;
		}
		else
		{
			log.info("Dealer name is not displayed");
			return false;
		}
	
	}
	
}

