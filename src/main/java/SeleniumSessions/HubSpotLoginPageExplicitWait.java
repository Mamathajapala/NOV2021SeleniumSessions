package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLoginPageExplicitWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		By emailid = By.id("username");

		//it is for specific elements
		//ExplicitWait is applies on non webelements 
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(emailid));
		//Exception in thread "main" org.openqa.selenium.TimeoutException:
		// Expected condition failed: waiting for presence of element located by: By.id:
		// username (tried for 20 second(s) with 500 milliseconds interval)

		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("test@gmail.com");

		// WebElement emailId = driver.findElement(By.id("username"));
		// WebElement password = driver.findElement(By.id("password"));
		// WebElement loginBtton = driver.findElement(By.id("loginBtn"));
	

	}

}
