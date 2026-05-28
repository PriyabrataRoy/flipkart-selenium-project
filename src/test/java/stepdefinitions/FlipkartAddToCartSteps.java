package stepdefinitions;

import org.openqa.selenium.By;

import Pages.AddToCartPage;
import ReusableFunctions.SeleniumUtility;
import baseclass.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartAddToCartSteps extends BaseTest {
	@Given("Open The Flipkart Website")
	public void Open_The_Flipkart_Website() {
		setup();
	}
	
	@When("Close the login pop up")
	public void close_The_Login_Pop_Up() throws InterruptedException {
		SeleniumUtility utility = new SeleniumUtility (driver);
		Thread.sleep(3000);
		utility.clickElement(driver.findElement(By.xpath("//span[contains(text(),'✕')]")));
	}
	@When("Open The First Mobile")
	public void open_First_Mobile() throws InterruptedException {
		AddToCartPage clickToOpen = new AddToCartPage(driver);
		
			clickToOpen.openFirstProduct();
		
	}
	
	@When("Click Add To Cart")
	public void click_Add_To_Cart() {
		AddToCartPage addToCart = new AddToCartPage(driver);
		addToCart.clickAddToCart();
		
	}
	
	@Then("Product Must Be Added To The Cart")
	public void productAddedToCart() throws InterruptedException {
		
		System.out.println(driver.getTitle()+" Added To Cart");
		Thread.sleep(3000);
		tearDown();
	}
}
