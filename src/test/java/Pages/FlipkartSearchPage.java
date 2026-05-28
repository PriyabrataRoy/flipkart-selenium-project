package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FlipkartSearchPage {

    WebDriver driver;

    By searchBox = By.name("q");

    public FlipkartSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String product) {

        driver.findElement(searchBox).sendKeys(product);

        driver.findElement(searchBox).sendKeys(Keys.ENTER);
    }
}