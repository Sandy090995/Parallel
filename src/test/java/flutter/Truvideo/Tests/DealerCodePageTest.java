package flutter.Truvideo.Tests;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.DealerCodePage;

public class DealerCodePageTest extends BaseClass {
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
		dealerCodePage=new DealerCodePage(driver);
		Assert.assertTrue(dealerCodePage.visibleElements_DealerCodePage());
	}
	
	@Test(priority = 2)
	public void verifyLogin_InValidDealerCode() throws InterruptedException {
		dealerCodePage=new DealerCodePage(driver);
		Assert.assertTrue(dealerCodePage.dealerLogin_InvalidCredentials());
	}
	
	@Test(priority = 3)
	public void verifyLogin_ValidDealerCode() throws Exception {
	dealerCodePage=new DealerCodePage(driver);
	Assert.assertTrue(dealerCodePage.dealerLogin_ValidCredentials());
	}
	
	//@Test//Sales
	public void verifyLogin_ValidDealerCode_Sales() throws Exception {
		dealerCodePage=new DealerCodePage(driver);
		Assert.assertTrue(dealerCodePage.salesDealerLogin_ValidCredentials());
	}
	
}

