package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Navigation navigate=driver.navigate();
		driver.manage().window().maximize();
		//to launch url
		navigate.to("https://www.google.com/");
		Thread.sleep(3000);
		navigate.to("https://www.amazon.in/");
		Thread.sleep(3000);
		navigate.back();
		Thread.sleep(3000);
		navigate.forward();
		Thread.sleep(3000);
		navigate.refresh();
		
	}
	

}
