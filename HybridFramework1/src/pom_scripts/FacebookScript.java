package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaric_scripts.Base_Page;

public class FacebookScript extends Base_Page{
	//declaration
	@FindBy(id="email")
	private WebElement unTbox;
	@FindBy(id="pass")
	private WebElement pwdTbox;
	@FindBy(name="login")
	private WebElement loginBtn;
	
	//Initialization
	public FacebookScript(WebDriver driver)
	{
		super(driver);
	}
	
	//Utilization
	public void unPass(String un)
	{
		unTbox.sendKeys(un);
	}
	public void pwdPass(String pwd)
	{
		pwdTbox.sendKeys(pwd);
	}
	public void clickLogin()
	{
		loginBtn.click();
	}

}
