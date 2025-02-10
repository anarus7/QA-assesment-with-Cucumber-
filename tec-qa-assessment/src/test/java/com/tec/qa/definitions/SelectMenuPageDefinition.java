package com.tec.qa.definitions;

import com.tec.qa.steps.SelectFromDropDownSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class SelectMenuPageDefinition {

    @Steps
    SelectFromDropDownSteps selectFromDropDownSteps;

    @Given("the user opens the select-menu page")
    public void openSelectMenuPage() {
        selectFromDropDownSteps.openSelectMenuPage();

    }

    @When("the user clicks on the {string}")
    public void clickOnDropDown(String dropdownName) {
        selectFromDropDownSteps.clickOnDropDownButton(dropdownName);
    }

    @Then("{string} options are displayed")
    public void optionsDisplayed(String numberOfOptions) {
        selectFromDropDownSteps.optionsDisplayed(Integer.valueOf(numberOfOptions));
    }

    @When("the user selects {string}  from the dropdown")
    public void selectDropdownOption(String option) {
        selectFromDropDownSteps.clickOnDropDownOption(option);
    }

    @Then("{string} is displayed in the dropdown input field")
    public void checkDropDownValue(String value) {
        selectFromDropDownSteps.checkDropDownValue(value);
    }


}
