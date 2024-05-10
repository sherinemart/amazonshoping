package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.LoginPageObj;

public class login {
  @Test
  public void loginInfo() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver123\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://phptravels.net/login");
		
		
		//      Page Factory Design
		PageFactory.initElements(d, LoginPageObj.class);
		
		LoginPageObj.user.sendKeys("user@phptravels.com");
		LoginPageObj.pswd.sendKeys("demouser");
		LoginPageObj.submit.click();
		
		// Page Object Model 
//		LoginPageObj.user(d).sendKeys("user@phptravels.com");
//		LoginPageObj.pswd(d).sendKeys("demouser");
//		LoginPageObj.submit(d).click();
//		 
//		d.findElement(By.id("email")).sendKeys("user@phptravels.com");
//		
//		d.findElement(By.id("password")).sendKeys("demouser");
//		
//		d.findElement(By.id("submitBTN")).click();
		
	
		
		
		
  }
}
