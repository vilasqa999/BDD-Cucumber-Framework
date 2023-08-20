package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	WebElement login;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	
	public void enterUsername(String emailadd)
	{
		email.clear();
		email.sendKeys("emailadd");
	}
	
	
	public void enterPassword(String pass)
	{
		password.clear();
		password.sendKeys("pass");
	}
	
	public void clickOnLogin()
	{
		login.click();
	}
	
	public void clickOnLogout()
	{
		logout.click();
	}
	
}
