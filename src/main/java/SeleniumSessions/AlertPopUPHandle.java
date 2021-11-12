package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUPHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		//alert method can generate your own popup in your browser using JavaScript 
		
		//only JavaScript Pop-up can handle using alert
		//Alert is an interface
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct error message");
		}
		else {
			System.out.println("in correct error message");
		}
		
		alert.accept();// click on Ok button
		
		alert.dismiss();//Cancel the alert
		
		

	}

}
