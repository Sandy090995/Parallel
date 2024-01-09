package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.AddOrderPage;

public class AddOrderPageTest extends  BaseClass{
	AddOrderPage addOrder;
	
	@Test(priority = 1)
	public void verifyMandatoryFieldRequiredMessage() {
		addOrder=new AddOrderPage(driver);
		Assert.assertTrue(addOrder.checkErrorMessage());
	}
	
	
	@Test(priority = 2)
	public void checkNewOrderCreation() throws Exception {
		addOrder = new AddOrderPage(driver);
		Assert.assertTrue(addOrder.checkCreateOrder());
	}
	
	@Test(dependsOnMethods = "checkNewOrderCreation")
	public void verifyOrderOnDashboard() throws Exception {
		addOrder = new AddOrderPage(driver);
		addOrder.verifyCreatedRO_OnDashboard();
	}
	
	/*
	 * @Test(priority = 3) public void countryDropdowncheckinRO() throws Exception {
	 * addOrder = new AddOrderPage(driver); addOrder.checkCounrtydropdown(); }
	 */
	 
	 
	 
	
}
