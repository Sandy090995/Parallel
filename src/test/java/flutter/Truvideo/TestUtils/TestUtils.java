package flutter.Truvideo.TestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import flutter.Truvideo.BaseClass.BaseClass;
import io.appium.java_client.AppiumDriver;

public class TestUtils {
	static ExtentReports extent;

	public static ExtentReports getReporterObject() {
		String path = System.getProperty("user.dir") + "/src/test/resources/Reports";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("RC Truvideo Enterprise App");
		reporter.config().setDocumentTitle("Automation Test Result");
		reporter.config().setTheme(Theme.STANDARD);

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
	
	public static String getTiketID1(String testCaseName) {
		String filePath = "C:\\Users\\windows10\\Desktop\\MyCode\\TestCases_Automation.xlsx";
		String searchValue = testCaseName;
		String secondColumnValue = null;
		try {
			FileInputStream file = new FileInputStream(new File(filePath));	
			 Workbook workbook = WorkbookFactory.create(file);
			Sheet sheet = workbook.getSheetAt(0); //Reading the first sheet
			// Iterate through each row
			for (Row row : sheet) {
				Cell firstCell = row.getCell(0); // First column
				Cell secondCell = row.getCell(1); // Second column
				if (firstCell != null && firstCell.getCellType() == CellType.STRING) {
					String cellValue = firstCell.getStringCellValue();
					if (cellValue.contains(searchValue)) {
						if (secondCell != null && secondCell.getCellType() == CellType.STRING) {
							secondColumnValue = secondCell.getStringCellValue();
							System.out.println("Value in column 2: " + secondColumnValue);
						}
					}
				}
			}
			workbook.close();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return secondColumnValue;
	}
	
	 public static String[][] testData;
	 public static void readTestDataFromExcel() {
        String filePath = "C:\\Users\\windows10\\Desktop\\MyCode\\TestCases_Automation.xlsx";
        try {
            FileInputStream file = new FileInputStream(filePath);
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0); // Reading the first sheet
            int rowCount = sheet.getPhysicalNumberOfRows();
            int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
            testData = new String[rowCount][colCount];
            // Iterate through each row and column
            for (int i = 0; i < rowCount; i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < colCount; j++) {
                    Cell cell = row.getCell(j);
                    if (cell != null) {
                        if (cell.getCellType() == CellType.STRING) {
                            testData[i][j] = cell.getStringCellValue();
                        } else if (cell.getCellType() == CellType.NUMERIC) {
                            testData[i][j] = String.valueOf(cell.getNumericCellValue());
                        }
                    }
                }
            }
            workbook.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	 
	 public static String getTicketID(String testCaseName) {
	        for (String[] row : testData) {
	            if (row[0].contains(testCaseName)) {
	                return row[1];
	            }
	        }
	        return "";
	    }
}
