package com.tutorialsninja.automation.stepdef;


import org.openqa.selenium.WebDriver;

import com.tutorialsninja.automation.base.Base;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Register {
	WebDriver driver;
	@Given("^I launch the application$")
	public void i_launch_the_application() {
	Base.driver.get(Base.reader.getUrl());
		
	}

	@And("^I navigate to Account Registration page$")
	public void i_navigate_to_Account_Registration_page() {

	}

	@When("^I provide all the below valide details$")
	public void i_provide_all_the_below_valide_details(DataTable arg1) {

	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy() {

	}

	@And("^I click on the continue button$")
	public void i_click_on_the_continue_button() {

	}

	@Then("^I should see that the user account has successfully registered$")
	public void i_should_see_that_the_user_account_has_successfully_registered() {

	}

}
