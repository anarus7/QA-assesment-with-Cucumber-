package com.tec.qa.definitions;

import com.tec.qa.steps.NavigationSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class HomePageStepsDefinition {
    @Steps
    NavigationSteps navigationSteps;

    @Given("the user opens the homepage")
    public void openHomePage() {
        navigationSteps.openHomePage();
    }

    @When("the user clicks on the {string} button")
    public void navigateToElementsPage(String cardName) {
        navigationSteps.clickOnCard(cardName);
    }

    @Then("the user should be on the {string} page")
    public void isOnElementsPage(String pageName) {
        navigationSteps.isOnPage(pageName);
    }
}
