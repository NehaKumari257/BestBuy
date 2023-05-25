package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BestbuyBaseClass.BaseClass;

public class MenuPage extends BaseClass{
	
	
	@FindBy(xpath="(//*[@class='bottom-fluid-container ']//*[contains(text(),'Deals')])")
	WebElement TopDeals;
	
	@FindBy(xpath="(//*[@class='bottom-fluid-container ']//*[contains(text(),'Deal of the Day')])")
	WebElement Dealofday;
	
	@FindBy(xpath="(//*[@class='bottom-fluid-container ']//*[contains(text(),'Totaltech Membership')])")
	WebElement TechMember;
	
	@FindBy(xpath="//*[@class='bottom-fluid-container ']//*[contains(text(),'Credit Cards')]")
	WebElement CreditCards;
	
	@FindBy(xpath="//*[@class='bottom-fluid-container ']//*[contains(text(),'Gift Cards')]")
	WebElement giftCard;
	
	@FindBy(xpath="//*[@class='bottom-fluid-container ']//*[contains(text(),'More')]")
	WebElement more;
	
	@FindBy(xpath="//*[@class='liDropdownList']//*[contains(text(),'Gift Ideas')]")
	WebElement giftIdeas;
	
	@FindBy(xpath="//*[@class='liDropdownList']//*[contains(text(),'Health & Wellness')]")
	WebElement HealthWellness ;
	
	@FindBy(xpath="//*[@class='liDropdownList']//*[contains(text(),'Best Buy Outlet')]")
	WebElement BestBuy;
	
	@FindBy(xpath="//*[@class='liDropdownList']//*[contains(text(),'Best Buy Business')]")
	WebElement BestBusiness;
	@FindBy(xpath="//span[contains(text(),'Close')]")
	WebElement Close;
	
	
	
     public MenuPage() {
    	 
    	 PageFactory.initElements(driver, this);
		
	}
     
     public void clickTopdeals() {
 		
 		clickElement(TopDeals);
 	}
     
    public void clickDealOfDay() {
    	
  		clickElement(Dealofday);
    	 
     }
    
    
     public void clickTechMember() {
    	 
   		clickElement(TechMember);
     	 
      }
    
     public void clickCreditcards() {
    	 
      clickElement(CreditCards);
      	 
       }
     
     
     public void clickgiftCard() {
    	 
     	clickElement(giftCard);
       	 
        }
     
     
     public void clickmore() {
    	
      	clickElement(more);
      	clickElement(giftIdeas);
      	       	 
         }
     public void clickhealth() {
     	
       	clickElement(more);
       	clickElement(HealthWellness);
       	       	 
          }
     public void clickBestbuy() {
      	
        	clickElement(more);
        	clickElement(BestBuy);
        	       	 
           }
     
     public void clickBestBussiness() {
       	
     	clickElement(more);
     	clickElement(BestBusiness);
     	       	 
        }
     public void clickonClose() {
        	
      	clickElement(more);
      	clickElement(Close);
      	       	 
         }
      

     
     
 
     
     
}
