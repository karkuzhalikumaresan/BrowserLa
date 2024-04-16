package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String []args) {
		WebDriver driver=new ChromeDriver();
		
		//to get url
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		
		//to maximize window size
		driver.manage().window().maximize();
		
		WebElement txtUsername = driver.findElement(By.xpath("input[@class='_aa4b _add6 _ac4d _ap35']"));
		txtUsername.sendKeys("karkzhalikumaresan@gmail.com");
	}

}
