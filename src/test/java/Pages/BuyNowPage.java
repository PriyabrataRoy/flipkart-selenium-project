package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyNowPage {
	WebDriver driver;
	By firstProduct = By.xpath("//div[contains(text(),'Apple iPhone 15 (Black, 128 GB)')]");
	By buyNowbtn =   By.xpath("//div[contains(text(),'Buy now')]");
	public BuyNowPage(WebDriver driver) {
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
	
	
	public void clickBuyNow() {
		System.out.println("Title: " + driver.getTitle());
		System.out.println("URL: " + driver.getCurrentUrl());
		
		
		driver.findElement(buyNowbtn).click();
		
	}
}
