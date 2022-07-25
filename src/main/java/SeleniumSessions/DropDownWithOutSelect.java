package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithOutSelect {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mamatha");
		

		
		String day = "//select[@id='day']/option";
		String month = "//select[@id='month']/option";
		String year = "//select[@id='year']/option";
	
		DropDownUtil.selectDropDownValueWithOutSelect(driver, day, "12");
		DropDownUtil.selectDropDownValueWithOutSelect(driver, month, "Aug");
		DropDownUtil.selectDropDownValueWithOutSelect(driver, year, "1993");

	}

}
