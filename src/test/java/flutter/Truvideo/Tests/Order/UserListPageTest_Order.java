package flutter.Truvideo.Tests.Order;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.CreateNewUserPage;
import flutter.Truvideo.Pages.UserListPage;

public class UserListPageTest_Order extends BaseClass {
	UserListPage userListPage ;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		if(driver==null) {
		driver=setUpApplication();
		userListPage=loadDealerCodePage().navigateToUserListScreen_Order();
		}
	}
	
	@BeforeMethod
	public void setDriverObject() {
		if (userListPage == null) {
			userListPage = new UserListPage(driver);
		}
	}
	
	//@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void verifyDealerName_And_RefreshButton_Order() throws Exception {
		Assert.assertTrue(userListPage.checkVisibleText_Icons());	
	}
	
	@Test(priority =2)
	public void verifyNavigationToCreateUserScreen_Order() throws InterruptedException {
		Assert.assertTrue(userListPage.checkCreateUserFunction());
		CreateNewUserPage createUserPage=new CreateNewUserPage(driver);
		createUserPage.getCancelButton().click();		
	}
	
	@Test(priority =3)
	public void verify_TextsUnderChangeDealerFunction_Order() {
		Assert.assertTrue(userListPage.check_TextsUnderChangeDealerFunction());
	}
	
	@Test(priority =4)
	public void verify_ChangeDealerFunction_Order() throws InterruptedException {
		Assert.assertTrue(userListPage.check_ChangeDealerFunction_Order());
	}
	
	@Test(priority = 5)
	public void verifyInvalidUserSearch_Order() throws InterruptedException {
		Assert.assertTrue(userListPage.checkForInvalidUser("mvnsdsdhj"));
	}
	
	@Test(priority = 6)
	public void verify_HelloThere_PersonalPinText_Order() throws Exception {
		Assert.assertTrue(userListPage.check_VisibleText_PersonalPinScreen("RahulTest test"));
	}
	
	@Test(priority = 7)
	public void verify_Login_InValidPin_Order() throws Exception {
		Assert.assertTrue(userListPage.selectUserToLogin_WitInvalidPin("RahulTest test"));
	}
	
	@Test(priority = 8)
	public void verify_Login_ValidPin_Order() throws Exception {
		Assert.assertTrue(userListPage.selectUserToLogin_WithValidPin("RahulTest test"));
	}
	
	//@Test(priority = 9)
	public void verifyDeletedUserSearch_Order() throws InterruptedException {
		Assert.assertTrue(userListPage.checkForInvalidUser(CreateNewUserPage.newUser));
	}
		
}

