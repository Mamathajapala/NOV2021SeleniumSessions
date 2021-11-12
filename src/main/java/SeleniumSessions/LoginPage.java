package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		Util util = new Util(driver);
		
		By emailid = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		
		
		util.doSendkeys(emailid,"mamatha@gmail.com");
		util.doSendkeys(password,"Password123!");
		util.doClick(loginButton);
		
		
	}

}
