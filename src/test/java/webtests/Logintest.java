package webtests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.AddingPage;
import pages.HomePage;
import pages.AuthorSelectionPage;
import pages.ShippingPage;
import pages.SignIn;
import utilities.DriverSetup;

public class Logintest extends DriverSetup{
	
	HomePage homePage = new HomePage();
	SignIn signIn = new SignIn();
	AuthorSelectionPage authorSelectionPage = new AuthorSelectionPage();
	AddingPage addingPage = new AddingPage();
	ShippingPage shippingPage = new ShippingPage();
	
	@Test(priority = 0, description = "Rokomari Home Page")
	@Description("Test Description: Here we have loaded Rokomari Home Page and used assertion to see if the base url of Rokomari matches with the url we have provided and screenshot was taken.")
	public void testHomePageUrl() {
		getDriver().get("https://www.rokomari.com/book");
		assertEquals(getDriver().getCurrentUrl(), "https://www.rokomari.com/book");
		homePage.takeScreenShot("HomePage");
	}
	
	@Test(priority = 0, description = "Rokomari Author Page")
	@Description("Test Description: Here we have used assertion to check if the page title of Rokomari Author page that we have loaded matches the page title that we have provided and screenshot was taken.")
	public void testAuthorPageTitle() {
		getDriver().get("https://www.rokomari.com/book");
		homePage.clickOnSigninButton();
		signIn.enterUsername("toukir.madrid@gmail.com");
		signIn.enterPassword("touRokomari07kir");
		signIn.clickSigninButton();
		authorSelectionPage.hoverOverAuthor();
		authorSelectionPage.clickOnAuthor();
		assertEquals(getDriver().getTitle(), "Sadat Hossain Books - সাদাত হোসাইন এর বই | Rokomari.com");
		homePage.takeScreenShot("AuthorPage");
	}
	
	@Test(priority = 0, description = "Rokomari Book Page")
	@Description("Test Description: Assertion was used here to check if the Book page title matches with our given title and screenshot was taken.")
	public void testBookPageTitle() {
		getDriver().get("https://www.rokomari.com/book");
		homePage.clickOnSigninButton();
		signIn.enterUsername("toukir.madrid@gmail.com");
		signIn.enterPassword("touRokomari07kir");
		signIn.clickSigninButton();
		authorSelectionPage.hoverOverAuthor();
		authorSelectionPage.clickOnAuthor();
		addingPage.categoryNobel();
		addingPage.sortingType();
		addingPage.hoverCart();
		addingPage.clickBook();
		assertEquals(getDriver().getTitle(), "নির্বাসন: সাদাত হোসাইন - Nirbason: Sadat Hossain | Rokomari.com");
		homePage.takeScreenShot("SelectedBook");
	}
	
	
	@Test(priority = 0, description = "Rokomari Cart Page")
	@Description("Test Description: We have selected an Author, Filtered Books by Sorting and Category, Chose a particular book and added it to the cart, provided necessary details for shipping the book and took screenshots throughout the process.")
	public void loginautomationTest() throws InterruptedException {
		
		getDriver().get("https://www.rokomari.com/book");
		homePage.clickOnSigninButton();
		signIn.enterUsername("toukir.madrid@gmail.com");
		signIn.enterPassword("touRokomari07kir");
		homePage.takeScreenShot("SignInPage");
		signIn.clickSigninButton();
		authorSelectionPage.hoverOverAuthor();
		authorSelectionPage.clickOnAuthor();
		addingPage.categoryNobel();
		addingPage.sortingType();
		homePage.takeScreenShot("FilteredBookPage");
		addingPage.hoverCart();
		addingPage.clickBook();
		Thread.sleep(1000);
		addingPage.addCart();
		addingPage.goCart();
		homePage.takeScreenShot("CartPage");
		addingPage.selectPlaceOrder();
		shippingPage.nameField("Toukir");
		shippingPage.phoneField("01771770888");
		shippingPage.phoneField2("01303127795");
		shippingPage.selectCountry();
		shippingPage.cityField();
		shippingPage.areaField();
		shippingPage.addressField("65/66 Rangs Hafiz Tower");
		shippingPage.paymentMethod();
		Thread.sleep(4000);
		homePage.takeScreenShot("ShippingPage");
	}
	
}
