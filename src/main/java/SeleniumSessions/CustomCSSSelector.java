package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCSSSelector {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//CSS id
		//	#username
		//	input[id='username']
		// 	input[id='username'][type()='email']
		//	button.loginBtn
		
		//Class .{Class}
		//	.form-control.privte.button
		//	input.form-control.privte.button
		//	button.loginBtn
		
		//text:
		//	input[id^='username'] -->stating text
		//	input[id$='username'] -->ending text
		//	input[id$='name'] -->ending text
		
		//Contains
		//	input[id*='username']
		//	input[id*='username']
		
		//
		//	div>input[id='usename']
		//	div.private-form__input-wrapper>input#username
		
		
		

	}

}
