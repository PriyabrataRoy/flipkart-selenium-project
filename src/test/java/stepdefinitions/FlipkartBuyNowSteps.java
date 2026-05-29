package stepdefinitions;

import org.openqa.selenium.By;

import Pages.BuyNowPage;
import ReusableFunctions.SeleniumUtility;
import baseclass.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartBuyNowSteps extends BaseTest {
	@Given("Open the Flipkart website")
	public void Open_The_Flipkart_Website() {
		setup();
	}
	
	@When("Close the login popup")
	public void close_The_Login_Pop_Up() throws InterruptedException {
		SeleniumUtility utility = new SeleniumUtility (driver);
		Thread.sleep(3000);
		utility.clickElement(driver.findElement(By.xpath("//span[contains(text(),'✕')]")));
	}
	@When("Open the first mobile")
	public void open_First_Mobile() throws InterruptedException {
		BuyNowPage clickToOpen = new BuyNowPage(driver);
		
			clickToOpen.openFirstProduct();
		
	}
	
	@When("Click on Buy Now")
	public void click_Buy_Now() {
		BuyNowPage bynow = new BuyNowPage(driver);
		bynow.clickBuyNow();
		
	}
	
	@Then("The login popup should appear")
	public void login_PopUp() throws InterruptedException {
		
		System.out.println(driver.getTitle()+" Login Pop Up");
		Thread.sleep(3000);
		tearDown();
	}
}
