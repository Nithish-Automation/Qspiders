package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrearyDemoLoginPage {
	
	@FindBy(id="course")
	private WebElement courseTab;
	
	@FindBy(xpath = "//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	public SkillrearyDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCourseTab() {
		return courseTab;
	}
	
	public void seleniumtrainingbt() {
		seleniumtraining.click();
	}
}
