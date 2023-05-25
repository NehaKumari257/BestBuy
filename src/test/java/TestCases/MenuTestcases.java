package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BestbuyBaseClass.BaseClass;
import Pages.HomePage;
import Pages.MenuPage;

public class MenuTestcases extends BaseClass{
	
	@Test
	
	public void validateTopDealsTitle() throws Exception {
	HomePage hp=new HomePage();
	hp.clickcountry();
	MenuPage mp=new MenuPage();
	mp.clickTopdeals();
	Thread.sleep(3000);
	//String actualTitle = driver.getTitle();
	//String expectedTitle = "Top Deals and Featured Offers on Electronics - Best Buy";
	Assert.assertEquals("Top Deals and Featured Offers on Electronics - Best Buy",driver.getTitle());
	//System.out.println(driver.getTitle());
	}

	@Test
	
	public void validateDealofDayTitle() throws Exception {
	HomePage hp=new HomePage();
	hp.clickcountry();
	MenuPage mp=new MenuPage();
	mp.clickDealOfDay();
	Thread.sleep(3000);
	//String actualTitle = driver.getTitle();
	//String expectedTitle = "Top Deals and Featured Offers on Electronics - Best Buy";
	Assert.assertEquals("Deal of the Day: Electronics Deals - Best Buy",driver.getTitle());	
	}
	
    @Test
	
	public void validateMemberOfferTitle() throws Exception {
	HomePage hp=new HomePage();
	hp.clickcountry();
	MenuPage mp=new MenuPage();
	mp.clickTechMember();
	Thread.sleep(3000);
	Assert.assertEquals("Best Buy Totaltech™ – Best Buy",driver.getTitle());	
		
	}
    
    
    @Test
    public void validateGiftTitle() throws Exception {
	HomePage hp=new HomePage();
	hp.clickcountry();
	MenuPage mp=new MenuPage();
	mp.clickCreditcards();
	Thread.sleep(3000);
	Assert.assertEquals("Best Buy Credit Card: Rewards & Financing",driver.getTitle()); 
    }  
    
    @Test
    public void validateGiftCardTitle() throws Exception {
	HomePage hp=new HomePage();
	hp.clickcountry();
	MenuPage mp=new MenuPage();
	mp.clickgiftCard();
	Thread.sleep(3000);
	Assert.assertEquals("Gifts Cards and E-Gift Cards - Best Buy",driver.getTitle());
    }   
    
    @Test
    public void validateGiftIdeasTitle() throws Exception {
	HomePage hp=new HomePage();
	hp.clickcountry();
	MenuPage mp=new MenuPage();
	mp.clickmore();
	Thread.sleep(3000);
	Assert.assertEquals("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy",driver.getTitle());

   

  } 
    @Test
    public void validateHealthTitle() throws Exception {
	HomePage hp=new HomePage();
	hp.clickcountry();
	MenuPage mp=new MenuPage();
	mp.clickhealth();
	Thread.sleep(3000);
	Assert.assertEquals("Health & Wellness Solutions & Technology - Best Buy",driver.getTitle());

  } 
    @Test
    public void validateBestBuyTitle() throws Exception {
	HomePage hp=new HomePage();
	hp.clickcountry();
	MenuPage mp=new MenuPage();
	mp.clickBestbuy();
	Thread.sleep(3000);
	Assert.assertEquals("Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy",driver.getTitle());

  } 
    
    @Test
    public void validateBestBusinessTitle() throws Exception {
	HomePage hp=new HomePage();
	hp.clickcountry();
	MenuPage mp=new MenuPage();
	mp.clickBestBussiness();
	Thread.sleep(3000);
	Assert.assertEquals("Best Buy for Business - Best Buy",driver.getTitle());

  } 
    @Test
    public void Close() throws Exception {
	HomePage hp=new HomePage();
	hp.clickcountry();
	MenuPage mp=new MenuPage();
	mp.clickonClose();
	Thread.sleep(3000);
	

  } 
    
  
    
}

