package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_xpath_2 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//absolute xpath:	//html//div//div[4]/div[3]//div[3]//span--id
		//relative xpath/custom xpath:	//span[@id ='test']
		
		
		
		
		
		// Xpath Axes:
		
		//following --> not go inside go to parallel line
		//div[@class='intput-group']//following::input[@name='username']
		
		//preceding--> before element
		//input[@name='username']//preceding::div

		//parent -->reversing jumping child tp parent
		//input[@name='username']//parent::div
		
		//child
		//div[@class='intput-group']//child::input
		
		//ancestor --> going to grand parent
		//div[@class='intput-group']//ancestor::div[@class='']
		
		//Reversing Xpath:
		//input[@name='username']/..
		
		
		
	}

}
