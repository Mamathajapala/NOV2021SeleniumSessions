package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class samplePage {

	public static void main(String[] args)   {
		
		RemoteWebDriver dr = new ChromeDriver();
		Capabilities capabilities = null ;
		try {
			WebDriver dr1 = new RemoteWebDriver(new URL("http://192.12.3.1:4444/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
