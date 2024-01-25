package flutter.Truvideo.Tests.Order;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.OrderDetailsPage;
import flutter.Truvideo.Pages.PendingToUploadPage;

public class PendingToUploadPageTest_Recorder_Order extends BaseClass {
	PendingToUploadPage pendingToUploadPage;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		if (driver == null) {
			driver = setUpApplication();
			pendingToUploadPage = loadDealerCodePage().navigateToUserListScreen_Order()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Order).NavigateTo_AddOrder_Page().CreateNewRO_NavigateToRODetail()
					.Navigate_To_CameraScreen().navigateToOrderDetails_Preview_Recorder()
					.navigateToOrderDetails_Recorder().Navigate_To_PendingToUploadScreen();
		} else {
			OrderDetailsPage orderDetails = new OrderDetailsPage(driver);
			orderDetails.Navigate_To_PendingToUploadScreen();
		}
	}

	@BeforeMethod
	public void setDriverObject() {
		if (pendingToUploadPage == null) {
			pendingToUploadPage = new PendingToUploadPage(driver);
		}
	}

	// @AfterClass
	public void tearDown() {
		driver.quit();
	}

	// @Test(priority = 1)
		public void verifyVideoCanPlayOnPendingScreen_Recorder() throws InterruptedException {
			Assert.assertTrue(pendingToUploadPage.checkVideoIsPlaying());
		}

		@Test(priority = 2)
		public void verifyDeleteImage_PendingToUploadScreen_Recorder() throws InterruptedException {
			Assert.assertTrue(pendingToUploadPage.detailsAndDeleteImage());
		}
		
		@Test(priority = 3)
		public void verifyChangeVideoTagAndDescription_Recorder() throws InterruptedException {
			Assert.assertTrue(pendingToUploadPage.changeVideoTagAndDescription());
		}

		@Test(priority = 4)
		public void verifyUploadVideo_Recorder() throws InterruptedException {
			Assert.assertTrue(pendingToUploadPage.uploadVideo());
		}
		
		//@Test(dependsOnMethods = "verifyUploadVideo_Recorder")
		public void verifyUploadedVideos_Recorder_OnDashboard_Order() throws InterruptedException {
			pendingToUploadPage.verifyUploadedVideos_OnDashboard_Order();
		}
		
}
