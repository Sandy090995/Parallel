package flutter.Truvideo.Tests;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.DealerCodePage;

public class DealerCodePageTest_Order extends BaseClass {
	DealerCodePage dealerCodePage;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		driver=setUpApplication();
		dealerCodePage=loadDealerCodePage();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void verifyAllVisibleText_LogoIsDisplayed_DealerCodePage(){
		Assert.assertTrue(dealerCodePage.visibleElements_DealerCodePage());
	}
	
	@Test(priority = 2)
	public void verifyLogin_InValidDealerCode() throws InterruptedException {
		Assert.assertTrue(dealerCodePage.dealerLogin_InvalidCredentials());
	}
	
	@Test(priority = 3)
	public void verifyLogin_ValidDealerCode() throws Exception {
	Assert.assertTrue(dealerCodePage.dealerLogin_ValidCredentials());
	}
		
}

