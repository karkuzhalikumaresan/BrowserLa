package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement btnSign = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding\']"));
		btnSign.click();
		WebElement btnNew = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		btnNew.click();
		WebElement txtNum = driver.findElement(By.id("userName"));
		txtNum.sendKeys("7358541528");
		WebElement btnCon = driver.findElement(By.id("checkUser"));
		btnCon.click();
	}

}
