package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String []args) {
		WebDriver driver=new ChromeDriver();
		//to launch url
		driver.get("https://www.facebook.com/");
		
		//to maximize window
		driver.manage().window().maximize();
		
		//to get the title
		String title=driver.getTitle();
		System.out.println(title);
		
		//to get the url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//to close the window
		driver.quit();
		
	}

}
