package flutter.Truvideo.Tests.Prospects;

import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.RO_ListPage;
import flutter.Truvideo.Pages.SupportPage;

public class SupportPageTest_Prospect extends BaseClass {
	SupportPage supportPage;

	@BeforeClass
	public void setUp() throws Exception {
		if (driver == null) {
			driver = setUpApplication();
			supportPage = loadDealerCodePage().navigateToUserListScreen_Sales()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Sales).Navigate_ToProfileIcon()
					.navigateToSupportPage();
		} else {
			RO_ListPage roListPage = new RO_ListPage(driver);
			roListPage.Navigate_ToProfileIcon().navigateToSupportPage();
		}
	}

	@BeforeMethod
	public void setDriverObject() {
		if (supportPage == null) {
			supportPage = new SupportPage(driver);
		}
	}

	//@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void verifySupportFunctionality() throws InterruptedException {
		Assert.assertTrue(
				supportPage.checkSupportFunctionality("rahul.kapse@5exceptions.com", "7812059487", "Testing Support"));
	}

}
