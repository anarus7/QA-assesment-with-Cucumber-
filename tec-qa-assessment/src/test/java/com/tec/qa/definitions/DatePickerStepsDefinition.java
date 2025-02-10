package com.tec.qa.definitions;

import com.tec.qa.steps.DatePickerSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class DatePickerStepsDefinition {
    @Steps
    DatePickerSteps datePickerSteps;

    @Given("the user opens the date picker page")
    public void openDatePickerPage() {
        datePickerSteps.openDatePickerPage();
    }

    @When("the user selects the {string} date")
    public void selectDate(String dateToSelect) {
        datePickerSteps.clickOnDatePicker();
        datePickerSteps.selectDate(dateToSelect);
    }

    @Then("the {string} date is selected")
    public void isOnElementsPage(String dateSelected) {
        datePickerSteps.checkSelectedDate(dateSelected);
    }
}
