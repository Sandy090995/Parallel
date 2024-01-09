package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.ProfileIconScreen;

public class ProfileIconScreenTest extends BaseClass {
	ProfileIconScreen profileIconScreen;
	
	@BeforeMethod
	public void loadProfileIconScreenClass() {
		profileIconScreen=new ProfileIconScreen(driver);
	}
	
	
	@Test
	public void verifyUserDetails()
	{
		Assert.assertTrue(profileIconScreen.verifyProficeIconScreenDetails());
	}
	
	@Test
	public void clickonsettingsButton()
	{
		Assert.assertTrue(profileIconScreen.checkNavigationToSettingsScreen());
	}
	
	@Test
	public void verifyDealerNameSwitchDealer()
	{
		Assert.assertTrue(profileIconScreen.varifyDealerName());
	}
	
	@Test
	public void verifyLogoutFunctionality() throws InterruptedException
	{
		Assert.assertTrue(profileIconScreen.verifyLogoutButton());
	}

}
