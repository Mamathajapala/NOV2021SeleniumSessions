package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {


	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh Kumar\\Downloads\\chromedriver);
		WebDriver driver = new ChromeDriver();//open the browser
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new SafariDriver();
		
		//WebDriver driver = new EdgeDriver();
		
		//Driver executable server 
		
		driver.get("http://www.google.com");
		String title =driver.getTitle();
		
		System.out.println(title);
		
		//validation point:
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("in-correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.quit(); //null
	
		//System.out.println(driver.getTitle());// Session ID is null, Using webDriver after calling quit()?
		
		
		//driver.close();//invaild session ID
	}
	

}
