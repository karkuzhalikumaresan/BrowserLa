package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook1 {
	public static void main(String []args) {
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.facebook.com/ ");
		driver.manage().window().maximize();
		WebElement txtEmail = driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]"));
		txtEmail.sendKeys("karkuzhalikumaresan@gmail.com");
		WebElement txtPass = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		txtPass.sendKeys("@Kar2024");
		String email = txtEmail.getAttribute("value");
		System.out.println(email);
		String password = txtPass.getAttribute("value");
		System.out.println(password);
	}

}
