package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
	
	private By LOGININBUTTON = By.xpath("//a[normalize-space()='Sign in']");
	
	public void clickOnSigninButton() {
		clickOnElement(LOGININBUTTON);
	}

}
