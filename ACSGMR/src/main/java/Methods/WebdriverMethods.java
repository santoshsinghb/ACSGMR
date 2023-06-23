package Methods;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import edu.emory.mathcs.backport.java.util.Arrays;

public class WebdriverMethods {
	WebDriver driver;
	
    String parentWindowHandler = null, elementText = null;
    boolean verify = false;

	//webdriver wait method
	public void ImplicitlyWait(WebDriver driver, int waitTimeInSec)
	{
		driver.manage().timeouts().implicitlyWait(waitTimeInSec, TimeUnit.SECONDS);		
	}
	
	public void InvisibilityOfElementExplicityWait(WebDriver driver, WebElement element, int timeInSec)
	{
		try
        {
			WebDriverWait wait = new WebDriverWait(driver, timeInSec);
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
			WebDriverWait wait = new WebDriverWait(driver, timeInSec);
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
			WebDriverWait wait = new WebDriverWait(driver, timeInSec);
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
			WebDriverWait wait = new WebDriverWait(driver, timeInSec);
			wait.until(ExpectedConditions.visibilityOfAllElements(Element));
        }
		catch (Exception e) 
		{
        	System.out.println(e.toString());
		}
	}
	
	public static void VisibilityOfElementExplicityWait(WebDriver driver, WebElement element, int timeInSec) {
		try
        {
			WebDriverWait wait = new WebDriverWait(driver, timeInSec);
			wait.until(ExpectedConditions.visibilityOf(element));
        }
		catch (Exception e) 
		{
        	System.out.println(e.toString());
		}
		
	}
	
	//webdriver window handle method
	public String[] handleWindows(WebDriver driver)
	{
		  Set<String> set =driver.getWindowHandles();
		  Iterator<String> itr= set.iterator();
		  String[] win=new String[5];
		  int i=0;
		  while (itr.hasNext()) 
		  {
			win[i]=itr.next();
			i++;
		  }
		  return win;
	}
	
	//webdriver element verifciation methods
	public Boolean isElementEnable(WebDriver driver, By Element)
    {
		WebElement element = null;
		boolean isEnable = false;
        try
        {
            element = driver.findElement(Element);
            if(element.isEnabled() == true && element.isDisplayed() == true)
            {
            	isEnable = true;
            }
            else
            {
            	isEnable = false;
            }
        }
        catch (Exception ex)
        {
        	isEnable = false;
        	System.out.println(ex.toString());
        }
        
        return isEnable;
    }
	
