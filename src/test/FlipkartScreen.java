package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartScreen {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement txtbox = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
//		js.executeScript("arguments[0].setAttribute('value','iphone')",txtbox );
		txtbox.sendKeys("iphone");
//		WebElement element = driver.findElement(By.xpath("//button[@class='_2iLD__']"));
//		element.click();
		txtbox.sendKeys(Keys.ENTER);
		
//		js.executeScript("arguments[0].click()", element);
		
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//		File f=new File("D:\\womens1.png");
//		FileUtils.copyFile(screenshotAs, f);
		
	}

}
