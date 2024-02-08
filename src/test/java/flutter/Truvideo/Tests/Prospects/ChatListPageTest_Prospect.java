package flutter.Truvideo.Tests.Prospects;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.ChatListPage;
import flutter.Truvideo.Pages.RO_ListPage;

public class ChatListPageTest_Prospect extends BaseClass {
	ChatListPage chatlistpage;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		if(driver==null) {
		driver=setUpApplication();
		chatlistpage=loadDealerCodePage().navigateToUserListScreen_Sales()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Sales).Navigate_To_Chat();
		}else {
			RO_ListPage roList=new RO_ListPage(driver);
			roList.Navigate_To_Chat();
		}
	}
	
	@BeforeMethod
	public void setDriverObject() {
		if(chatlistpage==null) {
			chatlistpage=new ChatListPage(driver);
		}
	}
	
	//@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyNavigationToChatScreen_Sales() throws InterruptedException {
		Assert.assertTrue(chatlistpage.navigationToChatScreen());
	}

	@Test(priority = 2)
	public void verifySendMessage_ChatScreen_Sales() throws InterruptedException {
		Assert.assertTrue(chatlistpage.checkSendMessage());
	}

	@Test(priority = 3)
	public void verifyCallingFunction_ChatScreen_Sales() throws InterruptedException {
		Assert.assertTrue(chatlistpage.checkCallingFunction());
	}
	
	@Test(priority = 4)
	public void verifyCreateChat_Function_Sales() throws InterruptedException {
		Assert.assertTrue(chatlistpage.checkCreateChat_Function("DEFAULT USER"));

	}

	@Test(priority = 5)
	public void verifySearchChat_Function_Sales() throws InterruptedException {
		Assert.assertTrue(chatlistpage.searchChat_Function("DEFAULT USER"));
	}

}
