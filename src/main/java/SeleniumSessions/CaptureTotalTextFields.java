package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureTotalTextFields {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php");
		
		List<WebElement> linksInput = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(""+linksInput.size());
		
		for(WebElement input :linksInput ) {
			input.sendKeys("Pakke");
		}
		
	}

}
