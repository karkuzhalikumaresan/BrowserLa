package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String []args) {
		WebDriver driver=new ChromeDriver();
		//to launch url
		driver.get("https://www.redbus.in/");
		
		//to maximize window
		driver.manage().window().maximize();
		
		//id="email"--find and verify the locator of From textbox
		WebElement txtUserName=driver.findElement(By.id("src"));
		
		//Insert value
		txtUserName.sendKeys("Chennai");
		
		//id="passContainer"--find and verify the locator of To textbox
		WebElement txtPassword=driver.findElement(By.id("dest"));
		
		//Insert vale
		txtPassword.sendKeys("Trichy");
		
		//driver.close();
	}

}
