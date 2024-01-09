package flutter.Truvideo.TestUtils;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.openqa.selenium.OutputType;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import flutter.Truvideo.BaseClass.BaseClass;
import io.appium.java_client.AppiumDriver;

public class TestUtils {
	static ExtentReports extent;

	public static ExtentReports getReporterObject() {
		String path = System.getProperty("user.dir") + "/src/test/resources/Reports";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("RC Truvideo Enterprise App");
		reporter.config().setDocumentTitle("Automation Test Result");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("5 Exceptions", "RC Truvideo");
		extent.setSystemInfo("Device", BaseClass.capabilityName);
		extent.setSystemInfo("OS", BaseClass.opeartingSystem);
		extent.setSystemInfo("Build", BaseClass.applicationBuild);
		return extent;

	}

	public String getScreenShotPath(String testCaseName, AppiumDriver driver) throws IOException {
		File source = driver.getScreenshotAs(OutputType.FILE);
		String destinationField = System.getProperty("user.dir") + "/src/test/resources/Screenshot" + testCaseName
				+ ".png";
		FileUtils.copyFile(source, new File(destinationField));
		return destinationField;
	}

	public void sendReportToEmail() {
		try {
			// Create the attachment
			EmailAttachment attachment = new EmailAttachment();
			attachment.setPath(System.getProperty("user.dir") + "/src/test/resources/Reports/index.html");
			attachment.setDisposition(EmailAttachment.ATTACHMENT);
			attachment.setDescription("Extent Report");
			// Create the email message
			MultiPartEmail email = new MultiPartEmail();
			email.setHostName("smtp.mail.yahoo.com");
			email.setSmtpPort(465); // port
			email.setAuthenticator(new DefaultAuthenticator("sandip.chopkar@5exceptions.com", "scusooxsoohzvlfz")); //pass=AppPass
			email.setSSLOnConnect(true); // Use SSL
			email.setFrom("sandip.chopkar@5exceptions.com");
			email.addTo("rahul.kapse@5exceptions.com");
			email.addTo("sandipchopkar789@gmail.com");
			email.setSubject("Automation Report");
			email.setMsg("Please find the attached Automation Report For Truvideo Flutter App.");
			// Attach the file
			email.attach(attachment);
			// Send the email
			email.send();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
