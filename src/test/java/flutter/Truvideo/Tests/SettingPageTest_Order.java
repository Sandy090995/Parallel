package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.RO_ListPage;
import flutter.Truvideo.Pages.RO_SettingPage;

public class SettingPageTest_Order extends BaseClass {

	RO_SettingPage settingPage;

	@BeforeClass
	public void setUp() throws Exception {
		if(driver==null) {
		driver=setUpApplication();
		settingPage=loadDealerCodePage().navigateToUserListScreen_Order()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Order).Navigate_ToProfileIcon()
				.NavigateToSettingsScreen();
		}else {
			RO_ListPage roListPage=new RO_ListPage(driver);
			roListPage.Navigate_ToProfileIcon().NavigateToSettingsScreen();
		}
	}
	
	@BeforeMethod
	public void setDriverObject() {
		if (settingPage == null) {
			settingPage = new RO_SettingPage(driver);
		}
	}
	
	//@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyAllElementsOnSettingScreen() throws InterruptedException {
		settingPage.checkElementofSetting();
	}

	@Test(priority = 2)
	public void verifyChangeFontSize_Small() throws InterruptedException {
		Assert.assertTrue(settingPage.checkSmallFont());
	}

	@Test(priority = 3)
	public void verifyChangeFontSize_Large() throws InterruptedException {
		Assert.assertTrue(settingPage.largeFontCheck());
	}

	@Test(priority = 4)
	public void verifyChangeFontSize_Medium() throws InterruptedException {
		Assert.assertTrue(settingPage.meduimFontCheck());
	}

	@Test(priority = 5)
	public void verifyThemeChangeFunction() throws InterruptedException {
		Assert.assertTrue(settingPage.checkTheme());
	}

	@Test(priority = 6)
	public void verifyBiometricConfiguration() throws InterruptedException {
		Assert.assertTrue(settingPage.biometricConfiguration());
	}

	@Test(priority = 7)
	public void verifyChangeDefaultCountry() throws InterruptedException {
		Assert.assertTrue(settingPage.defaultCountry("India"));
	}

	@Test(priority = 8)
	public void verifyChangeCameraQuality_Low() throws InterruptedException {
		Assert.assertTrue(settingPage.lowCameraQuality());
	}

	@Test(priority = 9)
	public void verifyChangeCameraQuality_Medium() throws InterruptedException {
		Assert.assertTrue(settingPage.mediumCameraQuality());
	}

	@Test(priority = 10)
	public void verifyChangeCameraQuality_High() throws InterruptedException {
		Assert.assertTrue(settingPage.highCameraQuality());
		driver.navigate().back();
	}

	//@Test(priority = 11)
	public void verifyDeleteUserFunction() throws InterruptedException {
		Assert.assertTrue(settingPage.deleteUser());
		driver.navigate().back();
	}

}
