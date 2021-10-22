package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import PageObject.LoginPageObject;
import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.HawksUtilitiesClass;

public class LoginStepDef extends Base {
	LoginPageObject loginPageObject = new LoginPageObject();

	@Given("user is on retail website login")
	public void user_is_on_retail_website_login() {
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		logger.info(actualPageTitle + "ActualPageTitle is equal to ExpectedPageTitle" + expectedPageTitle);

	}

	@When("user click on my account")
	public void user_click_on_my_account() {
		loginPageObject.myAccount();
		logger.info("user clicked on my account");

	}

	@And("user click on login")
	public void user_click_on_login() {
		loginPageObject.loginOption();
		logger.info("user click on login");
	}

	@And("user enter email {string}")
	public void user_enter_email(String emailValue) {
		loginPageObject.email(emailValue);
		logger.info("user enter the email");
	}

	@And("user enter password {string}")
	public void user_enter_password(String passValue) throws IOException {
		loginPageObject.password(passValue);
		logger.info("user enter the password");
		HawksUtilitiesClass.takeScreenShot();

	}

	@And("user click on login button")
	public void user_click_on_login_button() {
		loginPageObject.loginButton();
		logger.info("user click on login Button");

	}

	@Then("user confirm the login status")
	public void user_confirm_the_login_status() throws IOException {
		Assert.assertTrue(loginPageObject.validate());
		logger.info("user confirm the login status");

		HawksUtilitiesClass.takeScreenShot();
	}
	

}
