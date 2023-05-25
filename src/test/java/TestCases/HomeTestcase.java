package TestCases;

import org.testng.annotations.Test;

import BestbuyBaseClass.BaseClass;
import Pages.HomePage;

public class HomeTestcase extends BaseClass {
	
	
	@Test
	
	public void tcHome01() {
		
		HomePage hp=new HomePage();
		hp.clickcountry();
		
			
	}	
	

}
