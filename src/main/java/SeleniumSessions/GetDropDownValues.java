package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropDownValues {

	public static void main(String[] args) throws InterruptedException {
		
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		getDropDownValue(day);
		getDropDownValue(month);
		getDropDownValue(year);
		
	}
	/**
	 * this method is used to get all the values from drop down
	 * @param element
	 */
		public static void getDropDownValue(WebElement element) {
			Select select = new Select(element);
			
			List<WebElement> dropList = select.getOptions();
			System.out.println(dropList.size());
			
			for(WebElement total : dropList ) {
				String dropoptions = total.getText();
				System.out.println(dropoptions);
			}
			
		}
	}


