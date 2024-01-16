package flutter.Truvideo.Tests;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.MessagesListPage;

public class MessagesListPageTest_Order extends BaseClass{

	MessagesListPage messageListPage;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		driver=setUpApplication();
		messageListPage=loadDealerCodePage().navigateToUserListScreen_Order()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Order)
				.Navigate_To_MessageList();
	}
	
	@Override
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void verify_AllActive_Filter() throws InterruptedException {
		messageListPage=new MessagesListPage(driver);
		Assert.assertTrue(messageListPage.checkFilter_AllActive());
	}
	
	@Test(priority = 2)
	public void verifyAll_Filter() throws InterruptedException {
		messageListPage=new MessagesListPage(driver);
		Assert.assertTrue(messageListPage.checkFilter_All());
	}
	
	//Failed due to issue already logged
	@Test(priority = 3)
	public void verify_MyActive_Filter() throws Exception {
		messageListPage=new MessagesListPage(driver);
		Assert.assertTrue(messageListPage.checkFilter_My_Active());
	}
	
	//Failed due to issue already logged
	@Test(priority = 4)
	public void verify_My_Filter() throws Exception {
		messageListPage=new MessagesListPage(driver);
		Assert.assertTrue(messageListPage.checkFilter_My());
	}
	
	@Test(priority = 5)
	public void verifyNavigationToMessagingScreen() throws Exception {
		messageListPage=new MessagesListPage(driver);
		Assert.assertTrue(messageListPage.navigationToMessagingScreen());
	}
}
