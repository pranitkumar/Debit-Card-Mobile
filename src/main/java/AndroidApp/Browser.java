package AndroidApp;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Browser {

	
	@BeforeSuite
	public void browse() throws IOException, InterruptedException {
		
		Runtime.getRuntime().exec("cmd /c start C:\\Users\\Pranit\\startAppium.bat");
		Thread.sleep(59000L);
		System.out.println("Hello");
		
	}
	
}
