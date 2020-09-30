package _POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _1__POM_ACTITIME__LOGIN {

	@FindBy(id="username")
	private WebElement usernametextfield ;
	
	
	@FindBy(name="pwd")
	private WebElement passwordtextfield ; 
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	public _1__POM_ACTITIME__LOGIN(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	
	public void LoginMethod()
	{
		usernametextfield.sendKeys("admin");
		passwordtextfield.sendKeys("manager");
		loginbutton.click();
	}
}
