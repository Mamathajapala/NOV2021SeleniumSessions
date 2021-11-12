package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavaScriptUtil js = new JavaScriptUtil(driver);
				

		//System.out.println(js.getTitleByJS(driver));
		
		//js.generateAlert("this my code");
		
		//js.refreshBrowserByJS();
		
		//System.out.println(js.getBrowserInfo(driver));
		
		//js.sendKeysUsingWithId("twotabsearchtextbox", "iphone 13 pro Max");
		
		WebElement sreach = driver.findElement(By.id("twotabsearchtextbox"));
		
		//js.drawBorder(sreach);
		
		//js.flash(sreach);
		
		//System.out.println(js.getPageInnerText());

	}

}
