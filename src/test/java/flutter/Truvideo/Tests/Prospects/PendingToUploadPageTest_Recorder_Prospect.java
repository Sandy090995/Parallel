package flutter.Truvideo.Tests.Prospects;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.PendingToUploadPage;
import flutter.Truvideo.Pages.ProspectDetailsPage;

public class PendingToUploadPageTest_Recorder_Prospect extends BaseClass {
	PendingToUploadPage pendingToUploadPage;

	@BeforeClass
	public void setUp() throws Exception {
		if (driver == null) {
			driver = setUpApplication();
			pendingToUploadPage = loadDealerCodePage().navigateToUserListScreen_Sales()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Sales).NavigateTo_AddProspect_Page()
					.navigateTOProspectDetails().Navigate_To_CameraScreen().navigateToProspectDetails_Preview_Recorder()
					.navigateToProspectDetails_Recorder().Navigate_To_PendingToUploadScreen();
		}
		if (driver != null && pendingToUploadPage == null) {
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

	@AfterClass
	public void tearDown_OnFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			driver.quit();
			driver = null;
		}
	}

	// @Test(priority = 1)
	public void verifyVideoCanPlayOnPendingScreen_Recorder_Sales() throws InterruptedException {
		Assert.assertTrue(pendingToUploadPage.checkVideoIsPlaying());
	}

	@Test(priority = 2)
	public void verifyDeleteImage_PendingToUploadScreen_Recorder_Sales() throws InterruptedException {
		Assert.assertTrue(pendingToUploadPage.detailsAndDeleteImage());
	}

	@Test(priority = 3)
	public void verifyChangeVideoTagAndDescription_Recorder_Sales() throws InterruptedException {
		Assert.assertTrue(pendingToUploadPage.changeVideoTagAndDescription());
	}

	@Test(priority = 4)
	public void verifyUploadVideo_Recorder_Sales() throws InterruptedException {
		Assert.assertTrue(pendingToUploadPage.uploadVideo());
	}

	// @Test(dependsOnMethods = "verifyUploadVideo_Recorder_Sales")
	public void verifyUploadedVideos_OnDashboard_Prospects() throws InterruptedException {
		pendingToUploadPage.verifyUploadedVideos_OnDashboard_Prospect();
	}
}
