package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil {

	/**
	 * This method is used to select value from drop down on the basis of given text
	 * 
	 * @param element
	 * @param value
	 */
	public static void selectValueFromDropDownByText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);

	}

	/**
	 * This method is used to select value from drop down on the basis of given
	 * index
	 * 
	 * @param element
	 * @param value
	 */
	public void selectValueFromDropDownByIndex(WebElement element, int index) {

		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * this method is used to get all the values from drop down
	 * 
	 * @param element
	 */
	public static ArrayList getDropDownValue(WebElement element) {
		Select select = new Select(element);

		List<WebElement> dropList = select.getOptions();
		System.out.println(dropList.size());
		ArrayList<String> ar = new ArrayList<String>();

		for (WebElement total : dropList) {
			String dropoptions = total.getText();
			ar.add(dropoptions);
		}
		return ar;

	}

	/**
	 * This method is used to select the values from dropdown without select class
	 * 
	 * @param driver
	 * @param locator
	 * @param Value
	 */

	public static void selectDropDownValueWithOutSelect(WebDriver driver, String locator, String Value) {
		List<WebElement> daysList = driver.findElements(By.xpath(locator));
		System.out.println("Tatal day list: " + daysList.size());

		for (int i = 0; i < daysList.size(); i++) {
			String text = daysList.get(i).getText();
			System.out.println(text);
			if (text.equals(Value)) {
				daysList.get(i).click();
				break;
			}
		}

	}

}
