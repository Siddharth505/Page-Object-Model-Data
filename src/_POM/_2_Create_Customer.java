package _POM;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _2_Create_Customer {
	
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement usernametextfield ;
	
	
	@FindBy(name="pwd")
	private WebElement passwordtextfield ; 
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	// CREATING CUSTOMER
	
	@FindBy(id="container_tasks")
	private WebElement tasks;
	
	@FindBy(xpath="//div[@class='title ellipsis']")
	private WebElement addnewbutton;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement customerbutton;

	@FindBy(xpath="(//input[@type='text'])[68]")
	private WebElement customernamebutton;

	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcustomerbutton;

	// CANCELLING CUSTOMER 
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelcustomerbutton;
	
	// DELETING CUSTOMER 
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]']")
	private WebElement searchcustomertextfield;
	
	@FindBy(xpath="//div[@class='text']//span[text()='Rama']")
	private WebElement searchnametextfield;
	
	
	
    public _2_Create_Customer(WebDriver driver)
    {
    	this.driver = driver;
    	PageFactory.initElements(driver,this);
    }
    
    public void LoginMethod()
	{
		usernametextfield.sendKeys("admin");
		passwordtextfield.sendKeys("manager");
		loginbutton.click();
	}
    
    public void CreateCustomer() throws InterruptedException
    {
    	tasks.click();
    	Thread.sleep(6000);
    	addnewbutton.click();
    	Thread.sleep(6000);
    	customerbutton.click();
    	Thread.sleep(6000);
    	customernamebutton.sendKeys("Rama");
    	Thread.sleep(3000);
    	createcustomerbutton.click();
    }
     
    public void CancelCustomer()
    {
    	cancelcustomerbutton.click();
    	Alert al = driver.switchTo().alert();
    	System.out.println(al.getText());
    	al.accept();
    	
    }
    public void DeleteCustomer()
    {
    	
    }
 




}
