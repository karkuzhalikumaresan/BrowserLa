package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {
	public static void main(String []args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement txtInput = driver.findElement(By.id("APjFqb"));
		txtInput.sendKeys("greens velmurugan");
		WebElement txt1 = driver.findElement(By.xpath("//input[contains(@value,'Google Search')]"));
		txt1.click();
		WebElement txtLink = driver.findElement(By.xpath("//h3[contains(text(),'Velmurugan Rengasamy')]"));
		txtLink.click();

	}

}
