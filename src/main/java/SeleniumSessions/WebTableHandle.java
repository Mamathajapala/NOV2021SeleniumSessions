package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]
		//*[@id="customers"]/tbody/tr[7]/td[2]
		
		int rowCount =	driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
		 System.out.println(rowCount);

		 String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		 String  afterXpath = "]/td[2]";
		
		for(int rowNum=2; rowNum<=rowCount+1; rowNum++) {
			String actualXpath = beforeXpath + rowNum + afterXpath;
			//System.out.println(actualXpath);
			String value = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(value);
		}
	
	}

}
