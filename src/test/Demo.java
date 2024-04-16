package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String []args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement txtuserName=driver.findElement(By.id("username"));
		txtuserName.sendKeys("9942222100");
		WebElement txtPassword=driver.findElement(By.id("password"));
		txtPassword.sendKeys("@Kar1992");
		String username = txtuserName.getAttribute("value");
		System.out.println(username);
		
	}

}
