package flutter.Truvideo.Pages;

import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MessagesListPage extends UtilityClass {
	AppiumDriver driver;

	public MessagesListPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Message")
	@iOSXCUITFindBy(accessibility = "Message")
	private WebElement messages_Title;

	public WebElement getMessage_Title() {
		return messages_Title;
	}

	@AndroidFindBy(accessibility = "MY")
	@iOSXCUITFindBy(accessibility = "MY")
	private WebElement myFilter;

	public WebElement getFilter_My() {
		return myFilter;
	}

	@AndroidFindBy(accessibility = "MY ACTIVE")
	@iOSXCUITFindBy(accessibility = "MY ACTIVE")
	private WebElement myActiveFilter;

	public WebElement getFilter_MyActive() {
		return myActiveFilter;
	}

	@AndroidFindBy(accessibility = "ALL")
	@iOSXCUITFindBy(accessibility = "ALL")
	private WebElement allFilter;

	public WebElement getFilter_All() {
		return allFilter;
	}

	@AndroidFindBy(accessibility = "ALL ACTIVE")
	@iOSXCUITFindBy(accessibility = "ALL ACTIVE")
	private WebElement allActiveFilter;

	public WebElement getFilter_AllActive() {
		return allActiveFilter;
	}

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement searchIcon;

	public WebElement getSearchIcon() {
		return searchIcon;
	}

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]")
	private WebElement reFreshButton;

	public WebElement getRefreshButton() {
		return reFreshButton;
	}

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]")
	private WebElement profileIcon;

	public WebElement getProfileIconButton() {
		return profileIcon;
	}

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Open')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Open')]")
	private List<WebElement> status_Open;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Responded')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Responded')]")
	private List<WebElement> status_Resopned;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Closed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Closed')]")
	private List<WebElement> status_Closed;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc , 'Open')  or contains(@content-desc,'Responded') or contains(@content-desc,'Closed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Open') or contains(@label,'Responded') or contains(@label,'Closed') ]")
	private List<WebElement> statusListAll;

	public WebElement sentMessageByLoginUser(String advisorName) {
		if (isAndroid()) {
			return driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'" + advisorName + "')]"));
		} else {
			return driver.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@label,'" + advisorName + "')]"));
		}
	}

	public boolean checkFilter_AllActive() throws InterruptedException {
		allActiveFilter.click();
		Thread.sleep(3000);
		boolean flag = false;
		Set<String> statusList = new HashSet<String>();
		if (statusList == null || statusList.isEmpty()) {
			for (WebElement statusObject : statusListAll) {
				if (isAndroid()) {
					statusList.add(statusObject.getAttribute("content-desc"));
				} else {
					statusList.add(statusObject.getAttribute("label"));
				}
			}
			for (String status : statusList) {
				if (status.contains("Open")) {
					log.info("Message List Screen :- In All Active :->Status is :->" + status);
					flag = true;
				}
				if (flag == false) {
					log.info("Message List Screen :- In All Active :->Status is :->" + status);
					break;
				}
			}
			return flag;
		} else if (statusListAll.isEmpty()) {
			log.info("Message List Screen :- The Message list is empty");
			return true;
		}
		return flag;
	}

	public boolean checkFilter_All() throws InterruptedException {
		allFilter.click();
		Thread.sleep(3000);
		boolean flag = false;
		Set<String> statusList = new HashSet<String>();
		if (statusList == null || statusList.isEmpty()) {
			for (WebElement statusObject : statusListAll) {
				if (isAndroid()) {
					statusList.add(statusObject.getAttribute("content-desc"));
				} else {
					statusList.add(statusObject.getAttribute("label"));
				}
			}
			for (String status : statusList) {
				if (status.contains("Open") || status.contains("Responded") || status.contains("Closed")) {
					log.info("Message List Screen :- In All Active :->Status is :->" + status);
					flag = true;
				}
				if (flag == false) {
					break;
				}
			}
			return flag;
		} else if (statusListAll.isEmpty()) {
			log.info("Message List Screen :- The Message list is empty");
			return true;
		}
		return flag;
	}

	public boolean checkFilter_My_Active() throws Exception {
		String loginUserMessage;
		boolean flag = false;
		boolean isOwnMessage = false;
		MessagingScreen messagingScreen = new MessagingScreen(driver);
		myActiveFilter.click();
		Thread.sleep(1000);
		if (!statusListAll.isEmpty()) {
			for (WebElement statusObject : statusListAll) {
				statusObject.click();
				try {
					if (messagingScreen.getConversationStatus_Open().isDisplayed()
							&& sentMessageByLoginUser(UserListPage.userName).isDisplayed()) {
						isOwnMessage = true;
						if (isAndroid()) {
							loginUserMessage = sentMessageByLoginUser(UserListPage.userName)
									.getAttribute("content-desc");
						} else {
							loginUserMessage = sentMessageByLoginUser(UserListPage.userName).getAttribute("label");
						}
						log.info("Message List Screen :- In My Active Filter RO is of Login User and status is Open: "
								+ loginUserMessage);
					} else {
						isOwnMessage = false;
					}
				} catch (NoSuchElementException e) {
					if (e.getStackTrace().toString().contains("Exception")) {
						isOwnMessage = false;
					}
					log.error("Message List Screen :- Exception while processing conversation status", e);
				} finally {
					messagingScreen.getBackButton().click();
					if (isOwnMessage == false) {
						break;
					}
				}
			}
			flag = isOwnMessage;
		} else if (statusListAll.isEmpty()) {
			log.info("Message List Screen :- The Message list is empty");
			return true;
		}
		return flag;
	}

	public boolean checkFilter_My() throws Exception {
		String loginUserMessage;
		boolean flag = false;
		boolean isOwnMessage = false;
		MessagingScreen messagingScreen = new MessagingScreen(driver);
		myFilter.click();
		Thread.sleep(1000);
		if (!statusListAll.isEmpty()) {
			for (WebElement statusObject : statusListAll) {
				statusObject.click();
				try {
					if (sentMessageByLoginUser(UserListPage.userName).isDisplayed()) {
						isOwnMessage = true;
						if (isAndroid()) {
							loginUserMessage = sentMessageByLoginUser(UserListPage.userName)
									.getAttribute("content-desc");
						} else {
							loginUserMessage = sentMessageByLoginUser(UserListPage.userName).getAttribute("label");
						}
						log.info("Message List Screen :- In My Active Filter RO is of Login User & message is "
								+ loginUserMessage);
					} else {
						isOwnMessage = false;
					}
				} catch (NoSuchElementException e) {
					if (e.getStackTrace().toString().contains("Exception")) {
						isOwnMessage = false;
					}
					log.error("Message List Screen :- Exception while processing conversation status", e);
				} finally {
					messagingScreen.getBackButton().click();
					if (isOwnMessage == false) {
						break;
					}
				}
			}
			flag = isOwnMessage;
		} else if (statusListAll.isEmpty()) {
			log.info("Message List Screen :- The Message list is empty");
			return true;
		}
		return flag;
	}

	public boolean navigationToMessagingScreen() {
		navigateToMessagingScreen();
		MessagingScreen messagingScreen = new MessagingScreen(driver);
		if (messagingScreen.getMessage_Title().isDisplayed()) {
			log.info("Message List Screen :- User is navigated to the messaging screen");
			return true;
		} else {
			log.info("Message List Screen :- User is unable to navigate to the messaging screen");
			return false;
		}
	}

	public MessagingScreen navigateToMessagingScreen() {
		myActiveFilter.click();
		if (statusListAll.isEmpty()) {
			myFilter.click();
		}
		statusListAll.get(0).click();
		return new MessagingScreen(driver);
	}

}
