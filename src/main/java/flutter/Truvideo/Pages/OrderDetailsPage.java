package flutter.Truvideo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class OrderDetailsPage extends UtilityClass {
	AppiumDriver driver;

	public OrderDetailsPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public WebElement getOrderNumber() {
		try {
			return driver.findElement(By.xpath("//android.view.View[@text='" + AddOrderPage.orderNumber + "']"));
		} catch (Exception e) {
			return driver.findElement(By.xpath("//XCUIElementTypeOther[@value='" + AddOrderPage.orderNumber + "']"));
		}
	}

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4][@index='4']")
	private WebElement editButton;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3][@index='3']")
	private WebElement refreshButton;

	@AndroidFindBy(accessibility = "Status")
	@iOSXCUITFindBy(accessibility = "Status")
	private WebElement status;

	@AndroidFindBy(accessibility = "New")
	@iOSXCUITFindBy(accessibility = "New")
	private WebElement status_New;

	public WebElement getStatus_New() {
		return status_New;
	}

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Customer\"]/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement customer_Name;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Customer\"]/android.view.View[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]")
	private WebElement customer_Phone;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Customer\"]/android.view.View[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]")
	private WebElement customer_Email;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Service Advisor\"]/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]")
	private WebElement advisor_Name;

	public WebElement getAdvisorName() {
		return advisor_Name;
	}

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Service Advisor\"]/android.view.View[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[3]")
	private WebElement advisor_Email;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Technician\"]/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]")
	private WebElement technician_Name;

	public WebElement getTechnicianName() {
		return technician_Name;
	}

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Technician\"]/android.view.View[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther[3]")
	private WebElement technician_Email;

	@AndroidFindBy(accessibility = "Customer")
	@iOSXCUITFindBy(accessibility = "Customer")
	private WebElement customerBlock;

	@AndroidFindBy(accessibility = "Service Advisor")
	@iOSXCUITFindBy(accessibility = "Service Advisor")
	private WebElement serviceAdvisorBlock;

	@AndroidFindBy(accessibility = "Technician")
	@iOSXCUITFindBy(accessibility = "Technician")
	private WebElement technicianBlock;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Last Message')]")
	@iOSXCUITFindBy(accessibility = "Last Message")
	private WebElement lastMessagesBlock;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"There are no messages\"]/android.view.View[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[5]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]\n"
			+ "")
	private WebElement messageTextBox;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Media Gallery')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@value,'Media Gallery')]")
	private WebElement mediaGallery;

	@AndroidFindBy(xpath = "//android.view.View[5][@index='5'][@clickable='true']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[6][@index='6']")
	private WebElement cameraIcon;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='WHILE USING THE APP' or @text='While using the app']")
	@iOSXCUITFindBy(accessibility = "OK")
	private WebElement permission_Allow;

	@AndroidFindBy(accessibility = "INSPECTIONS")
	@iOSXCUITFindBy(accessibility = "INSPECTIONS")
	private WebElement inspectionsTab;

	@AndroidFindBy(accessibility = "//android.widget.ImageView[1]/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
	private WebElement check_Button;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Selected')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Selected')]")
	private WebElement selectedVideo_Count;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]")
	private WebElement x_Button;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Pending to upload') or (@index='0')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[contains(@name,'Pending to Upload')]")
	private WebElement pendingToUpload_video;

	public WebElement getPendingToUploadVideo() {
		return pendingToUpload_video;
	}

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement backButton;

	public WebElement getBackButton() {
		return backButton;
	}

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Video')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[contains(@label,'Video')]")
	private WebElement video_MediaGallery;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Video')]/android.view.View")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
	private WebElement video_InfoTab;

	@AndroidFindBy(accessibility = "Video information")
	@iOSXCUITFindBy(accessibility = "Video information")
	private WebElement videoInformation_Title;

	@AndroidFindBy(accessibility = "OKAY")
	@iOSXCUITFindBy(accessibility = "OKAY")
	private WebElement okayButton;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'ALL')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'ALL')]")
	private WebElement mediaGallery_All;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'VIDEOS')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'VIDEOS')]")
	private WebElement mediaGallery_VIDEOS;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'PICTURES')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'PICTURES')]")
	private WebElement mediaGallery_PICTURES;

	public boolean checkAllImportantTextsArePresent() {
		if (getOrderNumber().getText().contains(AddOrderPage.orderNumber) && customerBlock.isDisplayed()
				&& serviceAdvisorBlock.isDisplayed() && technicianBlock.isDisplayed()) {
			scrollDown();
			if (lastMessagesBlock.isDisplayed() && mediaGallery.isDisplayed() && cameraIcon.isDisplayed()) {
				log.info("All required elements are visible on Ro details screen");
				scrollUp();
			}
			return true;
		} else {
			log.info("All required elements are not visible on Ro details screen");
			return false;
		}
	}

	public boolean checkAllMandatoryFields() {
		if (getOrderNumber().getText() != null && customer_Name.getText() != null && advisor_Name.getText() != null) {
			log.info("order number, customer name & advisor name is not null");
			return true;
		} else {
			log.info("order number, customer name & advisor name is null");
			return false;
		}
	}

	// need to call in editRo.xml file
	public boolean checkNavigation_EditRO() throws InterruptedException {
		Navigate_To_EditRO();
		EditOrder_ProspectPage editOrder = new EditOrder_ProspectPage(driver);
		Thread.sleep(2000);
		if (editOrder.getEditOrderTitle().isDisplayed()) {
			log.info("user is navigated to the Edit Ro Screen");
			return true;
		} else {
			log.info("user is not navigated to the Edit Ro Screen");
			return false;
		}
	}

	public EditOrder_ProspectPage Navigate_To_EditRO() throws InterruptedException {
		editButton.click();
		return new EditOrder_ProspectPage(driver);
	}

	// need to call in cameraScreen.xml file
	public boolean checkNavigation_To_CameraScreen() throws InterruptedException {
		VideoRecordingPage recordingPage = new VideoRecordingPage(driver);
		Navigate_To_CameraScreen();
		if (recordingPage.getRotateDeviceMessage().isDisplayed()) {
			log.info("Camera screen is displayed");
			return true;
		} else {
			log.info("Camera screen is not displayed");
			return false;
		}
	}

	public VideoRecordingPage Navigate_To_CameraScreen() throws InterruptedException {
		cameraIcon.click();
		Thread.sleep(1000);
		try {
			if (permission_Allow.isDisplayed()) {
				log.info("Camera permission Displayed");
				permission_Allow.click();// camera permission
			} else {
				log.info("Camera permission Not Displayed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		try {
			if (permission_Allow.isDisplayed()) {
				log.info("Audio permission Displayed");
				permission_Allow.click();// camera permission
			} else {
				log.info("Audio permission Not Displayed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(4000);
		return new VideoRecordingPage(driver);
	}

	// need to call in messages.xml
	public boolean checkNavigation_To_Messages() throws InterruptedException {
		Navigate_To_Messages();
		MessagingScreen messageScreen = new MessagingScreen(driver);
		if (messageScreen.getMessage_Title().isDisplayed()) {
			log.info("Messages screen is displayed");
			return true;
		} else {
			log.info("Messages screen is displayed");
			return false;
		}
	}
	
	public MessagingScreen Navigate_To_Messages() throws InterruptedException {
		scrollDown();
		messageTextBox.click();
		Thread.sleep(5000);
		return new MessagingScreen(driver);
	}

	// need to call in inspection.xml
	public boolean checkNavigation_To_Inspection() {
		InspectionPage inspectionPage = new InspectionPage(driver);
		if (inspectionsTab.isDisplayed()) {
			inspectionsTab.click();
			try {
				if (inspectionPage.getInspection_Title().isDisplayed()
						|| inspectionPage.getInspection_TitleAgain().isDisplayed()) {
					log.info("User is navigated to the Inspection page");
					return true;
				} else {
					log.info("User is not able to navigated to the Inspection page");
					return false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		{
			return false;
		}
	}

	public boolean check_UncheckButton_Function() throws InterruptedException {
		scrollDown();
		// waitTillElementToBeVisible(check_Button, 60, 5);//wait till encoding
		Thread.sleep(60000);
		check_Button.click();
		if (selectedVideo_Count.isDisplayed()) {
			log.info("Video is selected for the next operations");
			x_Button.click();
			return true;
		} else {
			log.info("Video is not selected for the next operations");
			return false;
		}
	}

	public boolean checkNavigation_PendingToUploadScreen() throws InterruptedException {
		Navigate_To_PendingToUploadScreen();
		PendingToUploadPage pendingToUpload = new PendingToUploadPage(driver);
		if (pendingToUpload.getPendingToUpload_Title().isDisplayed()) {
			log.info("User is on Pending to Upload screen");
			return true;
		} else {
			log.info("User is not able to navigate to Pending Upload screen");
			return false;
		}
	}
	
	public PendingToUploadPage Navigate_To_PendingToUploadScreen() throws InterruptedException {
		scrollDown();
		Thread.sleep(5000);
		pendingToUpload_video.click();
		log.info("Clicked on video details :-  User will navigate to Pending to Upload screen");
		return new PendingToUploadPage(driver);
	}

	public boolean getMediaGallery() {
		scrollDown();
		waitTillElementToBeVisible(video_MediaGallery, 20);
		if (video_MediaGallery.isDisplayed() && mediaGallery_All.isDisplayed() && mediaGallery_VIDEOS.isDisplayed()
				&& mediaGallery_PICTURES.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkNavigationToListPage() throws InterruptedException {
		NavigateToOrderListPage();
		RO_ListPage rolistPage=new RO_ListPage(driver);
		if(rolistPage.getCreateButton().isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
	public RO_ListPage NavigateToOrderListPage() throws InterruptedException {
		Thread.sleep(3000);
		backButton.click();
		log.info("Clicked on back button and user will navigate to List Page");
		return new RO_ListPage(driver);
	}

}
