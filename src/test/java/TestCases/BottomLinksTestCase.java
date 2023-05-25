package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import BestbuyBaseClass.BaseClass;
import Pages.BottomLinks;
import Pages.HomePage;
import Pages.MenuPage;

public class BottomLinksTestCase extends BaseClass {
	
	@Test
	public void scroll() throws Exception 
	{
	HomePage hp=new HomePage();
	hp.clickcountry();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,5200)");
	Thread.sleep(3000);
	BottomLinks bl =new BottomLinks();
	bl.clickaccess();
	Assert.assertEquals("Accessibility - Best Buy",driver.getTitle());
	Thread.sleep(3000);
	
	}

}
