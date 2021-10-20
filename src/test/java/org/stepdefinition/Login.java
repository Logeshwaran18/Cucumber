package org.stepdefinition;

import org.baseclass.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Base {
	@Given("user enter into facebook")
	public void wser_enter_into_facebook() {
		launchUrl("https://www.facebook.com/");
	}

	@When("user enter Vusername and INpassword")
	public void user_enter_Vusername_and_INpassword() {
		driver.findElement(By.id("email")).sendKeys("hai");
		driver.findElement(By.id("pass")).sendKeys("5451");
		Assert.assertTrue(false);
	}
	
	@When("user enter Inusername and Inpassword")
	public void user_enter_Inusername_and_Inpassword() {
		driver.findElement(By.id("email")).sendKeys("nujwsn");
		driver.findElement(By.id("pass")).sendKeys("yhbxhb");
	}

	@When("user enter Vusername and Vpassword")
	public void user_enter_Vusername_and_Vpassword() {
		driver.findElement(By.id("email")).sendKeys("java");
		driver.findElement(By.id("pass")).sendKeys("Selenium");
	}

	@When("user click login button")
	public void user_click_login_button() {
		driver.findElement(By.name("login")).click();

	}

	@Then("user should be in error page")
	public void user_should_be_in_error_page() {
		WebDriverWait w = new WebDriverWait(driver, 20);
		Boolean until = w.until(ExpectedConditions.urlContains("privacy_mutation"));
		if (until) {
			System.out.println("user is an error page");
		}

	}

}
