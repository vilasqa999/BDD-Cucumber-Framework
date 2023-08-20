package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef 
{

 WebDriver driver;
 LoginPage page;
	
@Given("User launch Chrome browser")
public void user_launch_chrome_browser() 
{
 WebDriverManager.chromedriver().setup();
 
 ChromeOptions options = new ChromeOptions();
 options.addArguments("--remote-allow-origins=*");
 //ChromeDriver driver = new ChromeDriver(options);
 driver=new ChromeDriver(options);
 
 page=new LoginPage(driver);
 
 }

@When("User open application url {string}")
public void user_open_application_url(String url) 
{

 driver.get(url);
}

@When("User enter username as {string} and password as {string}")
public void user_enter_username_as_and_password_as(String emailadd, String pass)
{
 
page.enterUsername(emailadd);
page.enterPassword(pass);
}

@When("click on login button")
public void click_on_login_button()
{
	page.clickOnLogin();


}

@Then("dashboard title should be shown as {string}")
public void dashboard_title_should_be_shown_as(String expect) 
{

String actual=driver.getTitle();
if(actual.equals(expect))
{
	Assert.assertTrue(true);
}
else
{
	Assert.assertTrue(false);
}
}

@Then("User click on logout button")
public void user_click_on_logout_button() 
{

page.clickOnLogout();
}


@Then("close browser")
public void close_browser() 
{
driver.close();

}


	
	
	
	
	
	
}
