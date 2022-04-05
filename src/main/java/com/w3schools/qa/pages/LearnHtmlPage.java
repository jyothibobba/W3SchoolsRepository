package com.w3schools.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.w3schools.qa.base.TestBase;

public class LearnHtmlPage extends TestBase {

	@FindBy(xpath = "//div[@id='leftmenuinnerinner']//h2[contains(text(),' Tutorial')]")
	WebElement htmlTutorialTitle;

	@FindBy(xpath = "//div[@id='leftmenuinnerinner']//a")
	List<WebElement> htmlTutorialsLinks;

	public LearnHtmlPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHtmlTutorialTitle() {

		return htmlTutorialTitle.getText(); // Tutorial
	}

	public int verifyNumberOfLinks() {
		return htmlTutorialsLinks.size();

		// return htmlTutorialsLinks.si;

	}

	public void printHtmlTutorialsLinksText() {
		// Select select = new Select(htmlTutorialsLinks);
		for (int i = 0; i < htmlTutorialsLinks.size(); i++) {
			System.out.println(htmlTutorialsLinks.get(i).getText());
		}
	}
}
