package StepDefinitions;

import PageFactory.GoogleHome;
import Utilities.BaseDriver;
import Utilities.Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Search extends GoogleHome {

    private Methods methods = new Methods();

    @Given("I am on the Google homepage")
    public void iAmOnTheGoogleHomepage() {
        BaseDriver.getDriver().get("https://www.google.com/");
    }

    @When("I submit the search term {string}")
    public void iSubmitTheSearchTerm(String term) {
        methods.waitUntilVisible(searchBox);
        this.searchBox.sendKeys(term);
        this.searchButton.click();
    }

    @Then("I should see the first result as expected")
    public void iShouldSeeTheFirstResultAsExpected() {
        methods.waitUntilVisible(cucumber);
        Assert.assertTrue(this.cucumber.isDisplayed(), "Test Failed: Cucumber result not found");
    }
}
