package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	WebDriver driver;

	public Util(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * This method is used to create the webElement on the basis of By locator
	 * 
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {

			element = driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("some exception occured while creating the webelement....");
			System.out.println(e.getMessage());

		}
		return element;
	}

	/**
	 * This method is used to create the webElement on the basis of By locators
	 * 
	 * @param locator
	 * @return
	 */
	public List<WebElement> getElements(By locator) {
		List<WebElement> element = null;
		try {
			element = driver.findElements(locator);
		} catch (Exception e) {
			System.out.println("some exception occured while creating the webelements....");
			System.out.println(e.getMessage());
		}
		return element;
	}
	
	public void visiblivlityOfAllElements(List<WebElement> elements ,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	/**
	 * This method is used for wait the element to be present
	 * 
	 * @param locator
	 */
	public void waitForElementPresent(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public void waitForElementToBeClickable(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public WebElement waitForElementToBeVisible(By locator, int timeOut) {
		WebElement element = getElement(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	public WebElement waitForToBeVisiblElementLocator(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return getElement(locator);
	}
	
	public String waitForUrl(String url, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.urlContains(url));
		return driver.getCurrentUrl();
	}
	

	/**
	 * This method is used for wait the element to be title
	 * 
	 * @param title
	 * @param timeOut
	 * @return
	 */
	public String waitForTitlePresent(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}

	/**
	 * This method is used to send the value
	 * 
	 * @param locator
	 * @param Value
	 */
	public void doSendkeys(By locator, String Value) {
		try {
			getElement(locator).sendKeys(Value);
		} catch (Exception e) {
			System.out.println("some exception occured while passing the webelement....");
			System.out.println(e.getMessage());
		}

	}
	
	/**
	 * 
	 * @param loctaor
	 * @param value
	 */
	public void doActionSendKey(By loctaor,String value) {
		Actions action = new Actions(driver);
		WebElement element = getElement(loctaor);
		action.sendKeys(element,value).perform();
	}

	/**
	 * This method is used to click on element
	 * 
	 * @param locator
	 */
	public void doClick(By locator) {
		try {
			getElement(locator).click();
		} catch (Exception e) {
			System.out.println("some exception occured while clicking on webelement....");
			System.out.println(e.getMessage());
		}
	}
	/**
	 * 
	 * @param locator
	 */
	public void doActionClick(By locator) {
		Actions action = new Actions(driver);
		WebElement element = getElement(locator);
		action.click(element).perform();
	}
	/**
	 * This method is used for taking the screenshot for page
	 * 
	 * @param driver
	 * @param fileName
	 */
	public void takePageScreenshot(WebDriver driver, String fileName) {
		File SrcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File("./target/screenshots/" + fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used for taking the screenshot for Web Element
	 * 
	 * @param element
	 * @param fileName
	 */

	public void takeElementScreenshot(WebElement element, String fileName) {
		File SrcFile = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File("./target/screenshots/" + fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * this method is used to get all the values from drop down
	 * 
	 * @param element
	 */
	public static void getDropDownValue(WebElement element) {
		try {
			Select select = new Select(element);

			List<WebElement> dropList = select.getOptions();
			System.out.println(dropList.size());

			for (WebElement total : dropList) {
				String dropoptions = total.getText();
				System.out.println(dropoptions);
			}
		} catch (Exception e) {
			System.out.println("some exception occured while passing the webelement....");
			System.out.println(e.getMessage());

		}
	}

	/**
	 * This method is used to get text
	 * 
	 * @param locator
	 */
	public void getText(By locator) {
		try {
			String text = getElement(locator).getText();
			System.out.println(text);
		} catch (Exception e) {
			System.out.println("some exception occured while getting text the webelement....");
			System.out.println(e.getMessage());
		}
	}

	/**
	 * 
	 * @param driver
	 * @param value
	 */
	public static void selectChoiceValues(WebDriver driver, String... value) {
		List<WebElement> choiceList = driver.findElements(
				By.xpath("//div[@class='comboTreeDropDownContainer']//ul/li/span[@class='comboTreeItemTitle']"));
		if (!value[0].equalsIgnoreCase("ALL")) {

			for (int i = 0; i < choiceList.size(); i++) {
				System.out.println(choiceList.get(i).getText());
				String text = choiceList.get(i).getText();

				for (int k = 0; k < value.length; k++) {
					if (text.equals(value[k])) {
						choiceList.get(i).click();
						break;
					}

				}
			}

		}
		// select all the all values
		else {
			try {
				for (int all = 0; all < choiceList.size(); all++) {
					choiceList.get(all).click();
				}
			} catch (Exception e) {
				System.out.println();
			}

		}

	}
}
