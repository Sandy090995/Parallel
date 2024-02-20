package flutter.Truvideo.Tests.Order;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.MessagesListPage;
import flutter.Truvideo.Pages.RO_ListPage;

public class MessagesListPageTest_Order extends BaseClass {

	MessagesListPage messageListPage;

	@BeforeClass
	public void setUpTestEnvironment_SuiteLevel() {
		if (driver != null && messageListPage == null) {
			RO_ListPage roListPage = new RO_ListPage(driver);
			roListPage.Navigate_To_MessageList();
		}
	}

	@BeforeMethod
	public void setUp() throws Exception {
		if (driver == null) {
			driver = setUpApplication();
			messageListPage = loadDealerCodePage().navigateToUserListScreen_Order()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Order).Navigate_To_MessageList();
		}
		if (messageListPage == null) {
			messageListPage = new MessagesListPage(driver);
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
	public void verify_AllActive_Filter_Order() throws InterruptedException {
		Assert.assertTrue(messageListPage.checkFilter_AllActive());
	}

	@Test(priority = 2)
	public void verifyAll_Filter_Order() throws InterruptedException {
		Assert.assertTrue(messageListPage.checkFilter_All());
	}

	// Failed due to issue already logged
	@Test(priority = 3)
	public void verify_MyActive_Filter_Order() throws Exception {
		Assert.assertTrue(messageListPage.checkFilter_My_Active());
	}

	// Failed due to issue already logged
	@Test(priority = 4)
	public void verify_My_Filter_Order() throws Exception {
		Assert.assertTrue(messageListPage.checkFilter_My());
	}

	@Test(priority = 5)
	public void verifyNavigationToMessagingScreen_Order() throws Exception {
		Assert.assertTrue(messageListPage.navigationToMessagingScreen());
	}
}
