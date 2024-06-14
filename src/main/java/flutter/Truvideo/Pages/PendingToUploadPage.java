package flutter.Truvideo.Pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import Dashboard.Truvideo.Pages.DashHomePage;
import Dashboard.Truvideo.Pages.DashLoginPage;
import Dashboard.Truvideo.Pages.DashProspectsPage;
import Dashboard.Truvideo.Pages.DashRepairOrderPage;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PendingToUploadPage extends UtilityClass {
	AppiumDriver driver;
	WebDriver webdriver;

	public PendingToUploadPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Pending to Upload")
	@iOSXCUITFindBy(accessibility = "Pending to Upload")
	private WebElement pendingToUpload_Title;

	public WebElement getPendingToUpload_Title() {
		return pendingToUpload_Title;
	}

	@AndroidFindBy(accessibility = "UPLOAD")
	@iOSXCUITFindBy(accessibility = "UPLOAD")
	private WebElement upload_button;

	@AndroidFindBy(xpath = "//android.view.View[7]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]")
	private WebElement playIcon_Blue;

	@AndroidFindBy(xpath = "//android.view.View[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]")
	private WebElement playPause_Button_playerScreen;

	@AndroidFindBy(xpath = "//android.view.View[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]")
	private WebElement backButton_playerScreen;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'encoded')]")
	@iOSXCUITFindBy(accessibility = "The video was encoded")
	private WebElement encodingTag;

	@AndroidFindBy(xpath = "//android.view.View[13]")
	private WebElement tagDropdown_Media;

	@AndroidFindBy(xpath = "//android.view.View[8]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3][@accessible='true']")
	private WebElement tagDropdown_Recorder;

	@AndroidFindBy(xpath = "//android.view.View[3]/android.view.View/android.view.View")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeStaticText")
	List<WebElement> videoType_List;

	@AndroidFindBy(accessibility = "Inspection Video")
	@iOSXCUITFindBy(accessibility = "Inspection Video")
	private WebElement inspection_Video;

	@AndroidFindBy(accessibility = "Condition Video")
	@iOSXCUITFindBy(accessibility = "Condition Video")
	private WebElement condition_Video;

	@AndroidFindBy(accessibility = "Sanitization Video")
	@iOSXCUITFindBy(accessibility = "Sanitization Video")
	private WebElement sanitization_Video;

	@AndroidFindBy(accessibility = "Status Video")
	@iOSXCUITFindBy(accessibility = "Status Video")
	private WebElement status_Video;

	@AndroidFindBy(accessibility = "Other Video")
	@iOSXCUITFindBy(accessibility = "Other Video")
	private WebElement other_Video;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement backButton_VideoTag;

	@AndroidFindBy(xpath = "//android.view.View[16]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4]")
	private WebElement videoDescription_MessageButton;
	
	@AndroidFindBy(xpath = "//android.view.View[11]")
	
	private WebElement videoDescription_MessageButtonRecorder;

	@AndroidFindBy(xpath = "//android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	private WebElement descriptionTextBox;

	@AndroidFindBy(accessibility = "CLOSE")
	@iOSXCUITFindBy(accessibility = "CLOSE")
	private WebElement close_Button;

	@AndroidFindBy(xpath = "//android.view.View[17]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[18]")
	private WebElement enteredVideoDescription;
	
	@AndroidFindBy(xpath = "//android.view.View[12]")

	private WebElement enteredVideoDescription_Recorder;

	@AndroidFindBy(xpath = "//android.widget.ImageView[1][contains(@content-desc,'Resolution')]/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]")
	private WebElement firstImageDescription_MessageButton;

	@AndroidFindBy(xpath = "//android.widget.ImageView[2][contains(@content-desc,'Resolution')]/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]")
	private WebElement secondImageDescription_MessageButton;

	@AndroidFindBy(xpath = "//android.widget.ImageView[1][contains(@content-desc,'Resolution')]/android.view.View[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement firstImageDescription_DeleteButton;

	@AndroidFindBy(xpath = "//android.widget.ImageView[2][contains(@content-desc,'Resolution')]/android.view.View[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]")
	private WebElement secondImageDescription_DeleteButton;

	@AndroidFindBy(accessibility = "Delete")
	@iOSXCUITFindBy(accessibility = "Delete")
	private WebElement delete_Message;

	@AndroidFindBy(accessibility = "Are you sure?")
	@iOSXCUITFindBy(accessibility = "Are you sure?")
	private WebElement areYouSure_Message;

	@AndroidFindBy(accessibility = "NO")
	@iOSXCUITFindBy(accessibility = "NO")
	private WebElement no_Button;

	@AndroidFindBy(accessibility = "DELETE")
	@iOSXCUITFindBy(accessibility = "DELETE")
	private WebElement deleteButton;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	private WebElement backButton;// no need if bug is fixed

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'320x240')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'352x288')]")
	private List<WebElement> lowResolution;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'720x480')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'640x480')]")
	private List<WebElement> mediumResolution;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'1280x720')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'1280x720')]")
	private List<WebElement> highResolution;

	public boolean checkVideoIsPlaying() throws InterruptedException {
		Thread.sleep(30000);// wait for video encoding
		playIcon_Blue.click();
		Thread.sleep(1000);
		log.info("Video played inside pending to upload screen");
		playPause_Button_playerScreen.click();
		log.info("video paused inside pending to upload screen");
		Thread.sleep(1000);
		backButton_playerScreen.click();
		if (pendingToUpload_Title.isDisplayed()) {
			log.info("Navigate back to upload screen");
			return true;
		} else {
			log.info("Error in Navigating back to upload screen");
			return false;
		}
	}

	public boolean changeVideoTagAndDescription() throws InterruptedException {
		Thread.sleep(5000);
		scrollDown();
		//scrollDown();
		Thread.sleep(1000);
		if (deleteButton.isDisplayed()) {
			try {
				if (deleteButton.isDisplayed() && encodingTag.isDisplayed()) {
					tagDropdown_Media.click();
					log.info("Video tag dropdown opened");
					String videoType;
					try {
						videoType = videoType_List.get(3).getAttribute("content-desc");
					} catch (Exception e) {
						videoType = videoType_List.get(3).getAttribute("label");
					}
					videoType_List.get(3).click();
					log.info("Video tag changed to " + videoType);
					videoDescription_MessageButton.click();
					log.info("Add Description pop-up window open");
					descriptionTextBox.sendKeys("Testing Tags");
					String enteredTag = descriptionTextBox.getText();
					close_Button.click();
					if (enteredVideoDescription.getAttribute("content-desc").equals(enteredTag)
							|| enteredVideoDescription.getAttribute("label").equals(enteredTag)) {
						log.info("Description is same as Entered");
						return true;
					} else {
						log.info("Description is not same as Entered");
						return false;
					}
				}
			} catch (Exception e) {
				if (deleteButton.isDisplayed()) {
					tagDropdown_Recorder.click();
					log.info("Video tag dropdown opened");
					String videoType;
					try {
						videoType = videoType_List.get(3).getAttribute("content-desc");
					} catch (Exception f) {
						videoType = videoType_List.get(3).getAttribute("label");
					}
					videoType_List.get(3).click();
					log.info("Video tag changed to " + videoType);
					videoDescription_MessageButtonRecorder.click();
					log.info("Add Description pop-up window open");
					descriptionTextBox.sendKeys("Testing Tags");
					String enteredTag = descriptionTextBox.getText();
					close_Button.click();
					if (enteredVideoDescription_Recorder.getAttribute("content-desc").equals(enteredTag)
							|| enteredVideoDescription_Recorder.getAttribute("label").equals(enteredTag)) {
						log.info("Description is same as Entered");
						return true;
					} else {
						log.info("Description is not same as Entered");
						return false;
					}
				}
			}
		}
		{
			return true;
		}
	}

	@AndroidFindBy(xpath = "//android.widget.ImageView[1]/android.view.View[2]")
   @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]")
	private WebElement firstImage_CommentButton;

	@AndroidFindBy(xpath = "//android.widget.ImageView[2]/android.view.View[2]")
	 @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]")
	private WebElement secondImage_CommentButton;

	@AndroidFindBy(xpath = "//android.widget.ImageView[3]/android.view.View[2]")
	 @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]")
	private WebElement thirdImage_CommentButton;

	@AndroidFindBy(accessibility = "Details")
	@iOSXCUITFindBy(accessibility = "Add comment")
	private WebElement details_Button;

	@AndroidFindBy(accessibility = "Delete")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement deleteImage_Button;

	@AndroidFindBy(accessibility = "Picture Details")
	@iOSXCUITFindBy(accessibility = "Add comment")
	private WebElement pictureDetails_Heading;

	public boolean detailsAndDeleteImage() throws InterruptedException {
		scrollDown();
		scrollDown();
		Thread.sleep(3000);
		firstImage_CommentButton.click();
		//details_Button.click();
		if (pictureDetails_Heading.isDisplayed() || close_Button.isDisplayed()) {
			log.info("Picture Details screen is displayed");
			close_Button.click();
			log.info("Picture Details screen closed");
		}
		firstImage_CommentButton.click();
		deleteImage_Button.click();
		if (delete_Message.isDisplayed() && areYouSure_Message.isDisplayed()) {
			log.info("Delete Pop-up window is displayed");
			no_Button.click();
			log.info("Image not deleted ");
		}
		firstImage_CommentButton.click();
		deleteImage_Button.click();
		if (delete_Message.isDisplayed() && areYouSure_Message.isDisplayed()) {
			log.info("Delete Pop-up window is displayed");
			deleteButton.click();
			log.info("Image deleted successfully");
			return true;
		} else {
			deleteButton.click();
			return false;
		}
	}

	public boolean uploadVideo() throws InterruptedException {
		scrollUp();
		scrollUp();
		Thread.sleep(1000);
		upload_button.click();
		Thread.sleep(10000);// wait for video encoding and uploading process
		OrderDetailsPage orderDetailsPage = new OrderDetailsPage(driver);
		scrollDown();
		Thread.sleep(1000);
		scrollDown();
		if (orderDetailsPage.getMediaGallery() == true) {
			log.info("Video Uploaded Successfully");
			return true;
		} else {
			log.info("Video Uploading failed");
			return false;
		}
	}

	String resolution;

	public boolean checkVideoLowQuality() throws InterruptedException {
		if (isAndroid()) {
			resolution = lowResolution.get(0).getAttribute("content-desc");
		} else {
			resolution = lowResolution.get(0).getAttribute("label");
		}
		log.info(resolution);
		System.out.println("checking low resolution" + resolution);

		log.info("User is navigated on RO Details Page");

		// Assert.assertTrue(resultion.contains("320x240"));
		scrollDown();
		deleteButton.click();
		deleteButton.click();
		if (isAndroid()) {
			if (resolution.contains("320x240")) {
				return true;
			} else {
				return false;
			}
		} else {
			if (resolution.contains("352x288")) {
				return true;
			} else {
				return false;
			}
		}
	}

	public boolean checkVideoMediumQuality() throws InterruptedException {
		String resultion = mediumResolution.get(0).getAttribute("content-desc");
		log.info(resultion);
		System.out.println("checking medium resolution" + resultion);

		log.info("User is navigated on RO Details Page");

		// Assert.assertTrue(resultion.contains("640x480"));
		scrollDown();
		deleteButton.click();
		deleteButton.click();
		if (resultion.contains("720x480")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkVideoHighQuality() throws InterruptedException {
		String resultion = highResolution.get(0).getAttribute("content-desc");
		log.info(resultion);
		System.out.println("checking high resolution" + resultion);

		log.info("User is navigated on RO Details Page");

		// Assert.assertTrue(resultion.contains("1280x720"));
		scrollDown();
		deleteButton.click();
		deleteButton.click();
		if (resultion.contains("1280x720")) {
			return true;
		} else {
			return false;
		}
	}

	public void verifyUploadedVideos_OnDashboard_Order() {
		/* Web Browser Execution Starts */
		webdriver = BaseClass.setDashboardBrowser();
		DashLoginPage dashLoginPage = new DashLoginPage(webdriver);
		dashLoginPage.loginToWebApplication();
		DashHomePage dashHomePage = new DashHomePage(webdriver);
		dashHomePage.navigateToRepairOrderList();
		DashRepairOrderPage dashRepairOrderPage = new DashRepairOrderPage(webdriver);
		SoftAssert soft = new SoftAssert();
		dashRepairOrderPage.verifyNewlyCreatedRO();
		soft.assertTrue(dashRepairOrderPage.verifyVideoUploading());
		soft.assertAll();
		 webdriver.close();
		/* Web Browser Execution Closed */
	}

	public void verifyUploadedVideos_OnDashboard_Prospect() {
		/* Web Browser Execution Starts */
		webdriver = BaseClass.setDashboardBrowser();
		DashLoginPage dashLoginPage = new DashLoginPage(webdriver);
		dashLoginPage.loginToWebApplication();
		DashHomePage dashHomePage = new DashHomePage(webdriver);
		dashHomePage.navigateToProspectsList();
		DashProspectsPage dashProspectPage = new DashProspectsPage(webdriver);
		SoftAssert soft = new SoftAssert();
		dashProspectPage.verifyNewlyCreatedProspect();
		soft.assertTrue(dashProspectPage.verifyVideoUploading());
		soft.assertAll();
		webdriver.close();
		/* Web Browser Execution Closed */
	}

}
