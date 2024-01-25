package flutter.Truvideo.Tests.Order;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.RO_ListPage;
import flutter.Truvideo.Pages.VideoPreviewScreen;
import flutter.Truvideo.Pages.VideoRecordingPage;

public class VideoRecordingPageTest_Recorder_Order extends BaseClass {
	VideoRecordingPage vidioRecordingPage;
	VideoPreviewScreen videoPreviewScreen;

	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		if (driver == null) {
			driver = setUpApplication();
			vidioRecordingPage = loadDealerCodePage().navigateToUserListScreen_Order()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Order).NavigateTo_AddOrder_Page()
					.CreateNewRO_NavigateToRODetail().Navigate_To_CameraScreen();
		} else {
			RO_ListPage rolistPage = new RO_ListPage(driver);
			rolistPage.NavigateTo_AddOrder_Page().CreateNewRO_NavigateToRODetail()
			.Navigate_To_CameraScreen();
		}
	}

	@BeforeMethod
	public void setDriverObject() {
		if (vidioRecordingPage == null) {
			vidioRecordingPage = new VideoRecordingPage(driver);
		}
		videoPreviewScreen = new VideoPreviewScreen(driver);
	}

	// @AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyChangingVideoQualityFromRecorder() throws InterruptedException {
		vidioRecordingPage.checkChangingVideoQualityFromRecorder();
	}

	@Test(priority = 2)
	public void verifyFlashlightFunction_Recorder() throws InterruptedException {
		Assert.assertTrue(vidioRecordingPage.checkFlashlightFunction());
	}

	@Test(priority = 3)
	public void verifyNarratorMode_Recorder() throws InterruptedException {
		Assert.assertTrue(vidioRecordingPage.checkNarratorMode());
	}

	@Test(priority = 4)
	public void verifyNoiseCancellation_Recorder() throws InterruptedException {
		Assert.assertTrue(vidioRecordingPage.checkNoiseCancellation());
	}

	@Test(priority = 5)
	public void verifyVideoRecordingWithImageCapture_Recorder() throws InterruptedException {
		vidioRecordingPage.checkOnlyImageCapturing();
		Assert.assertTrue(vidioRecordingPage.checkVideoRecordingWithImageCapture());
	}

	@Test(priority = 6)
	public void verifyDeleteVideoFunction_NOButton_Recorder() throws InterruptedException {
		Assert.assertTrue(videoPreviewScreen.checkDeleteVideoFunction_NOButton());
	}

	@Test(priority = 7)
	public void verifyDeleteVideoFunction_DeleteButton_Recorder() throws InterruptedException {
		Assert.assertTrue(videoPreviewScreen.checkDeleteVideoFunction_DeleteButton_Recorder());
	}

	@Test(priority = 8)
	public void verifyOnlyImageCapturing_Recorder() throws InterruptedException {
		Assert.assertTrue(vidioRecordingPage.checkOnlyImageCapturing());
	}

	@Test(priority = 9)
	public void verifyNavigationToMediaActionScreen_Recorder() throws InterruptedException {
		vidioRecordingPage = new VideoRecordingPage(driver);
		Assert.assertTrue(vidioRecordingPage.checkNavigationToMediaActionScreen());
	}

	@Test(priority = 10)
	public void verifyVideoRecordingWithImageCapture_Again_Recorder() throws InterruptedException {
		Assert.assertTrue(vidioRecordingPage.checkVideoRecordingWithImageCapture());
	}

	@Test(priority = 11)
	public void verifyDeleteImagesFunction_PreviewScreen_recorder() throws InterruptedException {
		videoPreviewScreen = new VideoPreviewScreen(driver);
		videoPreviewScreen.deleteImages();
	}

	@Test(priority = 12)
	public void verifyPreviewScreenFunction_Recorder() throws InterruptedException {
		Assert.assertTrue(videoPreviewScreen.checkPreviewScreenFunction_Order());
	}

}
