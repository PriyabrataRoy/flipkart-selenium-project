package ReusableFunctions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtility {

    WebDriver driver;

    public SeleniumUtility(WebDriver driver) {

        this.driver = driver;
    }

    public void waitForElement(WebElement element) {

        WebDriverWait wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(WebElement element) {

        waitForElement(element);

        element.click();
    }

    public void typeText( WebElement element, String value) {

        waitForElement(element);

        element.sendKeys(value);
    }

    public String getPageTitle() {

        return driver.getTitle();
    }
}