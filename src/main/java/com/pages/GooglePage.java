 package com.pages;

import org.openqa.selenium.By;

public class GooglePage  extends BasePage{
	
	//Page actions
	
	public void gooleSearchTest() {
		
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("naveen automationlabs");
		driver.findElement(By.name("q")).submit();
		driver.findElements(By.xpath("//h3")).stream().forEach(ele -> System.out.println(ele.getText()));	
		
	}
	
	
	public void tearDown(){
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
