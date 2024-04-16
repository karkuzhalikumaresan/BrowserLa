package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modelqp {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement txtPlus = driver.findElement(By.id("heading201"));
		txtPlus.click();
		WebElement btnCts = driver.findElement(By.xpath("[//a[@href='https://traininginchennai.in/Fresher_Selenium_Resume.pdf']"));
	    btnCts.click();
	}
}
