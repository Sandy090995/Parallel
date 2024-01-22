package flutter.Truvideo.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.Properties;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;

public class UtilityClass {

	AppiumDriver driver;
	public Logger log = LogManager.getLogger(this.getClass().getName());

	public UtilityClass(AppiumDriver driver) {
		this.driver = driver;
	}

	public int randomNumber() {
		Random rnd = new Random();
		int number = rnd.nextInt(999999999);
		return number;
	}

	public static String randomString(int length) {
		String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(CHARACTERS.length());
			char randomChar = CHARACTERS.charAt(randomIndex);
			sb.append(randomChar);
		}

		return sb.toString();
	}
	
	public void scrollDown_quarter() {
		Dimension size = driver.manage().window().getSize();
		int startX = size.getWidth() / 2;
		int endX = size.getWidth() / 2;
		int startY = size.getHeight() / 3;
		int endY = (int) (size.getHeight() * 0.25);
		performScrollUsingSequence(startX, endX, startY, endY);
	}
	
	public void scrollUp_quarter(){
		Dimension size = driver.manage().window().getSize();
		int startX = size.getWidth() / 2;
		int endX = size.getWidth() / 2;
		int startY = size.getHeight() / 3;
		int endY = (int) (size.getHeight() * 0.75);
		performScrollUsingSequence(startX, endX, startY, endY);
	}
	
	public void scrollDown() {
		Dimension size = driver.manage().window().getSize();
		int startX = size.getWidth() / 2;
		int endX = size.getWidth() / 2;
		int startY = size.getHeight() /2;
		int endY = (int) (size.getHeight() * 0.25);
		performScrollUsingSequence(startX, endX, startY, endY);
	}
	
	public void scrollUp(){
		Dimension size = driver.manage().window().getSize();
		int startX = size.getWidth() / 2;
		int endX = size.getWidth() / 2;
		int startY = size.getHeight() /2;
		int endY = (int) (size.getHeight() * 0.75);
		performScrollUsingSequence(startX, endX, startY, endY);
	}
	
	public void scrollDown1() {
		Dimension size = driver.manage().window().getSize();
		int startX = size.getWidth() / 2;
		int endX = (int) (size.getWidth() / 0.25);
		int startY = size.getHeight() / 2;
		int endY = (int) (size.getHeight() * 0.25);
		performScrollUsingSequence(startX, endX, startY, endY);
	}
	
	public void scrollUp1(){
		Dimension size = driver.manage().window().getSize();
		int startX = size.getWidth() / 2;
		int endX = (int) (size.getWidth() / 0.25);
		int startY = size.getHeight() / 2;
		int endY = (int) (size.getHeight() * 0.75);
		performScrollUsingSequence(startX, endX, startY, endY);
	}
	
	private void performScrollUsingSequence(int startX, int endX, int startY, int endY) {
		PointerInput input = new PointerInput(PointerInput.Kind.MOUSE, "first-finger");
		Sequence sequence = new Sequence(input, 0)
				.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
				.addAction(input.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()))
				.addAction(input.createPointerMove(Duration.ofMillis(300), PointerInput.Origin.viewport(), endX, endY))
				.addAction(input.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
		driver.perform(Collections.singletonList(sequence));
	}
		
	public void scrollForVisualElement1(By list, String attName, String text) {
		String previousPageSource = "";
		boolean flag = false;
		while (isEndOfPage(previousPageSource)==false) {
			previousPageSource = driver.getPageSource();
			for (WebElement ele : driver.findElements(list)) {
				if (ele.getAttribute(attName).equalsIgnoreCase(text)) {
					System.out.println("inside scroll method 4");
					ele.click();
					flag = true;
					break;
				}
			}
			if (flag)
				break;
			else
				scrollDown();
			continue;
		}
	}
	
	public void scrollForVisualElement(By list, String attName, String text) {
		String previousPageSource = "";
		boolean flag = false;
		do {
			previousPageSource = driver.getPageSource();
			for (WebElement ele : driver.findElements(list)) {
				if (ele.getAttribute(attName).equalsIgnoreCase(text)) {
					ele.click();
					flag = true;
					break;
				}
			}
			if (flag)
				break;
			else
				scrollDown();
			    	 continue; 
		}
		while (!isEndOfPage(previousPageSource) && flag==false );
	}

	private boolean isEndOfPage(String pageSource) {
	    return pageSource.equals(driver.getPageSource());
	  }

	public void waitTillElementToBeVisible(WebElement element,int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitTillElementToBeVisible(WebElement element, int totalSeconds, int pollingSeconds) {
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(totalSeconds))
				.pollingEvery(Duration.ofSeconds(pollingSeconds)).ignoring(TimeoutException.class);
		fluentWait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public boolean isAndroid() {
		return driver.getCapabilities().getPlatformName().toString().equals("ANDROID");
	}
	
	public boolean isiOS() {
		return driver.getCapabilities().getPlatformName().toString().equals("iOS");
	}
	
	//Not in use
	private String getValue(String keyName) {
	Properties properties = new Properties();
    try {
        FileInputStream fileInputStream = new FileInputStream("config.properties");
        properties.load(fileInputStream);
        fileInputStream.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    String value = properties.getProperty(keyName);
    return value;
}
	
}
