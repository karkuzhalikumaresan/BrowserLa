package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gtcourse {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	Actions a=new Actions(driver);
	WebElement mouseover = driver.findElement(By.xpath("//div[@title='Courses']"));
	a.moveToElement(mouseover).perform();
	WebElement mouseover1 = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
	a.moveToElement(mouseover1).perform();
	WebElement select = driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Certification Training']"));
    select.click();
}

}
