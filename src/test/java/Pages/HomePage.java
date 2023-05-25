package Pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BestbuyBaseClass.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="(//*[contains(text(),'United State')])[1]")
	WebElement selectCountry;
	
	
	public HomePage() {
		PageFactory.initElements(driver,this );
		
	}
	public void clickcountry() {
		
	    clickElement(selectCountry);
	}
	
	
	
	
	 

}
	
	
	
	
	
	


