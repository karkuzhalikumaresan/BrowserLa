package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement txtPlus = driver.findElement(By.id("heading20"));
		txtPlus.click();
		WebElement btnCts = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/interview-questions/cts.pdf#toolbar=0']"));
	    btnCts.click();
	}

}
