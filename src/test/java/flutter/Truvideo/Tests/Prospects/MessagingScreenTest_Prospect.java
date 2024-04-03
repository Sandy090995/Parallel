package flutter.Truvideo.Tests.Prospects;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.MessagingScreen;

public class MessagingScreenTest_Prospect extends BaseClass {
	MessagingScreen messageScreen;
	
	@BeforeMethod
	public void setUpTestEnvironment_SuiteLevel() throws Exception {
		if(driver==null) {
		driver=setUpApplication();
		messageScreen=loadDealerCodePage().navigateToUserListScreen_Sales()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Sales)
				.Navigate_To_MessageList().navigateToMessagingScreen();
		}
		if(messageScreen==null) {
			messageScreen=new MessagingScreen(driver);
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
