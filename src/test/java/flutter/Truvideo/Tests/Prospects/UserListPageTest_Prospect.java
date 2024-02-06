package flutter.Truvideo.Tests.Prospects;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.CreateNewUserPage;
import flutter.Truvideo.Pages.UserListPage;

public class UserListPageTest_Prospect extends BaseClass {
	UserListPage userListPage;

	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		if(driver==null) {
		driver = setUpApplication();
		userListPage = loadDealerCodePage().navigateToUserListScreen_Sales();
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
	public void verifyDealerName_And_RefreshButton_Sales() throws Exception {
		Assert.assertTrue(userListPage.checkVisibleText_Icons());
	}

	@Test(priority = 2)
	public void verifyNavigationToCreateUserScreen_Sales() throws InterruptedException {
		Assert.assertTrue(userListPage.checkCreateUserFunction());
		CreateNewUserPage createUserPage=new CreateNewUserPage(driver);
		createUserPage.getCancelButton().click();

	}

	@Test(priority = 3)
	public void verify_TextsUnderChangeDealerFunction_Sales() {
		Assert.assertTrue(userListPage.check_TextsUnderChangeDealerFunction());
	}

	@Test(priority = 4)
	public void verify_ChangeDealerFunction_Sales() throws InterruptedException {
		Assert.assertTrue(userListPage.check_ChangeDealerFunction_Sales());
	}

	@Test(priority = 5)
	public void verifyInvalidUserSearch_Sales() throws InterruptedException {
		Assert.assertTrue(userListPage.checkForInvalidUser("mvnsdsdhj"));
	}

	@Test(priority = 6)
	public void verify_HelloThere_PersonalPinText_Sales() throws Exception {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.check_VisibleText_PersonalPinScreen("disha gupta"));
	}

	@Test(priority = 7)
	public void verify_Login_InValidPin_Sales() throws Exception {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.selectUserToLogin_WitInvalidPin("disha gupta"));
	}

	@Test(priority = 8)
	public void verify_Login_ValidPin_Sales() throws Exception {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.selectUserToLogin_WithValidPin("disha gupta"));
	}

	// @Test(priority = 9)
	public void verifyDeletedUserSearch_Sales() throws InterruptedException {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.checkForInvalidUser(CreateNewUserPage.newUser));
	}
}
