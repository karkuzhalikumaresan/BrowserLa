package test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	private static final int Company = 0;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> header = table.findElements(By.tagName("th"));
		List<String> li=new ArrayList<String>();
		for(WebElement heading:header) {
			String text = heading.getText();
			//System.out.println(text);
			li.add(text);
		}
		
		String HeaderName="Contact";
		int Columnindex = li.indexOf(HeaderName);
		List<WebElement> data = table.findElements(By.xpath("//td["+(Columnindex+1)+"]"));
		for(WebElement v:data) {
			System.out.println(v.getText());
		}
		
//		for(int i=0;i<7;i++) {
//			WebElement v = data.get(Columnindex);
//			System.out.println(v.getText());
//		}
	}

}
