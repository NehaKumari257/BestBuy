package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BestbuyBaseClass.BaseClass;

public class CreateAccountPage extends BaseClass {
	
	@FindBy(xpath=" //span[contains(text(),'Account')]")
	WebElement account;
	
	@FindBy(xpath="(//a[contains(text(),'Create Account')])[1]")
	WebElement CreateAccount;
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement Firstname;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement Lastname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='fld-p1']")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='reenterPassword']")
	WebElement rePassword;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement phoneNo;
	
	@FindBy(xpath="//button[contains(text(),'Create an Account')]")
	WebElement Submit;
	
	public CreateAccountPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getcreateaccount() {
		return account;
		
	}
	public boolean AccountButton() {
		return validateElement(account);
		
	}
	
	public void signup(String Firstname, String Lastname, String email, String Password, String rePassword, String phoneNo  ) {
		
		clickElement(account);
		clickElement(CreateAccount);

		this.Firstname.sendKeys(Firstname);
		this.Lastname.sendKeys(Lastname);
		this.email.sendKeys(email);
		this.Password.sendKeys(Password);
		this.rePassword.sendKeys(rePassword);
		this.phoneNo.sendKeys(phoneNo);
		//Thread.sleep(2000);
		clickElement(Submit);
		
		
		
	}
	
	
	

}
