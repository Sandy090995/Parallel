package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.RO_SettingPage;

public class RO_SettingPageTest extends BaseClass {
	
	RO_SettingPage settingPage;
	
	@BeforeMethod
	public void loadSettingPageClass()
	{
		settingPage=new RO_SettingPage(driver);
	}
	
	@Test(priority = -1)
	public void checkSettingModel() throws InterruptedException
	{
						settingPage.checkElementofSetting();
	}
	
	@Test(priority = 0)
	public void checkSmallFont() throws InterruptedException
	{
				Assert.assertTrue(settingPage.checkSmallFont());
	}
	@Test(priority = 1)
	public void checkLargeFont() throws InterruptedException
	{
				Assert.assertTrue(settingPage.largeFontCheck());
	}
	@Test(priority = 2)
	public void checkMediumFont() throws InterruptedException
	{
				Assert.assertTrue(settingPage.meduimFontCheck());
	}
	
	@Test(priority = 3)
	public void checkThemeMode() throws InterruptedException
	{
				Assert.assertTrue(settingPage.checkTheme());
	}

	@Test(priority = 4)
	public void biometricConfiguration() throws InterruptedException
	{
		settingPage.biometricConfiguration();
	}
	
	@Test (priority = 5)
	public void checkingCountryDopdown() throws InterruptedException
	{
		Assert.assertTrue(settingPage.defaultCountry("India"));
	}

	@Test(priority = 11)
	public void checkingLowCamQuality() throws InterruptedException
	{
		Assert.assertTrue(settingPage.lowCameraQuality());
	}
	
	@Test(priority = 12)
	public void checkingMediumCamQuality() throws InterruptedException
	{
		Assert.assertTrue(settingPage.mediumCameraQuality());
	}
	
	@Test(priority = 13)
	public void checkingHighCamQuality() throws InterruptedException
	{
		Assert.assertTrue(settingPage.highCameraQuality());
	}
	
	@Test(priority = 15)
	public void verifyDeleteUser() throws InterruptedException
	{
		Assert.assertTrue(settingPage.deleteUser());
	}
	
	
}

