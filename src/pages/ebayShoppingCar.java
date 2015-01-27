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
public class ebayShoppingCar {
	By productBuyLocator = By.id("291247122341_title");
	By deleteLinkLocator=By.linkText("Eliminar");
	public String getProductBuy(WebDriver driver){
		return driver.findElement(productBuyLocator).getText();
	}
	
	public void deleteProduct(WebDriver driver){
		driver.findElement(deleteLinkLocator).click();
	}
	
}
