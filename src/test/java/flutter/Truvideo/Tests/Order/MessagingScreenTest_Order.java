package flutter.Truvideo.Tests.Order;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.MessagingScreen;

public class MessagingScreenTest_Order extends BaseClass {
	MessagingScreen messageScreen;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		if(driver==null) {
		driver=setUpApplication();
		messageScreen=loadDealerCodePage().navigateToUserListScreen_Order()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Order)
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
	public void verifyDefaultScreenDuringNew_Conversation_Order() {
		Assert.assertTrue(messageScreen.checkDefaultScreenDuringNewConversation());
	}

	@Test(priority = 2)
	public void verifySendMessageFunction_Order() throws InterruptedException {
		Assert.assertTrue(messageScreen.checkSendMessage());
	}

	@Test(priority = 3)
	public void verifyManualConversationStatus_Order() throws InterruptedException {
		messageScreen.checkManualConversationStatus();
		driver.navigate().back();
	}

	
}
