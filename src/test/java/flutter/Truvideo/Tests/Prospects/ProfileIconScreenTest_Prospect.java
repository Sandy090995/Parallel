package flutter.Truvideo.Tests.Prospects;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.DealerCodePage;
import flutter.Truvideo.Pages.ProfileIconScreen;
import flutter.Truvideo.Pages.RO_ListPage;
import flutter.Truvideo.Pages.RO_SettingPage;
import flutter.Truvideo.Pages.SupportPage;

public class ProfileIconScreenTest_Prospect extends BaseClass {
	ProfileIconScreen profileIconScreen;
	RO_ListPage roListPage;

	@BeforeMethod
	public void setUpTestEnvironment_SuiteLevel() throws Exception {
		if (driver != null && roListPage == null) {
			roListPage = new RO_ListPage(driver);
		}
	}

	@BeforeMethod
	public void setUpTestEnvironment_ClassLevel() throws Exception {
		if (driver == null) {
			driver = setUpApplication();
			roListPage = loadDealerCodePage().navigateToUserListScreen_Sales()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Sales);
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
	public void verifyUserDetails_Sales() throws InterruptedException {
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().verifyProficeIconScreenDetails());
		driver.navigate().back();
	}

	@Test(priority = 2)
	public void clickonsettingsButton_Sales() throws InterruptedException {
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().checkNavigationToSettingsScreen());
		RO_SettingPage settingPage = new RO_SettingPage(driver);
		settingPage.getBackArrow().click();
	}

	@Test(priority = 3)
	public void verifyNavigationToSupportScreen_Sales() throws InterruptedException {
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().navigationToSupportScreen());
		SupportPage supportPage = new SupportPage(driver);
		supportPage.getBackArrowButton().click();
	}

	@Test(priority = 4)
	public void verifySwitchDealerFunction_Sales() throws InterruptedException {
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().changeDealer("BMW"));
	}

	@Test(priority = 5)
	public void verifySwitchBackToFirstDealer_Sales() throws InterruptedException {
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().changeDealer(DealerCodePage.dealerName));
	}

	@Test(priority = 6)
	public void verifyLogoutFunctionality_Sales() throws InterruptedException {
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().verifyLogoutButton());
	}

}
