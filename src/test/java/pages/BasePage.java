package pages;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Allure;

import static utilities.DriverSetup.getDriver;

public class BasePage {
	
	
	public WebElement getElement(By locator) {
		
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(40));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();
	}
	
	public String getElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public void writeText(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
	public void hoverElement(By locator) {
		
		WebElement element = getElement(locator);
		Actions actions = new Actions(getDriver());
		actions.clickAndHold(element).build().perform();;
	}
	
	public void dropdownList(By locator, String text) {
		Select dropdownlist = new Select(getElement(locator));
		dropdownlist.selectByVisibleText(text);
	}
	
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
	}

}

