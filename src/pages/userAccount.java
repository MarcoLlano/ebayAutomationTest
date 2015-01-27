/**
 * 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Marco
 *
 */
public class userAccount {

	String userName = "llano.marco@gmail.com";
	String password = "369xlbuj25";
	By iniciarSesionLinkLocator = By.xpath(".//*[@id='gh-ug']/a");
	By emailLocator = By.xpath(".//*[@id='userid']");
	By passwordLocator = By.xpath(".//*[@id='pass']");
	By iniciarSesionButtonLocator = By.xpath(".//*[@id='sgnBt']");
	By welcomeMessageLocator = By.xpath(".//*[@id='gh-ug']");
	By cerrarSesionLinLocator = By.xpath(".//*[@id='gh-uo']/a");

	public void loginEbay(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 40000);
		driver.findElement(iniciarSesionLinkLocator).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(emailLocator));
		driver.findElement(emailLocator).clear();
		driver.findElement(emailLocator).sendKeys(userName);
		driver.findElement(passwordLocator).clear();
		driver.findElement(passwordLocator).sendKeys(password);
	} 

	public void clickOnIniciaSesion(WebDriver driver){
		driver.findElement(iniciarSesionButtonLocator).click();
	}

	public void logout(WebDriver driver){
		driver.findElement(welcomeMessageLocator).click();
		driver.findElement(cerrarSesionLinLocator).click();
	}

}
