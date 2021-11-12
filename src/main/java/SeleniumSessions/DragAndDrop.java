package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	
		Actions action = new Actions(driver);
		
		WebElement sourcesElement = driver.findElement(By.id("draggable"));
		
		WebElement targetElement = driver.findElement(By.id("droppable"));
		
		action.clickAndHold(sourcesElement).
		moveToElement(targetElement).
		release().
		build().
		perform();//action drag and drop is used for only webelement not for file upload
		
		action.dragAndDrop(sourcesElement, targetElement).build().perform();
		
	}

}
