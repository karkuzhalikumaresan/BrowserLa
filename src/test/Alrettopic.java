package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alrettopic {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
//		WebElement element = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
//		element.click();
//		WebElement element2 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
//		element2.click();
//		driver.switchTo().alert().accept();
		
//		WebElement element = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//		element.click();
//		WebElement element2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
//		element2.click();
//		driver.switchTo().alert().accept();
		
		WebElement element = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		element.click();
		WebElement element2 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		element2.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Welcome to automation");
		alert.accept();
		
	}

}
