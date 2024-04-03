package flutter.Truvideo.Tests.Order;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.CreateNewUserPage;
import flutter.Truvideo.Pages.UserListPage;

public class UserListPageTest_Order extends BaseClass {
	UserListPage userListPage;

	@BeforeMethod
	public void setUpTestEnvironment_ClassLevel() throws Exception {
		if (driver == null) {
			driver = setUpApplication();
			userListPage = loadDealerCodePage().navigateToUserListScreen_Order();
		}
		if (userListPage == null) {
			userListPage = new UserListPage(driver);
		}
	}

	@AfterMethod
	public void tearDown_OnFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			driver.quit();
			driver = null;
		}
	}

	@Test(priority = 1)
	public void verifyDealerName_And_RefreshButton_Order() throws Exception {
		Assert.assertTrue(userListPage.checkVisibleText_Icons());
	}

	@Test(priority = 2)
	public void verifyNavigationToCreateUserScreen_Order() throws InterruptedException {
		Assert.assertTrue(userListPage.checkCreateUserFunction());
		CreateNewUserPage createUserPage = new CreateNewUserPage(driver);
		createUserPage.getCancelButton().click();
	}

	@Test(priority = 3)
	public void verify_TextsUnderChangeDealerFunction_Order() {
		Assert.assertTrue(userListPage.check_TextsUnderChangeDealerFunction());
	}

	@Test(priority = 4)
	public void verify_ChangeDealerFunction_Order() throws InterruptedException {
		Assert.assertTrue(userListPage.check_ChangeDealerFunction_Order());
	}

	@Test(priority = 5)
	public void verifyInvalidUserSearch_Order() throws InterruptedException {
		Assert.assertTrue(userListPage.checkForInvalidUser("mvnsdsdhj"));
	}

	@Test(priority = 6)
	public void verify_HelloThere_PersonalPinText_Order() throws Exception {
		Assert.assertTrue(userListPage.check_VisibleText_PersonalPinScreen("RahulTest Kapse"));
	}

	@Test(priority = 7)
	public void verify_Login_InValidPin_Order() throws Exception {
		Assert.assertTrue(userListPage.selectUserToLogin_WitInvalidPin("RahulTest Kapse"));
	}

	@Test(priority = 8)
	public void verify_Login_ValidPin_Order() throws Exception {
		Assert.assertTrue(userListPage.selectUserToLogin_WithValidPin("RahulTest Kapse"));
	}

	// @Test(priority = 9)
	public void verifyDeletedUserSearch_Order() throws InterruptedException {
		Assert.assertTrue(userListPage.checkForInvalidUser(CreateNewUserPage.newUser));
	}

}
