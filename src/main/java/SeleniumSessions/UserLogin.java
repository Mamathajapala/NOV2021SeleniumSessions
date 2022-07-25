package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLogin {

	public static void main(String[] args) {
	
		Map<String, String> userMap = new HashMap<String, String>();
		
		userMap.put("admin", "admin_admin");
		userMap.put("patient", "tom@gmail.com_test12");
		userMap.put("doctor", "peter@gmail.com_test1234");
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	//	driver.findElement(By.id("username")).sendKeys(userMap.get("patient").split("_")[0]);	
	//	driver.findElement(By.id("password")).sendKeys(userMap.get("patient").split("_")[1]);
		
	doLogin(driver, getUserMap(), "doctor");
		
		
		
	}
	
	public static Map<String, String> getUserMap() {
		
		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("admin", "admin_admin");
		userMap.put("patient", "tom@gmail.com_test12");
		userMap.put("doctor", "peter@gmail.com_test1234");
		
		return userMap;
	}
	
	public static void doLogin(WebDriver driver, Map<String, String> userMap, String userKey) {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userMap.get(userKey).split("_")[0]);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(userMap.get(userKey).split("_")[1]);
	}

}
