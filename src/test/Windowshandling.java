package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("iphone x");
		txtsearch.sendKeys(Keys.ENTER);
		WebElement txtselect = driver.findElement(By.xpath("//span[text()='Ghostek Covert Clear Silicone iPhone X Case with Grip Sides and Drop Protection (Pink)']"));
		txtselect.click();
		
		//to get parent window id
		String parentwindow = driver.getWindowHandle();
		
		//to get window id for all opened window
		Set<String> allwindowId= driver.getWindowHandles();
		
		for(String x:allwindowId) {
			if(x!=parentwindow) {
				driver.switchTo().window(x);
				}
		}
		
		WebElement price = driver.findElement(By.xpath("(//span[text()='2,499'])[5]"));
		String cost = price.getText();
		System.out.println("iphone case cost:"+cost);
		Thread.sleep(7000);
		
		
		driver.switchTo().defaultContent();
//		driver.switchTo().window(parentwindow);
		
		WebElement txtsearch1 = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch1.sendKeys("iphone x");
		
	}

}
