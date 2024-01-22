package flutter.Truvideo.Tests;
import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.DealerCodePage;
import flutter.Truvideo.Pages.EditOrder_ProspectPage;

public class Edit_OrderPageTest extends BaseClass{
	EditOrder_ProspectPage editPage;
	
	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		driver=setUpApplication();
		editPage=loadDealerCodePage().navigateToUserListScreen_Order()
				.navigateTo_RO_Prospect_ListPage(userForLogin_Order)
				.NavigateTo_AddOrder_Page().CreateNewRO_NavigateToRODetail()
				.Navigate_To_EditRO();
	}
	
	@BeforeMethod
	public void setDriverObject() {
		if(editPage==null) {
			editPage=new EditOrder_ProspectPage(driver);
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void verifyFleetCustomerFunction() {
		Assert.assertTrue(editPage.checkFleetCustomerFunction());
	}
	
	@Test(priority = 2)
	public void verifyEditOrderFunction() throws InterruptedException {
		Assert.assertTrue(editPage.editOrder());
	}
	
}
