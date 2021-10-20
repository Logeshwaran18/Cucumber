package org.stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleTest {
	@Given("User")
	public void user() {
	   
	}

	@When("User enter")
	public void user_enter() {
	  
	}

	@Then("user should be in invalid credential")
	public void user_should_be_in_invalid_credential(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> mp = dataTable.asMaps();
		for (Map<String, String> map : mp) {
			String string = map.get("apple");
			System.out.println(string);
//			if(string.equals("11")) {
//				System.out.println(string);
//			}
		}
	}

}
