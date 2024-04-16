package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonPrime {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement mouseover = driver.findElement(By.id("nav-link-amazonprime"));
		a.moveToElement(mouseover).perform();
		WebElement select = driver.findElement(By.id("multiasins-img-link"));
		select.click();
	}

}
