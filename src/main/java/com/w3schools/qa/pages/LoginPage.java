package com.w3schools.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w3schools.qa.base.TestBase;

public class LoginPage extends TestBase {

	//login using email id
	
	@FindBy(id = "modalusername")
	WebElement username;

	@FindBy(id = "current-password")
	WebElement password;

	@FindBy(xpath = "//span[text()='Log in']")
	WebElement login_button;

	@FindBy(xpath = "//a[text()='Forgot password?']")
	WebElement forgotpassword_link;

	@FindBy(xpath = "//span[text()='Help']")
	WebElement helpLink;

	public LoginPage() {
		super();
		PageFactory.initElements(driver, this);

	}

	public String validatePageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login_button.click();

		return new HomePage();

	}

	public String validateForgotPasswodLink() {
		forgotpassword_link.click();
		return forgotpassword_link.getText();

	}

	public String validateHelpLink() {
		helpLink.click();
		String title = driver.getTitle();
		return title;
	}

}
