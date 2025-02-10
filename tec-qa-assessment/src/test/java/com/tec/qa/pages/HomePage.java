package com.tec.qa.pages;

import com.tec.qa.utility.UtilityClass;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://demoqa.com")
public class HomePage extends PageObject {

    public void clickOnCard(String cardName) {
        WebElementFacade cardByName = getCardByName(cardName);
        UtilityClass.scrollToElement(cardByName);
        cardByName.click();
    }

    private WebElementFacade getCardByName(String elementName) {
        String dynamicXpath = "//h5[text()='" + elementName + "']/preceding::div[contains(@class, 'avatar')][1]";
        return find(By.xpath(dynamicXpath));
    }

}
