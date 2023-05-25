package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BestbuyBaseClass.BaseClass;

public class BottomLinks extends BaseClass{

	
	
	@FindBy(xpath="//a[contains(text(),'Accessibility')]")
	WebElement access;
	
	public BottomLinks() {
		PageFactory.initElements(driver, this);
	}
	  public void clickaccess() {
	 		
	 	clickElement(access);
	 }
	     

}
