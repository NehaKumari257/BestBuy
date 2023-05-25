package TestCases;

import org.testng.annotations.Test;

import BestbuyBaseClass.BaseClass;
import Pages.AddCartPage;
import Pages.HomePage;

public class AddCartTestcases extends BaseClass{
	@Test
	
	public void addCart() throws Exception {
		HomePage hp=new HomePage();
		hp.clickcountry();
		AddCartPage ap=new AddCartPage();
		ap.textSearch("apple watch");
		Thread.sleep(5000);
	    ap.paymentInfo("royneha257@gmail.com", "8743945696");
	    
		ap.paymentDetails("234567899012345","fgfgfhf", "ewewewew","gfghghgfjjgh","dgffff" , "AL","34583","Neha@123#");
		
		
	}

}
