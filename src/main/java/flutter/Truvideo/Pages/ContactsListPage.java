package flutter.Truvideo.Pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ContactsListPage extends UtilityClass {
	AppiumDriver driver;

	public ContactsListPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Contacts")
	@iOSXCUITFindBy(accessibility = "Contacts")
	private WebElement contacts_Title;

	public WebElement getContacts_Title() {
		return contacts_Title;
	}

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement searchIconButton;

	@AndroidFindBy(xpath = "//android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	private WebElement searchBar;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement back_Button_BeforeEnteringText;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement back_Button_AfterEnteringText;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]")
	private WebElement refreshButton;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'ALL')]")
	@iOSXCUITFindBy(accessibility = "ALL")
	private WebElement allTab;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'FAVORITES')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'FAVORITES')]")
	private WebElement favoritesTab;

	@AndroidFindBy(xpath = "//android.view.View[@long-clickable='true']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
	private List<WebElement> contactsList;

	@AndroidFindBy(xpath = "//android.view.View[@long-clickable='true']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
	private List<WebElement> contactsList_AfterSearch;

	@AndroidFindBy(xpath = "//android.view.View[@long-clickable='true']/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]")
	private List<WebElement> addToFavorite_Button_WithoutSearch;

	@AndroidFindBy(xpath = "//android.view.View[@long-clickable='true']/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]")
	private List<WebElement> addToFavorite_Button;

	@AndroidFindBy(xpath = "//android.view.View[@long-clickable='true']/android.view.View[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]")
	private List<WebElement> call_Button_WithouSearch;

	@AndroidFindBy(xpath = "//android.view.View[@long-clickable='true']/android.view.View[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]")
	private List<WebElement> call_Button;

	@AndroidFindBy(accessibility = "YOU HAVE NO FAVORITES")
	@iOSXCUITFindBy(accessibility = "YOU HAVE NO FAVORITES")
	private WebElement youHaveNoFavorites_Text;

	@AndroidFindBy(accessibility = "Added to favorite contacts.")
	@iOSXCUITFindBy(accessibility = "Added to favorite contacts.")
	private WebElement addedToFavoriteContacts_Text;

	@AndroidFindBy(accessibility = "Removed from favorite contacts.")
	@iOSXCUITFindBy(accessibility = "Removed from favorite contacts.")
	private WebElement removedFromFavorite_text;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='While using the app' or @text='WHILE USING THE APP']")
	@iOSXCUITFindBy(accessibility = "OK")
	private WebElement permission_Allow;

	public boolean checkAllAvailableTabsOnContactsScreen() {
		if (allTab.isDisplayed() && favoritesTab.isDisplayed()
				&& addToFavorite_Button_WithoutSearch.get(0).isDisplayed()
				&& call_Button_WithouSearch.get(0).isDisplayed() && searchIconButton.isDisplayed()
				&& refreshButton.isDisplayed()) {
			log.info("All Important tabs are available on screen");
			return true;
		} else {
			return false;
		}
	}

	public boolean checkSearchContacts(String contactForSearch) throws InterruptedException {
		searchIconButton.click();
		log.info("Search screen is opened");
		back_Button_BeforeEnteringText.click();
		log.info("Search screen is closed");
		searchIconButton.click();
		log.info("Search screen is opened");
		searchBar.click();
		searchBar.sendKeys(contactForSearch);
		String enteredContactName;
		if (isAndroid()) {
			enteredContactName = searchBar.getText();
		} else {
			enteredContactName = searchBar.getAttribute("value");
		}
		boolean flag = false;
		if (!enteredContactName.isEmpty()) {
			if (isAndroid()) {
				if (contactsList_AfterSearch.get(0).getAttribute("content-desc").equalsIgnoreCase(enteredContactName)) {
					log.info("Search Function is Working");
					back_Button_AfterEnteringText.click();
					flag = true;
					return flag;
				}
			} else {
				System.out.println("Name enterd" + enteredContactName);
				Thread.sleep(1000);
				// System.out.println("Name
				// searched"+contactsList_AfterSearch.get(0).getAttribute("name"));
				if (!contactsList_AfterSearch.isEmpty()) {
					log.info("Search Function is Working");
					back_Button_AfterEnteringText.click();
					flag = true;
					return flag;
				}
			}
		} else {
			log.info("Search Function is Not Working");
			back_Button_AfterEnteringText.click();
			flag = false;
			return flag;
		}
		return flag;
	}

	public boolean checkAddToFavorite_withoutSearch() throws InterruptedException {
		addToFavorite_Button_WithoutSearch.get(0).click();
		log.info("First Contact added to Favorite");
		addToFavorite_Button_WithoutSearch.get(1).click();
		log.info("Second Contact added to Favorite");
		Thread.sleep(1000);
		favoritesTab.click();
		if (addToFavorite_Button_WithoutSearch.get(0).isDisplayed()
				&& addToFavorite_Button_WithoutSearch.get(1).isDisplayed()) {
			log.info("Add to favorite working fine");
			return true;
		} else {
			log.info("Add to favorite not working");
			return false;
		}
	}

	public boolean removeFromFavorite() throws InterruptedException {
		addToFavorite_Button_WithoutSearch.get(0).click();
		log.info("First Contact Removed from Favorite");
		addToFavorite_Button_WithoutSearch.get(0).click();
		log.info("Second Contact Removed from Favorite");
		Thread.sleep(500);
		if (removedFromFavorite_text.isDisplayed() && youHaveNoFavorites_Text.isDisplayed()) {
			log.info("Removed from Favorite Working fine");
			Thread.sleep(2000);
			allTab.click();
			return true;
		} else {
			log.info("Removed from Favorite Not Working");
			allTab.click();
			return false;
		}
	}

	public boolean checkCalling_Button() throws InterruptedException {
		call_Button_WithouSearch.get(0).click();
		try {
			permission_Allow.click();
			Thread.sleep(2000);
			permission_Allow.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(3000);
		JointheRoomPage joinTheRoom = new JointheRoomPage(driver);
		if (joinTheRoom.getJoinTheRoomButton().isDisplayed()) {
			log.info("Join The Room Screen Is Dispalyed");
			joinTheRoom.getCancelButton().click();
			return true;
		} else {
			log.info("Join The Room Screen Not Dispalyed");
			joinTheRoom.getCancelButton().click();
			return false;
		}
	}

	public boolean checkAdd_Remove_Favorite_withSearch(String contactForSearch) {
		searchIconButton.click();
		log.info("Search screen is opened");
		back_Button_BeforeEnteringText.click();
		log.info("Search screen is closed");
		searchIconButton.click();
		log.info("Search screen is opened");
		searchBar.click();
		searchBar.sendKeys(contactForSearch);
		addToFavorite_Button.get(0).click();
		if (addedToFavoriteContacts_Text.isDisplayed()) {
			log.info("Search Contact added to Favorite List");
			addToFavorite_Button.get(0).click();
			if (removedFromFavorite_text.isDisplayed()) {
				log.info("Search Contact Removed from Favorite List");
				back_Button_AfterEnteringText.click();
			}
			return true;
		} else {
			log.info("Search Contact, failed to add to Favorite List");
			back_Button_AfterEnteringText.click();
			return false;
		}
	}

	public boolean checkCalling_withSearch(String contactForSearch) throws InterruptedException {
		searchIconButton.click();
		log.info("Search screen is opened");
		back_Button_BeforeEnteringText.click();
		log.info("Search screen is closed");
		searchIconButton.click();
		log.info("Search screen is opened");
		searchBar.click();
		searchBar.sendKeys(contactForSearch);
		Thread.sleep(2000);
		call_Button.get(0).click();
		Thread.sleep(3000);
		JointheRoomPage joinTheRoom = new JointheRoomPage(driver);
		if (joinTheRoom.getJoinTheRoomButton().isDisplayed()) {
			log.info("Join The Room Screen Is Dispalyed");
			joinTheRoom.getCancelButton().click();
			return true;
		} else {
			log.info("Join The Room Screen Not Dispalyed");
			joinTheRoom.getCancelButton().click();
			return false;
		}
	}

}
