package flutter.Truvideo.Tests;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.ContactsListPage;
import flutter.Truvideo.Pages.CreateNewUserPage;
import flutter.Truvideo.Pages.UserListPage;

public class CreateNewUserPageTest_Sales extends BaseClass{
	CreateNewUserPage createUser;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		driver=setUpApplication();
		createUser=loadDealerCodePage().navigateToUserListScreen_Sales()
				.Navigate_To_CreateUserPage();
	}
	
	@BeforeMethod
	public void setDriverObject() {
		if(createUser==null) {
			createUser=new CreateNewUserPage(driver);
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void verifyCancelButton_SalesUserCreation() throws InterruptedException {
		Assert.assertTrue(createUser.check_cancelButton());
	}
	
	@Test(priority = 2)
	public void verifyErrorToastMessage_SalesUserCreation() throws InterruptedException {
		UserListPage userList=new UserListPage(driver);
		Assert.assertTrue(userList.Navigate_To_CreateUserPage().checkErrorMessage_NullValue_Sales());	
	}
	
	@Test(priority = 3)
	public void checkNewUserCreation_SalesUserCreation() throws InterruptedException {
		createUser.checkNewUserCreation_Sales();
	}
}
