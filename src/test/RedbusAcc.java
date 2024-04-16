package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusAcc {
	public static void main(String []args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		WebElement txtFrom = driver.findElement(By.id("from_station"));
		txtFrom.sendKeys("Chennai");
		WebElement txtTo = driver.findElement(By.id("to_station"));
		txtTo.sendKeys("Trichy");
		WebElement btnSearch = driver.findElement(By.id("trainFormButton"));
		btnSearch.click();
	}

}
