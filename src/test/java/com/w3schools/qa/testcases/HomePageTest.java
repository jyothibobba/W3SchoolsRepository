package com.w3schools.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.w3schools.qa.base.TestBase;
import com.w3schools.qa.pages.HomePage;
import com.w3schools.qa.pages.LearnHtmlPage;
import com.w3schools.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	LearnHtmlPage learnHtmlPage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
		homePage.clickOnLogo();

	}

	@Test
	public void verifyHomePageTitleTest() {

		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "W3Schools Online Web Tutorials");
	}

	@Test
	public void clickOnLearnHtmlPageLinkTest() {
		learnHtmlPage = homePage.clickOnLearnHTMLPage();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
