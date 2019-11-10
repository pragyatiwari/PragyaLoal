package com.basic.cucumberscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstStepDef {

	@Given("I am starting cucumber automation")
	
	public void I_am_starting_cucumber_automation() {
		System.out.println("Starting cucumber automation");
		System.setProperty("webdriver.chrome.driver",
				"C:\\RedicalSilenium\\selenium driver\\geckodriver-v0.18.0-win64\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.seleniumhq.org");
	}

	@When("I print hello cucumber")
	public void I_print_hello_cucumber() {
		System.out.println("Hello Cucumber");
	}

	@Then("I print cucumber test passed")
	public void I_print_cucumber_test_passed() {
		System.out.println("Hello Cucumber Test Passed");
	}
}
