package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		Thread.sleep(5000);
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		search.sendKeys("iPhone 13 pro");
		
		takePageScreenshot(driver, "Amazonpage");
		takeElementScreenshot(search, "AmazonSearchElement");
		
		
		
		
	}
	
	/**
	 * This method is used for taking the screenshot for page
	 * @param driver
	 * @param fileName
	 */
		public static void takePageScreenshot(WebDriver driver, String fileName) {
			File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			try {
				FileUtils.copyFile(SrcFile, new File("./target/screenshots/" +fileName + ".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		/**
		 *This method is used for taking the screenshot for Web Element 
		 * @param element
		 * @param fileName
		 */
		
		public static void takeElementScreenshot(WebElement element, String fileName) {
			File SrcFile = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE); 
			try {
				FileUtils.copyFile(SrcFile, new File("./target/screenshots/" +fileName + ".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
					
		
		
		
		
		
		
		}
}
