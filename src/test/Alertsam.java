package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsam {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		element.click();
		//driver.switchTo().alert().accept();
	}

}
