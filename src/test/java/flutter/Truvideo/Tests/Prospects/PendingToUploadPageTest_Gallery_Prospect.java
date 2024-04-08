package flutter.Truvideo.Tests.Prospects;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.PendingToUploadPage;
import flutter.Truvideo.Pages.ProspectDetailsPage;

public class PendingToUploadPageTest_Gallery_Prospect extends BaseClass {
	PendingToUploadPage pendingToUploadPage;
	
	@BeforeClass
	public void setUpTestEnvironment_SuiteLevel() throws Exception {
		if (driver == null) {
			driver = setUpApplication();
			pendingToUploadPage = loadDealerCodePage().navigateToUserListScreen_Sales()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Sales).NavigateTo_AddProspect_Page()
					.navigateTOProspectDetails().Navigate_To_CameraScreen().navigateToVideoPreviewScreen_Gallery()
					.navigateToProspectDetails().Navigate_To_PendingToUploadScreen();
		} 

		if(driver !=null && pendingToUploadPage==null){
			ProspectDetailsPage prospectDetails = new ProspectDetailsPage(driver);
			prospectDetails.Navigate_To_PendingToUploadScreen();
		}
	}

	@BeforeMethod
	public void setDriverObject() {
		if (pendingToUploadPage == null) {
			pendingToUploadPage = new PendingToUploadPage(driver);
		}
	}

	//@AfterClass
	public void tearDown_OnFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			driver.quit();
			driver = null;
		}
	}

	// @Test(priority = 1)
	public void verifyVideoCanPlayOnPendingScreen_Gallery_Sales() throws InterruptedException {
		Assert.assertTrue(pendingToUploadPage.checkVideoIsPlaying());
	}

	@Test(priority = 2)
	public void verifyDeleteImage_PendingToUploadScreen_Gallery_Sales() throws InterruptedException {
		Assert.assertTrue(pendingToUploadPage.detailsAndDeleteImage());
	}
	
	@Test(priority = 3)
	public void verifyChangeVideoTagAndDescription_Gallery_Sales() throws InterruptedException {
		Assert.assertTrue(pendingToUploadPage.changeVideoTagAndDescription());
	}

	@Test(priority = 4)
	public void verifyUploadVideo_Gallery_Sales() throws InterruptedException {
		Assert.assertTrue(pendingToUploadPage.uploadVideo());
		driver.navigate().back();
	}
	
	//@Test(dependsOnMethods = "verifyUploadVideo_Gallery_Sales")
	public void verifyUploadedVideos_Gallery_OnDashboard_Sales() throws InterruptedException {
		pendingToUploadPage.verifyUploadedVideos_OnDashboard_Prospect();
	}

}
