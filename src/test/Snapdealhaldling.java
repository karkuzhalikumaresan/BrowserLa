package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdealhaldling {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement txtinput = driver.findElement(By.id("inputValEnter"));
		txtinput.sendKeys("iphones 7");
		txtinput.sendKeys(Keys.ENTER);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement select = driver.findElement(By.xpath("//p[text()='Apple Iphone 7 Bumper Cases Megha Star - Transparent Premium Transparent Case']"));
		js.executeScript("arguments[0].click()", select);
		//to get parent window id
				String parentwindow = driver.getWindowHandle();
				
		//to get window id for all opened window
				Set<String> allwindowId= driver.getWindowHandles();
				
				for(String x:allwindowId) {
					if(x!=parentwindow) {
						driver.switchTo().window(x);
						}
				}
		WebElement BtnAdd = driver.findElement(By.xpath("//span[text()='add to cart']"));
		js.executeScript("arguments[0].scrollIntoView(false)", BtnAdd);
		js.executeScript("arguments[0].click()",BtnAdd);
		driver.findElement(By.xpath("//div[text()='View Cart']")).click();
		//driver.switchTo().alert().accept();
		WebElement total = driver.findElement(By.xpath("//input[@value='PROCEED TO PAY Rs. 140']"));
		String text = total.getText();
		System.out.println(text);
		
	}

}
