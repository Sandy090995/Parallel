package flutter.Truvideo.Tests.Order;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.RO_ListPage;
import flutter.Truvideo.Pages.RO_SettingPage;

public class SettingPageTest_Order extends BaseClass {

	RO_SettingPage settingPage;

	@BeforeClass
	public void setUpTestEnvironment_SuiteLevel() throws Exception {
		if (driver != null && settingPage == null) {
			RO_ListPage roListPage = new RO_ListPage(driver);
			roListPage.Navigate_ToProfileIcon().NavigateToSettingsScreen();
		}
	}

	@BeforeMethod
	public void setUpTestEnvironment_ClassLevel() throws Exception {
		if (driver == null) {
			driver = setUpApplication();
			settingPage = loadDealerCodePage().navigateToUserListScreen_Order()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Order).Navigate_ToProfileIcon()
					.NavigateToSettingsScreen();
		}
		if (settingPage == null) {
			settingPage = new RO_SettingPage(driver);
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
	public void verifyAllElementsOnSettingScreen_Order() throws InterruptedException {
		settingPage.checkElementofSetting();
	}

	@Test(priority = 2)
	public void verifyChangeFontSize_Small_Order() throws InterruptedException {
		Assert.assertTrue(settingPage.checkSmallFont());
	}

	@Test(priority = 3)
	public void verifyChangeFontSize_Large_Order() throws InterruptedException {
		Assert.assertTrue(settingPage.largeFontCheck());
	}

	@Test(priority = 4)
	public void verifyChangeFontSize_Medium_Order() throws InterruptedException {
		Assert.assertTrue(settingPage.meduimFontCheck());
	}

	@Test(priority = 5)
	public void verifyThemeChangeFunction_Order() throws InterruptedException {
		Assert.assertTrue(settingPage.checkTheme());
	}

	@Test(priority = 6)
	public void verifyBiometricConfiguration_Order() throws InterruptedException {
		Assert.assertTrue(settingPage.biometricConfiguration());
	}

	@Test(priority = 7)
	public void verifyChangeDefaultCountry_Order() throws InterruptedException {
		Assert.assertTrue(settingPage.defaultCountry("India"));
	}

	@Test(priority = 8)
	public void verifyChangeCameraQuality_Low_Order() throws InterruptedException {
		Assert.assertTrue(settingPage.lowCameraQuality());
	}

	@Test(priority = 9)
	public void verifyChangeCameraQuality_Medium_Order() throws InterruptedException {
		Assert.assertTrue(settingPage.mediumCameraQuality());
	}

	@Test(priority = 10)
	public void verifyChangeCameraQuality_High_Order() throws InterruptedException {
		Assert.assertTrue(settingPage.highCameraQuality());
		driver.navigate().back();
	}

	// @Test(priority = 11)
	public void verifyDeleteUserFunction_Order() throws InterruptedException {
		Assert.assertTrue(settingPage.deleteUser());
		driver.navigate().back();
	}

}
