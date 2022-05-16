package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:FeatureFiles/Login.feature","classpath:FeatureFiles/Register.feature","classpath:FeatureFiles/Orders.feature","classpath:FeatureFiles/SearchProducts.feature" }, glue = {
		"classpath:com.tutorialsninja.automation.stepdef" }, publish = true)
public class TestRunner {

}
