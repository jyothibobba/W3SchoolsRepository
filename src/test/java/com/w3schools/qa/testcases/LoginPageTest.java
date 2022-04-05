package com.w3schools.qa.testcases;

import java.util.Properties;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.w3schools.qa.base.TestBase;
import com.w3schools.qa.pages.HomePage;
import com.w3schools.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginPage; 
	HomePage hp;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 loginPage = new LoginPage();
	}
	
	
	
	@Test
	public void loginPageTitleTest() {
		String title = loginPage.validatePageTitle();
	    Assert.assertEquals(title,"Log in - W3Schools");
		}
	
	@Test
	public void loginTest() {
		hp = loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
	
	}
	
	@Test
	public void validateForgotPasswodLinkTest() {
		//Assert.assertEquals(loginPage.validateForgotPasswodLink(),"Forgot password?","linkTextmatches");
	   System.out.println(loginPage.validateForgotPasswodLink());
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
