package RoyalBrother;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Rentalbike_Cap {

	public static AndroidDriver<AndroidElement> cap() throws MalformedURLException {
		// This method sets up the desired capabilities for Appium
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Amulo");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.royalbrothers");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.royalbrothers.MainActivity");

		// Ensure that URL is now correctly resolved
		@SuppressWarnings("deprecation")
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4724/wd/hub"), dc);
		return driver;

	}

}
