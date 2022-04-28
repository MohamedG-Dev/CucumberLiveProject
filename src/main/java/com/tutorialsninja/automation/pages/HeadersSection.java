package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class HeadersSection {

	public HeadersSection() {
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(xpath = "//a[@title='My Account']") // //a[@title='My Account']//span[text()='My Account']
	public static WebElement myAccountLink;

	@FindBy(linkText = "Register")
	public static WebElement register;
}