package flutter.Truvideo.Tests;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.AddOrderPage;

public class AddOrderPageTest extends  BaseClass{
	AddOrderPage addOrder;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		if(driver==null) {
		driver=setUpApplication();
		addOrder=loadDealerCodePage().navigateToUserListScreen_Order()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Order)
				.NavigateTo_AddOrder_Page();
		}
	}
	
	@BeforeMethod
	public void setDriverObject() {
		if(addOrder==null) {
		addOrder=new AddOrderPage(driver);
		}
	}
	
	//@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void verifyMandatoryFieldRequiredMessage() {
		Assert.assertTrue(addOrder.checkErrorMessage());
	}
	
	@Test(priority = 2)
	public void checkNewOrderCreation() throws Exception {
		Assert.assertTrue(addOrder.checkCreateOrder());
	}
	
	@Test(dependsOnMethods = "checkNewOrderCreation")
	public void verifyOrderOnDashboard() throws Exception {
		addOrder.verifyCreatedRO_OnDashboard();
	}
}
