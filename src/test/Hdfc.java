package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	public static void main(String []args) {
		WebDriver driver=new ChromeDriver();
		
		//to get url
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//to maximize window
		driver.manage().window().maximize();
		
		//name="fldLoginUserId"--find the locator and verify the userName textbox
		WebElement userId=driver.findElement(By.xpath("//input[@type='text']"));
		
		//to insert value
		userId.sendKeys("karkuzhali");
		
	}

}
