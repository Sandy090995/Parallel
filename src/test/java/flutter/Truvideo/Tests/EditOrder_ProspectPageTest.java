package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.EditOrder_ProspectPage;

public class EditOrder_ProspectPageTest extends BaseClass{
	EditOrder_ProspectPage editPage;
	
	@Test(priority = 1)
	public void verifyFleetCustomerFunction() {
		editPage=new EditOrder_ProspectPage(driver);
		Assert.assertTrue(editPage.checkFleetCustomerFunction());
	}
	
	@Test(priority = 2)
	public void verifyEditOrderFunction() throws InterruptedException {
		editPage=new EditOrder_ProspectPage(driver);
		Assert.assertTrue(editPage.editOrder());
	}
	
	@Test
	public void verifyEditProspectFunction() throws InterruptedException {
		editPage=new EditOrder_ProspectPage(driver);
		Assert.assertTrue(editPage.editProspect());
	}

}
