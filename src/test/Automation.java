package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		//to check element is displayed or not
		WebElement checkDisplayed = driver.findElement(By.xpath("//h1[text()='Automation Demo Site ']"));
		boolean displayed = checkDisplayed.isDisplayed();
		System.out.println(displayed);
		WebElement txtName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtName.sendKeys("Karkuzhali");
		WebElement txtLastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtLastName.sendKeys("Kumaresan");
		WebElement txtAddress=driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtAddress.sendKeys("voc nagar 3rd cross angarai lalgudi");
		WebElement txtEmail=driver.findElement(By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("karkuzhalikumaresan@gmail.com");
		WebElement txtPhone=driver.findElement(By.xpath("//input[@type='tel']"));
		txtPhone.sendKeys("9942222100");
		WebElement btnGender=driver.findElement(By.xpath("//input[@value='FeMale']"));
		btnGender.click();
		//to check the button is selected or not
		boolean selected = btnGender.isSelected();
		System.out.println(selected);
		WebElement boxCricket=driver.findElement(By.xpath("//input[@value='Cricket']"));
		boxCricket.click();
		WebElement boxMovies=driver.findElement(By.xpath("//input[@value='Movies']"));
		boxMovies.click();
		WebElement boxHockey=driver.findElement(By.xpath("//input[@value='Hockey']"));
		boxHockey.click();
		WebElement txtPass=driver.findElement(By.id("firstpassword"));
		txtPass.sendKeys("@Karu1993");
		WebElement txtConfirm=driver.findElement(By.id("secondpassword"));
		txtConfirm.sendKeys("@Karu1993"); 
		WebElement btnSubmit = driver.findElement(By.id("submitbtn"));
		//to check the button is enabled or not
		boolean enabled = btnSubmit.isEnabled();
		System.out.println(enabled);
		//btnSubmit.click();
		//driver.close();
		
	}

}
