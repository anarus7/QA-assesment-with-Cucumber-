package com.tec.qa.steps;

import com.tec.qa.pages.SelectMenuPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SelectFromDropDownSteps {

    SelectMenuPage selectMenuPage;

    @Step
    public void openSelectMenuPage() {
        selectMenuPage.open();
    }

    @Step
    public void clickOnDropDownButton(String dropdownName) {
        selectMenuPage.clickOnDropDown(dropdownName);
    }

    @Step
    public void optionsDisplayed(Integer numberOfOptions) {
        assertEquals(numberOfOptions.intValue(), selectMenuPage.getAvailableOptions().size());
    }

    @Step
    public void clickOnDropDownOption(String dropdownValue) {
        List<WebElementFacade> availableOptions = selectMenuPage.getAvailableOptions();
        WebElementFacade dropdownElementToSelect = availableOptions.stream().filter(option -> option.getText().contains(dropdownValue))
                .findFirst().orElseThrow(IllegalArgumentException::new);
        dropdownElementToSelect.click();

    }


    public void checkDropDownValue(String value) {
        assertTrue(selectMenuPage.isOptionSelected(value));
    }
}
