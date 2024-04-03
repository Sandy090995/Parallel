package flutter.Truvideo.Tests.Order;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.ChatListPage;
import flutter.Truvideo.Pages.RO_ListPage;

public class ChatListPageTest_Order extends BaseClass {
	ChatListPage chatlistpage;

	@BeforeClass
	public void setUpTestEnvironment_SuiteLevel() throws Exception {
		if (driver != null && chatlistpage == null) {
			RO_ListPage roListPage = new RO_ListPage(driver);
			roListPage.Navigate_To_Chat();
		}
	}

	@BeforeMethod
	public void setUp() throws Exception {
		if (driver == null) {
			driver = setUpApplication();
			chatlistpage = loadDealerCodePage().navigateToUserListScreen_Order()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Order).Navigate_To_Chat();
		}
		if (chatlistpage == null) {
			chatlistpage = new ChatListPage(driver);
		}
	}

	@AfterMethod
	public void tearDown_OnFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			driver.quit();
			driver = null;
		}
	}

	@Test(priority = 1)
	public void verifyNavigationToChatScreen_Order() throws InterruptedException {
		Assert.assertTrue(chatlistpage.navigationToChatScreen());
	}

	@Test(priority = 2)
	public void verifySendMessage_ChatScreen_Order() throws InterruptedException {
		Assert.assertTrue(chatlistpage.checkSendMessage());
	}

	@Test(priority = 3)
	public void verifyCallingFunction_ChatScreen_Order() throws InterruptedException {
		Assert.assertTrue(chatlistpage.checkCallingFunction());
	}

	@Test(priority = 4)
	public void verifyCreateChat_Function_Order() throws InterruptedException {
		Assert.assertTrue(chatlistpage.checkCreateChat_Function("DEFAULT USER"));

	}

	@Test(priority = 5)
	public void verifySearchChat_Function_Order() throws InterruptedException {
		Assert.assertTrue(chatlistpage.searchChat_Function("DEFAULT USER"));
	}

}
