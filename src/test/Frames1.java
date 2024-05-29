package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		findElement.click();
		
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(outerFrame);
		Thread.sleep(1000);
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(innerFrame);
		Thread.sleep(1000);
		WebElement txtBox = driver.findElement(By.xpath("//input[@type='text']"));
		txtBox.sendKeys("Welcome");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
	//	driver.close();
		
	}
	
	

}
