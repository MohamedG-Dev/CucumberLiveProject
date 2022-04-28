package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:FeatureFiles/Register.feature" }, glue = {
		"classpath:com.tutorialsninja.automation.stepdef" }, tags = "@register", publish = true)
public class Runner {

}
