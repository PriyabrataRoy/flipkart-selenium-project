package testcases;

import org.testng.annotations.Test;

import Pages.FlipkartSearchPage;
import baseclass.BaseTest;

public class FlipkartSearchPageTest
        extends BaseTest {

    @Test
    public void verifyProductSearch()
            throws InterruptedException {

        FlipkartSearchPage sp =
                new FlipkartSearchPage(driver);

        Thread.sleep(3000);

        sp.searchProduct("iPhone 15");

        Thread.sleep(3000);

        String title =
                driver.getTitle();

        System.out.println(title);
    }
}