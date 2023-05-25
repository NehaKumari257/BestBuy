package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BestbuyBaseClass.BaseClass;

public class AddCartPage extends BaseClass {
	
	@FindBy(xpath="//input[@id='gh-search-input']")
	WebElement SearchBar;
	
	@FindBy(xpath="//span[@Class='header-search-icon']")
	WebElement search;
	
	@FindBy(xpath="(//a[contains(text(),'Midnight Sport Band - M/L - Midnight')])[1]")
	WebElement SelectProduct;
	
	//(//*[contains(text(),'Add to Cart')][@type='button'])[1]
	
	@FindBy(xpath="(//button[contains(@class,'add-to-cart-button')])[1]")
	WebElement ClickAddCart;
	
	@FindBy(xpath="(//button[contains(text(),'Continue shopping')])")
	WebElement continueshopping;
	
	@FindBy(xpath="//button[contains(@class,'menu-button')]")
	WebElement menu;
	
	@FindBy(xpath="//button[contains(text(),'Computers & Tablets')]")
	WebElement computerAndTab;
	
	@FindBy(xpath="//button[contains(text(),'Tablets')]")
	WebElement tablet;
	
	@FindBy(xpath="(//a[contains(text(),'iPad')])[1]")
	WebElement ipad;
	
	@FindBy(xpath="(//a[contains(text(),'Shop Now')])[1]")
	WebElement shopnow;
	
	@FindBy(xpath="(//*[contains(text(),'Add to Cart')][@type='button'])[1]")
	WebElement addToCart;
	
	@FindBy(xpath="//button[contains(text(),'Continue shopping')]")
	WebElement shoppingContinue;
	
	@FindBy(xpath="//button[contains(text(),'Brands')]")
	WebElement brands;
	
	@FindBy(xpath="//a[contains(text(),'Microsoft')]")
	WebElement microsoft;
	
	@FindBy(xpath="(//a[@class='tile-link']//*[contains(text(),'Windows laptops')])")
	WebElement windowslaptop;
	
	@FindBy(xpath="(//button[contains(@class,'add-to-cart-button')])[1]")
	WebElement selectLaptop;
	
	@FindBy(xpath="//a[contains(text(),'Go to Cart')]")
	WebElement FinalCart;
	
	//@FindBy(xpath="//button[contains(text(),'Add Totaltech to Cart')]")
	//WebElement Totaltech;
	
	@FindBy(xpath="//button[@class='c-close-icon c-modal-close-icon']")
	WebElement closebutton;
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkout;
	
	@FindBy(xpath="//button[contains(text(),'Continue as Guest')]")
	WebElement continueAsGuest;
	
	@FindBy(xpath="//input[@id='user.emailAddress']")
	WebElement emailAddress;
	
	@FindBy(xpath="//input[@id='user.phone']")
	WebElement Mobno;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement ContinuePayment;
	
	@FindBy(xpath="//input[@id='number']")
	WebElement CardNo;
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement Firstname;
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lastname;
	@FindBy(xpath="//input[@name='addressLine1']")
	WebElement addressLine;
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	@FindBy(xpath="//select[@name='state']")
	WebElement selState;
	@FindBy(xpath="//input[@name='postalCode']")
	WebElement postalcode;
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordCreate;
	
	
	@FindBy(xpath="(//button[(@class='btn btn-lg btn-block btn-primary')])")
	WebElement orderPlaced;
	

	
	
	public AddCartPage() {
		
		PageFactory.initElements(driver,this );
	}
	
	public WebElement searchBar() {
		return SearchBar;
		
	}
	
	 public void textSearch(String ProductName) {
			
			clickElement(SearchBar);
			this.SearchBar.sendKeys(ProductName);
			search.click();
			//clickElement(SelectProduct);
			//WebElement entityName = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='fulfillment-add-to-cart-button-98824305']//*[contains(text(),'Add to Cart')])[1]")));
			//entityName.clear();
			//entityName.clear();
			//entityName.sendKeys("TEST");
			//clickElement(ClickAddCart);
			
			clickElement(ClickAddCart);
			
			clickElement(continueshopping);
			
		    clickElement(menu);
		    clickElement(computerAndTab);
		    clickElement(tablet);
		    clickElement(ipad);
		    clickElement(shopnow);
		    clickElement(addToCart);
		    clickElement(shoppingContinue);
		    clickElement(menu);
		    clickElement(brands);
		    clickElement(microsoft);
		    clickElement(windowslaptop);
		    clickElement(selectLaptop);
		    clickElement(FinalCart);
		    clickElement(closebutton);
		    waitForElement(checkout);
		    clickElement(checkout);
		    clickElement(continueAsGuest);
		   
		    
			
			//clickElement(GotoCart);
			
			
		}
	 
	 public void paymentInfo(String emailAddress,String Mobno) throws Exception {
		this.emailAddress.sendKeys(emailAddress);
		this.Mobno.sendKeys(Mobno);
		clickElement(ContinuePayment);
		Thread.sleep(5000);
	 }
	 public void paymentDetails(String CardNo,String Firstname,String lastname, String addressLine,String city,String selectState, String postalcode, String passwordCreate) {
		 this.CardNo.sendKeys(CardNo);
		 this.Firstname.sendKeys(Firstname);
		 this.lastname.sendKeys(lastname);
		 this.addressLine.sendKeys(addressLine);
		 this.city.sendKeys(city);
		// this.selectState.sendKeys(selectState);
		 Select sel=new Select(selState);
		 sel.selectByValue(selectState);
		 this.postalcode.sendKeys(postalcode);
		 this.passwordCreate.sendKeys(passwordCreate);
		 clickElement(orderPlaced);
	 }
	

	
	
	
	
	

}
