package org.testbase;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	WebDriver driver;
	
	public void browserLanch() {
		driver=new ChromeDriver();
	}
	
	public void enterAppliUrl(String url) {
		driver.get(url);
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void elementSendKeys(WebElement element,String data) {
		element.sendKeys(data);
	}
	
	public void elementSendKeyEnter(WebElement element,String data) {
		element.sendKeys(Keys.ENTER);
	}
	
	public void elementClick(WebElement element) {
		element.click();
	}
	
	public void elementClear(WebElement element) {
		element.clear();
	}
	
	public String getAppliTitle() {
		String title=driver.getTitle();
		return title;
	}
	
	public 	WebElement findLocatorById(String attributeValue) {
		WebElement element=driver.findElement(By.id(attributeValue));
		return element;
	}
	
	public WebElement findLocatorByName(String attributeValue) {
		WebElement element=driver.findElement(By.name(attributeValue));
		return element;
	}
	
	public WebElement findLocatorByClass(String attributeValue) {
		WebElement element=driver.findElement(By.className(attributeValue));
		return element;
	}
	
	public WebElement findLocatorByXpath(String attributevalue) {
		WebElement element=driver.findElement(By.xpath(attributevalue));
		return element;
	}
	
	public String getCurrentUrl() {
		String url=driver.getCurrentUrl();
		return url;
	}
	
	public void closeAllWindow() {
		driver.quit();
	}
	
	public void closeCurrentWindow() {
		driver.close();
	}
	
	public boolean elementIsDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	
	public boolean elementIsnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	
	public boolean elementIsSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}
	
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	
	public String getAttribute(WebElement element,String AttributeName) {
		String attribute = element.getAttribute(AttributeName);
		return attribute;
	}
	
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void cancelAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public String dropdown(Select select,String data) {
		select.selectByVisibleText(data);
		return data;
	}
	
	public int dropdown(Select select, int index) {
		select.selectByIndex(index);
		return index;
	}
	
	public String dropdownByValue(Select select, String attribte) {
		select.selectByValue(attribte);
		return attribte;
	}
	
	public List<WebElement> dropDownByGetOptions(Select select, WebElement element) {
		List<WebElement> options = select.getOptions();
		for(int i=0;i<options.size();i++) {
			WebElement element1 = options.get(i);
			element1.getText(); 
		}
		return options;
	}
	
	public String dropdownFirstSelectedOption(Select select,WebElement data) {
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		return text;
	}
	
	public void deSelectByIndex(Select select,int index) {
		select.deselectByIndex(index);
	}
	
	public void deSelectByValue(Select select,String value) {
		select.deselectByValue(value);
	}
	
	public void deSelectByAttribute(Select select,String value) {
		select.deselectByVisibleText(value);
	}
	
	public void deSelectAll(Select select) {
		select.deselectAll();
	}
	
	
	public void frameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	
	public void frameById(String id) {
		driver.switchTo().frame(id);
	}
	
	public void frameByName(String name) {
		driver.switchTo().frame(name);
	}
	
	public void natigateRefresh(Navigation navigate) {
		navigate.refresh();	
	}
	
	public void mouseOverAction(WebElement element,Actions a) {
		a.moveToElement(element).perform();	
	}
	
	public void rightClickction(Actions a) {
		a.contextClick().perform();
	}
	
	public void doubleClick(Actions a) {
		a.doubleClick().perform();
	}
	
	public void dragAndDrop(WebElement element,WebElement element1,Actions a) {
		a.dragAndDrop(element, element1).perform();
	}
	
	public String parentWindow(String windowhandle) {
		String windowHandle = driver.getWindowHandle();
		return windowhandle;
	}
	
	public Set<String> allWindowId() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	
	public void ChildWindowId(){
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String x:windowHandles) {
			if(!x.equals(windowHandle)){
				driver.switchTo().window(x);
			}
		}
	}
	
	
	public void implicitWait(Duration duration) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
