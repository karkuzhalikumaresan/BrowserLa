package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Srolldownex {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement Onclick = driver.findElement(By.id("heading302"));
		Onclick.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement scroll = driver.findElement(By.id("heading303"));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("D:\\corejavatest.png");
		FileUtils.copyFile(screenshotAs, f);
		
		
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		WebElement txtbox = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
//		js.executeScript("argments[0].setAttribute('value','iphone')",txtbox );
//		
	}
	

}
