package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s=new Select(dropdown);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		//select options
		s.selectByIndex(0);
		s.selectByIndex(3);
		
		List<WebElement> options = s.getOptions();
		for(WebElement e:options) {
			String value = null;
			String attribute = e.getAttribute(value);
		}
		//to print all selected options in console
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for(WebElement e:allSelectedOptions) {
			
			String text = e.getText();
			System.out.println(text);
		}
		
		Thread.sleep(3000);
//		s.deselectByIndex(0);
//		s.deselectAll();
//		s.deselectByVisibleText("Volvo");
		s.deselectByValue("volvo");
		
	}

}
