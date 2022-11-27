package pages;

import org.openqa.selenium.By;

public class AuthorSelectionPage extends BasePage {
	
private By HOVERAUTHOR = By.xpath("//a[@id='js--authors']");
private By CLICKAUTHOR = By.xpath("//a[contains(text(),'সাদাত হোসাইন')]");
	
	public void hoverOverAuthor() {
		hoverElement(HOVERAUTHOR);
	}
	
	public void clickOnAuthor() {
		clickOnElement(CLICKAUTHOR);
	}
	

}
