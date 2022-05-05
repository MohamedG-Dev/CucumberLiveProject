package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgotPasswordPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	HeadersSection headersSection = new HeadersSection();
	MyAccountPage myAccountPage = new MyAccountPage();
	LoginPage loginPage = new LoginPage();
	ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

	@Given("I navigate to Account Login page")
	public void i_navigate_to_account_login_page() {
		Elements.click(HeadersSection.myAccountLink);
		Elements.click(HeadersSection.login);

	}

	@When("I login to the application using Username {string} and Password {string}")
	public void i_login_to_the_application_using_username_and_password(String username, String password) {
		LoginPage.loginToApplication(username, password);
	}

	@Then("I should see that User is able to successfully login")
	public void i_should_see_that_user_is_able_to_successfully_login() {
		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.registerAffiliateAccount));
	}

	@Then("I should see an error message informing the User about invalid credentials")
	public void i_should_see_an_error_message_informing_the_user_about_invalid_credentials() {
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainWarning,
				"Warning: No match for E-Mail Address and/or Password."));
	}

	@When("I reset the forgotten password for {string}")
	public void i_reset_the_forgotten_password_for(String string) {
		Elements.click(LoginPage.forgottenPassword);
		Elements.TypeText(ForgotPasswordPage.emailField, string);
		Elements.click(ForgotPasswordPage.continueButton);
	}

	@Then("I should see a message informing that the password reset details have been sent to your email address")
	public void i_should_see_a_message_informing_that_the_password_reset_details_have_been_sent_to_your_email_address() {
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainWarning,
				"An email with a confirmation link has been sent your email address."));
	}

}
