package stepdefinitions;

import Pages.FlipkartSearchPage;
import baseclass.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartSearchSteps extends BaseTest {

    FlipkartSearchPage sp;

    @Given("To Launch the browser and navigate the url")
    public void to_launch_the_browser_and_navigate_the_url() {

        setup();
    }

    @When("Search Mobiles in search bar")
    public void search_mobiles_in_search_bar() throws InterruptedException {

        sp = new FlipkartSearchPage(driver);

        Thread.sleep(3000);

        sp.searchProduct("iPhone 15");

        Thread.sleep(3000);
    }

    @Then("Navigate to search results page")
    public void navigate_to_search_results_page() {

        String title = driver.getTitle();

        System.out.println("Page Title : " + title);

        tearDown();
    }
}