package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String []args) {
		WebDriver driver=new ChromeDriver();
		
		//to launch url
		driver.get("https://www.swiggy.com/");
		
		//to maximize window
		driver.manage().window().maximize();
		
		//class="_381fS _1oTLG _1H_62"--find and verify the locator for location textbox
		WebElement txtLocation=driver.findElement(By.className("_381fS _1oTLG _1H_62"));
		
		//insert value
		txtLocation.sendKeys("Chennai");
	}
}