	public static  Boolean isElementPresent(WebDriver driver, WebElement Element)
    {
		boolean isFound = false;
        try
        {
            isFound = Element.isDisplayed(); System.out.println("isElementPresent:::"+isFound);
        }
        catch (Exception ex)
        {
            isFound = false; System.out.println("isElementPresent:::"+isFound);
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
	
	public  Boolean isElementPresent(WebDriver driver, String linkTextValue) throws Throwable
    {
		WebElement element = null;
		boolean isFound = false;
        try
        {
            element = TextContainsWebelement(driver, linkTextValue);
            Thread.sleep(500);
            isFound = element.isDisplayed();
        }
        catch (Exception ex)
        {
            isFound = false;
        	System.out.println(ex.toString());
        }
        
        return isFound;
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
	
	public  Boolean isElementTextMatch2(WebDriver driver, WebElement Element, String ElementText)
    {
		boolean isMatch = false;
		String elementText = null;
        try
        {
        	elementText = Element.getText();
        	elementText = elementText.trim();
//        	System.out.println("Webelement Text: "+elementText);
//        	System.out.println("Match Element Text: "+ElementText);
            isMatch = elementText.equalsIgnoreCase(ElementText);
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
	
	public  Boolean isElementAttributeValueEqual(WebDriver driver, WebElement element,String attributeName, String attributeValue)
    {
		boolean isEqual = false;
		String elementAttributeValue = null;
        try
        {
        	elementAttributeValue = element.getAttribute(attributeName);
//        	System.out.println("Webelement attribute value: "+elementAttributeValue);
//        	System.out.println("Match attribute value: "+attributeValue);
            isEqual = elementAttributeValue.equalsIgnoreCase(attributeValue);
        }
        catch (Exception ex)
        {
        	isEqual = false;
        	System.out.println(ex.toString());
        }
        
        return isEqual;
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
	
	//webdriver action class related methods
	public void ClearTextbox(WebDriver driver, WebElement element) throws Throwable
	{
		 Actions move = new Actions(driver);
		 Action clear = move.moveToElement(element).build();
		 clear.perform();
		 Thread.sleep(2000);
		 clear = move.click().build();
		 clear.perform();
		 Thread.sleep(2000);
		 clear = move.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE).build();
		 clear.perform();
		 Thread.sleep(3000);
	}
	
	public void DragAndDrop(WebDriver driver, WebElement fromElement, WebElement toElement) throws Throwable
	{
		 Actions moved = new Actions(driver);
		 Action dragDrop = moved.moveToElement(fromElement)
				 .clickAndHold(fromElement)
				 .moveToElement(toElement)
				 .release(toElement).build();
		 dragDrop.perform();
		 
		 Thread.sleep(3000);
	}
	
	public void JavascriptExecutorClick(WebDriver driver, WebElement Element)
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].click();", Element);
	}
	
	//select from dropdown methods
	public void SelectFromDropdownList(WebDriver driver, WebElement elementToClick, List <WebElement> DropdownListElements, String selectValue) throws Throwable
	{	
		Thread.sleep(1000);	
		VisibilityOfElementExplicityWait(driver, elementToClick, 60); 
		Thread.sleep(5000);
		elementToClick.click();
		Thread.sleep(2000);
		for (int i = 0; i < DropdownListElements.size(); i++) 
		{
			elementText = DropdownListElements.get(i).getText();  System.out.println("elementText :"+elementText);
			if (isElementTextContain(driver, DropdownListElements.get(i), selectValue) == true)
			{
				DropdownListElements.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
	}
	
	public void SelectFromDropdownList2(WebDriver driver, WebElement elementToClick, List <WebElement> DropdownListElements, String selectValue) throws Throwable
	{
		elementToClick.click();
		Thread.sleep(1000);
		for (int i = 0; i < DropdownListElements.size(); i++) 
		{
			elementText = DropdownListElements.get(i).getText();
			if (isElementTextMatch(driver, DropdownListElements.get(i), selectValue) == true)
			{
				DropdownListElements.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
	}
	
	public void SelectFromAutoDropdownList(WebDriver driver, WebElement elementToClick, List <WebElement> DropdownListElements, String selectValue) throws Throwable
	{ 
		VisibilityOfElementExplicityWait(driver, elementToClick, 20); 
		Thread.sleep(3000);
		elementToClick.sendKeys(selectValue);		
		Thread.sleep(3000);
		for (int i = 0; i < DropdownListElements.size(); i++) 
		{
			elementText = DropdownListElements.get(i).getText();
			if (isElementTextContain(driver, DropdownListElements.get(i), selectValue) == true)
			{
				DropdownListElements.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
	}
	
	public void SelectFromAutoDropdownList2(WebDriver driver, WebElement elementToClick, List <WebElement> DropdownListElements, String selectValue) throws Throwable
	{
		elementToClick.sendKeys(selectValue);
		Thread.sleep(3000);
		for (int i = 0; i < DropdownListElements.size(); i++) 
		{
			elementText = DropdownListElements.get(i).getText();
			if (isElementTextMatch(driver, DropdownListElements.get(i), selectValue) == true)
			{
				DropdownListElements.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
	}
	
	public void SelectFromCheckDropdownList(WebDriver driver, WebElement elementToClick, WebElement searchFieldElement, 
			List <WebElement> DropdownNameListElements, List <WebElement> DropdownNameCheckElements,String selectValue) throws Throwable
	{ 
		Thread.sleep(2000); 
		elementToClick.click();							
		Thread.sleep(1000);
		Thread.sleep(8000); /// dont reduce the sleept second otherwise script will fail
		searchFieldElement.sendKeys(selectValue);		
		Thread.sleep(2000);
		System.out.println("DropdownNameListElements.size():"+DropdownNameListElements.size());
		for (int i = 0; i < DropdownNameListElements.size(); i++)
		{
			if (isElementTextContain(driver, DropdownNameListElements.get(i), selectValue) == true)
			{
				DropdownNameCheckElements.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
		elementToClick.click();
		Thread.sleep(2000);
	}
	
	public void SelectFromCheckDropdownList(WebDriver driver, WebElement elementToClick, 
			List <WebElement> DropdownNameListElements, List <WebElement> DropdownNameCheckElements,String selectValue) throws Throwable
	{
		elementToClick.click();
		Thread.sleep(2000);
		for (int i = 0; i < DropdownNameListElements.size(); i++)
		{
			if (isElementTextContain(driver, DropdownNameListElements.get(i), selectValue) == true)
			{
				DropdownNameCheckElements.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
		elementToClick.click();
		Thread.sleep(2000);
	}
	
	public void SelectFromCheckDropdownList(WebDriver driver, WebElement elementToClick, 
			 List <WebElement> DropdownNameCheckElements) throws Throwable
	{
		elementToClick.click();
		Thread.sleep(1000);
		
		for (int i = 0; i < DropdownNameCheckElements.size(); i++)
		{
			DropdownNameCheckElements.get(i).click();
		}
		Thread.sleep(500);
		elementToClick.click();
		Thread.sleep(1000);
	}
	
	public void SelectFromCheckDropdownList(WebDriver driver, WebElement elementToClick, WebElement searchFieldElement, 
			List <WebElement> DropdownNameListElements, List <WebElement> DropdownNameCheckElements, String[] selectValues) throws Throwable
	{
		elementToClick.click();
		Thread.sleep(2000);
		for (int i = 0; i < selectValues.length; i++) 
		{
			String d = Keys.chord(Keys.CONTROL, "a");
			searchFieldElement.sendKeys(d);
			Thread.sleep(1000);
			searchFieldElement.sendKeys(selectValues[i]);
			Thread.sleep(2000);
			for (int j = 0; j < DropdownNameListElements.size(); j++)
			{
				if (isElementTextContain(driver, DropdownNameListElements.get(j), selectValues[i]) == true)
				{
					DropdownNameCheckElements.get(j).click();
					break;
				}
			}
			Thread.sleep(500);
		}
		elementToClick.click();
		Thread.sleep(2000);
	}
	
	public void SelectFromCheckDropdownList(WebDriver driver,
			List <WebElement> DropdownNameListElements, List <WebElement> DropdownNameCheckElements, String... selectValues) throws Throwable
	{
		for (int i = 0; i < selectValues.length; i++) 
		{
			for (int j = 0; j < DropdownNameListElements.size(); j++)
			{
				if (isElementTextContain(driver, DropdownNameListElements.get(j), selectValues[i]) == true)
				{
					DropdownNameCheckElements.get(j).click();
					break;
				}
			}
			Thread.sleep(500);
		}
	}
	
	//webdriver selected verification methods
	public boolean isSelected(WebDriver driver, WebElement elementToClick, WebElement searchFieldElement, List <WebElement> DropdownNameListElements, List <WebElement> DropdownNameCheckElements,String selectValue) throws Throwable
	{
		boolean isSelect = false;
		
		elementToClick.click();
		Thread.sleep(1000);
		searchFieldElement.sendKeys(selectValue);
		Thread.sleep(1000);
		
		for (int i = 0; i < DropdownNameListElements.size(); i++)
		{
			if (isElementTextContain(driver, DropdownNameListElements.get(i), selectValue) == true)
			{
				isSelect = isElementAttributeValueContain(driver, DropdownNameCheckElements.get(i), "class", "checked");
				break;
			}
			else
			{
				isSelect = false;
			}
		}
		Thread.sleep(1000);
		elementToClick.click();
		Thread.sleep(2000);
		
		return isSelect;
	}
	
	public boolean isSelected(WebDriver driver, WebElement elementToClick, List <WebElement> DropdownNameCheckElements) throws Throwable
	{
		boolean isSelect = false;
		elementToClick.click();
		Thread.sleep(2000);
		for (int i = 0; i < DropdownNameCheckElements.size(); i++)
		{
			if (isElementAttributeValueContain(driver, DropdownNameCheckElements.get(i), "class", "checked") == true)
			{
				isSelect = true;
				break;
			}
			else
			{
				isSelect = false;
			}
		}
		Thread.sleep(2000);
		elementToClick.click();
		Thread.sleep(2000);
		
		return isSelect;
	}
	
	public boolean isSelected(WebDriver driver, WebElement elementToClick, List <WebElement> DropdownListElements, String selectValue) throws Throwable
	{
		boolean isSelect = false;
		elementToClick.click();
		Thread.sleep(1000);
		for (int i = 0; i < DropdownListElements.size(); i++) 
		{
			if (isElementAttributeValueContain(driver, DropdownListElements.get(i), "class", "selected") == true)
			{
				if (isElementTextContain(driver, DropdownListElements.get(i), selectValue))
				{
					isSelect = true;
					break;
				}
				else
				{
					isSelect = false;
				}
				
			}
			else
			{
				isSelect = false;
			}
		}
		Thread.sleep(2000);
		
		return isSelect;
	}
	
	//Added by Snehal
	public boolean isSelected(WebDriver driver, WebElement elementToClick, List <WebElement> DD_Element_List,List <WebElement> DD_Element_Text_List, String selectValue) throws Throwable
	{
		boolean isSelect = false;
		
		elementToClick.click();
		Thread.sleep(1000);
		for (int i = 0; i <DD_Element_List.size(); i++) 
		{
			if (isElementAttributeValueContain(driver, DD_Element_List.get(i), "class", "selected") == true)
			{
				if (isElementTextContain(driver, DD_Element_Text_List.get(i), selectValue))
				{
					isSelect = true;
					break;
				}
				else
				{
					isSelect = false;
				}
				
			}
			else
			{
				isSelect = false;
			}
		}
//		Thread.sleep(1000);
//		elementToClick.click();
		Thread.sleep(2000);
		
		return isSelect;
	}
	
	public boolean isSelected(WebDriver driver, List <WebElement> DropdownListElements, String selectValue) throws Throwable
	{
		boolean isSelect = false;
		for (int i = 0; i < DropdownListElements.size(); i++) 
		{
			if (isElementAttributeValueContain(driver, DropdownListElements.get(i), "class", "checked") == true)
			{
				if (isElementTextContain(driver, DropdownListElements.get(i), selectValue))
				{
					isSelect = true;
					break;
				}
				else
				{
					isSelect = false;
				}
				
			}
			else
			{
				isSelect = false;
			}
		}
		Thread.sleep(2000);
		
		return isSelect;
	}
	
	//webdriver webelment methods
	public WebElement TextContainsWebelement(WebDriver driver, String textValue) throws Throwable
	{
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'"+textValue+"')]"));
		
		return element;
	}
	
	public WebElement TextMatchWebelement(WebDriver driver, String textValue) throws Throwable
	{
		WebElement element = driver.findElement(By.xpath("//*[text()='"+textValue+"']"));
		
		return element;
	}
	
	public String ElementText(WebDriver driver, WebElement element)
	{
		String elementText= element.getText();
		
		return elementText;
	}
	
	public String ElementAttributeValue(WebDriver driver, WebElement element, String attributeName)
	{
		String attributeValue= element.getAttribute(attributeName);
		
		return attributeValue;
	}
	
	//webdriver checkbox realted method
	public void Active(WebDriver driver, WebElement Active, WebElement activeCheckbox, String active) throws Throwable 
	 {
		 if (active.contains("Yes"))
		 {
			 if(isElementAttributeValueContain(driver, Active, "class", "checked") == false)
			 {
				 activeCheckbox.click();
			 }
		 }
		 else if (active.contains("No"))
		 {
			 if(isElementAttributeValueContain(driver, Active, "class", "checked") == true)
			 {
				 activeCheckbox.click();
			 }
		 }
		 
		 Thread.sleep(2000);
	 }
	
	//webdriver  column filter methods
	public void ColFilter(WebDriver driver, List <WebElement> ColFilterIconList, List <WebElement> ColHeaderNameList, 
			WebElement Fliter_TB, WebElement FliterApplyBtn,  String colName, String fliterValue) throws Throwable
	{  Thread.sleep(3000);
		 for (int i = 0; i < ColFilterIconList.size(); i++) 
		 {
			 elementText = ColHeaderNameList.get(i).getText();
			 System.out.println("elementText:"+elementText);
			 if(isElementTextContain(driver, ColHeaderNameList.get(i), colName) == true)
			 {
				 ColFilterIconList.get(i).click();
				 break;
			 }
		 }
		 Thread.sleep(3000);
		 Fliter_TB.sendKeys(fliterValue);		 
		 Thread.sleep(1000); 
		 System.out.println("String entered into Fliter_TB:"+fliterValue);
		 FliterApplyBtn.click();				 
		 Thread.sleep(2000);
  	}
	
	public void ColFilter(WebDriver driver, List <WebElement> ColFilterIconList, List <WebElement> ColHeaderNameList, 
			WebElement Fliter_TB, WebElement FliterApplyBtn, WebElement loadingElement,  String colName, String fliterValue) throws Throwable
	{
		 for (int i = 0; i <= ColFilterIconList.size(); i++) 
		 {
			 elementText = ColHeaderNameList.get(i).getText();
			 if(isElementTextContain(driver, ColHeaderNameList.get(i), colName) == true)
			 {
				 ColFilterIconList.get(i).click();
				 if(isElementPresent(driver, loadingElement)) 
				 {
					 InvisibilityOfElementExplicityWait(driver, loadingElement, 100);
				 }
				 break;
			 }
		 }
		 Thread.sleep(3000);
		 
		 Fliter_TB.sendKeys(fliterValue);
		 Thread.sleep(1000);
		 
		 FliterApplyBtn.click();
		 Thread.sleep(2000);
  	}
	
	public void RemoveColFilter(WebDriver driver, List <WebElement> ColFilterIconList, List <WebElement> ColHeaderNameList, 
			WebElement SelectAll, WebElement FliterApplyBtn,String colName) throws Throwable
	 {
		for (int i = 0; i < ColFilterIconList.size(); i++) 
		 {
			 if(isElementTextContain(driver, ColHeaderNameList.get(i), colName) == true)
			 {
				 ColFilterIconList.get(i).click();
				 break;
			 }
		 }
		 Thread.sleep(500);
		 
		 SelectAll.click();
		 Thread.sleep(500);
		 SelectAll.click();
		 Thread.sleep(500);
		 
		 FliterApplyBtn.click();
		 Thread.sleep(500);
	 }
	
	public void RemoveColFilterX(WebDriver driver, List <WebElement> ColFilterIconList, List <WebElement> ColHeaderNameList, 
			WebElement SelectAll, WebElement FliterApplyBtn,String colName) throws Throwable
	 {
		for (int i = 0; i < ColFilterIconList.size(); i++) 
		 {
			 if(isElementTextContain(driver, ColHeaderNameList.get(i), colName) == true)
			 {
				 ColFilterIconList.get(i).click();
				 break;
			 }
		 }
		 Thread.sleep(500);
		 
		 SelectAll.click();
		 Thread.sleep(500);
		 
		 FliterApplyBtn.click();
		 Thread.sleep(500);
	 }
	
	public void RemoveIndividualColFilter(WebDriver driver, List <WebElement> ColFilterIconList, List <WebElement> ColHeaderNameList,
			WebElement FliterApplyBtn, WebElement FilterSecond_CB, String colName) throws Throwable
	 {
		for (int i = 0; i < ColFilterIconList.size(); i++) 
		 {
			 if(isElementTextContain(driver, ColHeaderNameList.get(i), colName) == true)
			 {
				 ColFilterIconList.get(i).click();
				 break;
			 }
		 }
		 Thread.sleep(500);
		 
		 FilterSecond_CB.click();
		 
		 FliterApplyBtn.click();
		 Thread.sleep(500);
	 }
	
	//webdriver  column sort methods
	public void ColSort(WebDriver driver, List <WebElement> ColSortIconList, List <WebElement> ColHeaderNameList, String colName) throws Throwable
	 {
		 for (int i = 0; i < ColHeaderNameList.size(); i++) 
		 {
			 if(isElementTextContain(driver, ColHeaderNameList.get(i), colName) == true)
			 {
				 ColSortIconList.get(i).click();
				 break;
			 }
		 }
		 ImplicitlyWait(driver, 10);
	 }
	
	//webdriver  column drag and drop methods
	public void DragAndDrop(WebDriver driver, List <WebElement> ColHeaderNameList, WebElement DropLocation, String colName) throws Throwable
	 {
		 for (int i = 0; i < ColHeaderNameList.size(); i++) 
		 {
			 if(isElementTextContain(driver, ColHeaderNameList.get(i), colName))
			 {
				 DragAndDrop(driver, ColHeaderNameList.get(i), DropLocation);
				 break;
			 }
		 }
		 Thread.sleep(1000);
	 }
	
	//webdriver grid cell text methods
	public String FirstRowCellText(WebDriver driver, List <WebElement> colHeaderNameList, List <WebElement> firstRowCellElements, String colName)
	{
		String elementText = null;
		int breakLoop = 0;
		Actions actions = new Actions(driver);
		actions.moveToElement(firstRowCellElements.get(0)).perform();
//		Thread.sleep(500);
		
		for (int i = 0; i < 120; i++)
	    {
	        for (int j = 0; j < colHeaderNameList.size(); j++)
	        {
	            if (isElementTextContain(driver, colHeaderNameList.get(j), colName) == true)
	            {
	            	elementText = firstRowCellElements.get(j).getText();
	            	breakLoop = 1;
	            	break;
	            }
	           
	        }
	        if (breakLoop == 1)
	        {
	            break;
	        }
	        else
	        {
	        	Actions action = new Actions(driver);
	    //    	action.sendKeys(ScreenNameColList.get(ScreenNameColList.size()-3), Keys.ARROW_DOWN).build().perform();
	        	action.sendKeys(firstRowCellElements.get(firstRowCellElements.size()-2), Keys.ARROW_RIGHT).build().perform();
	    //        action.sendKeys(firstRowCellElements.get(firstRowCellElements.size()-1), Keys.ARROW_RIGHT).build().perform();
//	            Thread.sleep(500);
	        }
	    }
		elementText = elementText.trim();
		 
		return elementText;
	}
	
	//Added By Abhishek
	public String FirstRowCellTextMatch(WebDriver driver, List <WebElement> colHeaderNameList, List <WebElement> firstRowCellElements, String colName)
	{
		String elementText = null;
		int breakLoop = 0;
		Actions actions = new Actions(driver);
		actions.moveToElement(firstRowCellElements.get(0)).perform();
//		Thread.sleep(500);
		
		for (int i = 0; i < 120; i++)
	    {
	        for (int j = 0; j < colHeaderNameList.size(); j++)
	        {
	            if (isElementTextMatch(driver, colHeaderNameList.get(j), colName) == true)
	            {
	            	elementText = firstRowCellElements.get(j).getText();
	            	breakLoop = 1;
	            	break;
	            }
	           
	        }
	        if (breakLoop == 1)
	        {
	            break;
	        }
	        else
	        {
	        	Actions action = new Actions(driver);
	    //    	action.sendKeys(ScreenNameColList.get(ScreenNameColList.size()-3), Keys.ARROW_DOWN).build().perform();
	        	action.sendKeys(firstRowCellElements.get(firstRowCellElements.size()-2), Keys.ARROW_RIGHT).build().perform();
	            action.sendKeys(firstRowCellElements.get(firstRowCellElements.size()-1), Keys.ARROW_RIGHT).build().perform();
//	            Thread.sleep(500);
	        }
	    }
//		for (int i = 0; i < colHeaderNameList.size(); i++) 
//		 {
//			 if(isElementTextContain(driver, colHeaderNameList.get(i), colName))
//			 {
//				 elementText = firstRowCellElements.get(i).getText();
//				 break;
//			 }
//		 }
		 
		 return elementText;
	}
	
	public String FirstRowCellText(WebDriver driver, List <WebElement> colHeaderNameList, List <WebElement> firstRowCellTextElements, List <WebElement> firstRowCellElements, String colName)
	{
		String elementText = null;
		int breakLoop = 0;
		Actions actions = new Actions(driver);
		actions.moveToElement(firstRowCellElements.get(0)).perform();
//		Thread.sleep(500);
		
		for (int i = 0; i < 120; i++)
	    {
	        for (int j = 0; j < colHeaderNameList.size(); j++)
	        {
	            if (isElementTextContain(driver, colHeaderNameList.get(j), colName) == true)
	            {
	            	if (firstRowCellElements.size() > firstRowCellTextElements.size())
	            	{
	            		elementText = firstRowCellTextElements.get(j-(firstRowCellElements.size()-firstRowCellTextElements.size())).getText();
		            	breakLoop = 1;
	            	}
	            	else
	            	{
	            		elementText = firstRowCellTextElements.get(j).getText();
		            	breakLoop = 1;
	            	}
	            }
	           
	        }
	        if (breakLoop == 1)
	        {
	            break;
	        }
	        else
	        {
	        	Actions action = new Actions(driver);
	    //    	action.sendKeys(ScreenNameColList.get(ScreenNameColList.size()-3), Keys.ARROW_DOWN).build().perform();
	        	action.sendKeys(firstRowCellElements.get(firstRowCellElements.size()-2), Keys.ARROW_RIGHT).build().perform();
	           action.sendKeys(firstRowCellElements.get(firstRowCellElements.size()-1), Keys.ARROW_RIGHT).build().perform();
//	            Thread.sleep(500);
	        }
	    }
		elementText = elementText.trim();
		 
		return elementText;
	}
	
	public String FirstRowCellText2(WebDriver driver, List <WebElement> colHeaderNameList, List <WebElement> firstRowCellTextElements, List <WebElement> firstRowCellElements, String colName)
	{
		String elementText = null;
		int breakLoop = 0;
		Actions actions = new Actions(driver);
		actions.moveToElement(firstRowCellElements.get(0)).perform();
//		Thread.sleep(500);
		
		for (int i = 0; i < 120; i++)
	    {
	        for (int j = 0; j < colHeaderNameList.size(); j++)
	        {
	            if (isElementTextContain(driver, colHeaderNameList.get(j), colName) == true)
	            {
	            	if (firstRowCellElements.size() > firstRowCellTextElements.size())
	            	{
	            		elementText = firstRowCellTextElements.get(j-(firstRowCellElements.size()-firstRowCellTextElements.size() + 1)).getText();
		            	breakLoop = 1;
	            	}
	            	else
	            	{
	            		elementText = firstRowCellTextElements.get(j + 1).getText();
		            	breakLoop = 1;
	            	}
	            }
	           
	        }
	        if (breakLoop == 1)
	        {
	            break;
	        }
	        else
	        {
	        	Actions action = new Actions(driver);
	    //    	action.sendKeys(ScreenNameColList.get(ScreenNameColList.size()-3), Keys.ARROW_DOWN).build().perform();
	        	action.sendKeys(firstRowCellElements.get(firstRowCellElements.size()-2), Keys.ARROW_RIGHT).build().perform();
	           action.sendKeys(firstRowCellElements.get(firstRowCellElements.size()-1), Keys.ARROW_RIGHT).build().perform();
//	            Thread.sleep(500);
	        }
	    }
		elementText = elementText.trim();
		 
		return elementText;
	}
	
	
	public String RowCellText(WebDriver driver, List <WebElement> colHeaderNameList, 
			List <WebElement> firstRowCellElements, String colName, int colLength, int rowNo) throws Throwable
	{
		String elementText = null;
		int breakLoop = 0;
		Actions actions = new Actions(driver);
		actions.moveToElement(firstRowCellElements.get(0)).perform();
		Thread.sleep(500);
		
		for (int i = 0; i < 30; i++)
	    {
	        for (int j = 0; j < colHeaderNameList.size(); j++)
	        {
	            if (isElementTextContain(driver, colHeaderNameList.get(j), colName) == true)
	            {
	            	elementText = firstRowCellElements.get(j+((rowNo-1)*colLength)).getText();
	            	breakLoop = 1;
	            }
	           
	        }
	        if (breakLoop == 1)
	        {
	            break;
	        }
	        else
	        {
	        	Actions action = new Actions(driver);
	        	action.sendKeys(firstRowCellElements.get(firstRowCellElements.size()-2), Keys.ARROW_RIGHT).build().perform();
	            action.sendKeys(firstRowCellElements.get(firstRowCellElements.size()-1), Keys.ARROW_RIGHT).build().perform();
	            Thread.sleep(500);
	        }
	    }
		
		return elementText;
	}
	
	public int ValueRowNo(WebDriver driver, List <WebElement> colHeaderNameList, 
			List <WebElement> firstRowCellElements, List <WebElement> gridRowList, String colName, String value, int colLength) throws Throwable
	{
		int breakLoop = 0, colIndex = 0, rowNo = 0;
		Actions actions = new Actions(driver);
		actions.moveToElement(firstRowCellElements.get(0)).perform();
		Thread.sleep(500);
		
		for (int i = 0; i < 30; i++)
	    {
	        for (int j = 0; j < colHeaderNameList.size(); j++)
	        {
	            if (isElementTextContain(driver, colHeaderNameList.get(j), colName) == true)
	            {
	            	colIndex = j;
	            	breakLoop = 1;
	            }
	           
	        }
	        if (breakLoop == 1)
	        {
	            break;
	        }
	        else
	        {
	        	Actions action = new Actions(driver);
	        	action.sendKeys(firstRowCellElements.get(firstRowCellElements.size()-2), Keys.ARROW_RIGHT).build().perform();
	            action.sendKeys(firstRowCellElements.get(firstRowCellElements.size()-1), Keys.ARROW_RIGHT).build().perform();
	            Thread.sleep(500);
	        }
	    }
		
		for (int i = 0; i < gridRowList.size(); i++) 
		{
			if (isElementTextContain(driver, firstRowCellElements.get(colIndex+(i*colLength)), value) == true)
			{
				rowNo = i;
				break;
			}
			
		}
		
		return rowNo+1;
	}
	
	//webdriver grid scroll methods
	public void GridRow1RightScroll(WebDriver driver, List <WebElement> colHeaderNameList, List <WebElement> cellElementsList, String colName) throws Throwable
	{
		int breakLoop = 0;
		Actions actions = new Actions(driver);
		actions.moveToElement(cellElementsList.get(0)).perform();
		Thread.sleep(500);
		
		for (int i = 0; i < 50; i++) 
	    {
	        for (int j = 0; j < colHeaderNameList.size(); j++)
	        {
	            if (isElementTextContain(driver, colHeaderNameList.get(j), colName) == true)
	            {
	            	breakLoop = 1;
	            }
	           
	        }
	        if (breakLoop == 1)
	        {
	            break;
	        }
	        else
	        {
	        	Actions action = new Actions(driver);
	        	action.sendKeys(cellElementsList.get(cellElementsList.size()-2), Keys.ARROW_RIGHT).build().perform();
	            action.sendKeys(cellElementsList.get(cellElementsList.size()-1), Keys.ARROW_RIGHT).build().perform();
	        }
	    }
		
		Thread.sleep(1000);
	}
	
	public void GridRow1LeftScroll(WebDriver driver, List <WebElement> colHeaderNameList, List <WebElement> cellElementsList, String colName) throws Throwable
	{
		int breakLoop = 0;
		Actions actions = new Actions(driver);
		actions.moveToElement(cellElementsList.get(0)).perform();
		Thread.sleep(500);
		
		for (int i = 0; i < 50; i++)
	    {
	        for (int j = 0; j < colHeaderNameList.size(); j++)
	        {
	            if (isElementTextContain(driver, colHeaderNameList.get(j), colName) == true)
	            {
	            	breakLoop = 1;
	            }
	           
	        }
	        if (breakLoop == 1)
	        {
	            break;
	        }
	        else
	        {
	        	Actions action = new Actions(driver);
	        	action.sendKeys(cellElementsList.get(1), Keys.ARROW_LEFT).build().perform();
	            action.sendKeys(cellElementsList.get(0), Keys.ARROW_LEFT).build().perform();
	        }
	    }
		
		Thread.sleep(1000);
	}
	
	//webdriver verification methods
	//CLick on dropdown before calling this method.
	public boolean isAbleToSelectActiveElement(WebDriver driver, List <WebElement> dropDownList, String activeElement)
	{
		boolean verify = false;
		
		if (dropDownList.size() == 0)
		{
			verify = false;
		}
		else
		{
			for (int i = 0; i < dropDownList.size(); i++) 
			{
				if (isElementTextContain(driver, dropDownList.get(i), activeElement) == true)
				{
					if (isElementTextContain(driver, dropDownList.get(i), "InActive") == true)
					{
						verify = false;
					}
					else
					{
						verify = true;
						break;
					}
					
				}
				else
				{
					verify = false;
				}
			}
		}
		
		return verify;
	}
	
	public boolean isRowCellTextMatch(WebDriver driver, List <WebElement> colHeaderNameList, 
			List <WebElement> firstRowCellElements, String colName, String matchValue, int colLength, int rowNo) throws Throwable
	{
		String elementText = null;
		boolean verify = false;
		
		elementText = RowCellText(driver, colHeaderNameList, firstRowCellElements, colName, colLength, rowNo);
		elementText = elementText.trim();
		if (elementText.equalsIgnoreCase(matchValue))
		{
			verify = true;
		}
		else
		{
			verify = false;
		}
		
		return verify;
	}
	
	public boolean isRowCellTextContains(WebDriver driver, List <WebElement> colHeaderNameList, 
			List <WebElement> firstRowCellElements, String colName, String matchValue, int colLength, int rowNo) throws Throwable
	{
		String elementText = null;
		boolean verify = false;
		
		elementText = RowCellText(driver, colHeaderNameList, firstRowCellElements, colName, colLength, rowNo);
		if (elementText.contains(matchValue))
		{
			verify = true;
		}
		else
		{
			verify = false;
		}
		
		return verify;
	}
	
	public boolean isFirstRowCellTextMatch(WebDriver driver, List <WebElement> colHeaderNameList, 
			 List <WebElement> firstRowCellTextElements, List <WebElement> firstRowCellElements, String colName, String matchValue) throws Throwable
	{
		String elementText = null;
		boolean verify = false;
		
		elementText = FirstRowCellText(driver, colHeaderNameList,  firstRowCellTextElements, firstRowCellElements, colName);
		elementText = elementText.trim();
		if (elementText.equalsIgnoreCase(matchValue))
		{
			verify = true;
		}
		else
		{
			verify = false;
		}
		
		return verify;
	}
	
	public boolean isFirstRowCellTextContains(WebDriver driver, List <WebElement> colHeaderNameList, 
			 List <WebElement> firstRowCellTextElements, List <WebElement> firstRowCellElements,String colName, String matchValue) throws Throwable
	{
		String elementText = null;
		boolean verify = false;
		
		elementText = FirstRowCellText(driver, colHeaderNameList, firstRowCellTextElements, firstRowCellElements, colName);
		if (elementText.contains(matchValue))
		{
			verify = true;
		}
		else
		{
			verify = false;
		}
		
		return verify;
	}
	
	public boolean isFirstRowCellTextMatch(WebDriver driver, List <WebElement> colHeaderNameList, 
			List <WebElement> firstRowCellElements, String colName, String matchValue) throws Throwable
	{
		String elementText = null;
		boolean verify = false;
		
		elementText = FirstRowCellTextMatch(driver, colHeaderNameList, firstRowCellElements, colName);
		elementText = elementText.trim();
		if (elementText.equalsIgnoreCase(matchValue))
		{
			verify = true;
		}
		else
		{
			verify = false;
		}
		
		return verify;
	}
	
	public boolean isFirstRowCellTextContains(WebDriver driver, List <WebElement> colHeaderNameList, 
			List <WebElement> firstRowCellElements, String colName, String matchValue) throws Throwable
	{
		String elementText = null;
		boolean verify = false;
		
		elementText = FirstRowCellText(driver, colHeaderNameList, firstRowCellElements, colName);
		if (elementText.contains(matchValue))
		{
			verify = true;
		}
		else
		{
			verify = false;
		}
		
		return verify;
	}
	
	public boolean isAccess(WebDriver driver, List <WebElement> iconBtnList)
	{
		boolean verify = false;
		
		if (iconBtnList.size() <= 6)
		{
			for (int i = 0; i < iconBtnList.size(); i++) 
			{
				if (isElementAttributeValueContain(driver, iconBtnList.get(i), "class", "disabled") == false)
				{
					verify = true;
					break;
				}
				else
				{
					verify = false;
				}
			}
		}
		else
		{
			for (int i = 0; i < iconBtnList.size()-4; i++) 
			{
				if (isElementAttributeValueContain(driver, iconBtnList.get(i), "class", "disabled") == false)
				{
					verify = true;
					break;
				}
				else
				{
					verify = false;
				}
			}
		}
		
		return verify;
	}
	
	
	//download file verifications
	public boolean isFileDownloaded(String downloadPath)
	{
		File tmpDir = new File(downloadPath);
	    boolean isDownloded = tmpDir.exists();
	     
	    return isDownloded;
	}
	
	//random no and string generate methods
	public String RandomNo(int howManyDigit)
	{
		Random random = new Random();
		int number = 0;
		String strNo = null;
		
		if(howManyDigit==1)
		{
			number = 1 + (int)(random.nextFloat() * 8);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==2)
		{
			number = 10 + (int)(random.nextFloat() * 89);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==3)
		{
			number = 100 + (int)(random.nextFloat() * 899);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==4)
		{
			number = 1000 + (int)(random.nextFloat() * 8999);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==5)
		{
			number = 10000 + (int)(random.nextFloat() * 89990);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==6)
		{
			number = 100000 + (int)(random.nextFloat() * 899900);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==7)
		{
			number = 1000000 + (int)(random.nextFloat() * 8999000);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==8)
		{
			number = 10000000 + (int)(random.nextFloat() * 89990000);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==9)
		{
			number = 100000000 + (int)(random.nextFloat() * 899900000);
			strNo = Integer.toString(number);
		}
		else if(howManyDigit==10)
		{
			number = 1000000000 + (int)(random.nextFloat() * 1147483600);
			strNo = Integer.toString(number);
		}
		else
		{
			number = 1 + (int)(random.nextFloat() * 1147483600);
			strNo = Integer.toString(number);
		}
		
		return strNo;
	}
	
	public String Random_containerNo()
	{
		String strNo = null;
		strNo = RandomNo(6);
		String containerNo="AGWCN"+strNo;
		System.out.println("Container No.: "+containerNo);
		
		return containerNo;
	}
	
	//date & time realted methods
	public String CurrentDate()
	{
		 SimpleDateFormat dtFormat = new SimpleDateFormat("dd-MM-yyyy");  
		 Calendar dtCalender = Calendar.getInstance();
		 String dtReturn = dtFormat.format(dtCalender.getTime());
		 return dtReturn;
	}

	public String CurrentDateTime()
	{
		 SimpleDateFormat dtFormat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");  
		 Calendar dtCalender = Calendar.getInstance();
		 String dtReturn = dtFormat.format(dtCalender.getTime());
		 
		 return dtReturn;
	}
	
	public String CurrentDate(String Format)
	{  //format is case sensitive use exmaple format: "dd-MM-yyyy", "dd-MM-yy"
		 SimpleDateFormat dtFormat = new SimpleDateFormat(Format);  
		 Calendar dtCalender = Calendar.getInstance();
		 String dtReturn = dtFormat.format(dtCalender.getTime());
		 
		 return dtReturn;
	}
	
	public String SpecificDate(int days) throws Exception
	{
		SimpleDateFormat dtFormat = new SimpleDateFormat("dd-MM-yyyy");
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
	
	public String CurrentTime()
	{
		SimpleDateFormat dtFormat = new SimpleDateFormat("HH:mm:ss");
		Calendar dtCalender = Calendar.getInstance();
		String dtReturn=dtFormat.format(dtCalender.getTime()); 	 System.out.println("CurrentTime:::"+dtReturn);
		
		return dtReturn;
	}
	
	public String SpecificTime(int mintues) throws Exception
	{
		SimpleDateFormat dtFormat = new SimpleDateFormat("HH:mm:ss");
		Calendar dtCalender = Calendar.getInstance();
	    dtCalender.add(Calendar.DAY_OF_MONTH,mintues);
	    String dtReturn=dtFormat.format(dtCalender.getTime());
		
        return dtReturn;
	}
	
	public String CurrentTime(String format)
	{
		SimpleDateFormat dtFormat = new SimpleDateFormat(format);
		Calendar dtCalender = Calendar.getInstance();
		String dtReturn=dtFormat.format(dtCalender.getTime());
		
		return dtReturn;
	}
	
	public String SpecificTime(String format, int mintues) throws Exception
	{
		SimpleDateFormat dtFormat = new SimpleDateFormat(format);
		Calendar dtCalender = Calendar.getInstance();
	    dtCalender.add(Calendar.DAY_OF_MONTH,mintues);
	    String dtReturn=dtFormat.format(dtCalender.getTime());
		
        return dtReturn;
	}
	
	public String TimeDiff(String StartTime,String EndTime) throws Exception
	{
		String[] startTime = StartTime.split(" ");
		StartTime = startTime[3];
		String[] endTime = EndTime.split(" ");
		EndTime = endTime[3];
		SimpleDateFormat dtFormat=new SimpleDateFormat("HH:mm:ss");
		Date d1=dtFormat.parse(StartTime);
		Date d2=dtFormat.parse(EndTime);
		long diff=d2.getTime()-d1.getTime();
		String dtReturn= String.format("%02d:%02d:%02d",(diff/(60 * 60 * 1000) % 24),(diff/(60 * 1000) % 60),(diff/1000 % 60));
		return dtReturn;
	}
	
//	Added by Rakesh Jaiswal
	public static boolean isClicked(WebDriver driver, WebElement element)
	{ 
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	        element.click();
	        return true;
	    } catch(Exception e){
	    	e.printStackTrace();
	        return false;
	    }
	}
	
	public static void clearTextbox(WebDriver driver, WebElement element) throws Throwable
	{
		 element.sendKeys(Keys.CONTROL+"A", Keys.BACK_SPACE);	 
	}
	
	//Added By Abhishek 
	public void scrollTillPageEnd()
	{
	    Actions actions= new Actions(driver);	    
	    actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	}
	
	
	public void scrollDown(WebDriver driver) 
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, document.body.scrollHeight)");
	}
	
	public void horizontalScroll1(WebDriver driver, WebElement scrollTillElement) 
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;     
		jse.executeScript("arguments[0].scrollIntoView();", scrollTillElement);
	}
	
	public void scrollUsingScrollbar(WebDriver driver, WebElement horizontalbar) throws InterruptedException 
	{
		Actions action = new Actions(driver); 
		Actions moveToElement = action.moveToElement( horizontalbar ); 
		for (int i = 0; i < 5; i++)
		{ 
			moveToElement.sendKeys(Keys.RIGHT).build().perform();
		 }
		Thread.sleep(2000);
		horizontalbar.sendKeys(Keys.END);
		Thread.sleep(2000);
		
	}	
	
	public void scrolldownUsingpixel(WebDriver driver, String pixel) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,"+pixel+")");        	//Scroll Down(+ve)
	}
	public void scrollTillPageEnd(WebDriver driver)    {
        Actions actions= new Actions(driver);       
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
    }

	


	public void switchToNewWindow(WebDriver driver) {
		// TODO Auto-generated method stub
//		switched to new  window-----------------------------------------
		parentWindowHandler = driver.getWindowHandle(); // Store your parent window 
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window

//		validating the window has switched --------------------------------------------
		if( driver.getWindowHandle().contains(subWindowHandler)) {
			System.out.println("****driver focus on new window");
		}else {
			System.out.println("driver focus did not switch to new window, driver focus on:" + driver.getWindowHandle());
		}
		System.out.println("parent window   : "+parentWindowHandler);
		System.out.println("child window  : "+subWindowHandler);
		System.out.println("driver present focus: "+driver.getWindowHandle()); 
		
		driver.manage().window().maximize();

	}
	
	public void switchToParentWindow(WebDriver driver) {
		System.out.println("driver present focus: "+driver.getWindowHandle()); 
		System.out.println("parent window   :"+parentWindowHandler);
//		switched to parent window---
		 driver.switchTo().window(parentWindowHandler);
//		validating the window has switched ---
		if( driver.getWindowHandle().contains(parentWindowHandler)) {
			System.out.println("****driver focus on parent window");
		}else {
			System.out.println("driver focus did not switch to new window, driver focus on:" + driver.getWindowHandle());
		}
//		System.out.println("parent window   : "+parentWindowHandler);
		System.out.println("driver present focus: "+driver.getWindowHandle()); 
	}
	public void switchToParentWindow(WebDriver driver, String parentWindowHandler) {
		System.out.println("driver present focus: "+driver.getWindowHandle()); 
		System.out.println("parent window   :"+parentWindowHandler);
//		switched to parent window---
		 driver.switchTo().window(parentWindowHandler);
//		validating the window has switched ---
		if( driver.getWindowHandle().contains(parentWindowHandler)) {
			System.out.println("****driver focus on parent window");
		}else {
			System.out.println("driver focus did not switch to new window, driver focus on:" + driver.getWindowHandle());
		}
//		System.out.println("parent window   : "+parentWindowHandler);
		System.out.println("driver present focus: "+driver.getWindowHandle()); 
	}
	
	


	public void clickonColArrow(WebDriver driver, List <WebElement> ColArrowIconList, List <WebElement> ColHeaderNameList, String colName) throws Throwable
	{
		 for (int i = 0; i <= ColArrowIconList.size(); i++) 
		 {
			 String abc = ColHeaderNameList.get(i+1).getText();
			 if(isElementTextContain(driver, ColHeaderNameList.get(i+1), colName) == true)
			 {
				 System.out.println();
				 Thread.sleep(2000);
				 ColArrowIconList.get(i+1).click();
				 break;
			 }
		 }
		 ImplicitlyWait(driver, 6);
  	}
	
	public  boolean checkAlphabetic(String input) {
	    for (int i = 0; i != input.length(); ++i) {
	        if (!Character.isLetter(input.charAt(i))) {
	            return false;
	        }
	    }

	    return true;
	}
	
//Added by Abhishek
	
	//To verify is the column filer is applied
	public boolean isColFilterApplied(WebDriver driver, List<WebElement> ColHeaderNameList,
			List<WebElement> ColCellsValueList, String colName, String fliterValue) throws Throwable {
		boolean verify = false;
		for (int i = 0; i <= ColHeaderNameList.size(); i++) {
			String abc = ColHeaderNameList.get(i).getText();
			if (isElementTextContain(driver, ColHeaderNameList.get(i), colName) == true) {
				for (int j = 0; j <= ColCellsValueList.size(); j++) {
					String df = ColCellsValueList.get(i).getText();
					verify = isElementTextContain(driver, ColCellsValueList.get(i), fliterValue);
					Assert.assertTrue(verify);
					Thread.sleep(1000);
				}
				break;
			}
		}
		return verify;
	}
	
	//To verify the grid cell values are auto populated and read only.
	public boolean isGridColumnReadOnly(WebDriver driver, List <WebElement> rowElements ) throws Throwable
	{	
		int count = 0;
		boolean verify = false;
		Actions actions = new Actions(driver);
		actions.moveToElement(rowElements.get(0)).click().perform();
		Thread.sleep(500);
		verify = false;

	        for (int j = 0; j < rowElements.size(); j++)
	        {
	        	count = rowElements.size();
	        	try {
	        		rowElements.get(j).click();
	        		rowElements.get(j).sendKeys("test");
	        		verify = false;
	        	}
	        	catch(Exception e) {
	        		System.out.println(rowElements.get(j).getText() + "This column is read-only");
	        		verify = true;
	        	}	
	        
		        if(j >= 6) {
		        	break;
		        }
	        }
		        Actions action = new Actions(driver);
		        action.sendKeys(rowElements.get(rowElements.size()-2), Keys.ARROW_RIGHT).build().perform();
		        Thread.sleep(2000);
		        action.sendKeys(rowElements.get(rowElements.size()-1), Keys.ARROW_RIGHT).build().perform();
		        
	    
		System.out.println("Final COunt is " + count);
		return verify;
	}
	
	//To Verify the grid header contains all columns names specified in array. 
	public boolean verifyHeaderListPresent(List <WebElement> HeaderNameList, String[] ArrayHeaderList) {
		boolean verify = false;
		for(int i = 0; i < HeaderNameList.size(); i++) {
			verify = Arrays.asList(ArrayHeaderList).contains(HeaderNameList.get(i).getText());
		}
		return verify;
	}
	
	public void refreshPage(WebDriver driver) throws InterruptedException {
		driver.navigate().refresh(); Thread.sleep(3000);
	}
	
	
	



}
