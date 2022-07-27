package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOMElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);

		// ShadowDOMElement: when you see #shadow-root its different dom
		// instpert and right click on element copy JS path go to console and paste here
		// s using JavascriptExecutor their executeScripte method(paste JS path here)
	}

}
