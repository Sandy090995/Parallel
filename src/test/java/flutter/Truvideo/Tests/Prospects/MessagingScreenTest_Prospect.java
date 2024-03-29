package flutter.Truvideo.Tests.Prospects;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.MessagingScreen;

public class MessagingScreenTest_Prospect extends BaseClass {
	MessagingScreen messageScreen;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		if(driver==null) {
		driver=setUpApplication();
		messageScreen=loadDealerCodePage().navigateToUserListScreen_Sales()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Sales)
				.Navigate_To_MessageList().navigateToMessagingScreen();
		}
	}
	
	@BeforeMethod
	public void setDriverObject() {
		if(messageScreen==null) {
			messageScreen=new MessagingScreen(driver);
		}
	}
	
	//@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyDefaultScreenDuringNew_Conversation_Sales() {
		Assert.assertTrue(messageScreen.checkDefaultScreenDuringNewConversation());
	}

	@Test(priority = 2)
	public void verifySendMessageFunction_Sales() throws InterruptedException {
		Assert.assertTrue(messageScreen.checkSendMessage());
	}

	@Test(priority = 3)
	public void verifyManualConversationStatus_Sales() throws InterruptedException {
		messageScreen.checkManualConversationStatus();
		MessagingScreen messagingScreen=new MessagingScreen(driver);
		messagingScreen.getBackButton().click();
	}

	
}
