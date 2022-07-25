package SeleniumSessions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
	
		
		WebDriverManager.chromedriver().setup();//it automatically set chrome in your Operating system no need to set any chrome exe file 
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());
	}

}
