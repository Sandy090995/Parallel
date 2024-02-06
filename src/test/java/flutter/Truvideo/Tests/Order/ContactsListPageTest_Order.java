package flutter.Truvideo.Tests.Order;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.ContactsListPage;
import flutter.Truvideo.Pages.RO_ListPage;

public class ContactsListPageTest_Order extends BaseClass{

	ContactsListPage contactsListPage;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		if(driver==null) {
		driver=setUpApplication();
		contactsListPage=loadDealerCodePage().navigateToUserListScreen_Order()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Order)
				.Navigate_To_Contacts();
		}else {
			RO_ListPage roListPage=new RO_ListPage(driver);
			roListPage.Navigate_To_Contacts();
		}
	}
	
	@BeforeMethod
	public void setDriverObject() {
		if(contactsListPage==null) {
			contactsListPage=new ContactsListPage(driver);
		}
	}
	
	//@AfterClass
	public void tearDown() {
		driver.quit();
	}
 
	@Test(priority = 1)
	public void verifyAllAvailableTabsOnContactsScreen() {
		Assert.assertTrue(contactsListPage.checkAllAvailableTabsOnContactsScreen());
	}
	
	@Test(priority = 2)
	public void verifySearchContacts() throws InterruptedException {
		Assert.assertTrue(contactsListPage.checkSearchContacts("Sandip Test"));
	}
	
	@Test(priority = 3)
	public void verifyAddToFavorite_withoutSearch() throws InterruptedException {
		Assert.assertTrue(contactsListPage.checkAddToFavorite_withoutSearch());
	}
	
	@Test(priority = 4)
	public void verifyRemoveFromFavorite() throws InterruptedException {
		Assert.assertTrue(contactsListPage.removeFromFavorite());
	}
	
	@Test(priority = 5)
	public void verifyCalling_Button() throws InterruptedException {
		Assert.assertTrue(contactsListPage.checkCalling_Button());
	}
	
	@Test(priority = 6)
	public void verifyAdd_Remove_Favorite_withSearch() {
		Assert.assertTrue(contactsListPage.checkAdd_Remove_Favorite_withSearch("Sandip Test"));
	}
	
	@Test(priority = 7)
	public void verifyCalling_withSearch () throws InterruptedException{
		Assert.assertTrue(contactsListPage.checkCalling_withSearch("Sandip Test"));
	}
	
}
