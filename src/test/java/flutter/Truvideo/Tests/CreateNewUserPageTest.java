package flutter.Truvideo.Tests;

import org.testng.Assert;
import org.testng.annotations.*;
import flutter.Truvideo.BaseClass.BaseClass;
import flutter.Truvideo.Pages.CreateNewUserPage;

public class CreateNewUserPageTest extends BaseClass{
	CreateNewUserPage createUser;
	
	
	@Test(priority = 0)
	public void verifyCancelButton() throws InterruptedException {
		createUser=new CreateNewUserPage(driver);
		Assert.assertTrue(createUser.check_cancelButton());
	}
	
	@Test(priority = 1)
	public void verifyErrorToastMessage() {
		createUser=new CreateNewUserPage(driver);
		Assert.assertTrue(createUser.checkErrorMessage_NullValue());	
	}
	
	@Test(priority = 2)
	public void checkNewUserCreation() throws InterruptedException {
		createUser=new CreateNewUserPage(driver);
		createUser.checkNewUserCreationAndVerificationFromDashboard();
	}
	
	@Test
	public void verifyErrorToastMessage_Sales() throws InterruptedException {
		createUser=new CreateNewUserPage(driver);
		Assert.assertTrue(createUser.checkErrorMessage_NullValue_Sales());
	}
	
	@Test
	public void verifyNewUserCreation_Sales() throws InterruptedException {
		createUser=new CreateNewUserPage(driver);
		createUser.checkNewUserCreation_Sales();
	}
	
	
}
