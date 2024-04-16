package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens1 {
	public static void main(String []args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement txtLink = driver.findElement(By.xpath("//span[@title='Trainer']"));
		txtLink.click();
		WebElement txtVel = driver.findElement(By.xpath("//p[contains(text(),'Velmurugan currently')]"));
		String text = txtVel.getText();
		System.out.println(text);
	}

}
