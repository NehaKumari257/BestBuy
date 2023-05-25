package BestbuyBaseClass;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utility.utils;

public class BaseClass extends utils{
	
	@BeforeMethod
	public void start() throws Exception {
		
		browserLaunch(getpropvalue("browser"));
		launchUrl(getpropvalue("url"));
		driver.manage().window().maximize();
	
	}
    
		
	@AfterMethod
	public void closeUp() {
		
		//Thread.sleep(7);
		driver.quit();

}


		}
		
	
