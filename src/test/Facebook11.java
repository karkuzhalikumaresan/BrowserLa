package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook11 {
	public static void main(String []args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement btnLogin = driver.findElement(By.xpath("//span[text()='Login']"));
		btnLogin.click();
		WebElement txtInput = driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']"));
	    txtInput.sendKeys("karkuzhalikumaresan@gmail.com");
	}

}
