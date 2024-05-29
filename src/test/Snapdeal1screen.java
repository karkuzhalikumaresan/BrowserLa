package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal1screen {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement txtbox = driver.findElement(By.id("inputValEnter"));
		js.executeScript("arguments[0].setAttribute('value','Laptops')",txtbox);
		WebElement search = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		js.executeScript("arguments[0].click()",search);
	
		
	}

}
