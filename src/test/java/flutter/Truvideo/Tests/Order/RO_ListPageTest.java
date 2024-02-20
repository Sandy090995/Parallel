package flutter.Truvideo.Tests.Order;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.RO_ListPage;

public class RO_ListPageTest extends BaseClass {
	RO_ListPage ro_ListPage;

	@BeforeMethod
	public void setUpTestEnvironment_ClassLevel() throws Exception {
		if (driver == null) {
			driver = setUpApplication();
			ro_ListPage = loadDealerCodePage().navigateToUserListScreen_Order()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Order);
		}
		if (ro_ListPage == null) {
			ro_ListPage = new RO_ListPage(driver);
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
	public void verifyAllFooterTabs_and_HeadersTabs_Order() throws Exception {
		Assert.assertTrue(ro_ListPage.checkAllFooterTab_and_HederTabs());
	}

	@Test(priority = 2)
	public void verifySearchROFunction() throws InterruptedException {
		Assert.assertTrue(ro_ListPage.checkSearchRO_ProspectFunction("764"));
	}

	@Test(priority = 3)
	public void verifyRO_Status_New() throws Exception {
		Assert.assertTrue(ro_ListPage.checkRO_Prospects_Status_New());
	}

	@Test(priority = 4)
	public void verifyRO_Status_Rejected() throws Exception {
		Assert.assertTrue(ro_ListPage.checkRO_Status_Rejected());
	}

	@Test(priority = 5)
	public void verifyRO_Status_All() throws Exception {
		Assert.assertTrue(ro_ListPage.checkRO_Prospects_Status_All());
	}

	@Test(priority = 6)
	public void verifyRO_Status_My() throws Exception {
		Assert.assertTrue(ro_ListPage.checkRO_Status_My());
	}

	@Test(priority = 7)
	public void verifyNavigationTo_Chat_Order() throws InterruptedException {
		Assert.assertTrue(ro_ListPage.checkNavigationTo_Chat());
	}

	@Test(priority = 8)
	public void verifyNavigationTo_Messages_Order() {
		Assert.assertTrue(ro_ListPage.checkNavigationTo_Messages());
	}

	@Test(priority = 9)
	public void verifyNavigationTo_Contacts_Order() {
		Assert.assertTrue(ro_ListPage.checkNavigationTo_Contacts());
	}

	@Test(priority = 10)
	public void verifyNavigation_BackTo_Orders() {
		Assert.assertTrue(ro_ListPage.checkNavigationBackTo_Order());
	}

	@Test(priority = 11)
	public void verifyNavigationToProfileIcon_Order() throws InterruptedException {
		Assert.assertTrue(ro_ListPage.checkNavigationToProfileIcon());
		driver.navigate().back();
	}

	@Test(priority = 12)
	public void verifyNavigationToAddOrderPage() {
		Assert.assertTrue(ro_ListPage.checkNavigationTo_AddOrder_Page());
	}

	// @Test(priority = 15) //Using for selecting first Existing New RO
	public void verifyNavigationFirstNewExistingRODetailsPage() {
		ro_ListPage.navigateToOrderDetail_FirstNew();
	}
}
