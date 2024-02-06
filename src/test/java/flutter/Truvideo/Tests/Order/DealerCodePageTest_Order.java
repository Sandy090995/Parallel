package flutter.Truvideo.Tests.Order;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.DealerCodePage;
import flutter.Truvideo.Pages.UserListPage;

public class DealerCodePageTest_Order extends BaseClass {
	DealerCodePage dealerCodePage;
	UserListPage userListPage;

	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		if (driver == null) {
			driver = setUpApplication();
			dealerCodePage = loadDealerCodePage();
		}
	}

	@BeforeMethod
	public void setDriverObject() {
		if (dealerCodePage == null) {
			dealerCodePage = new DealerCodePage(driver);
		}
	}

	//@AfterClass
	public void tearDown() {
		if (driver != null ) {
			log.info("Closed in Class  1");
			driver.quit();
			log.info("Closed in Class  2");
		}
	}
	
	@Test(priority = 1)
	public void verifyInstallationOfTruVideoApplication() {
		Assert.assertTrue(dealerCodePage.applicationInstall_dealerCodePageLoad());
	}

	@Test(priority = 2)
	public void verifyAllVisibleText_LogoIsDisplayed_DealerCodePage_Order() {
		Assert.assertTrue(dealerCodePage.visibleElements_DealerCodePage());
	}

	@Test(priority = 3)
	public void verifyLogin_InValidDealerCode_Order() throws InterruptedException {
		Assert.assertTrue(dealerCodePage.dealerLogin_InvalidCredentials());
	}

	@Test(priority = 4)
	public void verifyLogin_ValidDealerCode_Order() throws Exception {
		Assert.assertTrue(dealerCodePage.dealerLogin_ValidCredentials());
	}
}
