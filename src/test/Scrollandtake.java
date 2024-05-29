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

public class Scrollandtake {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement scroll = driver.findElement(By.xpath("//div[@title=\"Model Resumes\"]"));
		js.executeScript("arguments[0].scrollIntoView(false)", scroll);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("D:\\Jobopenings.png");
		FileUtils.copyFile(screenshotAs, f);
		WebElement scrollup = driver.findElement(By.xpath("//a[text()='Book a free demo']"));
		js.executeScript("arguments[0].scrollIntoView(true)",scrollup);
		
	}

}
