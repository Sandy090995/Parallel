package flutter.Truvideo.Tests;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.EditOrder_ProspectPage;

public class Edit_ProspectPageTest extends BaseClass{
	EditOrder_ProspectPage editPage;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		driver=setUpApplication();
		editPage=loadDealerCodePage().navigateToUserListScreen_Sales()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Sales)
				.NavigateTo_AddProspect_Page().navigateTOProspectDetails()
				.Navigate_To_EditProspect();
	}
	
	@BeforeMethod
	public void setDriverObject() {
		if(editPage==null) {
			editPage=new EditOrder_ProspectPage(driver);
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void verifyEditProspectFunction() throws InterruptedException {
		editPage=new EditOrder_ProspectPage(driver);
		Assert.assertTrue(editPage.editProspect());
	}

}
