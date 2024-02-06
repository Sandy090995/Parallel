package flutter.Truvideo.TestUtils;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;

public class Listeners extends TestUtils implements ITestListener {
	AppiumDriver driver;
	ExtentTest test;
	ExtentReports extent = TestUtils.getReporterObject();

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());// Method Name
		test.assignCategory("All");
		try {
		test.assignCategory(TestUtils.getTicketID(result.getMethod().getMethodName()));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed");
	}

	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		try {
			driver = (AppiumDriver) result.getTestClass().getRealClass().getField("driver")
					.get(result.getInstance());
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {
			test.addScreenCaptureFromPath(getScreenShotPath(result.getMethod().getMethodName(), driver),
					result.getMethod().getMethodName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {
		try {
		readTestDataFromExcel();
		}catch (Exception e) {
			e.printStackTrace();
		}
		}

	public void onFinish(ITestContext context) {
		extent.flush();
		//sendReportToEmail();
	}

}
