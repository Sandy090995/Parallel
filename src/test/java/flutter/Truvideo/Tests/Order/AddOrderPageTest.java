package flutter.Truvideo.Tests.Order;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.AddOrderPage;

public class AddOrderPageTest extends BaseClass {
	AddOrderPage addOrder;

	@BeforeMethod
	public void setUpTestEnvironment_ClassLevel() throws Exception {
		if (driver == null) {
			driver = setUpApplication();
			addOrder = loadDealerCodePage().navigateToUserListScreen_Order()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Order).NavigateTo_AddOrder_Page();
		}
		if (addOrder == null) {
			addOrder = new AddOrderPage(driver);
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
	public void verifyMandatoryFieldRequiredMessage_OrderCreation() {
		Assert.assertTrue(addOrder.checkErrorMessage());
	}

	@Test(priority = 2)
	public void checkNewOrderCreation() throws Exception {
		Assert.assertTrue(addOrder.checkCreateOrder());
	}

	// @Test(dependsOnMethods = "checkNewOrderCreation")
	public void verifyOrderOnDashboard() throws Exception {
		addOrder.verifyCreatedRO_OnDashboard();
	}
}
