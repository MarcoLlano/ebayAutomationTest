/**
 * 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Marco
 *
 */
public class ebayHomepage {
	By welcomeMessageLocator = By.xpath(".//*[@id='gh-ug']");
	By searchProductTextBoxLocator = By.xpath(".//*[@id='gh-ac']");
	By searchProductButonLocator = By.xpath(".//*[@id='gh-btn']");
	By firstProductLocator = By.xpath(".//*[@id='item43cfae67a5']/h3/a/strong");
	By addShoppingCarButtonLocator = By.xpath(".//*[@id='isCartBtn_btn']");
	String productName="laptops";


	public String welcomeMessage(WebDriver driver){
		String message=driver.findElement(welcomeMessageLocator).getText();
		return message;
	}

	public void searchProduct(WebDriver driver){
		driver.findElement(searchProductTextBoxLocator).sendKeys(productName);
	}
	public void clickOnSearchButton(WebDriver driver){
		driver.findElement(searchProductButonLocator).click();
	}
	public void clickFirstProduct(WebDriver driver){
		driver.findElement(firstProductLocator).click();
	}
	public String getFirstProduct(WebDriver driver){
		return driver.findElement(firstProductLocator).getText();
	}
	public void clickOnSoppingCarButton(WebDriver driver){
		driver.findElement(addShoppingCarButtonLocator).click();
	}
}
