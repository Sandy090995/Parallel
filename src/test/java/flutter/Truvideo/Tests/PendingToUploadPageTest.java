package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.PendingToUploadPage;

public class PendingToUploadPageTest extends BaseClass {
	PendingToUploadPage pendingToUploadPage;

	// @Test(priority = 1)
	public void verifyVideoCanPlayOnPendingScreen() throws InterruptedException {
		pendingToUploadPage = new PendingToUploadPage(driver);
		Assert.assertTrue(pendingToUploadPage.checkVideoIsPlaying());
	}

	@Test(priority = 3)
	public void verifyChangeVideoTagAndDescription() throws InterruptedException {
		pendingToUploadPage = new PendingToUploadPage(driver);
		Assert.assertTrue(pendingToUploadPage.changeVideoTagAndDescription());
	}

	@Test(priority = 2)
	public void verifyDeleteImage() throws InterruptedException {
		pendingToUploadPage = new PendingToUploadPage(driver);
		Assert.assertTrue(pendingToUploadPage.detailsAndDeleteImage());
	}

	@Test(priority = 4)
	public void verifyUploadVideo() throws InterruptedException {
		pendingToUploadPage = new PendingToUploadPage(driver);
		Assert.assertTrue(pendingToUploadPage.uploadVideo());
	}

	@Test(priority = 8)
	public void verifyLowVideoQuality() throws InterruptedException {
		pendingToUploadPage = new PendingToUploadPage(driver);
		Assert.assertTrue(pendingToUploadPage.checkVideoLowQuality());
	}

	@Test(priority = 9)
	public void verifyMediumVideoQuality() throws InterruptedException {
		pendingToUploadPage = new PendingToUploadPage(driver);
		Assert.assertTrue(pendingToUploadPage.checkVideoMediumQuality());
	}

	@Test(priority = 10)
	public void verifyHighVideoQuality() throws InterruptedException {
		pendingToUploadPage = new PendingToUploadPage(driver);
		Assert.assertTrue(pendingToUploadPage.checkVideoHighQuality());
	}
	
	@Test(dependsOnMethods = "verifyUploadVideo")
	public void verifyUploadedVideos_OnDashboard() throws InterruptedException {
		pendingToUploadPage = new PendingToUploadPage(driver);
		pendingToUploadPage.verifyUploadedVideos_OnDashboard_Order();
	}
	
	@Test(dependsOnMethods = "verifyUploadVideo")
	public void verifyUploadedVideos_OnDashboard_Prospects() throws InterruptedException {
		pendingToUploadPage = new PendingToUploadPage(driver);
		pendingToUploadPage.verifyUploadedVideos_OnDashboard_Prospect();
	}

}
