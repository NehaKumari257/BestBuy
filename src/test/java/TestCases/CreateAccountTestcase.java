package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BestbuyBaseClass.BaseClass;
import Pages.CreateAccountPage;
import Pages.HomePage;


public class CreateAccountTestcase extends BaseClass {
	@Test
	
	public void tc02createAccount(){
		HomePage ca=new HomePage();
		ca.clickcountry();
		CreateAccountPage cp=new CreateAccountPage();
		cp.signup("Neha", "Kumari", "royneha257@gmail.com","Nehakumari@123","Nehakumari@123","8743945696");
		
	
	}
	@Test
	public void validateCreateAccount() {
		
		HomePage ca=new HomePage();
		ca.clickcountry();
	
	    CreateAccountPage pp=new CreateAccountPage();
		
		Assert.assertTrue(pp.AccountButton());
		
	}
/*
	@Test
	public void tc03PwdContainsLetter() {
		HomePage ca=new HomePage();
		ca.clickcountry();
		CreateAccountPage cp=new CreateAccountPage();
		cp.signup("Neha", "Kumari", "royneha257@gmail.com","Nehakumari","Nehakumari","8743945696");
		
		WebElement error_Message=driver.findElement(By.xpath("//strong[contains(text(),'An account with this email already exists.')]"));
		String exp="An account with this email already exists.";
		Assert.assertEquals(exp,error_Message.getText());
	}
	
	@Test
	public void tc03PwdContainsNumbers() {
		HomePage ca=new HomePage();
		ca.clickcountry();
		CreateAccountPage cp=new CreateAccountPage();
		cp.signup("Neha", "Kumari", "royneha257@gmail.com","12345678","12345678","8743945696");
		
	}
*/
}
