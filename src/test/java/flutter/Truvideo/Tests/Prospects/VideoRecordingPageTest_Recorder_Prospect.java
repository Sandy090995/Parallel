package flutter.Truvideo.Tests.Prospects;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.RO_ListPage;
import flutter.Truvideo.Pages.VideoPreviewScreen;
import flutter.Truvideo.Pages.VideoRecordingPage;

public class VideoRecordingPageTest_Recorder_Prospect extends BaseClass {
	VideoRecordingPage videoRecordingPage;
	VideoPreviewScreen videoPreviewScreen;

	@BeforeClass
	public void setUp() throws Exception {
		if (driver == null) {
			driver = setUpApplication();
			videoRecordingPage = loadDealerCodePage().navigateToUserListScreen_Sales()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Sales).NavigateTo_AddProspect_Page()
					.navigateTOProspectDetails().Navigate_To_CameraScreen();
		} 
		if(driver != null && videoRecordingPage == null) {
			RO_ListPage rolistPage = new RO_ListPage(driver);
			rolistPage.NavigateTo_AddProspect_Page().navigateTOProspectDetails()
			.Navigate_To_CameraScreen();
		}
	}

	@BeforeMethod
	public void setDriverObject() {
		if (videoRecordingPage == null) {
			videoRecordingPage = new VideoRecordingPage(driver);
		}
		videoPreviewScreen = new VideoPreviewScreen(driver);
	}

	//@AfterClass
	public void tearDown_OnFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			driver.quit();
			driver = null;
		}
	}

	@Test(priority = 1)
	public void verifyChangingVideoQualityFromRecorder_Sales() throws InterruptedException {
		videoRecordingPage.checkChangingVideoQualityFromRecorder();
	}

	@Test(priority = 2)
	public void verifyFlashlightFunction_Recorder_Sales() throws InterruptedException {
		Assert.assertTrue(videoRecordingPage.checkFlashlightFunction());
	}

	@Test(priority = 3)
	public void verifyNarratorMode_Recorder_Sales() throws InterruptedException {
		Assert.assertTrue(videoRecordingPage.checkNarratorMode());
	}

	@Test(priority = 4)
	public void verifyNoiseCancellation_Recorder_Sales() throws InterruptedException {
		Assert.assertTrue(videoRecordingPage.checkNoiseCancellation());
	}

	@Test(priority = 5)
	public void verifyVideoRecordingWithImageCapture_Recorder_Sales() throws InterruptedException {
		videoRecordingPage.checkOnlyImageCapturing();
		Assert.assertTrue(videoRecordingPage.checkVideoRecordingWithImageCapture());
	}

	@Test(priority = 6)
	public void verifyDeleteVideoFunction_NOButton_Recorder_Sales() throws InterruptedException {
		Assert.assertTrue(videoPreviewScreen.checkDeleteVideoFunction_NOButton());
	}

	@Test(priority = 7)
	public void verifyDeleteVideoFunction_DeleteButton_Recorder_Sales() throws InterruptedException {
		Assert.assertTrue(videoPreviewScreen.checkDeleteVideoFunction_DeleteButton_Recorder());
	}

	@Test(priority = 8)
	public void verifyOnlyImageCapturing_Recorder_Sales() throws InterruptedException {
		Assert.assertTrue(videoRecordingPage.checkOnlyImageCapturing());
	}

	@Test(priority = 9)
	public void verifyNavigationToMediaActionScreen_Recorder_Sales() throws InterruptedException {
		videoRecordingPage = new VideoRecordingPage(driver);
		Assert.assertTrue(videoRecordingPage.checkNavigationToMediaActionScreen());
	}

	@Test(priority = 10)
	public void verifyVideoRecordingWithImageCapture_Again_Recorder_Sales() throws InterruptedException {
		Assert.assertTrue(videoRecordingPage.checkVideoRecordingWithImageCapture());
	}

	@Test(priority = 11)
	public void verifyDeleteImagesFunction_PreviewScreen_recorder_Sales() throws InterruptedException {
		videoPreviewScreen = new VideoPreviewScreen(driver);
		videoPreviewScreen.deleteImages();
	}

	@Test(priority = 12)
	public void verifyPreviewScreenFunction_Recorder_Sales() throws InterruptedException {
		Assert.assertTrue(videoPreviewScreen.checkPreviewScreenFunction_Prospect());
	}

}
