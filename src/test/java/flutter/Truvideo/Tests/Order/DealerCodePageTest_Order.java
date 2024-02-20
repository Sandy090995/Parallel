package flutter.Truvideo.Tests.Order;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.DealerCodePage;
import flutter.Truvideo.Pages.UserListPage;

public class DealerCodePageTest_Order extends BaseClass {
	DealerCodePage dealerCodePage;
	UserListPage userListPage;

	@BeforeMethod
	public void setUpTestEnvironment_ClassLevel() throws Exception {
		if (driver == null) {
			driver = setUpApplication();
			dealerCodePage = loadDealerCodePage();
		}
		if (dealerCodePage == null) {
			dealerCodePage = new DealerCodePage(driver);
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
	public void verifyInstallationOfTruVideoApplication() {
		Assert.assertTrue(dealerCodePage.applicationInstall_dealerCodePageLoad());
	}

	@Test(priority = 2)
	public void verifyAllVisibleText_LogoIsDisplayed_DealerCodePage_Order() {
		Assert.assertTrue(dealerCodePage.visibleElements_DealerCodePage());
	}

	@Test(priority = 3)
	public void verifyLogin_InValidDealerCode_Order() throws InterruptedException {
		Assert.assertTrue(dealerCodePage.dealerLogin_InvalidCredentials());
	}

	@Test(priority = 4)
	public void verifyLogin_ValidDealerCode_Order() throws Exception {
		Assert.assertTrue(dealerCodePage.dealerLogin_ValidCredentials());
	}
}
