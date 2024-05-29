package org.testbase;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grocery {
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.get("https://www.omrbranch.com/");
	driver.manage().window().maximize();
	WebElement userIdTextBox = driver.findElement(By.id("email"));
	userIdTextBox.sendKeys("karkuzhalikumaresan@gmail.com");
	WebElement pwdTextBox = driver.findElement(By.id("pass"));
	pwdTextBox.sendKeys("Karu@1993");
	WebElement btnLogin = driver.findElement(By.xpath("//button[text()='Login']"));
	btnLogin.click();
	
	WebElement userName = driver.findElement(By.cssSelector(".icoTwitter.mr-2.dropdown-toggle"));
	String text = userName.getText();
	System.out.println(text);
	WebElement txtSearch = driver.findElement(By.id("search"));
	txtSearch.sendKeys("nuts");
	txtSearch.sendKeys(Keys.ENTER);
	
	WebElement txtSearchResult = driver.findElement(By.cssSelector(".sectionTitle.font35.font-weight-bold.color11"));
	String text2 = txtSearchResult.getText();
	System.out.println(text2);
	
	WebElement addClick = driver.findElement(By.cssSelector(".hover1.font16.fontsemibold.colorWhite.bgTheme.px-4.py-1.radius50.dyna_btn.addBtn-17"));
	addClick.click();
	
	WebElement btnAdd = driver.findElement(By.xpath("//button[@id='cart-21']"));
	btnAdd.click();
	
	WebElement goToCartBtn = driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()", goToCartBtn);
	
	WebElement txtMyCart = driver.findElement(By.xpath("//h5[text()='My Cart']"));
	String text3 = txtMyCart.getText();
	System.out.println(text3);
	
	WebElement deliveryAdd = driver.findElement(By.xpath("//div[text()='Delivery Address']"));
	String text4 = deliveryAdd.getText();
	System.out.println(text4);
	
	WebElement img = driver.findElement(By.xpath("//img[@src='https://www.omrbranch.com/front/images/plus.png']"));
	img.click();
	
	Thread.sleep(3000);
	WebElement dropdown = driver.findElement(By.xpath("//select[@name='address_type']"));
	Select select=new Select(dropdown);
	select.selectByVisibleText("Work");
	
	Thread.sleep(3000);
	
	WebElement txtFirstName = driver.findElement(By.xpath("//input[@placeholder='First name*']"));
	txtFirstName.sendKeys("karkuzhali");
	
	WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last name*']"));
	txtLastName.sendKeys("kumaresan");
	
	WebElement txtcontactNo = driver.findElement(By.xpath("//input[@placeholder='Contact No*']"));
	txtcontactNo.sendKeys("9942222100");
	
	WebElement txtHouseno = driver.findElement(By.xpath("//input[@placeholder='House No*']"));
	txtHouseno.sendKeys("19/b");
	
	WebElement txtAddress = driver.findElement(By.xpath("//input[@placeholder='Address*']"));
	txtAddress.sendKeys("Trichy");
	
	WebElement selectState = driver.findElement(By.xpath("//select[@name='state']"));
	Select s=new Select(selectState);
	s.selectByVisibleText("Tamil Nadu");
	
	WebElement selectCity = driver.findElement(By.xpath("//select[@name='city']"));
	Select s1=new Select(selectCity);
	s1.selectByVisibleText("Lalgudi");
	
	WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Zip Code*']"));
	pincode.sendKeys("621601");
	
	WebElement btnSave = driver.findElement(By.cssSelector(".saveAddress.font18.fontSemiBold.colorWhite.bgTheme.radius50.borderNone.px-5.py-2.hover1"));
	btnSave.click();
	
	WebElement paymentTxt = driver.findElement(By.xpath("//div[text()='  Payment Method ']"));
	js.executeScript("arguments[0].scrollIntoView(true)",paymentTxt);
	String text5 = paymentTxt.getText();
	System.out.println(text5);
	
	Thread.sleep(3000);
	WebElement payment = driver.findElement(By.xpath("//select[@id='payment_type']"));
	
	Select s6=new Select(payment);
	s6.selectByValue("debit_card");
	
	WebElement selectType = driver.findElement(By.xpath("//label[text()=' Visa ']"));
	selectType.click();
	
	WebElement txtCardNumber = driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
	txtCardNumber.sendKeys("5555555555552222");
	
	WebElement selectMonth = driver.findElement(By.id("month"));
	Select s4=new Select(selectMonth);
	s4.selectByVisibleText(" January ");
	
	WebElement selectYear = driver.findElement(By.id("year"));
	Select s5=new Select(selectYear);
	s5.selectByVisibleText("2028");
	
	WebElement txtCVV = driver.findElement(By.xpath("//input[@placeholder='CVV']"));
	txtCVV.sendKeys("067");
	
	WebElement btnPlace = driver.findElement(By.cssSelector("button#placeOrder"));
	btnPlace.click();
	
	WebElement userIdTextBox1 = driver.findElement(By.id("email"));
	userIdTextBox1.sendKeys("karkuzhalikumaresan@gmail.com");
	WebElement pwdTextBox1 = driver.findElement(By.id("pass"));
	pwdTextBox1.sendKeys("Karu@1993");
	WebElement btnLogin1 = driver.findElement(By.xpath("//button[text()='Login']"));
	btnLogin1.click();
	
	WebElement userClick = driver.findElement(By.xpath("//a[@class='icoTwitter mr-2 dropdown-toggle']"));
	userClick.click();
	
	WebElement AccountInfo = driver.findElement(By.xpath("//a[text()='My Account']"));
	AccountInfo.click();
	
	WebElement orderTab = driver.findElement(By.id("v-pills-orders-tab"));
	orderTab.click();
	
	Thread.sleep(3000);
	WebElement orderNo = driver.findElement(By.xpath("(//span[@class='font16 ml-2'])[1]"));
	String text6 = orderNo.getText();
	System.out.println("Order No :"+text6);
	
	
	}
	
	

}
