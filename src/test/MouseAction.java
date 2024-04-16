package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(drag, drop).perform();
		
		WebElement drag1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement drop1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(drag1, drop1).perform();
		
		WebElement drag2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement drop2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		a.dragAndDrop(drag2, drop2).perform();
		
		WebElement drag3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement drop3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		a.dragAndDrop(drag3, drop3).perform();
	}

}
