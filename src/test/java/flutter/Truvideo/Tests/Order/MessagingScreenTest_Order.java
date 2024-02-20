package flutter.Truvideo.Tests.Order;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.MessagingScreen;

public class MessagingScreenTest_Order extends BaseClass {
	MessagingScreen messageScreen;

	@BeforeMethod
	public void setUp() throws Exception {
		if (driver == null) {
			driver = setUpApplication();
			messageScreen = loadDealerCodePage().navigateToUserListScreen_Order()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Order).Navigate_To_MessageList()
					.navigateToMessagingScreen();
		}
		if (messageScreen == null) {
			messageScreen = new MessagingScreen(driver);
		}
	}

	@AfterMethod
	public void tearDown_OnFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			log.info("Test Case Failed" + result.getMethod().getMethodName());
			driver.quit();
			driver = null;
		}
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
		MessagingScreen messagingScreen = new MessagingScreen(driver);
		messagingScreen.getBackButton().click();
	}

}
