package flutter.Truvideo.Tests;

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
		driver=setUpApplication();
		userListPage=loadDealerCodePage().navigateToUserListScreen_Order();
	}
	
	@Override
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void verifyDealerName_And_RefreshButton() throws Exception {
		Assert.assertTrue(userListPage.checkVisibleText_Icons());	
	}
	
	@Test(priority =2)
	public void verifyCreateUserFunction() throws InterruptedException {
		Assert.assertTrue(userListPage.checkCreateUserFunction());
		
	}
	
	@Test(priority =3)
	public void verify_TextsUnderChangeDealerFunction() {
		Assert.assertTrue(userListPage.check_TextsUnderChangeDealerFunction());
	}
	
	@Test(priority =4)
	public void verify_ChangeDealerFunction() throws InterruptedException {
		Assert.assertTrue(userListPage.check_ChangeDealerFunction());
	}
	
	@Test(priority = 5)
	public void verifyInvalidUserSearch() throws InterruptedException {
		Assert.assertTrue(userListPage.checkForInvalidUser("mvnsdsdhj"));
	}
	
	@Test(priority = 6)
	public void verify_HelloThere_PersonalPinText() throws Exception {
		Assert.assertTrue(userListPage.check_VisibleText_PersonalPinScreen("RahulTest test"));
	}
	
	@Test(priority = 7)
	public void verify_Login_InValidPin() throws Exception {
		Assert.assertTrue(userListPage.selectUserToLogin_WitInvalidPin("RahulTest test"));
	}
	
	@Test(priority = 8)
	public void verify_Login_ValidPin() throws Exception {
		Assert.assertTrue(userListPage.selectUserToLogin_WithValidPin("RahulTest test"));
	}
	
	//@Test(priority = 9)
	public void verifyDeletedUserSearch() throws InterruptedException {
		Assert.assertTrue(userListPage.checkForInvalidUser(CreateNewUserPage.newUser));
	}
		
}

