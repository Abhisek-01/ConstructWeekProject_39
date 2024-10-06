package RoyalBrother;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Rentalbike extends Rentalbike_Cap {

	public AndroidDriver<AndroidElement> driver;

	@BeforeTest
	public void FirstCase() throws MalformedURLException {

		driver = cap();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

	}

	@Test
	public void RoyalBike() throws InterruptedException {

		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

		driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc='SKIP']/android.widget.TextView"))
				.click();
		// Select the Mention area
		AndroidElement city = driver.findElement(MobileBy.xpath(
				"//android.view.ViewGroup[@content-desc='BANGALORE']/android.view.ViewGroup/android.widget.ImageView"));
		city.click();

		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc='TARIFFS']/android.widget.TextView"))
				.click();

		driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc='7 DAYS']/android.widget.TextView"))
				.click();
		// Book Now
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"BOOK NOW\")")).click();

		// Pick the Date & Time
		driver.findElement(MobileBy.xpath("(//android.view.ViewGroup[@content-desc=' Date '])[1]")).click();
		driver.findElement(MobileBy
				.xpath("//android.view.ViewGroup[@content-desc='7']/android.view.ViewGroup/android.widget.TextView"))
				.click();
		driver.findElement(
				MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"08:30 AM\"]/android.widget.TextView\r\n"))
				.click();

		// Drop the return-Date & Time
		driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"11\"]/android.view.ViewGroup"))
				.click();
		driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"10:00 AM\"]")).click();

		// Check Availability
		driver.findElement(MobileBy
				.xpath("//android.view.ViewGroup[@content-desc=\"CHECK AVAILABILITY\"]/android.widget.TextView"))
				.click();

		Thread.sleep(2000);

		driver.navigate().back();

		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=\"HOME\"]/android.widget.TextView"))
				.click();

		// Navigate to the offer's
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Offers\")")).click();
		driver.findElement(
				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"MBK500\"))"))
				.click();
		driver.navigate().back();

		// Scroll to the User's top picks & Performing some task's
		driver.findElement(MobileBy
				.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"User's Top Picks\"))"))
				.click();

		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"VIEW ALL\")")).click();

		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Search by Model\")")).click();

		AndroidElement search = driver.findElement(MobileBy.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText"));
		search.sendKeys("Honda Activa");

		driver.findElement(
				MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Honda Activa 6G\"]/android.widget.TextView"))
				.click();
		Thread.sleep(1000);

		driver.quit();

	}

}
