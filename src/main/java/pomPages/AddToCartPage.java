package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	@FindBy(id = "add")
	private WebElement addBtn;
	
	@FindBy(xpath = "//button[text()=' Add to Cart']")
	private WebElement addtocartBtn;
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddBtn() {
		return addBtn;
	}
	
	public void addtocartButton() {
		addtocartBtn.click();
	}

}
