package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement btnselect = driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']"));
		js.executeScript("arguments[0].scrollIntoView(false)", btnselect);
		js.executeScript("arguments[0].click()",btnselect);
		WebElement btnclick = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
		js.executeScript("arguments[0].click()", btnclick);
		WebElement btnselect1 = driver.findElement(By.xpath("//button[text()='Windows Handling']"));
		js.executeScript("arguments[0].click()", btnselect1);
		
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindowId= driver.getWindowHandles();
		
		for(String x:allwindowId) {
			if(x!=parentwindow) {
				driver.switchTo().window(x);
				}
		}
		
		WebElement element = driver.findElement(By.xpath("//pre[contains(text(),'1.What is the purpose of windows Handling?')]"));
		String text = element.getText();
		System.out.println(text);
	}

}
