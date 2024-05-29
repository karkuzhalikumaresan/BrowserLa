package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciFrame {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
//		driver.switchTo().frame("Revamp_Banner_ID");
		WebElement txtUser = driver.findElement(By.xpath("//input[@title='Login using User ID and password']"));
		txtUser.sendKeys("karkuzhalikumaresan");
		WebElement TxtPassword = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		TxtPassword.sendKeys("@Karu1993");
		WebElement BtnLogin = driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
		BtnLogin.click();
		
	}

}
