package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calenderHandle {
	
	static WebDriver driver;
	
	public static void main(String[] args)  {

		
	
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

	driver.findElement(By.id("datepicker")).click();
	//driver.findElement(By.xpath("//a[text()='21']")).click();
	
	By Data = By.cssSelector("table.ui-datepicker-calendar a");
	
	
	//selectDate("21",Data);
	
	selectCustomDate("30");
	
	}
	
	public static void selectCustomDate(String text) {
	
		driver.findElement(By.xpath("//a[text()='"+ text +"']")).click();
		
}
	
	
	
	
	
	public static void selectDate(String day, By locator) {
		
		List<WebElement> dateList =	driver.findElements(locator);
		System.out.println(dateList.size());
		
		for(WebElement e : dateList) {
		String date =	e.getText();
		if(date.equals(day)) {
			e.click();
			break;
			
		}		
 }
 
		
		
	
		
	}
}
