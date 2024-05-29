package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotPgm {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();

        TakesScreenshot ts=(TakesScreenshot) driver;
        
        File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        
        File f=new File("D:\\GreensTechnology.png");
        
        FileUtils.copyFile(screenshotAs, f);
	}

}
