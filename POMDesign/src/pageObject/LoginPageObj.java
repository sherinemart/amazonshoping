package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObj {
	@FindBy(how=How.ID,using="email")
	public static WebElement user;
	
	
	@FindBy(id="password")
	public static WebElement pswd;
	
	
	@FindBy(id="submitBTN")
	public static WebElement submit;
	
//	public static WebElement user(WebDriver d)
//	{
//		return d.findElement(By.id("email"));
//	}
//	
//	public static WebElement pswd(WebDriver d)
//	{
//		return d.findElement(By.id("password"));
//	}
//
//	
//	public static WebElement submit(WebDriver d)
//	{
//		return d.findElement(By.id("submitBTN"));
//	}


}
