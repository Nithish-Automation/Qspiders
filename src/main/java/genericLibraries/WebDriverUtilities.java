package genericLibraries;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	public void dropDown(WebElement ele, String text) {
		
		Select s=new Select(ele);
		s.selectByVisibleText(text);
		
	}
	
	public void mouseHower(WebDriver driver, WebElement ele) {
		Actions a =new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	
	public void Doubleclick(WebDriver driver, WebElement ele) {
		Actions a =new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void FrameSwitch(WebDriver driver) {
		driver.switchTo().frame(0);
		
	}
	
	public void FrameDefault(WebDriver driver){
		driver.switchTo().defaultContent();
		
	}
	public void scrollBar(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("wondow.scrollBy(x,y)");
	}
	
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void switchTabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for (String b : child) {
			driver.switchTo().window(b);
			
		}
		
		
	
	}
	
	

}
