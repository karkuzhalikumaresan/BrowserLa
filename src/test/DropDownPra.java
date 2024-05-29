package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPra {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement CreateTxt = driver.findElement(By.id("u_0_0_JX"));
		CreateTxt.click();
		WebElement dropdown = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Select s=new Select(dropdown);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for(WebElement e:allSelectedOptions) {
			String text = e.getAttribute("value");
			System.out.println(text);
		}
		
	}

}
