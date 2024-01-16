package flutter.Truvideo.Tests;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.MessagingScreen;

public class MessagingScreenTest_Order extends BaseClass {
	MessagingScreen messageScreen;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		driver=setUpApplication();
		messageScreen=loadDealerCodePage().navigateToUserListScreen_Order()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Order)
				.Navigate_To_MessageList().navigateToMessagingScreen();
	}
	
	@Override
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyDefaultScreenDuringNew_Conversation() {
		messageScreen = new MessagingScreen(driver);
		Assert.assertTrue(messageScreen.checkDefaultScreenDuringNewConversation());
	}

	@Test(priority = 2)
	public void verifySendMessageFunction() throws InterruptedException {
		messageScreen = new MessagingScreen(driver);
		Assert.assertTrue(messageScreen.checkSendMessage());
	}

	@Test(priority = 3)
	public void verifyManualConversationStatus() throws InterruptedException {
		messageScreen = new MessagingScreen(driver);
		messageScreen.checkManualConversationStatus();
	}

	
}
