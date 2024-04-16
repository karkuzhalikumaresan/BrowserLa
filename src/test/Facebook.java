package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String []args) {
		WebDriver driver=new ChromeDriver();
		//to launch url
		driver.get("https://www.facebook.com/");
		
		//to maximize window
		driver.manage().window().maximize();
		
		WebElement txtUserName=driver.findElement(By.id("email"));
		txtUserName.sendKeys("karkuzhalikumaresan@gmail.com");
		
		
		WebElement txtPassword=driver.findElement(By.id("pass"));
		txtPassword.sendKeys("@Karu1935");
		
		WebElement btnLogin = driver.findElement(By.xpath("//button[@value='1']"));
		btnLogin.click();
		//driver.close();
	}

}
