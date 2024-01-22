package flutter.Truvideo.Tests;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.MessagingScreen;

public class MessagingScreenTest_Prospect extends BaseClass {
	MessagingScreen messageScreen;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		driver=setUpApplication();
		messageScreen=loadDealerCodePage().navigateToUserListScreen_Sales()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Sales)
				.Navigate_To_MessageList().navigateToMessagingScreen();
	}
	
	@BeforeMethod
	public void setDriverObject() {
		if(messageScreen==null) {
			messageScreen=new MessagingScreen(driver);
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyDefaultScreenDuringNew_Conversation() {
		Assert.assertTrue(messageScreen.checkDefaultScreenDuringNewConversation());
	}

	@Test(priority = 2)
	public void verifySendMessageFunction() throws InterruptedException {
		Assert.assertTrue(messageScreen.checkSendMessage());
	}

	@Test(priority = 3)
	public void verifyManualConversationStatus() throws InterruptedException {
		messageScreen.checkManualConversationStatus();
	}

	
}
