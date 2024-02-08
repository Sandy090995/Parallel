package flutter.Truvideo.Tests.Order;

import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.ProfileIconScreen;
import flutter.Truvideo.Pages.RO_ListPage;
import flutter.Truvideo.Pages.RO_SettingPage;
import flutter.Truvideo.Pages.SupportPage;

public class ProfileIconScreenTest_Order extends BaseClass {
	ProfileIconScreen profileIconScreen;

	@BeforeClass
	public void setUp() throws Exception {
		if (driver == null) {
			driver = setUpApplication();
			profileIconScreen = loadDealerCodePage().navigateToUserListScreen_Order()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Order).Navigate_ToProfileIcon();
		} else {
			RO_ListPage roListPage = new RO_ListPage(driver);
			roListPage.Navigate_ToProfileIcon();
		}
	}

	@BeforeMethod
	public void setDriverObject() {
		if (profileIconScreen == null) {
			profileIconScreen = new ProfileIconScreen(driver);
		}
	}

	// @AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyUserDetails_Order() {
		Assert.assertTrue(profileIconScreen.verifyProficeIconScreenDetails());
	}

	@Test(priority = 2)
	public void verifyNavigationToSettingScreen_Order() {
		Assert.assertTrue(profileIconScreen.checkNavigationToSettingsScreen());
		RO_SettingPage settingPage = new RO_SettingPage(driver);
		settingPage.getBackArrow().click();
	}

	@Test(priority = 3)
	public void verifyNavigationToSupportScreen_Order() throws InterruptedException {
		RO_ListPage roListPage = new RO_ListPage(driver);
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().navigationToSupportScreen());
		SupportPage supportPage = new SupportPage(driver);
		supportPage.getBackArrowButton().click();
	}

	@Test(priority = 4)
	public void verifySwitchDealerFunction_Order() throws InterruptedException {
		RO_ListPage roListPage = new RO_ListPage(driver);
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().changeDealer("BMW"));
	}

	@Test(priority = 5)
	public void verifySwitchBackToFirstDealer_Order() throws InterruptedException {
		RO_ListPage roListPage = new RO_ListPage(driver);
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().changeDealer("DEMO"));
	}

	@Test(priority = 6)
	public void verifyLogoutFunctionality_Order() throws InterruptedException {
		RO_ListPage roListPage = new RO_ListPage(driver);
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().verifyLogoutButton());
	}

}
