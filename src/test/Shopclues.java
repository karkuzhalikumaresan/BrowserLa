package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopclues {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement mouseover = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		a.moveToElement(mouseover).perform();
		WebElement select = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		select.click();
	}

}
