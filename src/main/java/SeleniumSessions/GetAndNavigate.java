package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigate {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh Kumar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//open the browser
		
		
		driver.navigate().to("https://www.amazon.in");
		System.out.println(driver.getTitle());
	}

}
