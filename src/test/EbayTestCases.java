package test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import pages.ebayHomepage;
import pages.ebayShoppingCar;
import pages.links;
import pages.userAccount;

public class EbayTestCases {
	WebDriver driver;
	userAccount credentials=new userAccount();
	ebayHomepage homePage=new ebayHomepage();
	ebayShoppingCar shoppingCar =new ebayShoppingCar();

	@Test
	public void login() {
		String expectedMessage="Hola, Marco";
		Assert.assertEquals(expectedMessage, homePage.welcomeMessage(driver));
	}

	@Test
	public void buyingProducts() {
		homePage.searchProduct(driver);
		homePage.clickOnSearchButton(driver);
		String expectedlValue=homePage.getFirstProduct(driver);
		homePage.clickFirstProduct(driver);
		homePage.clickOnSoppingCarButton(driver);
		String actualValue=shoppingCar.getProductBuy(driver);
		
		Assert.assertEquals(expectedlValue.substring(0, 80), actualValue.substring(0, 80));
		shoppingCar.deleteProduct(driver);
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		 
		credentials.loginEbay(driver);
		credentials.clickOnIniciaSesion(driver);
	}

	@AfterMethod
	public void afterMethod() {
		credentials.logout(driver);
	}

	@BeforeSuite
	public void beforeSuite() {
		driver = new FirefoxDriver();
		links link=new links();	  
		String baseUrl = link.ebayUrl();
		driver.get(baseUrl);
	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}

}
