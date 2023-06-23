package Methods;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.CommonOprations;



public class WebDriverMethod  extends Pages.BasePage {

	
	WebDriverWait wait;
    Alert alert;
    String alertMessage;
	
	public WebDriverMethod(WebDriver driver) 
	{
//		this.driver=driver;
//		PageFactory.initElements(driver, this);
		super(driver);
		
	}
	public WebDriverMethod(WebDriver driver,CommonOprations co,CommonMethods cm) 
	{
		super(driver);
		
	}
	
	
	public void ImplicitlyWait(WebDriver driver, int seconds)
	{
		//driver.manage().timeouts().implicitlyWait(waitTimeInSec, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	  public WebDriverWait initWebDriverWait(WebDriver driver, int timeInSec)
	    {
	       wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
	    	return wait;
	    }
	public void InvisibilityOfElementExplicityWait(WebDriver driver, WebElement element, int timeInSec)
	{
		try
      {
			
			//WebDriverWait wait = new WebDriverWait(driver, timeInSec);
		
			  wait = initWebDriverWait(driver, timeInSec);
			wait.until(ExpectedConditions.invisibilityOf(element));
      }
		catch (Exception e) 
		{
			System.out.println(e.toString());
		}
		
		
	}
	
	public void ElementAttributeContainsExplicityWait(WebDriver driver, WebElement element, String attributename, String attributevalue, int timeInSec)
	{
		try
      {
			 wait = initWebDriverWait(driver, timeInSec);
			wait.until(ExpectedConditions.attributeContains(element, attributename, attributevalue));
      }
		catch (Exception e) 
		{
			System.out.println(e.toString());
		}
	}
	
	public void ExplicityWaitForElementTobeClickable(WebDriver driver, WebElement element, int timeInSec)
	{
		try
      {
			 wait = initWebDriverWait(driver, timeInSec);
			wait.until(ExpectedConditions.elementToBeClickable(element));
      }
		catch (Exception e) 
		{
			System.out.println(e.toString());
		}
	}
	
	public void VisibilityOfElementExplicityWait(WebDriver driver, List<WebElement> Element, int timeInSec)
	{
		try
      {
			 wait = initWebDriverWait(driver, timeInSec);
			wait.until(ExpectedConditions.visibilityOfAllElements(Element));
      }
		catch (Exception e) 
		{
			System.out.println(e.toString());
		}
	}
	
	public void VisibilityOfElementExplicityWait(WebDriver driver, WebElement element, int timeInSec)
	{
		try
      {
			 wait = initWebDriverWait(driver, timeInSec);
			wait.until(ExpectedConditions.visibilityOf(element));
      }
		catch (Exception e) 
		{
			System.out.println(e.toString());
		}
	}
	
	
	public  Boolean isElementPresent(WebDriver driver, By Element)
    {
		WebElement element = null;
		boolean isFound = false;
        try
        {
            element = driver.findElement(Element);
            isFound = element.isDisplayed();
        }
        catch (Exception ex)
        {
            isFound = false;
        	System.out.println(ex.toString());
        }
        
        return isFound;
    }
	
	public static  Boolean isElementPresent(WebDriver driver, WebElement Element)
    {
		boolean isFound = false;
        try
        {
            isFound = Element.isDisplayed();
        }
        catch (Exception ex)
        {
            isFound = false;
        	System.out.println(ex.toString());
        }
        
        return isFound;
    }
	
	public  Boolean isElementPresent(WebDriver driver, List<WebElement> Element)
    {
		boolean isFound = false;
        try
        {
            isFound = Element.get(0).isDisplayed();
        }
        catch (Exception ex)
        {
            isFound = false;
        	System.out.println(ex.toString());
        }
        
        return isFound;
    }
	
	
	
	public void isClicked(WebDriver driver, WebElement element, int timeInSec)
	{ 
	    try {
	        wait = initWebDriverWait(driver, timeInSec);
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	        element.click();
	    } catch(Exception e){
	    	e.printStackTrace();
	    }
	}
	
	public  void JavascriptExecutorClick(WebDriver driver, WebElement Element)
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].click();", Element);
	}
	
	public static Boolean isElementAttributeValueEqual(WebDriver driver, WebElement element,String attributeName, String attributeValue)
    {
		boolean isEqual = false;
        try
        {
            isEqual = element.getAttribute(attributeName).equalsIgnoreCase(attributeValue);
        }
        catch (Exception ex)
        {
        	isEqual = false;
        	System.out.println(ex.toString());
        }
        
        return isEqual;
    }
	

	public void AlertPresentExplicityWait(WebDriver driver, int timeInSec)
	{
		try 
		{
			wait = initWebDriverWait(driver, timeInSec);
			wait.until(ExpectedConditions.alertIsPresent());
//			Assert.assertEquals(driver.switchTo().alert().getText(), "Please Enter Word Verification");
			System.out.println("alert message: "+driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
		}
		catch (UnhandledAlertException e) 
		{
			System.out.println("Exception: "+e.toString());
		}
	}
	
	public void scrollTillPageUp()
	{
	    Actions actions= new Actions(driver);	    
	    actions.keyUp(Keys.CONTROL).sendKeys(Keys.ARROW_UP).perform();
	}
	
	public  Boolean isAlertPresent_accept(WebDriver driver,boolean action) throws Exception
    {
        try
        {
           alert = driver.switchTo().alert();		
           alertMessage= driver.switchTo().alert().getText();		
           System.out.println(alertMessage);	
           Thread.sleep(2000);
           if(action==true)
           {
        	   alert.accept();   
           }
           else
           {
        	   alert.dismiss();
           }
           return true;
        }
        
        catch (Exception ex)
        {
            System.out.println("Alert not present");
            return false;
        }
    }
	
	public  Boolean isElementAttributeValueContain(WebDriver driver, WebElement element,String attributeName, String attributeValue)
    {
		boolean isEqual = false;
		String elementAttributeValue = null;
        try
        {
        	elementAttributeValue = element.getAttribute(attributeName);
        	System.out.println("Webelement attribute value: "+elementAttributeValue);
        	System.out.println("Match attribute value: "+attributeValue);
            isEqual = elementAttributeValue.contains(attributeValue);
        }
        catch (Exception ex)
        {
        	isEqual = false;
        	System.out.println(ex.toString());
        }
        
        return isEqual;
    }
	
	public  Boolean isElementTextMatch(WebDriver driver, WebElement Element, String ElementText)
    {
		boolean isMatch = false;
		String elementText = null;
        try
        {
        	elementText = Element.getText();
        	elementText = elementText.trim();
            isMatch = Element.getText().equalsIgnoreCase(ElementText);
            System.out.println("Webelement Text :"+elementText +"|Match Element Text :"+ElementText +"|result ==="+isMatch);
        }
        catch (Exception ex)
        {
        	isMatch = false;
        	System.out.println(ex.toString());
        }
        
        return isMatch;
    }
	
	public  Boolean isElementTextContain(WebDriver driver, WebElement Element, String ElementText)
    {
		boolean isMatch = false;
		String elementText = null;
        try
        {
        	elementText = Element.getText();
            isMatch = elementText.contains(ElementText);
            System.out.println("WebElementText :"+elementText + "|:Match ElementText :"+ElementText + "|:result =="+ isMatch);
        }
        catch (Exception ex)
        {
        	isMatch = false;
        	System.out.println(ex.toString());
        }
        
        return isMatch;
    }	
	
	public void scrollTillPageEnd()
	{
	    Actions actions= new Actions(driver);	    
	    actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	}
	
	public String CurrentDate(String Format)
	{  
		 SimpleDateFormat dtFormat = new SimpleDateFormat(Format);  
		 Date dt= new Date();
		 String dtReturn= dtFormat.format(dt);
		 return dtReturn;
	}

	
	public String SpecificDate(int days) throws Exception
	{
		SimpleDateFormat dtFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar dtCalender = Calendar.getInstance();
	    dtCalender.add(Calendar.DAY_OF_MONTH,days);
	    String dtReturn = dtFormat.format(dtCalender.getTime()); System.out.println("Date=="+dtReturn);
	    
        return dtReturn;
	}
	
	public String SpecificDate(String Format, int days) throws Exception
	{
		SimpleDateFormat dtFormat = new SimpleDateFormat(Format);
		Calendar dtCalender = Calendar.getInstance();
	    dtCalender.add(Calendar.DAY_OF_MONTH,days);
	    String dtReturn = dtFormat.format(dtCalender.getTime());	 System.out.println("SpecificDate:::"+dtReturn);
        return dtReturn;
	}
	
	public String SpecificDate(String date, String Format, int days) throws Exception
	{
		SimpleDateFormat dtFormat=new SimpleDateFormat(Format);
		Calendar dtCalender=Calendar.getInstance();
		dtCalender.setTime(dtFormat.parse(date));
	    dtCalender.add(Calendar.DAY_OF_MONTH,days);
	    String dtReturn=dtFormat.format(dtCalender.getTime()); 	 System.out.println("SpecificDate:::"+dtReturn);
        return dtReturn;
	}
	
	
	
}
