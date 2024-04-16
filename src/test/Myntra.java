package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		WebElement btnOthers = driver.findElement(By.xpath("//span[@class='_3odgy']"));
		btnOthers.click();
		WebElement txtSearch = driver.findElement(By.xpath("//input[@class='_381fS _1oTLG _1H_62']"));
		txtSearch.sendKeys("Chennai");
		
	}

}
