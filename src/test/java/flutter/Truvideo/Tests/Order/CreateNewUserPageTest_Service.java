package flutter.Truvideo.Tests.Order;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.CreateNewUserPage;
import flutter.Truvideo.Pages.UserListPage;

public class CreateNewUserPageTest_Service extends BaseClass{
	CreateNewUserPage createUser;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		if(driver==null) {
		driver=setUpApplication();
		createUser=loadDealerCodePage().navigateToUserListScreen_Order()
				.Navigate_To_CreateUserPage();
		}
	}
	
	@BeforeMethod
	public void setDriverObject() {
		if(createUser==null) {
			createUser=new CreateNewUserPage(driver);
		}
	}
	
	//@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	//@Test(priority = 1)
	public void verifyCancelButton_ServiceUserCreation() throws InterruptedException {
		Assert.assertTrue(createUser.check_cancelButton());
	}
	
	@Test(priority = 2)
	public void verifyErrorToastMessage_ServiceUserCreation() throws InterruptedException {
		UserListPage userList=new UserListPage(driver);	
		Assert.assertTrue(userList.Navigate_To_CreateUserPage().checkErrorMessage_NullValue());	
	}
	
	@Test(priority = 3)
	public void checkNewUserCreation_ServiceUserCreation() throws InterruptedException {
		createUser.checkNewUserCreationAndVerificationFromDashboard();
	}
	
}
