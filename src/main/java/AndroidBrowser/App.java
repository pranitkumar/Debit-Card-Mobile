package AndroidBrowser;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class App {

	
	@Test
	public  void mani() throws MalformedURLException {

		File f = new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());		
		AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

	
	}
	
	

}
