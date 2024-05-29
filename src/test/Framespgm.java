package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framespgm {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		WebElement txtTab = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		txtTab.click();
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width: 600px']"));
		driver.switchTo().frame(outerframe);
		Thread.sleep(3000);
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(innerFrame);
		Thread.sleep(1000);
		WebElement txtBox = driver.findElement(By.xpath("//input[@type='text']"));
		txtBox.sendKeys("Hello");
		driver.switchTo().parentFrame();
	}

}
