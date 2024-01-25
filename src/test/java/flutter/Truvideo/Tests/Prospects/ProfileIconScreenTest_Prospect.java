package flutter.Truvideo.Tests.Prospects;

import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.ProfileIconScreen;
import flutter.Truvideo.Pages.RO_ListPage;
import flutter.Truvideo.Pages.RO_SettingPage;
import flutter.Truvideo.Pages.SupportPage;

public class ProfileIconScreenTest_Prospect extends BaseClass {
	ProfileIconScreen profileIconScreen;

	@BeforeClass
	public void setUp() throws Exception {
		if (driver == null) {
		driver = setUpApplication();
		profileIconScreen = loadDealerCodePage().navigateToUserListScreen_Sales()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Sales).Navigate_ToProfileIcon();
		}else {
			RO_ListPage roListPage = new RO_ListPage(driver);
			roListPage.Navigate_ToProfileIcon();
		}
		}

	@BeforeMethod
	public void setDriverObject() {
		if(profileIconScreen==null) {
			profileIconScreen=new ProfileIconScreen(driver);
		}
	}
	
	//@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyUserDetails() {
		Assert.assertTrue(profileIconScreen.verifyProficeIconScreenDetails());
	}

	@Test(priority = 2)
	public void clickonsettingsButton() {
		Assert.assertTrue(profileIconScreen.checkNavigationToSettingsScreen());
		RO_SettingPage settingPage = new RO_SettingPage(driver);
		settingPage.getBackArrow().click();
	}

	@Test(priority = 3)
	public void verifyNavigationToSupportScreen() throws InterruptedException {
		RO_ListPage roListPage = new RO_ListPage(driver);
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().navigationToSupportScreen());
		SupportPage supportPage = new SupportPage(driver);
		supportPage.getBackArrowButton().click();
	}
	
	@Test(priority = 4)
	public void verifySwitchDealerFunction() throws InterruptedException{
		RO_ListPage roListPage = new RO_ListPage(driver);
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().changeDealer("BMW"));
	}
	
	@Test(priority = 5)
	public void verifySwitchBackToFirstDealer() throws InterruptedException{
		RO_ListPage roListPage = new RO_ListPage(driver);
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().changeDealer("DEMO"));
	}

	@Test(priority = 6)
	public void verifyLogoutFunctionality() throws InterruptedException {
		RO_ListPage roListPage = new RO_ListPage(driver);
		Assert.assertTrue(roListPage.Navigate_ToProfileIcon().verifyLogoutButton());
	}

}
