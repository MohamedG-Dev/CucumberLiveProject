package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(id = "input-email")
	public static WebElement emailAddressField;

	@FindBy(id = "input-password")
	public static WebElement passwordField;

	@FindBy(css = "input[type='submit'][value='Login']")
	public static WebElement loginButton;

	@FindBy(css = "div[class$='alert-dismissible']")
	public static WebElement mainWarning;

	@FindBy(linkText = "Forgotten Password")
	public static WebElement forgottenPassword;

	public static void loginToApplication(String emailAddress, String password) {
		Elements.TypeText(emailAddressField, emailAddress);
		Elements.TypeText(passwordField, password);
		Elements.click(loginButton);
	}

	public static void loginToApplication() {
		loginToApplication(Base.reader.getUserName(),Base.reader.getPassword());
	}
}
