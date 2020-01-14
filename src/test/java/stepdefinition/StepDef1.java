package stepdefinition;

import org.junit.Assert;

import base.BaseClass;
import io.cucumber.java.en.*;
import pom.LoginPage;

public class StepDef1 extends BaseClass {

	@Given("User should be in the login page")
	public void user_should_be_in_the_login_page() {
		launch("https://www.facebook.com/");
	}

	@When("User should enter the username and password")
	public void user_should_enter_the_username_and_password(io.cucumber.datatable.DataTable dataSet) {
		LoginPage page = new LoginPage();
		login(page.getUser().get(0), page.getPass().get(0), dataSet.asLists().get(0).get(0),
				dataSet.asLists().get(0).get(1));

	}

	@When("User click login")
	public void user_click_login() {
		LoginPage page = new LoginPage();
		buttonClick(page.getBtn().get(0));
	}

	@Then("user should navigate to the login attempt page")
	public void user_should_navigate_to_the_login_attempt_page() {
		driver.quit();
	}

	@When("User has to click the Create new account")
	public void user_has_to_click_the_Create_new_account() {
		LoginPage page = new LoginPage();
		page.getNew().click();	
	}

	@Then("User should have navigated to the create account page")
	public void user_should_have_navigated_to_the_create_account_page() {
		String s = "create";
		Assert.assertEquals("verified","https://www.facebook.com/pages/creation/?ref_type=registration_form" ,driver.getCurrentUrl());
	}

}
