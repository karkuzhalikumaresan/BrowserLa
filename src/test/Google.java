package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String []args) {
		WebDriver driver=new ChromeDriver();
		// to get the url
		driver.get("https://www.google.com/");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//id="APjFqb--Find and verify the locator search textarea
		WebElement textArea=driver.findElement(By.id("APjFqb"));
		
		//Insert value
		textArea.sendKeys("Greens Technology");
	}

}
