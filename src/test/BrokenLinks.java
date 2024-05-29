package test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		int count=0;
		List<WebElement> links = driver.findElements(By.tagName("img"));
		for(WebElement link:links) {
			String attribute = link.getAttribute("src");
			if(attribute!=null) {
				if(attribute.startsWith("http")) {
					URL url=new URL(attribute);
					URLConnection urlConnection = url.openConnection();
					HttpURLConnection httpurlconnection=(HttpURLConnection)urlConnection;
					int Code = httpurlconnection.getResponseCode();
					if(Code>=400) {
						System.out.println("Response Code:"+Code+" "+"Links==>"+attribute);
						count++;
					}
				}
			}
		}
		System.out.println("Broken image Count:"+count);
	}

}
