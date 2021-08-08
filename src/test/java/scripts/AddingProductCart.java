package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkillraryLoginPage;
import pomPages.SkillrearyDemoLoginPage;

public class AddingProductCart extends BaseClass{
	@Test
	public void tc1() throws FileNotFoundException, IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrearyDemoapplication();
		
		utilities.switchTabs(driver);
		
		SkillrearyDemoLoginPage d=new SkillrearyDemoLoginPage(driver);
		utilities.mouseHower(driver, d.getCourseTab());
		d.seleniumtrainingbt();
		
		AddToCartPage a= new AddToCartPage(driver);
		utilities.Doubleclick(driver, a.getAddBtn());
		a.addtocartButton();
		utilities.alertPopup(driver);
		
		Assert.assertEquals(driver.getTitle(), pdata.getData("addtocarttitle"));
		
	}

}
