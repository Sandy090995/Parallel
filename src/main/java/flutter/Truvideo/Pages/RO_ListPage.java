package flutter.Truvideo.Pages;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import flutter.Truvideo.Utils.UtilityClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class RO_ListPage extends UtilityClass {
	AppiumDriver driver;

	public RO_ListPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	String eneterdOrder_Prospect;

	@AndroidFindBy(accessibility = "Orders")
	@iOSXCUITFindBy(accessibility = "Orders")
	private WebElement orders_PageTitle;

	public WebElement getOrderPageTitle() {
		return orders_PageTitle;
	}

	@AndroidFindBy(accessibility = "Prospects")
	@iOSXCUITFindBy(accessibility = "Prospects")
	private WebElement prospects_PageTitle;
	
	public WebElement getprospects_PageTitle() {
		return prospects_PageTitle;
	}
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	private WebElement searchButton;// modified

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]")
	private WebElement reFreshButton;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]")
	private WebElement profileIcon;

	@AndroidFindBy(xpath = "//android.view.View[2][@clickable='true']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]")
	private WebElement screentap; // require when profile icon is opened

	@AndroidFindBy(xpath = "//android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	private WebElement searchBar;

	@AndroidFindBy(xpath = "//android.view.View[@index='1']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TruVideo Enterprise\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]")
	private WebElement seachBarCancelButton;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
			
	private WebElement searchBarBackButton;// modified

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name,'752')]")
	private List<WebElement> searchResults;// new//make it common for IOS & Android
	
	@AndroidFindBy(accessibility = "Chat")
	@iOSXCUITFindBy(accessibility = "Chat")
	private WebElement chatFooterTab;

	@AndroidFindBy(accessibility = "Messages")
	@iOSXCUITFindBy(accessibility = "Messages")
	private WebElement messageFooterTab;

	@AndroidFindBy(accessibility = "Contacts")
	@iOSXCUITFindBy(accessibility = "Contacts")
	private WebElement contactsFooterTab;

	@AndroidFindBy(accessibility = "Orders")
	@iOSXCUITFindBy(accessibility = "Orders")
	private WebElement ordersFooterTab;

	@AndroidFindBy(accessibility = "Prospects")
	@iOSXCUITFindBy(accessibility = "Prospects")
	private WebElement prospectsFooterTab;

	@AndroidFindBy(accessibility = "CREATE")
	@iOSXCUITFindBy(accessibility = "CREATE")
	private WebElement createButton;

	public WebElement getCreateButton() {
		return createButton;
	}

	@AndroidFindBy(accessibility = "ALL")
	@iOSXCUITFindBy(accessibility = "ALL")
	private WebElement allFilter;

	@AndroidFindBy(accessibility = "MY")
	@iOSXCUITFindBy(accessibility = "MY")
	private WebElement myFilter;

	@AndroidFindBy(accessibility = "NEW")
	@iOSXCUITFindBy(accessibility = "NEW")
	private WebElement newFilter;

	@AndroidFindBy(accessibility = "REJECTED")
	@iOSXCUITFindBy(accessibility = "REJECTED")
	private WebElement rejectedFilter;

	@AndroidFindBy(xpath = "//android.view.View[6]/android.view.View/android.view.View")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'New')]")
	private List<WebElement> filterStatusList;

	public boolean checkAllFooterTab_and_HederTabs() throws Exception {
		Thread.sleep(1000);
		log.info("inside Footer tab method");
		if (chatFooterTab.isDisplayed() && messageFooterTab.isDisplayed() && contactsFooterTab.isDisplayed()
				&& createButton.isDisplayed() && reFreshButton.isDisplayed() && profileIcon.isDisplayed()) {
			log.info("All Footer tabs, Header tabs & Create button are Present on RO Screen");

			return true;
		} else {
			log.info("All Footer tabs, Header tabs & Create button are not Present on RO Screen");
			return false;
		}
	}

	public boolean checkSearchRO_ProspectFunction(String orderNumber_ProspectName) throws InterruptedException {
		searchButton.click();
		searchBarBackButton.click();
		log.info("RO/Prospects Search--  SearchBar Closed ");
		searchButton.click();
		searchBar.click();
		searchBar.sendKeys(orderNumber_ProspectName);
		eneterdOrder_Prospect=searchBar.getText();
		Thread.sleep(4000);
		if (searchBar.getText() != null) {
				if (isAndroid()) {
					if(searchResults.get(0).getAttribute("content-desc").contains(searchBar.getText())) {
					log.info("Search Function working");
					}
				}else if(isiOS()) {
					if(searchResults.get(0).getAttribute("label").contains(searchBar.getText())) {
						log.info("Search Function working");
				}
			}
				searchBarBackButton.click();
				return true;
		}else{
			searchBarBackButton.click();
			return false;
		}
		
	}

	public boolean checkRO_Prospects_Status_New() throws Exception {
		newFilter.click();
		Thread.sleep(1000);
		Set<String> statusList = new HashSet<String>();
		if (statusList == null || statusList.isEmpty()) {
			for (WebElement statusObject : filterStatusList) {
				if (isAndroid()) {
					statusList.add(statusObject.getAttribute("content-desc"));
				}else if(isiOS()) {
					statusList.add(statusObject.getAttribute("label"));
				}
			}
			for (String status : statusList) {
				if (status.contains("New")) {
					log.info("In new :->Status is :->" + status);
				}
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean checkRO_Status_Rejected() throws Exception {
		rejectedFilter.click();
		Thread.sleep(1000);
		Set<String> statusList = new HashSet<String>();
		if (statusList == null || statusList.isEmpty()) {
			for (WebElement statusObject : filterStatusList) {
				if (isAndroid()) {
					statusList.add(statusObject.getAttribute("content-desc"));
				}else if (isiOS()) {
					statusList.add(statusObject.getAttribute("label"));
				}
			}
			for (String status : statusList) {
				if (status.contains("Rejected")) {
					log.info("In Rejected :->Status is :->" + status);
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkRO_Prospects_Status_All() throws Exception {
		allFilter.click();
		Thread.sleep(1000);
		Set<String> statusList = new HashSet<String>();
		if (statusList == null || statusList.isEmpty()) {
			for (WebElement statusObject : filterStatusList) {
				if (isAndroid()) {
					statusList.add(statusObject.getAttribute("content-desc"));
				}else if(isiOS()){
					statusList.add(statusObject.getAttribute("label"));
				}
			}
			for (String status : statusList) {
				if ((status.contains("Sent")||status.contains("New")||status.contains("For Review")||status.contains("Viewed"))) {
					log.info("In Rejected :->Status is :->" + status);
				}
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean checkRO_Status_My() throws Exception {
		OrderDetailsPage orderDetails=new OrderDetailsPage(driver);
		myFilter.click();
		Thread.sleep(1000);
		if (!filterStatusList.isEmpty()) {
			for (WebElement statusObject : filterStatusList) {
				try {
					statusObject.click();
					if (orderDetails.getTechnicianName().getText().contains(UserListPage.userName)
							|| orderDetails.getAdvisorName().getText().contains(UserListPage.userName)) {
						log.info("The RO in My Filter is of Login technician is " + orderDetails.getTechnicianName().getText()
								+ " Advisor is " + orderDetails.getAdvisorName().getText());
						Thread.sleep(1000);
						orderDetails.getBackButton().click();
						log.info("Return back to ROList screen");
					
					}else {
						orderDetails.getBackButton().click();
						return false;
					}

				} catch (Exception e) {
					orderDetails.getBackButton().click();
				}
			}
			return true;
		} else {
			log.info("The RO in My Filter is not of Login technician or advisor");
			return false;
		}
	}

	public boolean checkNavigationTo_Chat() throws InterruptedException {
		Navigate_To_Chat();
		ChatListPage chatPage = new ChatListPage(driver);
		waitTillElementToBeVisible(chatPage.getChat_Title(),10,1);
		if (chatPage.getChat_Title().isDisplayed()) {
			log.info("user is navigated to the chat screen");
			return true;
		} else {
			return false;
		}
	}
	
	public ChatListPage Navigate_To_Chat() throws InterruptedException {
		  Thread.sleep(3000);
			chatFooterTab.click();
			return new ChatListPage(driver);
		}

	public boolean checkNavigationTo_Messages() {
		Navigate_To_MessageList();
		MessagesListPage messagePage = new MessagesListPage(driver);
		waitTillElementToBeVisible(messagePage.getMessage_Title(), 3);
		if (messagePage.getMessage_Title().isDisplayed()) {
			log.info("user is navigated to the Messages screen");
			return true;
		} else {
			return false;
		}
	}
	
	public MessagesListPage Navigate_To_MessageList() {
		messageFooterTab.click();
		return new MessagesListPage(driver);
	}

	public boolean checkNavigationTo_Contacts() {
		Navigate_To_Contacts();
		ContactsListPage contactPage = new ContactsListPage(driver);
		waitTillElementToBeVisible(contactPage.getContacts_Title(), 3);
		if (contactPage.getContacts_Title().isDisplayed()) {
			log.info("user is navigated to the Contacts screen");
			return true;
		} else {
			return false;
		}
	}
	
	public ContactsListPage Navigate_To_Contacts() {
		contactsFooterTab.click();
		return new ContactsListPage(driver);	
	}

	public boolean checkNavigationBackTo_Order() {
		ordersFooterTab.click();
		if (orders_PageTitle.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkNavigationBackTo_Prospects() {
		prospectsFooterTab.click();
		if (prospects_PageTitle.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkNavigationToProfileIcon() throws InterruptedException {
		Navigate_ToProfileIcon();
		log.info("Clicked on Profile Icon");
		ProfileIconScreen profileScreen = new ProfileIconScreen(driver);
		if (profileScreen.getLogOut_Button().isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public ProfileIconScreen Navigate_ToProfileIcon() throws InterruptedException {
		Thread.sleep(7000);
		profileIcon.click();
		return new ProfileIconScreen(driver);
	}

	public boolean checkNavigationTo_AddOrder_Page() {
		NavigateTo_AddOrder_Page();
		AddOrderPage addOrderPage = new AddOrderPage(driver);	
		if (addOrderPage.getAddOrder_Title().isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkNavigationTo_AddProspect_Page() {
		NavigateTo_AddProspect_Page();
		AddProspectPage addProspectPage = new AddProspectPage(driver);	
		if (addProspectPage.getAddProspect_Title().isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public AddOrderPage NavigateTo_AddOrder_Page() {
		createButton.click();
		return new AddOrderPage(driver);
	}
	
	public AddProspectPage NavigateTo_AddProspect_Page() {
		createButton.click();
		return new AddProspectPage(driver);
	}

	public OrderDetailsPage navigateToOrderDetail_FirstNew() {
		newFilter.click();
		log.info("Clicked on new tab");
		filterStatusList.get(0).click();
		log.info("Selected First RO" );
		return new OrderDetailsPage(driver);
	}
	
	public boolean checkNavigationTo_AddProspects_Page() {
		NavigateTo_AddProspect_Page();
		AddProspectPage addProspectsPage = new AddProspectPage(driver);
		if (addProspectsPage.getAddProspect_Title().isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkProspects_Status_My() throws Exception {
		ProspectDetailsPage prospectDetail=new ProspectDetailsPage(driver);
		myFilter.click();
		Thread.sleep(1000);
		if (!filterStatusList.isEmpty()) {
			for (WebElement statusObject : filterStatusList) {
				try {
					statusObject.click();
					if (prospectDetail.getSalesAgentName().getText().contains(UserListPage.userName)) {
						log.info("The Prospects in My Filter is of Login Agent" + prospectDetail.getSalesAgentName().getText());
						Thread.sleep(1000);
						prospectDetail.getBackButton().click();
						log.info("Return back to Prospects List screen");
					} else {
						prospectDetail.getBackButton().click();
						return false;
					}
				} catch (Exception e) {
					prospectDetail.getBackButton().click();
				}
			}
			return true;
		} else {
			return false;
		}
	}

}
