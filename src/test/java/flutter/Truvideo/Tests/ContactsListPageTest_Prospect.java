package flutter.Truvideo.Tests;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.ContactsListPage;

public class ContactsListPageTest_Prospect extends BaseClass{

	ContactsListPage contactsListPage;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		driver=setUpApplication();
		contactsListPage=loadDealerCodePage().navigateToUserListScreen_Sales()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Sales)
				.Navigate_To_Contacts();
	}
	
	@BeforeMethod
	public void setDriverObject() {
		if(contactsListPage==null) {
			contactsListPage=new ContactsListPage(driver);
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void verifyAllAvailableTabsOnContactsScreen() {
		contactsListPage=new ContactsListPage(driver);
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
