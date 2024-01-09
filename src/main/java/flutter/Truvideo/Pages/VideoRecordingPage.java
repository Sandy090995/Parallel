package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class VideoRecordingPage extends UtilityClass {
	AppiumDriver driver;

	public VideoRecordingPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Rotate your device Left or Right")
	@iOSXCUITFindBy(accessibility = "Rotate your device Left or Right")
	private WebElement rotateDeviceMessage;

	public WebElement getRotateDeviceMessage() {
		return rotateDeviceMessage;
	}

	@AndroidFindBy(xpath = "//android.view.View[@index='6']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@index='7']")
	private WebElement RecordingTimer;

	public WebElement getRecordingTimer() {
		return RecordingTimer;
	}

	// upload from device
	@AndroidFindBy(accessibility = "The device must be on landscape mode")
	@iOSXCUITFindBy(accessibility = "The device must be on landscape mode")
	private WebElement theDeviceMustBeOnLandscapeMode_text;

	@AndroidFindBy(accessibility = "PICK FROM DEVICE GALLERY")
	@iOSXCUITFindBy(accessibility = "PICK FROM DEVICE GALLERY")
	private WebElement pickFromGallery;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	@iOSXCUITFindBy(accessibility = "Allow Access to All Photos")
	private WebElement accessPhotosAndMedia_Allow;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Recent')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@value,'Recents')]")
	private WebElement RecentTab;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'ALL')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@value,'ALL')]")
	private WebElement all_Tab;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'VIDEOS')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@value,'VIDEOS')]")
	private WebElement videos_Tab;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'PICTURES')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@value,'PICTURES')]")
	private WebElement pictures_Tab;

	@AndroidFindBy(xpath = "//android.widget.ImageView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[1]")
	private WebElement firstVideoOrImage_InEach_Tab;

	@AndroidFindBy(xpath = "//android.widget.ImageView[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[2]")
	private WebElement secondVideoOrImage_InEach_Tab;

	@AndroidFindBy(xpath = "//android.widget.ImageView[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@index='3']")
	private WebElement ThirdVideoOrImage_InEach_Tab;

	@AndroidFindBy(accessibility = "CONTINUE")
	@iOSXCUITFindBy(accessibility = "CONTINUE")
	private WebElement continueButton;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='ALLOW' or @text='Allow']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Allow Access to All Photos']")
	private WebElement mediaPermission_Allow;

	// upload from Recorder
	@AndroidFindBy(accessibility = "Flash enabled")
	@iOSXCUITFindBy(accessibility = "Flash enabled")
	private WebElement flashEnabled;

	@AndroidFindBy(accessibility = "Flash disabled")
	@iOSXCUITFindBy(accessibility = "Flash disabled")
	private WebElement flashDisabled;

	@AndroidFindBy(accessibility = "Narrator mode disabled")
	@iOSXCUITFindBy(accessibility = "Narrator mode disabled")
	private WebElement narratorDisabled;

	@AndroidFindBy(accessibility = "Narrator mode enabled")
	@iOSXCUITFindBy(accessibility = "Narrator mode enabled")
	private WebElement narratorEnabled;

	@AndroidFindBy(accessibility = "Noise cancellation enabled")
	@iOSXCUITFindBy(accessibility = "Noise cancellation enabled")
	private WebElement noiseCancellationEnabled;

	@AndroidFindBy(accessibility = "Noise cancellation disabled")
	@iOSXCUITFindBy(accessibility = "Noise cancellation disabled")
	private WebElement noiseCancellationDisabled;

	@AndroidFindBy(xpath = "//android.view.View[2]")
	@iOSXCUITFindBy(accessibility = "Camera quality")
	private WebElement quality_CameraScreen;

	@AndroidFindBy(xpath = "//android.view.View[@index='10']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[7]")
	private WebElement cameraQuality_Low;

	@AndroidFindBy(xpath = "//android.view.View[@index='11']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[8]")
	private WebElement cameraQuality_Medium;

	@AndroidFindBy(xpath = "//android.view.View[12]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[9]")
	private WebElement cameraQuality_High;

	@AndroidFindBy(xpath = "//android.view.View[3]")
	@iOSXCUITFindBy(accessibility = "Flash")
	private WebElement flash_CameraScreen;

	@AndroidFindBy(xpath = "//android.view.View[4]")
	@iOSXCUITFindBy(accessibility = "Narrator mode")
	private WebElement narator_CameraScreen;

	@AndroidFindBy(xpath = "//android.view.View[5]")
	@iOSXCUITFindBy(accessibility = "Noise cancelling")
	private WebElement noiseCancellation_CameraScreen;

	@AndroidFindBy(xpath = "//android.view.View[10]")
	@iOSXCUITFindBy(accessibility = "Switch cameras")
	private WebElement frontCamera_BeforeRecording;

	@AndroidFindBy(xpath = "//android.view.View[11]")
	@iOSXCUITFindBy(accessibility = "Switch cameras")
	private WebElement frontCamera_DuringRecording;

	@AndroidFindBy(xpath = "//android.view.View[10]")
	@iOSXCUITFindBy(accessibility = "Switch cameras")
	private WebElement BackCamera_DuringRecording;

	@AndroidFindBy(xpath = "//android.view.View[12]")
	@iOSXCUITFindBy(accessibility = "Take picture")
	private WebElement imageCaptureButton_BeforeRecording;

	@AndroidFindBy(xpath = "//android.view.View[14]")
	@iOSXCUITFindBy(accessibility = "Take picture")
	private WebElement secondAndAfterCaptureButton_BeforeRecording;

	@AndroidFindBy(xpath = "//android.view.View[13]")
	@iOSXCUITFindBy(accessibility = "Take picture")
	private WebElement imageCaptureButton_DuringRecording;

	@AndroidFindBy(xpath = "//android.view.View[@index='5']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@index='6']")
	private WebElement imageVideo_Count_AfterImageCapture;

	@AndroidFindBy(xpath = "//android.view.View[@index='5']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@index='4']")
	private WebElement imageVideo_Count_AfterRecording;

	@AndroidFindBy(xpath = "//android.view.View[11]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4]")
	private WebElement start_Recording;

	@AndroidFindBy(xpath = "//android.view.View[11]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4][@index='9']")
	private WebElement final_StartRecording;

	@AndroidFindBy(xpath = "//android.view.View[12]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[5]")
	private WebElement stop_Recording;

	@AndroidFindBy(xpath = "//android.view.View[9]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[5]")
	private WebElement finale_StopRecording;

	@AndroidFindBy(accessibility = "CONTINUE")
	@iOSXCUITFindBy(accessibility = "CONTINUE")
	private WebElement continue_Button;

	public boolean checkVideoUploadingFromDeviceGallery() throws InterruptedException {
		pickFromGallery.click();
		Thread.sleep(2000);
		try {
			if (mediaPermission_Allow.isDisplayed()) {
				log.info("Permission message displayed");
				mediaPermission_Allow.click();
			}
		} catch (Exception e) {
			log.info("Permission message not displayed");
		}
		Thread.sleep(10000);
		RecentTab.click();
		Thread.sleep(10000);
		videos_Tab.click();
		Thread.sleep(5000);
		firstVideoOrImage_InEach_Tab.click();
		pictures_Tab.click();
		Thread.sleep(5000);
		firstVideoOrImage_InEach_Tab.click();
		secondVideoOrImage_InEach_Tab.click();
		ThirdVideoOrImage_InEach_Tab.click();
		Thread.sleep(5000);
		continueButton.click();
		Thread.sleep(5000);
		VideoPreviewScreen previewScreen = new VideoPreviewScreen(driver);
		if (previewScreen.getPlay_PauseButton().isDisplayed()) {
			log.info("video Preview is Displayed");
			return true;
		} else {
			log.info("video Preview is not Displayed");
			return false;
		}
	}

	public boolean checkChangingVideoQualityFromRecorder() throws InterruptedException {
		Boolean flag = null;
		Thread.sleep(10000);
		quality_CameraScreen.click();
		Thread.sleep(1000);
		cameraQuality_High.click();
		if (quality_CameraScreen.isDisplayed()) {
			flag = true;
			log.info("Changed camera quality to High : message displayed");
			quality_CameraScreen.click();
			Thread.sleep(1000);
			cameraQuality_Medium.click();
			if (quality_CameraScreen.isDisplayed()) {
				flag = true;
				log.info("Changed camera quality to Medium : message displayed");
				quality_CameraScreen.click();
				Thread.sleep(1000);
				cameraQuality_Low.click();
				if (quality_CameraScreen.isDisplayed()) {
					flag = true;
					log.info("Changed camera quality to Low : message displayed");
				} else {
					flag = false;
				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}
		return flag;
	}

	public boolean checkFlashlightFunction() throws InterruptedException {
		Thread.sleep(1000);
		flash_CameraScreen.click();
		if (flashEnabled.isDisplayed()) {
			log.info("Flash Working : Flash Enabled");
			flash_CameraScreen.click();
			if (flashDisabled.isDisplayed()) {
				log.info("Flash Working : Flash disabled");
				return true;
			} else {
				log.info("Falsh Not Working ");
				return false;
			}
		} else {
			log.info("Falsh Not Working ");
			return false;
		}
	}

	public boolean checkNarratorMode() {
		narator_CameraScreen.click();
		if (narratorDisabled.isDisplayed()) {
			log.info("Narrator Working : Narrator disabled");
			narator_CameraScreen.click();
			if (narratorEnabled.isDisplayed()) {
				log.info("Narrator Working : Narrator enabled");
				return true;
			} else {
				log.info("Narrator Not Working ");
				return false;
			}
		} else {
			log.info("Narrator Not Working ");
			return false;
		}
	}

	public boolean checkNoiseCancellation() {
		noiseCancellation_CameraScreen.click();
		if (noiseCancellationDisabled.isDisplayed()) {
			log.info("Noise cancellation Working : Noise cancellation disabled");
			noiseCancellation_CameraScreen.click();
			if (noiseCancellationEnabled.isDisplayed()) {
				log.info("Noise cancellation Working : Noise cancellation enabled");
				return true;
			} else {
				log.info("Noise cancellation");
				return false;
			}
		} else {
			log.info("Noise cancellation");
			return false;
		}
	}

	public boolean checkOnlyImageCapturing() throws InterruptedException {
		Thread.sleep(3000);
		imageCaptureButton_BeforeRecording.click();
		Thread.sleep(1000);
		secondAndAfterCaptureButton_BeforeRecording.click();
		Thread.sleep(1000);
		secondAndAfterCaptureButton_BeforeRecording.click();
		Thread.sleep(3000);
		imageVideo_Count_AfterImageCapture.click();
		RecordingVideoAndImagesActionsPage actionPage = new RecordingVideoAndImagesActionsPage(driver);
		if (actionPage.getVideos_Title().isDisplayed()) {
			log.info("Image capture successfull without starting Recording");
			actionPage.getX_Button().click();
			return true;
		} else {
			log.info("Image capture Unsuccessfull without starting Recording");
			actionPage.getX_Button().click();
			return false;
		}
	}

	public boolean checkNavigationToMediaActionScreen() throws InterruptedException {
		Thread.sleep(7000);
		start_Recording.click();
		Thread.sleep(1000);
		imageCaptureButton_DuringRecording.click();
		Thread.sleep(4000);// wait for record 4 seconds video
		stop_Recording.click();
		Thread.sleep(4000);
		imageVideo_Count_AfterRecording.click();
		RecordingVideoAndImagesActionsPage actionPage = new RecordingVideoAndImagesActionsPage(driver);
		if (actionPage.getVideos_Title().isDisplayed()) {
			log.info("User is on media action screen: Recorded video dispalyed");
			actionPage.getX_Button().click();
			return true;
		} else {
			log.info("Recorded video not displayed");
			actionPage.getX_Button().click();
			return false;
		}
	}

	public boolean checkVideoRecordingWithImageCapture() throws InterruptedException {
		Thread.sleep(2000);
		final_StartRecording.click();
		log.info("Recording started");
		Thread.sleep(1000);
		imageCaptureButton_DuringRecording.click();
		imageCaptureButton_DuringRecording.click();
		imageCaptureButton_DuringRecording.click();
		log.info("Image captured during Recording");
		Thread.sleep(3000);
		frontCamera_DuringRecording.click();
		log.info("Front camera open during Recording");
		Thread.sleep(8000);
		BackCamera_DuringRecording.click();
		log.info("Switch to Back camera during Recording");
		Thread.sleep(8000);
		stop_Recording.click();
		Thread.sleep(8000);
		continue_Button.click();
		Thread.sleep(5000);
		VideoPreviewScreen previewScreen = new VideoPreviewScreen(driver);
		if (previewScreen.getPlay_PauseButton().isDisplayed()) {
			log.info("video Preview is Displayed");
			return true;
		} else {
			log.info("video Preview is not Displayed");
			return false;
		}

	}

	@AndroidFindBy(xpath = "//android.view.View[10]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[5]")
	private WebElement cameraFunction_StartRecording;

	@AndroidFindBy(xpath = "//android.view.View[8]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[5]")
	private WebElement cameraStopRecording;

	public void cameraQualityFromSetting() throws InterruptedException {

		// checkVideoRecordingWithImageCapture();
		cameraFunction_StartRecording.click();
		log.info("Clicked on startRecording");
		Thread.sleep(10000);
		cameraStopRecording.click();
		log.info("Clicked on stop recording button");
		Thread.sleep(3000);
		continue_Button.click();
		log.info("Clicked on continue button");

//		log.info("Clicked on Camera quality button" );
//		boolean lowCamValue= cameraQuality_Low.isSelected();
//		String lowCamValue1= cameraQuality_Low.getText();
//		boolean lowCamValue2= cameraQuality_Low.isEnabled();
//		System.out.println("Boolean value low camera Quality is :-"+lowCamValue+"Boolean value low camera Quality is gettext :-"+lowCamValue1+"Boolean value low camera Quality is isEnabled :-"+lowCamValue2);
//		boolean value=cameraQuality_Medium.isEnabled();
//		System.out.println("Medium is enabled:-"+value);
	}

}
