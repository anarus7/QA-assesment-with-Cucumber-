package com.tec.qa.steps;


import com.tec.qa.pages.HomePage;
import net.serenitybdd.annotations.Step;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.assertTrue;

public class NavigationSteps {

    HomePage homepage;

    @Step
    public void openHomePage() {
        homepage.open();
    }

    @Step
    public void clickOnCard(String cardName) {
        homepage.clickOnCard(cardName);
    }

    @Step
    public void isOnPage(String pageName) {
        assertTrue(getDriver().getCurrentUrl().endsWith(pageName));
    }
}
