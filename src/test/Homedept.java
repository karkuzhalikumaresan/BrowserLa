package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homedept {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement btn1 = driver.findElement(By.xpath("//p[text()='Shop All']"));
		btn1.click();
		WebElement mouseover = driver.findElement(By.xpath("//span[text()='Shop By Department']"));
		a.moveToElement(mouseover).perform();
	}

}
