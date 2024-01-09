package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.AddProspectPage;

public class AddProspectPageTest extends BaseClass {
	AddProspectPage addProspectPage;
	
	@Test
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
