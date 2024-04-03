package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ProspectDetailsPage extends UtilityClass {
	AppiumDriver driver;

	public ProspectDetailsPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(accessibility = "Prospect Detail")
	@AndroidFindBy(accessibility = "Prospect Detail")
	private WebElement prospectDetails_PageTitle;

	public WebElement getProspectDetails_PageTitle() {
		return prospectDetails_PageTitle;
	}

	@AndroidFindBy(xpath = "//android.view.View[4][@index='3'][@clickable='true']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4][@index='4']")
	private WebElement editButton;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3][@index='3']")
	private WebElement refreshButton;

	@AndroidFindBy(accessibility = "Status")
	private WebElement status;

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.View[3]")
	private WebElement currentStatus;

	@AndroidFindBy(accessibility = "Customer")
	private WebElement customer_Block;

	@AndroidFindBy(accessibility = "Sales Agent")
	private WebElement salesAgent_Block;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Sales Agent\"]/android.view.View[1]")
	private WebElement salesAgent_Name;

	public WebElement getSalesAgentName() {
		return salesAgent_Name;
	}

	@AndroidFindBy(accessibility = "Vehicle")
	private WebElement vehicle_Block;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Last Message')]")
	private WebElement lastMessage_Block;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Media Gallery')]")
	private WebElement mediaGallery_Block;

	@AndroidFindBy(xpath = "//android.view.View[5][@index='5'][@clickable='true']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[6][@index='6']")
	private WebElement cameraIcon;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='WHILE USING THE APP' or @text='While using the app']")
	@iOSXCUITFindBy(accessibility = "OK")
	private WebElement permission_Allow;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"There are no messages\"]/android.view.View[2]")
	@iOSXCUITFindBy(accessibility = "VIEW ALL")
	private WebElement messageTextBox;

	@AndroidFindBy(accessibility = "//android.widget.ImageView[1]/android.view.View[1]")
	private WebElement check_Button;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Selected')]")
	private WebElement selectedVideo_Count;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]")
	private WebElement x_Button;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Pending to Upload') or (@index='0')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[contains(@name,'Pending to Upload')]")
	private WebElement pendingToUpload_video;

	public WebElement getPendingToUploadVideo() {
		return pendingToUpload_video;
	}

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Video')]")
	private WebElement video_MediaGallery;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'ALL')]")
	private WebElement mediaGallery_All;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'VIDEOS')]")
	private WebElement mediaGallery_Videos;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'PICTURES')]")
	private WebElement mediaGallery_Pictures;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Video')]/android.view.View")
	private WebElement info_MediaGallery;

	@AndroidFindBy(accessibility = "Video information")
	private WebElement videoInformation_Title;

	@AndroidFindBy(accessibility = "OKAY")
	private WebElement okayButton;

	public WebElement getVideo_MediaGallery() {
		return video_MediaGallery;
	}

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	private WebElement backButton;

	public WebElement getBackButton() {
		return backButton;
	}

	public boolean checkAllImportantTextsArePresent() {
		if (status.isDisplayed() && customer_Block.isDisplayed() && salesAgent_Block.isDisplayed()
				&& vehicle_Block.isDisplayed()) {
			scrollDown();
			if (lastMessage_Block.isDisplayed() && mediaGallery_Block.isDisplayed()) {
				log.info("All required elements are visible on Prospect details screen");
				scrollUp();
			}
			return true;
		} else {
			log.info("All required elements are not visible on Prospect details screen");
			return false;
		}
	}

	public boolean checkNavigation_EditProspect() throws InterruptedException {
		Navigate_To_EditProspect();
		EditOrder_ProspectPage editPage = new EditOrder_ProspectPage(driver);
		if (editPage.getEditPropspectTitle().isDisplayed()) {
			log.info("user is navigated to the Edit Prospect Screen");
			return true;
		} else {
			log.info("user is not navigated to the Edit Prospect Screen");
			return false;
		}
	}

	public EditOrder_ProspectPage Navigate_To_EditProspect() throws InterruptedException {
		Thread.sleep(3000);
		editButton.click();
		Thread.sleep(3000);
		return new EditOrder_ProspectPage(driver);
	}

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
		Thread.sleep(4000);
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
		Thread.sleep(4000);
		try {
			if (permission_Allow.isDisplayed()) {
				log.info("Audio permission Displayed");
				permission_Allow.click();// audio permission
			} else {
				log.info("Audio permission Not Displayed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(3000);
		return new VideoRecordingPage(driver);
	}

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
		messageTextBox.click();
		Thread.sleep(3000);
		return new MessagingScreen(driver);
	}

	public boolean check_UncheckButton_Function() throws InterruptedException {
		scrollDown();
		waitTillElementToBeVisible(check_Button, 60, 5);// wait for video encoding
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
		pendingToUpload_video.click();
		return new PendingToUploadPage(driver);
	}	

}
