package POM_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {
	@FindBy(id="email")
	private WebElement unTbox;

	@FindBy (name="pass")
	private WebElement pwdTbox;

	@FindBy(xpath="//button[.='Log in'] ")
	private WebElement loginbtn;

	public POM1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	public void uname(String un)
	{
		unTbox.sendKeys(un);
	}
	public void pwd(String pwd)
	{
		pwdTbox.sendKeys(pwd);
	}
	public void login()
	{
		loginbtn.click();
	}
}
