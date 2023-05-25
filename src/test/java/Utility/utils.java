package Utility;

import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class utils {
	
	public static WebDriver driver;

	public static void launchUrl(String url) {
		
		try 
        {
          
          
         HttpURLConnection httpConnection = (HttpURLConnection) new URL(url).openConnection();
           
         httpConnection.setConnectTimeout(3000);
           
         httpConnection.connect();
           
           if(httpConnection.getResponseCode()==200)
           {
               System.out.println(url+" - "+httpConnection.getResponseMessage());
            }
          if(httpConnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(url+" - "+httpConnection.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
		
		driver.get(url);
	}

	public static String getpropvalue(String key) {
		String value = null;
		try {
			Properties prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "//config.properties");
			prop.load(ip);
			value = prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static void browserLaunch(String browser) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

	}
	
	public void verifyLink(String url)
	{
        try 
        {
          
          
         HttpURLConnection httpConnection = (HttpURLConnection) new URL(url).openConnection();
           
         httpConnection.setConnectTimeout(3000);
           
         httpConnection.connect();
           
           if(httpConnection.getResponseCode()==200)
           {
               System.out.println(url+" - "+httpConnection.getResponseMessage());
            }
          if(httpConnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(url+" - "+httpConnection.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
    } 
	
	 public void waitForElement(WebElement ele) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 50);
				wait.until(ExpectedConditions.visibilityOf(ele));
				wait.until(ExpectedConditions.elementToBeClickable(ele));
				
			} catch (Exception ex) {

				ex.printStackTrace();
			}

		}
        

	public void clickElement(WebElement element) {
		try {
			element.click();

							
		} catch (Exception e) {
			System.out.println("Error in clicking the webelement :" + e.getMessage());
			// test.log(Status.FAIL, "Failed to click the element :" + id);
		}

	}

	public boolean validateElement(WebElement element) {

		if (element.isDisplayed()) {
			
			return true;
			// test.log(Status.PASS, id + "is clicked ");
		}

		else
			return false;

	}
	public String textgetmethod(WebElement element) {
		
		return element.getText(); 
		
		
	}
	
	
	

}



