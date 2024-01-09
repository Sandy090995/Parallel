package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.ChatListPage;

public class ChatListPageTest extends BaseClass {
	ChatListPage chatlistpage;

	@Test(priority = 1)
	public void verifyNavigationToChatScreen() throws InterruptedException {
		chatlistpage = new ChatListPage(driver);
		Assert.assertTrue(chatlistpage.navigationToChatScreen());
	}

	@Test(priority = 2)
	public void verifySendMessage_ChatScreen() throws InterruptedException {
		chatlistpage = new ChatListPage(driver);
		Assert.assertTrue(chatlistpage.checkSendMessage());
	}

	@Test(priority = 3)
	public void verifyCallingFunction() throws InterruptedException {
		chatlistpage = new ChatListPage(driver);
		Assert.assertTrue(chatlistpage.checkCallingFunction());
	}
	
	@Test(priority = 4)
	public void verifyCreateChat_Function() throws InterruptedException {
		chatlistpage = new ChatListPage(driver);
		Assert.assertTrue(chatlistpage.checkCreateChat_Function("DEFAULT USER"));

	}

	@Test(priority = 5)
	public void verifySearchChat_Function() throws InterruptedException {
		chatlistpage = new ChatListPage(driver);
		Assert.assertTrue(chatlistpage.searchChat_Function("DEFAULT USER"));
	}

}
