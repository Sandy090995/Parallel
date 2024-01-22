package flutter.Truvideo.Tests;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.ChatListPage;

public class ChatListPageTest_Prospect extends BaseClass {
	ChatListPage chatlistpage;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		driver=setUpApplication();
		chatlistpage=loadDealerCodePage().navigateToUserListScreen_Sales()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Sales).Navigate_To_Chat();
	}
	
	@BeforeMethod
	public void setDriverObject() {
		if(chatlistpage==null) {
			chatlistpage=new ChatListPage(driver);
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyNavigationToChatScreen() throws InterruptedException {
		Assert.assertTrue(chatlistpage.navigationToChatScreen());
	}

	@Test(priority = 2)
	public void verifySendMessage_ChatScreen() throws InterruptedException {
		Assert.assertTrue(chatlistpage.checkSendMessage());
	}

	@Test(priority = 3)
	public void verifyCallingFunction() throws InterruptedException {
		Assert.assertTrue(chatlistpage.checkCallingFunction());
	}
	
	@Test(priority = 4)
	public void verifyCreateChat_Function() throws InterruptedException {
		Assert.assertTrue(chatlistpage.checkCreateChat_Function("DEFAULT USER"));

	}

	@Test(priority = 5)
	public void verifySearchChat_Function() throws InterruptedException {
		Assert.assertTrue(chatlistpage.searchChat_Function("DEFAULT USER"));
	}

}
