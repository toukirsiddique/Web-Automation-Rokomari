package pages;

import org.openqa.selenium.By;

public class SignIn extends BasePage {
	
	private By USERNAME = By.xpath("//input[@id='j_username']");
	private By PASSWORD = By.xpath("//input[@id='j_password']");
	private By SIGNINBUTTON = By.xpath("//button[normalize-space()='Sign In']");
	
	
	public void enterUsername(String username) {
		writeText(USERNAME, username);
	}
	
	
	public void enterPassword(String password) {
		writeText(PASSWORD, password);
	}
	
	public void clickSigninButton() {
		clickOnElement(SIGNINBUTTON);
	}
	
	public void doLogIn(String username, String password) {
		writeText(USERNAME, username);
		writeText(PASSWORD, password);
		clickOnElement(SIGNINBUTTON);
	}

}
