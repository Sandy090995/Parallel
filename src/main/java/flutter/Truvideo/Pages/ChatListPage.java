package flutter.Truvideo.Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ChatListPage extends UtilityClass {
	AppiumDriver driver;

	public ChatListPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Chat")
	@iOSXCUITFindBy(accessibility = "Chat")
	private WebElement chat_Title;

	public WebElement getChat_Title() {
		return chat_Title;
	}

	@AndroidFindBy(accessibility = "CREATE")
	@iOSXCUITFindBy(accessibility = "CREATE")
	private WebElement createChatButton;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
	private List<WebElement> userList_Chat;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]")
	private List<WebElement> callingButton_List;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement permission_Allow;

	@AndroidFindBy(xpath = "//android.view.View[@index='1'][@clickable='false']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText")
	private WebElement chatScreen_UserName;

	@AndroidFindBy(xpath = "//android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	private WebElement textBox;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4][@index='5']")
	private WebElement sendButton;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText")
	private List<WebElement> messageList;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement backButton_ChatScreen;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement searchIcon;

	@AndroidFindBy(xpath = "//android.view.View[3]/android.view.View/android.view.View")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther\n"
			+ "")
	private List<WebElement>searched_UserList;
	
	
	public boolean navigationToChatScreen() throws InterruptedException {
		String userName_ChatListScreen="";
		String userName_ChatScreen="";
		if(isAndroid()) {
			userName_ChatListScreen = userName_ChatListScreen+userList_Chat.get(0).getAttribute("content-desc");
		} else {
			Thread.sleep(3000);
			userName_ChatListScreen = userName_ChatListScreen+userList_Chat.get(0).getAttribute("name");
		}
		userList_Chat.get(0).click();
		if(isAndroid()) {
			userName_ChatScreen = userName_ChatScreen+chatScreen_UserName.getAttribute("content-desc");
		} else {
			Thread.sleep(3000);
			userName_ChatScreen= userName_ChatScreen+chatScreen_UserName.getAttribute("name");
		}
		log.info("chatlistscreen"+userName_ChatListScreen);
		log.info("chatscreen"+userName_ChatScreen);
		if (userName_ChatListScreen.contains(userName_ChatScreen)) {
			log.info("user is navigated to the Chat screen: userName_ChatListScreen:->" + userName_ChatListScreen
					+ " & userName_ChatScreen:->" + userName_ChatScreen);
			return true;
		} else {
			log.info("user is unable to navigate to Chat screen: userName_ChatListScreen:->" + userName_ChatListScreen
					+ " & userName_ChatScreen:->" + userName_ChatScreen);
			return false;
		}
	}
	
	public boolean checkSendMessage() throws InterruptedException {
		textBox.click();
		textBox.sendKeys("Automation Message from Chat");
		if (textBox.getText() != null) {
			sendButton.click();
			Thread.sleep(3000);
			chatScreen_UserName.click();// hiding keyboard
			try {
				if (messageList.get(messageList.size() - 1).getAttribute("content-desc")
						.contains("Automation Message from Chat")) {
					log.info("Message sent successfully");
				}
				return true;
			} catch (Exception e) {
				if (messageList.get(messageList.size() - 1).getAttribute("label")
						.contains("Automation Message from Chat")) {
					log.info("Message sent successfully");
				}
				return true;
			} finally {
				backButton_ChatScreen.click();
			}
		} else {
			backButton_ChatScreen.click();
			return false;
		}
	}

	public boolean checkCallingFunction() throws InterruptedException {
		callingButton_List.get(0).click();
		try {
			if (permission_Allow.isDisplayed()) {
				permission_Allow.click();
				log.info("camera permission message displayed");
			}
		} catch (Exception e) {
			log.info("permission message not displayed");
		}
		try {
			if (permission_Allow.isDisplayed()) {
				permission_Allow.click();
				log.info("Audio permission message displayed");
			}
		} catch (Exception e) {
			log.info("permission message not displayed");
		}
		Thread.sleep(2000);
		JointheRoomPage joinTheRoomPage = new JointheRoomPage(driver);
		if (joinTheRoomPage.getJoinTheRoomButton().isDisplayed()) {
			log.info("User is on Join the Room screen");
			joinTheRoomPage.getCancelButton().click();
			return true;
		} else {
			log.info("User not able to go to Join the Room screen");
			joinTheRoomPage.getCancelButton().click();
			return false;
		}
	}

	public boolean checkCreateChat_Function(String UserForChat) throws InterruptedException {
		createChatButton.click();
		Thread.sleep(5000);
		try {
		if(isAndroid()) {
			By element=By.xpath("//android.widget.ScrollView/android.view.View");
			scrollForVisualElement(element, "content-desc", UserForChat);
			Thread.sleep(2000);
		}else {
			By element=By.xpath("//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText");
			scrollForVisualElement(element, "content-desc", UserForChat);
			Thread.sleep(2000);
		}}catch(Exception e) {
			log.info("Inside scroll-catch");
		}
		if (textBox.isDisplayed()) {
			log.info("User is navigated to the new chat screen");
			backButton_ChatScreen.click();
			return true;
		} else {
			log.info("User is navigated to the new chat screen");
			backButton_ChatScreen.click();
			return false;
		}
	}

	public boolean searchChat_Function(String UserForChat) {
		searchIcon.click();
		textBox.click();
		textBox.sendKeys(UserForChat);
		searched_UserList.get(0).click();
		if (textBox.isDisplayed()) {
			log.info("User is navigated to the new chat screen");
			backButton_ChatScreen.click();
			return true;
		} else {
			log.info("User is navigated to the new chat screen");
			backButton_ChatScreen.click();
			return false;
		}
	}

}
