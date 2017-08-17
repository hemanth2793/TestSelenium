package org.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonElements {

	WebDriver driver;
	
	@FindBy(css="[name='LoginForm[username]']")
	WebElement email;
	
	@FindBy(css="[name='LoginForm[password]']")
	WebElement password;
	
	@FindBy(xpath=".//*[contains(text(),'Login')]")
	WebElement login_button;
	
	
	@FindBy(xpath="(.//*[@class='dropdown-toggle'])[2]")
	WebElement account;
	
	@FindBy(xpath="(.//*[@class='dropdown-toggle'])[2]/following-sibling::ul")
	WebElement logout;
	
	public CommonElements(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void loginpage()
	{
		email.sendKeys("superadmin@innovate.com");
		password.sendKeys("123456");
		login_button.click();
	}
	
	public void logout()
	{
		account.click();
		System.out.println("Now Clicking Logout");
		logout.click();
		System.out.println("Pass");
	}

}
