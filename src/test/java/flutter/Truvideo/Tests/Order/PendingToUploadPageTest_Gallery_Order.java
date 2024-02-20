package flutter.Truvideo.Tests.Order;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.OrderDetailsPage;
import flutter.Truvideo.Pages.PendingToUploadPage;

public class PendingToUploadPageTest_Gallery_Order extends BaseClass {
	PendingToUploadPage pendingToUploadPage;
	OrderDetailsPage orderDetails;

	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		if (driver == null) {
			driver = setUpApplication();
			pendingToUploadPage = loadDealerCodePage().navigateToUserListScreen_Order()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Order).NavigateTo_AddOrder_Page()
					.CreateNewRO_NavigateToRODetail().Navigate_To_CameraScreen().navigateToVideoPreviewScreen_Gallery()
					.navigateToOrderDetails().Navigate_To_PendingToUploadScreen();
		}
		if (driver != null && pendingToUploadPage == null) {
			orderDetails = new OrderDetailsPage(driver);
			orderDetails.Navigate_To_PendingToUploadScreen();
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
	public void verifyVideoCanPlayOnPendingScreen_Gallery_Order() throws InterruptedException {
		Assert.assertTrue(pendingToUploadPage.checkVideoIsPlaying());
	}

	@Test(priority = 2)
	public void verifyDeleteImage_PendingToUploadScreen_Gallery_Order() throws InterruptedException {
		Assert.assertTrue(pendingToUploadPage.detailsAndDeleteImage());
	}

	@Test(priority = 3)
	public void verifyChangeVideoTagAndDescription_Gallery_Order() throws InterruptedException {
		Assert.assertTrue(pendingToUploadPage.changeVideoTagAndDescription());
	}

	@Test(priority = 4)
	public void verifyUploadVideo_Gallery_Order() throws InterruptedException {
		Assert.assertTrue(pendingToUploadPage.uploadVideo());
		driver.navigate().back();
	}

	// @Test(dependsOnMethods = "verifyUploadVideo_Gallery_Order")
	public void verifyUploadedVideos_Gallery_OnDashboard_Order() throws InterruptedException {
		pendingToUploadPage.verifyUploadedVideos_OnDashboard_Order();
	}

}
