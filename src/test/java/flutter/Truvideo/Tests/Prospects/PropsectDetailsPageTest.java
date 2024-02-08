package flutter.Truvideo.Tests.Prospects;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.EditOrder_ProspectPage;
import flutter.Truvideo.Pages.MessagingScreen;
import flutter.Truvideo.Pages.ProspectDetailsPage;
import flutter.Truvideo.Pages.VideoRecordingPage;

public class PropsectDetailsPageTest extends BaseClass {
	ProspectDetailsPage prospectDetails;

	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		if(driver==null) {
		driver = setUpApplication();
		prospectDetails = loadDealerCodePage().navigateToUserListScreen_Sales()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Sales).NavigateTo_AddProspect_Page()
				.navigateTOProspectDetails();
		}
	}
	
	@BeforeMethod
	public void setDriverObject() {
		if(prospectDetails==null) {
			prospectDetails=new ProspectDetailsPage(driver);
		}
	}

	//@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyVariousFields_ProspectDetails() {
		Assert.assertTrue(prospectDetails.checkAllImportantTextsArePresent());
	}

	// need to call in editRO.xml
	@Test(priority = 2)
	public void verifyNavigationToEditProspect() throws InterruptedException {
		Assert.assertTrue(prospectDetails.checkNavigation_EditProspect());
		EditOrder_ProspectPage editProspectPage=new EditOrder_ProspectPage(driver);
		editProspectPage.getCancelButton().click();
	}

	@Test(priority = 3)
	public void verifyNavigationToCameraScreen_ProspectDetails() throws InterruptedException {
		Assert.assertTrue(prospectDetails.checkNavigation_To_CameraScreen());
		VideoRecordingPage recordingPage=new VideoRecordingPage(driver);
		recordingPage.getX_Button().click();
	}

	@Test(priority = 4)
	public void verifyNavigationToMessages_ProspectDetails() throws InterruptedException {
		Assert.assertTrue(prospectDetails.checkNavigation_To_Messages());
		MessagingScreen messageScreen=new MessagingScreen(driver);
		messageScreen.getBackButton().click();
		driver.navigate().back();
	}

}
