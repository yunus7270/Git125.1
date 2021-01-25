package fileReader;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

public class FileReaderClass {

	
	@Given("WebPage {string} on this side")
	public void web_page_on_this_side(String string) {
	 	   
	}

	@When("logging into this page with credentials {string} and {string} username and password")
	public void logging_into_this_page_with_credentials_and_username_and_password(String string, String string2) {
	
	}
	@Then("verification of the landing {string}.")
	public void verification_of_the_landing(String string) {

	}
	@Then("success {string}.")
	public void success(String string) {
	
	}

}
