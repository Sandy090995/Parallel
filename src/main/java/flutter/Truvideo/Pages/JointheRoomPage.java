package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class JointheRoomPage extends UtilityClass {

	AppiumDriver driver;

	public JointheRoomPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "JOIN THE ROOM")
	@iOSXCUITFindBy(accessibility = "JOIN THE ROOM")
	private WebElement joinTheRoomButton;

	public WebElement getJoinTheRoomButton() {
		return joinTheRoomButton;
	}

	@AndroidFindBy(xpath = "//android.view.View[2]/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeOther[1]")
	private WebElement audioButton;
	
	public WebElement getAudioIconButton() {
		return audioButton;
	}

	@AndroidFindBy(xpath = "//android.view.View[2]/android.view.View[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeOther[2]")
	private WebElement videoButton;
	
	public WebElement getVideoIconButton() {
		return videoButton;
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement cancelButton;

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public boolean verifyJoinTheRoom() {
		if (joinTheRoomButton.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

}
