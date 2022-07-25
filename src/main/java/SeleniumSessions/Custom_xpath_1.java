package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_xpath_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//htmltag[@prop1='value']
		//input[@id='username']
		
		//htmltag[@prop1='value' and @prop2= 'value']
		//input[@id='username' and @type ='email']
		
		//contains() in xpath -> for particular property
		//input[contains(@class,'login-email')]
		//input[contains(@id,'username')]
		//input[@id,'username' and contains(@class,''))]
		
		//contains used for dynamic ids:
		//<input id='test_123'>
		//<input id='test_132'>
		//<input id='test_143'>
		//<input id='test_163'>
		
		//input[contain(@id,'test_')
		
		//Based on index
		//(//input[contains(@class,'form-control')])[1]
		//(//input[contains(@class,'form-control')])[2]
		
		//Base on Position
		//(//input[contains(@class,'form-control')])[position()=1]
		//(//input[contains(@class,'form-control')])[position()=2]
		
		//last element
		//(//input[contains(@class,'form-control')])[last()]
		
		//using html tag and apply the position
		//(//i18n-string)[1]
		
		//text() in xpath if we have ' in text you have using ""
		//htmltag[text()='value']
		//*[text()='Forgot my password']
		//h5[text()="That email address doesn't exist."]
		
		//contains with text()
		//span[contains(text(),'Show Password')]
		//span[contains(text(),'Show')]
		//span[contains(text(),'Password')]
		//i18n-string[contains(text(),'account?')]
		
		//starts-with() class and text()
		//span[starts-with(@class,'account')]
		//span[starts-with(@class,'account')]
		//span[starts-with(@text(),'Greeter')]
		
		//*[text()='Forgot my password']--> * is any element it search of the element it performance issue
		//input[text()='Forgot my password']--> it directly goes input tags only 
		
		
		//div/input(/-direct child) 
		//div//input(//-indirect child)
		
		
		
	}

}
