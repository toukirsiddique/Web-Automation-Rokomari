package pages;

import org.openqa.selenium.By;

public class ShippingPage extends BasePage{
	
	private By NAME = By.xpath("//div[@class='shipping-form-container']//input[@id='name']");
	private By PHONE = By.xpath("//fieldset[@class='group']//input[@id='phone']");
	private By PHONE2 = By.xpath("//fieldset[@class='group']//input[@id='phone2']");
	private By COUNTRY = By.xpath("//select[@id='js--country']");
	private By CITY = By.xpath("//select[@id='js--city']");
	private By AREA = By.xpath("//select[@id='js--area']");
	private By ADDRESS = By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");
	private By PAYMENT = By.xpath("//label[@for='bkash']");
	
	
	public void nameField(String name) {
		writeText(NAME, name);
	}
	
	public void phoneField(String phone) {
		writeText(PHONE, phone);
	}
	
	public void phoneField2(String phone2) {
		writeText(PHONE2, phone2);
	}
	
	public void selectCountry() {
		dropdownList(COUNTRY, "Bangladesh");
	}
	
	public void cityField() {
		dropdownList(CITY, "ঢাকা");
	}
	
	public void areaField() {
		dropdownList(AREA, "সিদ্ধেশ্বরী ");
	}
	
	public void addressField(String address) {
		writeText(ADDRESS, address);
	}
	
	public void paymentMethod() {
		clickOnElement(PAYMENT);
	}

}

