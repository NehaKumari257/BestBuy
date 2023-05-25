package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import BestbuyBaseClass.BaseClass;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginTestcase extends BaseClass {
	@Test
	public void tc03Signin() {
		HomePage ca=new HomePage();
		ca.clickcountry();
		LoginPage lp=new LoginPage();
		lp.login("royneha257@gmail.com","Nehakumari@123");
		
		
		
	}
	
	//Negative test case for login
	@Test
	public void tc004signinWithNum() {
		HomePage ca=new HomePage();
		ca.clickcountry();
		LoginPage lp=new LoginPage();
		try {
			
		lp.login("royneha257@gmail.com", "1232456891");
		Assert.assertEquals("The password was incorrect. Please try again.",lp.getTexterror());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
