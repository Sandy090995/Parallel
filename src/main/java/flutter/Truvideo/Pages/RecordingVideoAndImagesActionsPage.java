package flutter.Truvideo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class RecordingVideoAndImagesActionsPage extends UtilityClass{
	AppiumDriver driver;
	
	public RecordingVideoAndImagesActionsPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "Videos")
	 @iOSXCUITFindBy(accessibility = "Videos" )
	private WebElement videos_Title;
	
	public WebElement getVideos_Title() {
		return videos_Title;
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Duration')]")
	private WebElement firstVideo;
	
	public WebElement getFirstVideo() {
		return firstVideo;
	}
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	 @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]" )
		private WebElement x_Button;
	
	public WebElement getX_Button() {
		return x_Button;
	}
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Duration')]")
	private WebElement firstImage;
	
	
}
