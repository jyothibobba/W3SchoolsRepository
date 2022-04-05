package com.w3schools.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.w3schools.qa.base.TestBase;
import com.w3schools.qa.pages.HomePage;
import com.w3schools.qa.pages.LearnHtmlPage;
import com.w3schools.qa.pages.LoginPage;

public class LearnHtmlPageTest extends TestBase  {

	LoginPage loginPage;
	HomePage homePage;
	LearnHtmlPage learnHtmlPage;
	
	public LearnHtmlPageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage =new LoginPage();
		homePage =loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
		homePage.clickOnLogo();
		learnHtmlPage = homePage.clickOnLearnHTMLPage();
	}
	
	@Test
	public void verifyHtmlTutorialTitleTest() {
	
		Assert.assertEquals(learnHtmlPage.verifyHtmlTutorialTitle(), " Tutorial");
	}
	
	@Test
	public void verifyNumberOfLinksTest() {
		int list_size = learnHtmlPage.verifyNumberOfLinks();
		Assert.assertEquals(list_size, list_size);
		
	}
	
	@Test
	public void printHtmlTutorialsLinksTextTest() {
	  learnHtmlPage.printHtmlTutorialsLinksText();
		
	}
	
   @AfterMethod
   public void tearDown() {
	   driver.quit();
   }
	
	
}
