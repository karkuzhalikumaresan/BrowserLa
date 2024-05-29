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

public class Amazonscreen {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement txtbox = driver.findElement(By.id("twotabsearchtextbox"));
		js.executeScript("arguments[0].setAttribute('value','motorolo')",txtbox);
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		js.executeScript("arguments[0].click()",search);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("D:\\motorolo.png");
		FileUtils.copyFile(screenshotAs, f);
		
	}

}
