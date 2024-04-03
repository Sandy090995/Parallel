package flutter.Truvideo.Tests.Order;

import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.EditOrder_ProspectPage;

public class Edit_OrderPageTest extends BaseClass{
	EditOrder_ProspectPage editPage;
	
	@BeforeClass
	public void setUpTestEnvironment_ClassLevel() throws  Exception {
		if(driver==null) {
		driver=setUpApplication();
		editPage=loadDealerCodePage().navigateToUserListScreen_Order()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Order)
				.NavigateTo_AddOrder_Page().CreateNewRO_NavigateToRODetail()
				.Navigate_To_EditRO();
		}
	}
	
	@BeforeMethod
	public void setDriverObject() {
		if(editPage==null) {
			editPage=new EditOrder_ProspectPage(driver);
		}
	}
	
	//@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void verifyFleetCustomerFunction() {
		Assert.assertTrue(editPage.checkFleetCustomerFunction());
	}
	
	@Test(priority = 2)
	public void verifyEditOrderFunction() throws InterruptedException {
		Assert.assertTrue(editPage.editOrder());
	}
	
}
