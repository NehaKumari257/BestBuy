package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BestbuyBaseClass.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath=" //span[contains(text(),'Account')]")
	WebElement account;
	
	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	WebElement Signin;
	
	@FindBy(xpath="//input[@name='fld-e']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='fld-p1']")
	WebElement pwd;
	
	@FindBy(xpath="(//button[contains(text(),'Sign In')])[1]")
	WebElement SigninButton;
	
	@FindBy(xpath="//button[contains(text(),'Skip For Now')]")
	WebElement skipButton;
	
	@FindBy(xpath="//button[contains(text(),'Continue Anyway')]")
	WebElement ContinueButton;
	
	@FindBy(xpath="//*[contains(text(),'The password was incorrect. Please try again.')]")
	WebElement loginErr;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getloginAccount() {
		return account;
		
	}
	public void login(String email,String pwd) {
		
		clickElement(account);
		clickElement(Signin);
		this.email.sendKeys(email);
		this.pwd.sendKeys(pwd);
		clickElement(SigninButton);
		clickElement(skipButton);
		clickElement(ContinueButton);
		
	}
	public String getTexterror() {
		String actual=loginErr.getText();
		return actual;
		
		
	}
	

}
