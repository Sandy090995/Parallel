package flutter.Truvideo.Tests.Order;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.RO_ListPage;
import flutter.Truvideo.Pages.SupportPage;

public class SupportPageTest_Order extends BaseClass {
	SupportPage supportPage;

	@BeforeClass
	public void setUpTestEnvironment_SuiteLevel() throws Exception {
		if (driver != null && supportPage == null) {
			RO_ListPage roListPage = new RO_ListPage(driver);
			roListPage.Navigate_ToProfileIcon().navigateToSupportPage();
		}
	}

	@BeforeMethod
	public void setUp() throws Exception {
		if (driver == null) {
			driver = setUpApplication();
			supportPage = loadDealerCodePage().navigateToUserListScreen_Order()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Order).Navigate_ToProfileIcon()
					.navigateToSupportPage();
		}
		if (supportPage == null) {
			supportPage = new SupportPage(driver);
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
	public void verifySupportFunctionality_Order() throws InterruptedException {
		Assert.assertTrue(
				supportPage.checkSupportFunctionality("rahul.kapse@5exceptions.com", "7812059487", "Testing Support"));
		driver.navigate().back();
	}

}
