package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensMouseOver {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement btnClick = driver.findElement(By.xpath("//a[text()='COURSES']"));
		a.moveToElement(btnClick).perform();
		WebElement btnSelect = driver.findElement(By.xpath("(//span[text()='Python'])[1]"));
		btnSelect.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("(//button[text()='Explore Curriculum'])[1]"));
		a.contextClick(element).perform();
		
	}

}
