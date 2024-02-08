package flutter.Truvideo.Tests.Order;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.EditOrder_ProspectPage;
import flutter.Truvideo.Pages.InspectionPage;
import flutter.Truvideo.Pages.MessagingScreen;
import flutter.Truvideo.Pages.OrderDetailsPage;
import flutter.Truvideo.Pages.VideoRecordingPage;

public class OrderDetailsPageTest extends BaseClass {
	OrderDetailsPage orderDetails;

	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		if (driver == null) {
			driver = setUpApplication();
			orderDetails = loadDealerCodePage().navigateToUserListScreen_Order()
					.navigateTo_RO_Prospect_ListPage(userForLogin_Order).NavigateTo_AddOrder_Page()
					.CreateNewRO_NavigateToRODetail();
		}
	}

	@BeforeMethod
	public void setDriverObject() {
		if (orderDetails == null) {
			orderDetails = new OrderDetailsPage(driver);
		}
	}

	// @AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyVariousFields_RoDetails() {
		Assert.assertTrue(orderDetails.checkAllImportantTextsArePresent());
	}

	@Test(priority = 2)
	public void verifyMandatoryFields_RoDetails() {
		Assert.assertTrue(orderDetails.checkAllMandatoryFields());
	}
	
	@Test(priority = 3)
	public void verifyNavigationToInspection() throws InterruptedException {
		Assert.assertTrue(orderDetails.checkNavigation_To_Inspection());
		InspectionPage inspectionPage = new InspectionPage(driver);
		inspectionPage.getBackArrowButton().click();
		/*
		 * if(inspectionPage.getYesButton().isDisplayed()) {
		 * inspectionPage.getYesButton().click(); }else { driver.navigate().back();
		 * //inspectionPage.getYesButton().click(); }
		 */
	}

	@Test(priority = 4)
	public void verifyNavigationToEditOrder() throws InterruptedException {
		Assert.assertTrue(orderDetails.checkNavigation_EditRO());
		EditOrder_ProspectPage editOrder = new EditOrder_ProspectPage(driver);
		editOrder.getCancelButton().click();
	}

	@Test(priority = 5)
	public void verifyNavigationToMessages_RoDetails() throws InterruptedException {
		Assert.assertTrue(orderDetails.checkNavigation_To_Messages());
		MessagingScreen messages = new MessagingScreen(driver);
		messages.getBackButton().click();
	}

	@Test(priority = 6)
	public void verifyNavigationToCameraScreen_RoDetails() throws InterruptedException {
		Assert.assertTrue(orderDetails.checkNavigation_To_CameraScreen());
		VideoRecordingPage recordingPage = new VideoRecordingPage(driver);
		recordingPage.getX_Button().click();
	}

	@Test(priority = 7)
	public void verifyNavigationToROListPage() throws InterruptedException {
		Assert.assertTrue(orderDetails.checkNavigationToListPage());
	}

	// @Test
	public void verifyCheck_UncheckVideoFunction() throws InterruptedException {
		Assert.assertTrue(orderDetails.check_UncheckButton_Function());
	}

	// @Test
	public void verifyNavigationToPendingToUpload() throws InterruptedException {
		Assert.assertTrue(orderDetails.checkNavigation_PendingToUploadScreen());
	}

}
