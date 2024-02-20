package flutter.Truvideo.Tests.Order;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.UserListPage;
import flutter.Truvideo.Pages.VideoPreviewScreen;
import flutter.Truvideo.Pages.VideoRecordingPage;

public class VideoRecordingPageTest_Gallery_Order extends BaseClass {
	VideoRecordingPage videoRecordingPage;
	VideoPreviewScreen videoPreviewScreen;

	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		if (driver == null) {
			driver = setUpApplication();
			videoRecordingPage = loadDealerCodePage().navigateToUserListScreen_Order()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Order).NavigateTo_AddOrder_Page()
					.CreateNewRO_NavigateToRODetail().Navigate_To_CameraScreen();
		}
		if (driver != null && videoRecordingPage == null) {
			UserListPage userlistPage = new UserListPage(driver);
			userlistPage.navigateTo_RO_Prospect_ListPage(userForLogin_Order).NavigateTo_AddOrder_Page()
					.CreateNewRO_NavigateToRODetail().Navigate_To_CameraScreen();
		}
	}

	@BeforeMethod
	public void setDriverObject() {
		if (videoRecordingPage == null) {
			videoRecordingPage = new VideoRecordingPage(driver);
		}
		videoPreviewScreen = new VideoPreviewScreen(driver);
	}

	@AfterClass
	public void tearDown_OnFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			driver.quit();
			driver = null;
		}
	}

	@Test(priority = 1)
	public void verifyPickFromDeviceGallery_Order() throws InterruptedException {
		Assert.assertTrue(videoRecordingPage.checkVideoPickFromDeviceGallery());
	}

	@Test(priority = 2)
	public void verifyDeleteVideo_VideoPreviewScreen_NOButton_MediaGallery_Order() throws InterruptedException {
		Assert.assertTrue(videoPreviewScreen.checkDeleteVideoFunction_NOButton());
	}

	@Test(priority = 3)
	public void verifyDeleteVideo_VideoPreviewScreen__DeleteButton_MediaGallery_Order() throws InterruptedException {
		Assert.assertTrue(videoPreviewScreen.checkDeleteVideoFunction_DeleteButton_MediaGallery());
	}

	@Test(priority = 4)
	public void verifyPreviewScreenFunction_MediaGallery_Order() throws InterruptedException {
		Assert.assertTrue(videoRecordingPage.navigateToVideoPreviewScreen_Gallery().checkPreviewScreenFunction_Order());
	}

}
