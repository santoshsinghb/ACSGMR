package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Methods.CommonMethods;
import Methods.WebDriverMethod;

public class Login_Screen extends BasePage {

	public Login_Screen(WebDriver driver)
	{
		super(driver);
		
	}
	
	public Login_Screen(WebDriver driver, WebDriverMethod wm) 
	{
		super(driver);
	}
	
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-login/div/div/div[2]/div[1]/div[2]/img")
	public WebElement LoginScreenpage;
	
	//login email path
    @FindBy(xpath="//*[@id='txtUsrName']")
    public WebElement fillemail;
  

//login password path
	@FindBy(xpath="//*[@id='txtPswd']")
    public WebElement fillpassword;

	
//login button path
	@FindBy(xpath="//*[@id='btnLogin']")
	
	public WebElement loginbutton;
	
	
	
	public void isLoginScreenDisplayed() throws InterruptedException
	{
		verify= WebDriverMethod.isElementPresent(driver, LoginScreenpage);
		Thread.sleep(1000);
		CommonMethods.Verify(verify, true);
	}
	public void Login(String entity, String usr, String pwd) throws Throwable
	{		
		Thread.sleep(500);
		fillemail.sendKeys(usr);
		fillpassword.sendKeys(pwd);
		Thread.sleep(1000);
		loginbutton.click();
		Thread.sleep(20000);
		
	} 
}
