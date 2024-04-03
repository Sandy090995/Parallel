package flutter.Truvideo.Tests.Prospects;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.EditOrder_ProspectPage;
import flutter.Truvideo.Pages.MessagingScreen;
import flutter.Truvideo.Pages.OrderDetailsPage;
import flutter.Truvideo.Pages.ProspectDetailsPage;
import flutter.Truvideo.Pages.VideoRecordingPage;

public class PropsectDetailsPageTest extends BaseClass {
	ProspectDetailsPage prospectDetails;

	@BeforeMethod
	public void setUpTestEnvironment_ClassLevel() throws Exception {
		if (driver == null) {
			driver = setUpApplication();
			prospectDetails = loadDealerCodePage().navigateToUserListScreen_Sales()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Sales).NavigateTo_AddProspect_Page()
					.navigateTOProspectDetails();
		}
		if (prospectDetails == null) {
			prospectDetails = new ProspectDetailsPage(driver);
		}
	}

	@AfterMethod
	public void tearDown_OnFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			driver.quit();
			driver = null;
		}
	}

	@Test(priority = 1)
	public void verifyVariousFields_ProspectDetails() {
		Assert.assertTrue(prospectDetails.checkAllImportantTextsArePresent());
	}

	@Test(priority = 2)
	public void verifyNavigationToEditProspect() throws InterruptedException {
		Assert.assertTrue(prospectDetails.checkNavigation_EditProspect());
		EditOrder_ProspectPage editProspectPage = new EditOrder_ProspectPage(driver);
		editProspectPage.getCancelButton().click();
	}
	
	@Test(priority = 3)
	public void verifyNavigationToMessages_ProspectDetails() throws InterruptedException {
		Assert.assertTrue(prospectDetails.checkNavigation_To_Messages());
		MessagingScreen messageScreen = new MessagingScreen(driver);
		messageScreen.getBackButton().click();
		driver.navigate().back();
	}

	@Test(priority = 4)
	public void verifyNavigationToCameraScreen_ProspectDetails() throws InterruptedException {
		Assert.assertTrue(prospectDetails.checkNavigation_To_CameraScreen());
		VideoRecordingPage recordingPage = new VideoRecordingPage(driver);
		recordingPage.getX_Button().click();
	}

	@Test(priority = 5)
	public void verifyNavigationToProspectListPage() throws InterruptedException {
		OrderDetailsPage orderDetails=new OrderDetailsPage(driver);
		Assert.assertTrue(orderDetails.checkNavigationToListPage());
	}

}
