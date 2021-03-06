package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh Kumar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// open the browser

		// Driver executable server

		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

		driver.navigate().to("https://www.amazon.in");
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().forward();
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().refresh();

	}

}
