package com.w3schools.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w3schools.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//hello

	@FindBy(xpath = "//div[@class='_2FRg0']//a[contains(@href, 'https://w3schools.com')]")
	WebElement logo;

	@FindBy(xpath = "//a[@id ='navbtn_tutorials']")
	WebElement tutorialsLink;

	@FindBy(xpath = "//a[@id ='navbtn_references']")
	WebElement referencesLink;

	@FindBy(xpath = "//a[@id ='navbtn_exercises']")
	WebElement exercisesLink;

	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	public void clickOnLogo() {
		logo.click();
	}

	public String verifyHomePageTitle() {

		return driver.getTitle();

	}
	
	

	public LearnHtmlPage clickOnLearnHTMLPage() {

		tutorialsLink.click();

		return new LearnHtmlPage();
	}

}
