package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandles {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//frame is webElement 
		//Frame is method Overloading
		
		//WebElement frameElement = driver.findElement(By.name("main"));
		
		//driver.switchTo().frame(frameElement);
		
		//driver.switchTo().frame("main");
		
		driver.switchTo().frame(2);

		String text = driver.findElement(By.cssSelector("body > h2")).getText();
		
		System.out.println(text);
		
		driver.switchTo().defaultContent();// it will come to default browser
		
		//driver.switchTo().parentFrame(); it will come to parent browser

	}

}
