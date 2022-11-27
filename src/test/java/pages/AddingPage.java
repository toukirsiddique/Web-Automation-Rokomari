package pages;

import org.openqa.selenium.By;

public class AddingPage extends BasePage {
	
	private By FILTERING = By.xpath("//label[normalize-space()='Best Seller']");
	private By FILTERING2 = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
	private By HOVERINGBOOK = By.xpath("//p[contains(text(),'নির্বাসন')]");
	private By ADDCART = By.xpath("//div[@title='নির্বাসন সাদাত হোসাইন ']//a[@class='btn home-details-btn btn-block'][normalize-space()='View Details']");
	private By ADDINGTOCART = By.xpath("//a[@class='btn details-cart-btn small-cart-button js--add-to-cart js--add-to-cart-desc']//span[@id='js--add-to-cart-button']");
	private By GOTOCART = By.xpath("//a[@class='btn btn-place-order ml-2']//span[contains(text(),'Go To Cart')]");
	private By PLACEORDER = By.xpath("//span[normalize-space()='Place Order']");
	
	public void categoryNobel() {
		clickOnElement(FILTERING);
	}
	
	public void sortingType() {
		clickOnElement(FILTERING2);
	}
	
	public void hoverCart() {
		hoverElement(HOVERINGBOOK);
	}
	
	public void clickBook() {
		clickOnElement(ADDCART);
	}
	
	public void addCart() {
		clickOnElement(ADDINGTOCART);
	}
	
	public void goCart() {
		clickOnElement(GOTOCART);
	}
	
	
	public void selectPlaceOrder() {
		clickOnElement(PLACEORDER);
	}

}