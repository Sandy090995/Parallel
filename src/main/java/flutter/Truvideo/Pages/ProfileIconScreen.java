package flutter.Truvideo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ProfileIconScreen extends UtilityClass{
   AppiumDriver driver;
	
   public ProfileIconScreen(AppiumDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
   
   @AndroidFindBy(accessibility = "Log out")
   @iOSXCUITFindBy(accessibility = "Log out")
   private WebElement logOut_Button;
   
   @AndroidFindBy(accessibility = "NO")
   @iOSXCUITFindBy(accessibility = "NO")
   private WebElement noButton;
   
   @AndroidFindBy(accessibility = "YES")
   @iOSXCUITFindBy(accessibility = "YES")
   private WebElement yesButton;
   
   @AndroidFindBy(accessibility = "Settings")
   @iOSXCUITFindBy(accessibility = "Settings")
   private WebElement settingsButton;
   
   @AndroidFindBy(accessibility = "Demo-BMW2")
   @iOSXCUITFindBy(accessibility = "Demo-BMW")
   private WebElement dealerName;
   
   @AndroidFindBy(accessibility = "DEMO - Main Street Toyota")
   @iOSXCUITFindBy(accessibility = "DEMO - Main Street Toyota")
   private WebElement serviceSideDealerName;
   
   public WebElement serviceDealerCode() {
		  WebElement dealerCode = null;
		if (isAndroid()) {
			dealerCode = driver.findElement(By.xpath("//android.view.View[@content-desc='" + DealerCodePage.dealerCode + "']"));
		} else if (isiOS()) {
			dealerCode = driver.findElement(By.xpath("//XCUIElementTypeApplication[@label='" + DealerCodePage.dealerCode + "']"));
		}
		return dealerCode;
	}
   
	public WebElement userNameProfileIcon() {
		  WebElement userName = null;
		if (isAndroid()) {
			userName = driver.findElement(By.xpath("//android.view.View[@content-desc='" + UserListPage.userName + "']"));
		} else if (isiOS()) {
			userName = driver.findElement(By.xpath("//XCUIElementTypeApplication[@label='" + UserListPage.userName + "']"));
		}
		return userName;
	}
   
   public WebElement getLogOut_Button() {
	   return logOut_Button;
   }
   
   String userName;
   String loginDealerName;
   String dealerCode;
   public boolean verifyProficeIconScreenDetails()
   {
	   log.info("verifying logged user is showing or not....");
	   if(isAndroid()) {
	 userName= userNameProfileIcon().getAttribute("content-desc");
	   }else if(isiOS()) {
		userName= userNameProfileIcon().getAttribute("label");
	   }
	  if(userName.equalsIgnoreCase(UserListPage.userName))
	  {
		  log.info("Logged user is verified , Showing user is:-"+UserListPage.userName);
	  }
	  else {
		  log.info("User name is not showing correctly");
	  }
	  log.info("Now Verifying Dealer Name....");
	  
	  if(isAndroid()) {
		  loginDealerName=serviceSideDealerName.getAttribute("content-desc");
	  }else if(isiOS()) {
		  loginDealerName=serviceSideDealerName.getAttribute("label"); 
	  }
	  if(loginDealerName.equalsIgnoreCase("DEMO - Main Street Toyota"))
	  {
		  log.info("Delaer Name is verified , Showing Dealer Name is:-"+dealerName);
	  }
	  else {
		  log.info("Dealer name is not showing correctly");
	  }
	  if(isAndroid()) {
		 dealerCode=serviceDealerCode().getAttribute("content-desc");
	  }else if(isiOS()) {
		  dealerCode=serviceDealerCode().getAttribute("label");
	  }

	  if(dealerCode.equalsIgnoreCase(DealerCodePage.dealerCode))
	  {
		  log.info("Delaer Code is verified , Showing Dealer code is:-"+dealerCode);
		  return true;
	  }
	  else {
		  log.info("Dealer Code is not showing correctly");
		  return false;
	  }
	  
   }
   
   public boolean checkNavigationToSettingsScreen() {
	   
	   settingsButton.click();
	   RO_SettingPage settingsScreen = new RO_SettingPage(driver);
		if (settingsScreen.getSettingsLabel().isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
   
   public boolean varifyDealerName()
   {
	   if(dealerName.isDisplayed())
	   {
		   log.info("Changed dealer name is displayed");
		   return true;
	   }else {
		   return false;
	   }
   }

   
   public boolean verifyLogoutButton() throws InterruptedException
   {
	   logOut_Button.click();
	   log.info("Clicked on Logout button :- Logout confirm box is opened");
	   yesButton.click();
	   log.info("Logout process is done :-User navigating on User List page");
	   Thread.sleep(5000);
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



