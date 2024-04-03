package flutter.Truvideo.Tests.Order;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.DealerCodePage;
import flutter.Truvideo.Pages.ProfileIconScreen;
import flutter.Truvideo.Pages.RO_ListPage;
import flutter.Truvideo.Pages.RO_SettingPage;
import flutter.Truvideo.Pages.SupportPage;

public class ProfileIconScreenTest_Order extends BaseClass {
	ProfileIconScreen profileIconScreen;
	RO_ListPage roListPage;

	@BeforeClass
	public void setUpTestEnvironment_SuiteLevel() throws Exception {
		if (driver != null && roListPage == null) {
			roListPage = new RO_ListPage(driver);
		}
	}

	@BeforeMethod
	public void setUpTestEnvironment_ClassLevel() throws Exception {
		if (driver == null) {
			driver = setUpApplication();
			roListPage = loadDealerCodePage().navigateToUserListScreen_Order()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Order);
		}
		if (profileIconScreen == null) {
			profileIconScreen = new ProfileIconScreen(driver);
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
	public void verifyUserDetails_Order() throws InterruptedException {
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().verifyProficeIconScreenDetails());
		driver.navigate().back();
	}

	@Test(priority = 2)
	public void verifyNavigationToSettingScreen_Order() throws InterruptedException {
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().checkNavigationToSettingsScreen());
		RO_SettingPage settingPage = new RO_SettingPage(driver);
		settingPage.getBackArrow().click();
	}

	@Test(priority = 3)
	public void verifyNavigationToSupportScreen_Order() throws InterruptedException {
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().navigationToSupportScreen());
		SupportPage supportPage = new SupportPage(driver);
		supportPage.getBackArrowButton().click();
	}

	@Test(priority = 4)
	public void verifySwitchDealerFunction_Order() throws InterruptedException {
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().changeDealer("BMW"));
	}

	@Test(priority = 5)
	public void verifySwitchBackToFirstDealer_Order() throws InterruptedException {
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().changeDealer(DealerCodePage.dealerName));
	}

	@Test(priority = 6)
	public void verifyLogoutFunctionality_Order() throws InterruptedException {
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().verifyLogoutButton());
	}

}
