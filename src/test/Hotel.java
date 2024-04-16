package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
	public static void main(String []args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement txtuserName=driver.findElement(By.xpath("//input[contains(@id,'username')]"));
		txtuserName.sendKeys("Karkuzhali123");
		String username = txtuserName.getAttribute("value");
		System.out.println(username);
		WebElement txtPassword=driver.findElement(By.xpath("//input[contains(@id,'password')]"));
		txtPassword.sendKeys("@Kar1992");
		String password = txtPassword.getAttribute("value");
		System.out.println(password);
	}
		

}
