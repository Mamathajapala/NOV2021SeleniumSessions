package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {


	public static void main(String[] args) throws InterruptedException {
		
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		selectValueFromDropDownByText(day, "5");
		selectValueFromDropDownByText(month, "May");
		selectValueFromDropDownByText(year, "1985");
		
		
		
		
	}
	/**
	 * This method is used to select value from drop down on the basis of given text
	 * @param element
	 * @param value
	 */
	public static void  selectValueFromDropDownByText(WebElement element, String value ) {		
		Select select = new Select(element);
		select.selectByVisibleText(value);
			
		}
		

		public void  selectValueFromDropDownByIndex(WebElement element, int index ) {
			
			Select select = new Select(element);
			select.selectByIndex(index);
			
		}
	}


