package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	
	
	public static void main(String[] args) throws InterruptedException {
	//Explicit wait:
	//1. WebDriverWait
	//2.FluentWait:
	//a.TimeOut	b. pollingPeriod 	c.ignoringException
	
		
	//When to use:
	//For handling the Ajax components
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		
		final By username = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//input[@value='Login']");
		
		
		WebElement closeicon = driver.findElement(By.xpath("//div[@aria-label='Dismiss']"));
		//WebElement month = driver.findElement(By.name("slctMonth"));
		Thread.sleep(5000);

		WebElement msg = driver.findElement(By.xpath("//div[text()='Welcome to Free CRM, please let us know how we can help.']"));

		Actions action = new Actions(driver);
		
		action.moveToElement(msg).click(closeicon).build().perform();;
		 
		
	waitForElementWithFluentWait(driver, username).sendKeys("batchautomation");
	driver.findElement(password).sendKeys("Test@12345");
	driver.findElement(login).click();
	
//	selectMonth(month, "July");
	
	}
	
	public static WebElement waitForElementWithFluentWait(WebDriver driver, final By locator) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
	WebElement element = wait.until(new Function<WebDriver, WebElement>(){
		
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
				
			}
								
	});
	
	return element;	
		
	}
	
	public static void selectMonth(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
}
