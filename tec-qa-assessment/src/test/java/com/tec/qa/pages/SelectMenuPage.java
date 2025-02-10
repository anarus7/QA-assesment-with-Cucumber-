package com.tec.qa.pages;

import com.tec.qa.utility.UtilityClass;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("https://demoqa.com/select-menu")
public class SelectMenuPage extends PageObject {

    private WebElementFacade getButtonByName(String elementName) {
        String dynamicXpath = "//b[contains(text(), '" + elementName + "')]/following::div[contains(@class, 'css-tlfecz-indicatorContainer')][1]";
        return find(By.xpath(dynamicXpath));
    }


    public void clickOnDropDown(String dropdownName) {
        WebElementFacade buttonByName = getButtonByName(dropdownName);
        UtilityClass.scrollToElement(buttonByName);
        buttonByName.click();
    }

    public List<WebElementFacade> getAvailableOptions() {
        return findAll(By.xpath("//div[contains(@class, 'css-26l3qy-menu')]//div[contains(@class, '-option')]"));
    }


    public boolean isOptionSelected(String option) {
        String optionXPath = "//div[contains(@class, 'css-1rhbuit-multiValue')]//div[contains(@class, 'css-12jo7m5') and text()='" + option + "']";
        List<WebElementFacade> selectedOptions = findAll(By.xpath(optionXPath));
        return !selectedOptions.isEmpty();
    }
}
