package flutter.Truvideo.Tests;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.AddProspectPage;

public class AddProspectPageTest extends BaseClass {
	AddProspectPage addProspectPage;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		driver=setUpApplication();
		addProspectPage=loadDealerCodePage().navigateToUserListScreen_Sales()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Sales)
				.NavigateTo_AddProspect_Page();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	//@Test
	public void verifyCancelButton_AddProspectScreen() throws Exception {
		addProspectPage=new AddProspectPage(driver);
		Assert.assertTrue(addProspectPage.checkCancelButton());
	}
	
	@Test(priority = 1)
	public void verifyRequiredFields_ProspectScreen() throws Exception {
		addProspectPage=new AddProspectPage(driver);
		Assert.assertTrue(addProspectPage.checkRequired_Fields());
	}
	
	@Test(priority = 2)
	public void verifyAddNewProspect() throws Exception {
		addProspectPage=new AddProspectPage(driver);
		Assert.assertTrue(addProspectPage.checkCreateProspect());
	}
	
	@Test(dependsOnMethods = "verifyAddNewProspect")
	public void verifyProspectsOnDashboard() throws Exception {
		addProspectPage=new AddProspectPage(driver);
		addProspectPage.verifyCreatedRO_OnDashboard();
	}

}
