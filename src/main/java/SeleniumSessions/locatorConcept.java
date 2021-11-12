package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh Kumar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//open the browser
		
		
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(6000);
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("japala.mamatha61@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Mamatha");
	
		
		

	}

}
