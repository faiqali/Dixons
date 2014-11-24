package com.dixons.dixonsAutomationPrototype;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Steps {

WebDriver driver;

@Before

public void startUp()
{
	driver =new FirefoxDriver();
}

@After

public void testShutDown()
{
driver.quit();
}
    
@Before("@web")

public void startUpweb()
{
	driver =new FirefoxDriver();
}

@After("@web")

public void testShutDownweb()
{
driver.quit();
}

@Before("@app")

public void startUpApp()
{
	driver =new FirefoxDriver();
}

@After("@app")

public void testShutDownApp()
{
driver.quit();
}
	@Given("^I am on the dixonstraning wesite$")
	public void shouldNavigateDixonsSite() throws Throwable {
		
		driver.navigate().to("https://www.dixonsretailtraining.co.uk/dixonsLMS/login");
	}

	@When("^I populate the fields$")
	public void shouldPopulateFields() throws Throwable {
		driver.findElement(By.id("websiteLogin_contentAreaId_413_sUserName")).sendKeys("745315A");
	    driver.findElement(By.id("websiteLogin_contentAreaId_413_sPassword")).sendKeys("qudratali27");
	    
	}

	@When("^I click on Login$")
	public void shouldLogin() throws Throwable {
		driver.findElement(By.id("websiteLogin_contentAreaId_413_loginButton")).click();
	   
	}

	@Then("^I see title \"([^\"]*)\"$")
	public void shouldSeeTitle(String arg1) throws Throwable {

		Assert.assertEquals("Training to do ...",("Training to do ..."));
	}
	
	@When("^I click on PLC$")
	public void I_click_on_PLC() throws Throwable {
	    driver.navigate().to("https://www.dixonsretailtraining.co.uk/DixonsLMS/PLC");
	}

	@Then("^I should see text \"([^\"]*)\"$")
	public void I_should_see_text(String arg1) throws Throwable {
	    Assert.assertEquals("Product Learning Centre", ("Product Learning Centre"));
	}
	@When("^I click on MY TRAINING PLAN EXPLAINED$")
	public void I_click_on_MY_TRAINING_PLAN_EXPLAINED() throws Throwable {
		  driver.navigate().to("https://www.dixonsretailtraining.co.uk/DixonsLMS/MyTrainingPlanExplained");
	    
	}
	@Then("^I should see text3 \"([^\"]*)\"$")
	public void I_should_see_text3(String arg1) throws Throwable {
	    Assert.assertEquals("My Training Plan Explained", ("My Training Plan Explained"));
	}



}
