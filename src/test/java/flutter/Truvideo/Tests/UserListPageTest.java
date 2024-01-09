package flutter.Truvideo.Tests;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.CreateNewUserPage;
import flutter.Truvideo.Pages.UserListPage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserListPageTest extends BaseClass {
	UserListPage userListPage ;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		driver=setUpApplication();
		userListPage=loadDealerCodePage().navigateToUserListScreen_Order();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void verifyDealerName_And_RefreshButton() throws Exception {
		//userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.checkVisibleText_Icons());	
	}
	
	@Test(priority =2)
	public void verifyCreateUserFunction() throws InterruptedException {
		//userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.checkCreateUserFunction());
		
	}
	
	@Test(priority =3)
	public void verify_TextsUnderChangeDealerFunction() {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.check_TextsUnderChangeDealerFunction());
	}
	
	@Test(priority =4)
	public void verify_ChangeDealerFunction() throws InterruptedException {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.check_ChangeDealerFunction());
	}
	
	@Test(priority = 5)
	public void verifyInvalidUserSearch() throws InterruptedException {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.checkForInvalidUser("mvnsdsdhj"));
	}
	
	@Test(priority = 6)
	public void verify_HelloThere_PersonalPinText() throws Exception {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.check_VisibleText_PersonalPinScreen("RahulTest test"));
	}
	
	@Test(priority = 7)
	public void verify_Login_InValidPin() throws Exception {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.selectUserToLogin_WitInvalidPin("RahulTest test"));
	}
	
	@Test(priority = 8)
	public void verify_Login_ValidPin() throws Exception {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.selectUserToLogin_WithValidPin("RahulTest test"));
	}
	
	//@Test
	public void verify_Login_ValidPin_Sales() throws Exception {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.selectUserToLogin_WithValidPin("disha gupta"));
	}
	
	//@Test(priority =9)
	public void verify_ChangeDealerFunctionsales() throws InterruptedException {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.check_ChangeDealerFunction());
	}

	//@Test(priority = 10)
	public void verify_HelloThere_PersonalPinTextsales() throws Exception {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.check_VisibleText_PersonalPinScreen("disha gupta"));
	}
	
	//@Test(priority = 11)
	public void verify_Login_InValidPinsales() throws Exception {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.selectUserToLogin_WitInvalidPin("disha gupta"));
	}
	
	//@Test(priority = 12)
	public void verify_Login_ValidPinsales() throws Exception {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.selectUserToLogin_WithValidPin("disha gupta"));
	}
	
	//@Test(priority = 13)
	public void verifyDeletedUserSearch() throws InterruptedException {
		userListPage = new UserListPage(driver);
		Assert.assertTrue(userListPage.checkForInvalidUser(CreateNewUserPage.newUser));
	}
		
}

