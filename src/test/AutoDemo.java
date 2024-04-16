package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoDemo {
	public static void main(String []args) {
		WebDriver driver=new EdgeDriver();
		
		//to launch url
		driver.get("http://demo.automationtesting.in/Register.html");
		
		//to maximize window
		driver.manage().window().maximize();
		
		//class="form-control ng-pristine ng-invalid ng-invalid-required ng-touched"--find and verify the locator for location textbox
		WebElement firstName=driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));
		
		//insert value
		firstName.sendKeys("karkuzhali");
	}

}
