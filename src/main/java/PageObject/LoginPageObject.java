package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObject extends Base {

	public LoginPageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement login;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;
	@FindBy(xpath = "//h2[contains(text(),'My Account')]")
	private WebElement validation;

	public void myAccount() {
		myAccount.click();
	}

	public void loginOption() {
		login.click();
	}

	public void email(String emailValue) {
		email.sendKeys(emailValue);

	}

	public void password(String passwordValue) {
		password.sendKeys(passwordValue);
	}

	public void loginButton() {
		loginButton.click();
	}

	public boolean validate() {
		if (validation.isDisplayed())
			return true;
		else
			return false;

	}

}
