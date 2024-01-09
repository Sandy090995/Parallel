package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.ProspectDetailsPage;

public class PropsectDetailsPageTest extends BaseClass {
	ProspectDetailsPage prospectDetails;
	
	@Test(priority = 1)
	public void verifyVariousFields_ProspectDetails() {
		prospectDetails=new ProspectDetailsPage(driver);
		Assert.assertTrue(prospectDetails.checkAllImportantTextsArePresent());
	}
	
	//need to call in editRO.xml
	@Test
	public void verifyNavigationToEditProspect() throws InterruptedException {
		prospectDetails=new ProspectDetailsPage(driver);
		Assert.assertTrue(prospectDetails.checkNavigation_EditProspect());
	}
	
	@Test
	public void verifyNavigationToCameraScreen() throws InterruptedException {
		prospectDetails=new ProspectDetailsPage(driver);
		Assert.assertTrue(prospectDetails.checkNavigation_To_CameraScreen());
	}
	
	@Test
	public void verifyNavigationToMessages() throws InterruptedException {
		prospectDetails=new ProspectDetailsPage(driver);
		Assert.assertTrue(prospectDetails.checkNavigation_To_Messages());
	}
	
	@Test
	public void verifyCheck_UncheckVideoFunction() throws InterruptedException {
		prospectDetails=new ProspectDetailsPage(driver);
		Assert.assertTrue(prospectDetails.check_UncheckButton_Function());
	}
	
	@Test
	public void verifyNavigationToPendingToUpload() throws InterruptedException {
		prospectDetails=new ProspectDetailsPage(driver);
		Assert.assertTrue(prospectDetails.checkNavigation_PendingToUploadScreen());
	}

}
