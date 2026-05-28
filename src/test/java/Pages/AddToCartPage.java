package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage {
	WebDriver driver;
	By firstProduct = By.xpath("//div[contains(text(),'Apple iPhone 15 (Black, 128 GB)')]");
	By addToCart =   By.xpath("//div[@style=\"align-items: center; justify-content: center; z-index: 2; border-color: rgb(214, 214, 214); height: 44px; width: 44px; border-radius: 12px; border-width: 1px;\"]");
	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void openFirstProduct() throws InterruptedException {
		
		driver.findElement(firstProduct).click();
		String parrent = driver.getWindowHandle();
		Thread
		.sleep(3000);
		
		for(String window : driver.getWindowHandles()) {
			if(!window.equals(parrent)) {
				driver.switchTo().window(window);
				break;
			}
		}
	}
	
	
	public void clickAddToCart() {
		System.out.println("Title: " + driver.getTitle());
		System.out.println("URL: " + driver.getCurrentUrl());
		
		
		driver.findElement(addToCart).click();
		
	}
}
